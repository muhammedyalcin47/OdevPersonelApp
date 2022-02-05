package com.bilgeadam.odevpersonelapp.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class PersonelNotFoundException extends RuntimeException {

    public PersonelNotFoundException(String message) {
        super(message);
    }
}
