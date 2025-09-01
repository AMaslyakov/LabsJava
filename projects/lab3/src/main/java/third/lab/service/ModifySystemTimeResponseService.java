package third.lab.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import third.lab.model.Response;
import third.lab.util.DateTimeUtil;

@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{

    @Override
    public Response modify(Response response){
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }

}
