/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api;

import com.exoscale.api.models.errors.SDKError;
import com.exoscale.api.models.operations.SDKMethodInterfaces.*;
import com.exoscale.api.utils.HTTPClient;
import com.exoscale.api.utils.HTTPRequest;
import com.exoscale.api.utils.JSON;
import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

public class Sos implements
            MethodCallListSosBucketsUsage,
            MethodCallGetSosPresignedUrl {

    private final SDKConfiguration sdkConfiguration;

    Sos(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public com.exoscale.api.models.operations.ListSosBucketsUsageRequestBuilder listSosBucketsUsage() {
        return new com.exoscale.api.models.operations.ListSosBucketsUsageRequestBuilder(this);
    }

    /**
     * List SOS Buckets Usage
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.exoscale.api.models.operations.ListSosBucketsUsageResponse listSosBucketsUsageDirect() throws Exception {

        String baseUrl = com.exoscale.api.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = com.exoscale.api.utils.Utils.generateURL(
                baseUrl,
                "/sos-buckets-usage");

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        HTTPClient client = this.sdkConfiguration.defaultClient;

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.exoscale.api.models.operations.ListSosBucketsUsageResponse.Builder resBuilder = 
            com.exoscale.api.models.operations.ListSosBucketsUsageResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.exoscale.api.models.operations.ListSosBucketsUsageResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.exoscale.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.exoscale.api.models.operations.ListSosBucketsUsageResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.exoscale.api.models.operations.ListSosBucketsUsageResponseBody>() {});
                res.withObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }


    public com.exoscale.api.models.operations.GetSosPresignedUrlRequestBuilder getSosPresignedUrl() {
        return new com.exoscale.api.models.operations.GetSosPresignedUrlRequestBuilder(this);
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * @param bucket
     * @param key
     * @return The response from the API call.
     * @throws Exception if the API call fails.
     */
    public com.exoscale.api.models.operations.GetSosPresignedUrlResponse getSosPresignedUrl(
            String bucket,
            Optional<? extends String> key) throws Exception {
        com.exoscale.api.models.operations.GetSosPresignedUrlRequest request =
            com.exoscale.api.models.operations.GetSosPresignedUrlRequest
                .builder()
                .bucket(bucket)
                .key(key)
                .build();
        

        String baseUrl = com.exoscale.api.utils.Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());

        String url = com.exoscale.api.utils.Utils.generateURL(
                com.exoscale.api.models.operations.GetSosPresignedUrlRequest.class,
                baseUrl,
                "/sos/{bucket}/presigned-url",
                request, null);

        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);

        java.util.List<NameValuePair> queryParams = com.exoscale.api.utils.Utils.getQueryParams(
                com.exoscale.api.models.operations.GetSosPresignedUrlRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }

        HTTPClient client = this.sdkConfiguration.defaultClient;

        HttpResponse<InputStream> httpRes = client.send(req);

        String contentType = httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.exoscale.api.models.operations.GetSosPresignedUrlResponse.Builder resBuilder = 
            com.exoscale.api.models.operations.GetSosPresignedUrlResponse
                .builder()
                .contentType(contentType)
                .statusCode(httpRes.statusCode())
                .rawResponse(httpRes);

        com.exoscale.api.models.operations.GetSosPresignedUrlResponse res = resBuilder.build();

        res.withRawResponse(httpRes);

        if (httpRes.statusCode() == 200) {
            if (com.exoscale.api.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.exoscale.api.models.operations.GetSosPresignedUrlResponseBody out = mapper.readValue(
                    Utils.toUtf8AndClose(httpRes.body()),
                    new TypeReference<com.exoscale.api.models.operations.GetSosPresignedUrlResponseBody>() {});
                res.withObject(java.util.Optional.ofNullable(out));
            } else {
                throw new SDKError(httpRes, httpRes.statusCode(), "Unknown content-type received: " + contentType, Utils.toByteArrayAndClose(httpRes.body()));
            }
        }

        return res;
    }

}
