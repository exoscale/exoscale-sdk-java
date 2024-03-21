/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.exoscale.apichgva2.ExoscalePublicAPIClient;
import com.exoscale.apichgva2.exceptions.ApiException;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NetworkLoadBalancerControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static ExoscalePublicAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static NetworkLoadBalancerController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getNetworkLoadBalancerController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * List Load Balancers.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListLoadBalancers() throws Exception {

        // Set callback and perform API call
        try {
            controller.listLoadBalancers();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
