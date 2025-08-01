package com.example.blog.exception;

public class HandleEventDoesnotExistException extends RuntimeException {
    public HandleEventDoesnotExistException(String message) {
        super(message);
    }
}
