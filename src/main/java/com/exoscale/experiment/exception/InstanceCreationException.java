package com.exoscale.experiment.exception;

/**
 * Custom exception for handling instance creation errors in Exoscale services.
 */
public class InstanceCreationException extends GenericException {
    /**
     * Constructs a new InstanceCreationException with the specified detail message.
     *
     * @param errorMessage The detail message (which is saved for later retrieval by the getMessage() method).
     */
    public InstanceCreationException(String errorMessage) {
        super("InstanceCreationException", errorMessage);
    }
}