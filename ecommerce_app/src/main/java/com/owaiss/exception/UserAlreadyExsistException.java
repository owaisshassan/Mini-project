package com.owaiss.exception;

public class UserAlreadyExsistException extends RuntimeException {

    public UserAlreadyExsistException( String mssg){
        super(mssg);
    }

}
