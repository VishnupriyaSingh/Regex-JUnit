package com.day11;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String message) {
        super(message);
    }
}