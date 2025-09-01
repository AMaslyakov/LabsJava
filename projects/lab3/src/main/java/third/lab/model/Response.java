package third.lab.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private Codes code;
    private ErrorCodes errorCode;
    private ErrorMessages errorMessage;


@Override
public String toString(){
    return String.format("response:{uid: %s, " +
    "operationUid:%s," + 
    "systemTime:%s," + 
    "code: %s," +
    "errorCode: %s" +
    "errorMessage: %s}",
    uid, 
    operationUid.toString(),
    systemTime.toString(),
    code.toString(),
    errorCode.toString(), errorMessage.toString()
    );
}

}
