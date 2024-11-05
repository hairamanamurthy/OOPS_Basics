package org.example.exception_handling;

public class invalidAgeException extends RuntimeException {
    public invalidAgeException(String message) {
        super(message);
    }
}
