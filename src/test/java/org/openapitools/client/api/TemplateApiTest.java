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
import org.openapitools.client.model.CopyTemplateRequest;
import org.openapitools.client.model.ListTemplates200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.PromoteSnapshotToTemplateRequest;
import org.openapitools.client.model.RegisterTemplateRequest;
import org.openapitools.client.model.Template;
import java.util.UUID;
import org.openapitools.client.model.UpdateTemplateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for TemplateApi
 */
@Ignore
public class TemplateApiTest {

    private final TemplateApi api = new TemplateApi();

    
    /**
     * Copy a Template from a zone to another
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void copyTemplateTest() throws ApiException {
        UUID id = null;
        CopyTemplateRequest copyTemplateRequest = null;
        Operation response = 
        api.copyTemplate(id, copyTemplateRequest);
        
        // TODO: test validations
    }
    
    /**
     * Delete a Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateTest() throws ApiException {
        UUID id = null;
        Operation response = 
        api.deleteTemplate(id);
        
        // TODO: test validations
    }
    
    /**
     * Retrieve Template details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateTest() throws ApiException {
        UUID id = null;
        Template response = 
        api.getTemplate(id);
        
        // TODO: test validations
    }
    
    /**
     * List Templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTemplatesTest() throws ApiException {
        String visibility = null;
        String family = null;
        ListTemplates200Response response = 
        api.listTemplates(visibility, family);
        
        // TODO: test validations
    }
    
    /**
     * Promote a Snapshot to a Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void promoteSnapshotToTemplateTest() throws ApiException {
        UUID id = null;
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = null;
        Operation response = 
        api.promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest);
        
        // TODO: test validations
    }
    
    /**
     * Register a Template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerTemplateTest() throws ApiException {
        RegisterTemplateRequest registerTemplateRequest = null;
        Operation response = 
        api.registerTemplate(registerTemplateRequest);
        
        // TODO: test validations
    }
    
    /**
     * Update template attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTemplateTest() throws ApiException {
        UUID id = null;
        UpdateTemplateRequest updateTemplateRequest = null;
        Operation response = 
        api.updateTemplate(id, updateTemplateRequest);
        
        // TODO: test validations
    }
    
}
