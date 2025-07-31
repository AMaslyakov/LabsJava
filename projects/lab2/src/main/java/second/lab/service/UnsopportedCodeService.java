package second.lab.service;

import org.springframework.stereotype.Service;

import second.lab.exception.UnsopportedCodeException;

@Service
public interface UnsopportedCodeService {

    void isValid(String uid) throws UnsopportedCodeException;

}
