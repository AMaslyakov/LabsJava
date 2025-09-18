package third.lab.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.extern.slf4j.Slf4j;
import third.lab.model.Request;

@Slf4j
@Service
@Qualifier("ModifySourceRequestService")
public class ModifySourceRequestService implements ModifyRequestService{

    @Override
    public void modify(Request request){
        request.setSource("Source 1");

        log.debug("modify request = {}", request);
        
        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
            HttpMethod.POST,
            httpEntity,
            new ParameterizedTypeReference<>(){}
        );
    }
}
