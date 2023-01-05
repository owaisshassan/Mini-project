package com.owaiss.exception;

public class UserDoesNotExtistException extends RuntimeException{

    public UserDoesNotExtistException( String mssg ){
        super(mssg);
    }

}
