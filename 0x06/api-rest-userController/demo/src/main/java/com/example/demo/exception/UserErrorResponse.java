package com.example.demo.exception;

public class UserErrorResponse {
    private int status;
    private String message;


    public UserErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public UserErrorResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
