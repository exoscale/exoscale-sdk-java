package com.exoscale.api.experiment.exception;

public class GenericException  extends RuntimeException {
    private final String errorName;
    public GenericException(String errorName, String errorMessage) {
        super(errorMessage);
        this.errorName = errorName;
    }
    public String getErrorName() {
        return errorName;
    }
}

