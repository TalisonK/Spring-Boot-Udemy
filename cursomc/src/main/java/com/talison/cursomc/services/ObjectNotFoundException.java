package com.talison.cursomc.services;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable trow){
        super(msg, trow);
    }
}
