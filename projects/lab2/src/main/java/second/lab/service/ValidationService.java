package second.lab.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import second.lab.exception.UnsopportedCodeException;
import second.lab.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;

    void isUnsupported(String uid) throws UnsopportedCodeException;
}
