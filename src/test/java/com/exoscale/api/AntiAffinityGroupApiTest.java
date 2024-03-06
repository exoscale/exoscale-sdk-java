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


package com.exoscale.api;

import com.exoscale.model.AntiAffinityGroup;
import com.exoscale.model.CreateAntiAffinityGroupRequest;
import com.exoscale.model.ListAntiAffinityGroups200Response;
import com.exoscale.model.Operation;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for AntiAffinityGroupApi
 */
@Ignore
public class AntiAffinityGroupApiTest {

    private final AntiAffinityGroupApi api = new AntiAffinityGroupApi();

    
    /**
     * Create an Anti-affinity Group
     *
     * 
     */
    @Test
    public void createAntiAffinityGroupTest()  {
        CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest = null;
        Operation response = api.createAntiAffinityGroup(createAntiAffinityGroupRequest).block();

        // TODO: test validations
    }
    
    /**
     * Delete an Anti-affinity Group
     *
     * 
     */
    @Test
    public void deleteAntiAffinityGroupTest()  {
        UUID id = null;
        Operation response = api.deleteAntiAffinityGroup(id).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve Anti-affinity Group details
     *
     * 
     */
    @Test
    public void getAntiAffinityGroupTest()  {
        UUID id = null;
        AntiAffinityGroup response = api.getAntiAffinityGroup(id).block();

        // TODO: test validations
    }
    
    /**
     * List Anti-affinity Groups
     *
     * 
     */
    @Test
    public void listAntiAffinityGroupsTest()  {
        ListAntiAffinityGroups200Response response = api.listAntiAffinityGroups().block();

        // TODO: test validations
    }
    
}
