package com.exoscale.experiment.exception;

/**
 * Exception thrown when there is an error in communicating with the Exoscale API.
 */
public class ExoscaleNetworkCommunicationException  extends GenericException{
    public ExoscaleNetworkCommunicationException(String errorMessage) {
        super("ExoscaleNetworkCommunicationError", errorMessage);
    }
}