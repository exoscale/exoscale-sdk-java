package com.exoscale.experiment;


import com.exoscale.model.AntiAffinityGroup;
import com.exoscale.model.Instance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Service class for handling operations related to Exoscale compute instances.
 * This includes creating instances and preparing request bodies for API calls.
 */
@Service
public class ExoscaleService {
    // Using ObjectMapper to convert classes into Jackson format
    private final ObjectMapper objectMapper;

    private static final Logger logger = LoggerFactory.getLogger(ExoscaleNetworkCommunication.class);
    private final ExoscaleNetworkCommunication exoscaleNetwork;

    @Autowired
    public ExoscaleService(ExoscaleNetworkCommunication exoscaleNetwork, ObjectMapper objectMappe) {
        this.objectMapper = objectMappe;
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        this.exoscaleNetwork = exoscaleNetwork;
    }

    /**
     * Creates a compute {@link Instance} on Exoscale using the provided request body.
     *
     * @param requestBody The JSON string representing the request body for instance creation.
     * @return The response from the Exoscale API after creating the {@link Instance}.
     * @throws JsonProcessingException If there is an error processing the JSON.
     */
    public InstanceResponse createComputeInstance(String requestBody) throws JsonProcessingException {
        logger.info("Inside the createComputeInstance within the service!:");
        InstanceResponse response = exoscaleNetwork.createNewInstance(requestBody);
        logger.info("Compute Instance created successfully: {}", response.getId());
        return response;
    }

    /**
     * Generates a JSON string request body for creating a compute  {@link Instance} on Exoscale.
     *
     * @param instance The {@link Instance} data to convert into a JSON request body.
     * @return A JSON string representing the request body for {@link Instance} creation.
     */
    public String createInstanceRequestBodyWithJackson(Instance instance) {
        try {
            String jsonRequestBody = objectMapper.writeValueAsString(instance);
            logger.info("Generated JSON request body for compute instance creation: {}", jsonRequestBody);
            return jsonRequestBody;
        } catch (JsonProcessingException e) {
            logger.error("Error serializing Instance to JSON", e);
            throw new RuntimeException("Failed to serialize Instance to JSON", e);
        }
    }

    /**
     * Serializes an {@link AntiAffinityGroup} object into a JSON string using Jackson's {@link ObjectMapper}.
     * This JSON string is used as the request body for API calls.
     *
     * @param antiAffinityGroup The {@link AntiAffinityGroup} object to serialize.
     * @return A JSON string representation of the {@link AntiAffinityGroup} object.
     * @throws RuntimeException if serialization to JSON fails.
     */
    public String createAntiAffinityGroupRequestBodyWithJackson(AntiAffinityGroup antiAffinityGroup) {
        try {
            return objectMapper.writeValueAsString(antiAffinityGroup);
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize AntiAffinityGroup to JSON", e);
        }

    }

    public InstanceResponse createAntiAffinityGroup(String requestBody) {
        logger.info("Inside the createAntiAffinityGroup within the service!:");
        InstanceResponse response = exoscaleNetwork.createNewAntiAffinityGroup(requestBody);
        logger.info("Anti Affinity Group created successfully: {}", response.getId());
        return response;
    }
}

