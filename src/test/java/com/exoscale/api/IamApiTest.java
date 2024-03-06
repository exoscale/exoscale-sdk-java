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

import com.exoscale.model.AccessKey;
import com.exoscale.model.CreateAccessKeyRequest;
import com.exoscale.model.CreateApiKeyRequest;
import com.exoscale.model.CreateIamRoleRequest;
import com.exoscale.model.IamApiKey;
import com.exoscale.model.IamApiKeyCreated;
import com.exoscale.model.IamPolicy;
import com.exoscale.model.IamRole;
import com.exoscale.model.ListAccessKeyKnownOperations200Response;
import com.exoscale.model.ListAccessKeys200Response;
import com.exoscale.model.ListApiKeys200Response;
import com.exoscale.model.ListIamRoles200Response;
import com.exoscale.model.Operation;
import java.util.UUID;
import com.exoscale.model.UpdateIamRoleRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for IamApi
 */
@Ignore
public class IamApiTest {

    private final IamApi api = new IamApi();

    
    /**
     * Create a legacy IAM Access Key
     *
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     */
    @Test
    public void createAccessKeyTest()  {
        CreateAccessKeyRequest createAccessKeyRequest = null;
        AccessKey response = api.createAccessKey(createAccessKeyRequest).block();

        // TODO: test validations
    }
    
    /**
     * Create a new API key
     *
     * 
     */
    @Test
    public void createApiKeyTest()  {
        CreateApiKeyRequest createApiKeyRequest = null;
        IamApiKeyCreated response = api.createApiKey(createApiKeyRequest).block();

        // TODO: test validations
    }
    
    /**
     * Create IAM Role
     *
     * 
     */
    @Test
    public void createIamRoleTest()  {
        CreateIamRoleRequest createIamRoleRequest = null;
        Operation response = api.createIamRole(createIamRoleRequest).block();

        // TODO: test validations
    }
    
    /**
     * Delete an API key
     *
     * 
     */
    @Test
    public void deleteApiKeyTest()  {
        String id = null;
        Operation response = api.deleteApiKey(id).block();

        // TODO: test validations
    }
    
    /**
     * Delete IAM Role
     *
     * 
     */
    @Test
    public void deleteIamRoleTest()  {
        UUID id = null;
        Operation response = api.deleteIamRole(id).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve IAM Access Key details
     *
     * 
     */
    @Test
    public void getAccessKeyTest()  {
        String key = null;
        AccessKey response = api.getAccessKey(key).block();

        // TODO: test validations
    }
    
    /**
     * Get API key
     *
     * 
     */
    @Test
    public void getApiKeyTest()  {
        String id = null;
        IamApiKey response = api.getApiKey(id).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve IAM Organization Policy
     *
     * 
     */
    @Test
    public void getIamOrganizationPolicyTest()  {
        IamPolicy response = api.getIamOrganizationPolicy().block();

        // TODO: test validations
    }
    
    /**
     * Retrieve IAM Role
     *
     * 
     */
    @Test
    public void getIamRoleTest()  {
        UUID id = null;
        IamRole response = api.getIamRole(id).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     *
     * 
     */
    @Test
    public void listAccessKeyKnownOperationsTest()  {
        ListAccessKeyKnownOperations200Response response = api.listAccessKeyKnownOperations().block();

        // TODO: test validations
    }
    
    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     *
     * 
     */
    @Test
    public void listAccessKeyOperationsTest()  {
        ListAccessKeyKnownOperations200Response response = api.listAccessKeyOperations().block();

        // TODO: test validations
    }
    
    /**
     * List IAM Access Keys
     *
     * 
     */
    @Test
    public void listAccessKeysTest()  {
        ListAccessKeys200Response response = api.listAccessKeys().block();

        // TODO: test validations
    }
    
    /**
     * List API keys
     *
     * 
     */
    @Test
    public void listApiKeysTest()  {
        ListApiKeys200Response response = api.listApiKeys().block();

        // TODO: test validations
    }
    
    /**
     * List IAM Roles
     *
     * 
     */
    @Test
    public void listIamRolesTest()  {
        ListIamRoles200Response response = api.listIamRoles().block();

        // TODO: test validations
    }
    
    /**
     * Revoke an IAM Access Key
     *
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     */
    @Test
    public void revokeAccessKeyTest()  {
        String key = null;
        Operation response = api.revokeAccessKey(key).block();

        // TODO: test validations
    }
    
    /**
     * Update IAM Organization Policy
     *
     * 
     */
    @Test
    public void updateIamOrganizationPolicyTest()  {
        IamPolicy iamPolicy = null;
        Operation response = api.updateIamOrganizationPolicy(iamPolicy).block();

        // TODO: test validations
    }
    
    /**
     * Update IAM Role
     *
     * 
     */
    @Test
    public void updateIamRoleTest()  {
        UUID id = null;
        UpdateIamRoleRequest updateIamRoleRequest = null;
        Operation response = api.updateIamRole(id, updateIamRoleRequest).block();

        // TODO: test validations
    }
    
    /**
     * Update IAM Role Policy
     *
     * 
     */
    @Test
    public void updateIamRolePolicyTest()  {
        UUID id = null;
        IamPolicy iamPolicy = null;
        Operation response = api.updateIamRolePolicy(id, iamPolicy).block();

        // TODO: test validations
    }
    
}
