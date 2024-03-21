package com.exoscale.api.experiment.exception;


/**
 * Exception thrown when there is an error generating a cryptographic signature.
 */
public class SignatureGenerationException extends GenericException{
    public SignatureGenerationException(String message) {
        super("SignatureGenerationException",message);
    }
}
