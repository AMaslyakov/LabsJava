package second.lab.service;

import org.springframework.stereotype.Service;

import second.lab.exception.UnsupportedCodeException;

@Service
public interface UnsopportedCodeService {

    void isValid(String uid) throws UnsupportedCodeException;

}
