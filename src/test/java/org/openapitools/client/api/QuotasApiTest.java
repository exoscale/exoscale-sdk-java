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
import org.openapitools.client.model.ListQuotas200Response;
import org.openapitools.client.model.Quota;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for QuotasApi
 */
@Ignore
public class QuotasApiTest {

    private final QuotasApi api = new QuotasApi();

    
    /**
     * Retrieve Resource Quota
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuotaTest() throws ApiException {
        String entity = null;
        Quota response = 
        api.getQuota(entity);
        
        // TODO: test validations
    }
    
    /**
     * List Organization Quotas
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listQuotasTest() throws ApiException {
        ListQuotas200Response response = 
        api.listQuotas();
        
        // TODO: test validations
    }
    
}
