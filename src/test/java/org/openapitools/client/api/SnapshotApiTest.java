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
import org.openapitools.client.model.ListSnapshots200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.PromoteSnapshotToTemplateRequest;
import org.openapitools.client.model.Snapshot;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SnapshotApi
 */
@Ignore
public class SnapshotApiTest {

    private final SnapshotApi api = new SnapshotApi();

    
    /**
     * Create a Snapshot of a Compute instance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSnapshotTest() throws ApiException {
        UUID id = null;
        Operation response = 
        api.createSnapshot(id);
        
        // TODO: test validations
    }
    
    /**
     * Delete a Snapshot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSnapshotTest() throws ApiException {
        UUID id = null;
        Operation response = 
        api.deleteSnapshot(id);
        
        // TODO: test validations
    }
    
    /**
     * Export a Snapshot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportSnapshotTest() throws ApiException {
        UUID id = null;
        Operation response = 
        api.exportSnapshot(id);
        
        // TODO: test validations
    }
    
    /**
     * Retrieve Snapshot details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotTest() throws ApiException {
        UUID id = null;
        Snapshot response = 
        api.getSnapshot(id);
        
        // TODO: test validations
    }
    
    /**
     * List Snapshots
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSnapshotsTest() throws ApiException {
        ListSnapshots200Response response = 
        api.listSnapshots();
        
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
    
}
