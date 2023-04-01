package com.example.march2023.model;

public class CalculateResponse {

    private int status;
    private String errorMessage;
    private double operationResult;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public double getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(double operationResult) {
        this.operationResult = operationResult;
    }
}
