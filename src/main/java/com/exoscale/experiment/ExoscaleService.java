package com.exoscale.experiment;


import com.exoscale.model.AntiAffinityGroup;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

    private static final Logger logger = LoggerFactory.getLogger(ExoscaleNetworkCommunication.class);

    private final ExoscaleNetworkCommunication exoscaleNetwork;

    @Autowired
    public ExoscaleService(ExoscaleNetworkCommunication exoscaleNetwork) {
        this.exoscaleNetwork = exoscaleNetwork;
    }

    /**
     * Creates a compute instance on Exoscale using the provided request body.
     *
     * @param requestBody The JSON string representing the request body for instance creation.
     * @return The response from the Exoscale API after creating the instance.
     * @throws JsonProcessingException If there is an error processing the JSON.
     */
    public InstanceResponse createComputeInstance(String requestBody) throws JsonProcessingException {
        logger.info("Inside the createComputeInstance within the service!:");
        InstanceResponse response = exoscaleNetwork.createNewInstance(requestBody);
        logger.info("Compute Instance created successfully: {}", response.getId());
        return response;
    }

    /**
     * Generates a JSON string request body for creating a compute instance on Exoscale.
     *
     * @param instance The instance data to convert into a JSON request body.
     * @return A JSON string representing the request body for instance creation.
     */
    public String createRequestBodyWithGson(Instance instance) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("autoStart", instance.getAutoStart());
        JsonArray securityGroups = new JsonArray();
        JsonObject securityGroup = new JsonObject();
        securityGroup.addProperty("id", instance.getSecurityGroupId());
        securityGroups.add(securityGroup);
        jsonObject.add("security-groups", securityGroups);
        jsonObject.add("instance-type", createIdObject(instance.getInstanceTypeId()));
        jsonObject.add("template", createIdObject(instance.getTemplateId()));
        jsonObject.addProperty("disk-size", instance.getDiskSize());
        if(CloudInitUserData.getCloudInitUserData() != null)
            jsonObject.addProperty("user-data", CloudInitUserData.getCloudInitUserData());

        return new Gson().toJson(jsonObject);
    }

    /**
     * Creates a JSON object with a single field 'id'.
     *
     * @param idValue The value for the 'id' field.
     * @return A JsonObject with the 'id' field set to the given value.
     */
    private JsonObject createIdObject(String idValue) {
        JsonObject idObject = new JsonObject();
        idObject.addProperty("id", idValue);
        return idObject;
    }

    public String createAntiAffinityGroupRequestBodyWithGson(AntiAffinityGroup antiAffinityGroup) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", antiAffinityGroup.getName());
        return new Gson().toJson(jsonObject);

    }

    public InstanceResponse createAntiAffinityGroup(String requestBody) {
        logger.info("Inside the createAntiAffinityGroup within the service!:");
        InstanceResponse response = exoscaleNetwork.createNewAntiAffinityGroup(requestBody);
        logger.info("Anti Affinity Group created successfully: {}", response.getId());
        return response;
    }
}

