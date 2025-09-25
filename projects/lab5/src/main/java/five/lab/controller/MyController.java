package five.lab.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import five.lab.exception.UnsupportedCodeException;
import five.lab.exception.ValidationFailedException;
import five.lab.model.Codes;
import five.lab.model.ErrorCodes;
import five.lab.model.ErrorMessages;
import five.lab.model.Request;
import five.lab.model.Response;
import five.lab.service.ModifyRequestService;
import five.lab.service.ModifyResponseService;
import five.lab.service.ValidationService;
import five.lab.util.DateTimeUtil;

@Slf4j
@RestController
public class MyController {

    private final ValidationService validationService;
    private final ModifyResponseService modifyResponseService;
    private final ModifyRequestService modifyRequestService;


    @Autowired
    public MyController(ValidationService validationService,
    @Qualifier("ModifySystemTimeResponseService") ModifyResponseService modifyResponseService,
    @Qualifier("ModifySourceRequestService") ModifyRequestService modifyRequestService){
        this.validationService = validationService;
        this.modifyResponseService = modifyResponseService;
        this.modifyRequestService = modifyRequestService;
    }

    @PostMapping(value="/feedback")
    public ResponseEntity<Response> feedback(
        @Valid @RequestBody Request request,
        BindingResult bindingResult
        ){
            log.info("request: {}", request);
            log.info("Создается объект Response");

            Response response = Response.builder()
            .uid(request.getUid())
            .operationUid(request.getOperationUid())
            .systemTime(DateTimeUtil.getCustomFormat().format(new Date()))
            .code(Codes.SUCCESS)
            .errorCode(ErrorCodes.EMPTY)
            .errorMessage(ErrorMessages.EMPTY)
            .build();

            log.info("response:{}", response);

            try{
                log.info("Проверка Uid");
                validationService.isUnsupported(request.getUid());
                log.info("Валидация запроса");
                validationService.isValid(bindingResult);
            }catch(ValidationFailedException e){
                response.setCode(Codes.FAILED);
                response.setErrorCode(ErrorCodes.VALIDATION_EXCEPTION);
                response.setErrorMessage(ErrorMessages.VALIDATION);
                log.info("response: {}", response);
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            } catch (UnsupportedCodeException e) {
                response.setCode(Codes.FAILED);
                response.setErrorCode(ErrorCodes.UNSUPPORTED_EXCEPTION);
                response.setErrorMessage(ErrorMessages.UNSUPPORTED);
                log.info("response: {}", response);
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            } 
            catch (Exception e){
                response.setCode(Codes.FAILED);
                response.setErrorCode(ErrorCodes.UNKNOWN_EXCEPTION);
                response.setErrorMessage(ErrorMessages.UNKNOWN);
                log.info("response: {}", response);
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        
            log.info("Объект Request валидный, передается в ModifyResponseService");
            log.info("До модификации response: {}", response);
            modifyResponseService.modify(response);
            modifyRequestService.modify(request);
            log.info("После модификации response: {}", response);

            return new ResponseEntity<>(response, HttpStatus.OK);
        }
}
