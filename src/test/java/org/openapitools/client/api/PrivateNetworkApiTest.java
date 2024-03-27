/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AttachInstanceToPrivateNetworkRequest;
import org.openapitools.client.model.CreatePrivateNetworkRequest;
import org.openapitools.client.model.DetachInstanceFromPrivateNetworkRequest;
import org.openapitools.client.model.ListPrivateNetworks200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.PrivateNetwork;
import java.util.UUID;
import org.openapitools.client.model.UpdatePrivateNetworkInstanceIpRequest;
import org.openapitools.client.model.UpdatePrivateNetworkRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for PrivateNetworkApi
 */
@Ignore
public class PrivateNetworkApiTest {

    private final PrivateNetworkApi api = new PrivateNetworkApi();

    
    /**
     * Attach a Compute instance to a Private Network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachInstanceToPrivateNetworkTest() throws ApiException {
        UUID id = null;
        AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest = null;
        Operation response = 
        api.attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest);
        
        // TODO: test validations
    }
    
    /**
     * Create a Private Network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPrivateNetworkTest() throws ApiException {
        CreatePrivateNetworkRequest createPrivateNetworkRequest = null;
        Operation response = 
        api.createPrivateNetwork(createPrivateNetworkRequest);
        
        // TODO: test validations
    }
    
    /**
     * Delete a Private Network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePrivateNetworkTest() throws ApiException {
        UUID id = null;
        Operation response = 
        api.deletePrivateNetwork(id);
        
        // TODO: test validations
    }
    
    /**
     * Detach a Compute instance from a Private Network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachInstanceFromPrivateNetworkTest() throws ApiException {
        UUID id = null;
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = null;
        Operation response = 
        api.detachInstanceFromPrivateNetwork(id, detachInstanceFromPrivateNetworkRequest);
        
        // TODO: test validations
    }
    
    /**
     * Retrieve Private Network details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateNetworkTest() throws ApiException {
        UUID id = null;
        PrivateNetwork response = 
        api.getPrivateNetwork(id);
        
        // TODO: test validations
    }
    
    /**
     * List Private Networks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPrivateNetworksTest() throws ApiException {
        ListPrivateNetworks200Response response = 
        api.listPrivateNetworks();
        
        // TODO: test validations
    }
    
    /**
     * Reset Private Network field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPrivateNetworkFieldTest() throws ApiException {
        UUID id = null;
        String field = null;
        Operation response = 
        api.resetPrivateNetworkField(id, field);
        
        // TODO: test validations
    }
    
    /**
     * Update a Private Network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePrivateNetworkTest() throws ApiException {
        UUID id = null;
        UpdatePrivateNetworkRequest updatePrivateNetworkRequest = null;
        Operation response = 
        api.updatePrivateNetwork(id, updatePrivateNetworkRequest);
        
        // TODO: test validations
    }
    
    /**
     * Update the IP address of an instance attached to a managed private network
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePrivateNetworkInstanceIpTest() throws ApiException {
        UUID id = null;
        UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest = null;
        Operation response = 
        api.updatePrivateNetworkInstanceIp(id, updatePrivateNetworkInstanceIpRequest);
        
        // TODO: test validations
    }
    
}
