/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.controllers;

import com.exoscale.apichgva2.Environment;
import com.exoscale.apichgva2.ExoscalePublicAPIClient;
import com.exoscale.apichgva2.models.ZoneNameEnum;
import com.exoscale.apichgva2.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static ExoscalePublicAPIClient createConfigurationFromEnvironment() {
        ExoscalePublicAPIClient.Builder builder = new ExoscalePublicAPIClient.Builder();

        final String environment = System.getenv("EXOSCALE_PUBLIC_API_LIB_ENVIRONMENT");
        final String zone = System.getenv("EXOSCALE_PUBLIC_API_LIB_ZONE");
        final String timeout = System.getenv("EXOSCALE_PUBLIC_API_LIB_TIMEOUT");

        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (zone != null) {
            builder.zone(ZoneNameEnum.fromString(zone));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static ExoscalePublicAPIClient createConfiguration() {
        // Set Configuration parameters for test execution
        ExoscalePublicAPIClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
