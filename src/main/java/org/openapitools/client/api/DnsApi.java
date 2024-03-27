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

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.CreateDnsDomainRecordRequest;
import org.openapitools.client.model.CreateDnsDomainRequest;
import org.openapitools.client.model.DnsDomain;
import org.openapitools.client.model.DnsDomainRecord;
import org.openapitools.client.model.GetDnsDomainZoneFile200Response;
import org.openapitools.client.model.ListDnsDomainRecords200Response;
import org.openapitools.client.model.ListDnsDomains200Response;
import org.openapitools.client.model.Operation;
import java.util.UUID;
import org.openapitools.client.model.UpdateDnsDomainRecordRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DnsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public DnsApi() {
    this(new ApiClient());
  }

  public DnsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Create DNS domain
   * 
   * @param createDnsDomainRequest  (required)
   * @return DnsDomain
   * @throws ApiException if fails to make API call
   */
  public DnsDomain createDnsDomain(CreateDnsDomainRequest createDnsDomainRequest) throws ApiException {
    ApiResponse<DnsDomain> localVarResponse = createDnsDomainWithHttpInfo(createDnsDomainRequest);
    return localVarResponse.getData();
  }

  /**
   * Create DNS domain
   * 
   * @param createDnsDomainRequest  (required)
   * @return ApiResponse&lt;DnsDomain&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsDomain> createDnsDomainWithHttpInfo(CreateDnsDomainRequest createDnsDomainRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createDnsDomainRequestBuilder(createDnsDomainRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createDnsDomain", localVarResponse);
        }
        return new ApiResponse<DnsDomain>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DnsDomain>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createDnsDomainRequestBuilder(CreateDnsDomainRequest createDnsDomainRequest) throws ApiException {
    // verify the required parameter 'createDnsDomainRequest' is set
    if (createDnsDomainRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createDnsDomainRequest' when calling createDnsDomain");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createDnsDomainRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Create DNS domain record
   * 
   * @param domainId  (required)
   * @param createDnsDomainRecordRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation createDnsDomainRecord(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = createDnsDomainRecordWithHttpInfo(domainId, createDnsDomainRecordRequest);
    return localVarResponse.getData();
  }

  /**
   * Create DNS domain record
   * 
   * @param domainId  (required)
   * @param createDnsDomainRecordRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> createDnsDomainRecordWithHttpInfo(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createDnsDomainRecordRequestBuilder(domainId, createDnsDomainRecordRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createDnsDomainRecord", localVarResponse);
        }
        return new ApiResponse<Operation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Operation>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createDnsDomainRecordRequestBuilder(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws ApiException {
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new ApiException(400, "Missing the required parameter 'domainId' when calling createDnsDomainRecord");
    }
    // verify the required parameter 'createDnsDomainRecordRequest' is set
    if (createDnsDomainRecordRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createDnsDomainRecordRequest' when calling createDnsDomainRecord");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{domain-id}/record"
        .replace("{domain-id}", ApiClient.urlEncode(domainId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createDnsDomainRecordRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete DNS Domain
   * 
   * @param id  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteDnsDomain(UUID id) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteDnsDomainWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Delete DNS Domain
   * 
   * @param id  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteDnsDomainWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteDnsDomainRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteDnsDomain", localVarResponse);
        }
        return new ApiResponse<Operation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Operation>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteDnsDomainRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDnsDomain");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Delete DNS domain record
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteDnsDomainRecord(UUID domainId, UUID recordId) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteDnsDomainRecordWithHttpInfo(domainId, recordId);
    return localVarResponse.getData();
  }

  /**
   * Delete DNS domain record
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteDnsDomainRecordRequestBuilder(domainId, recordId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteDnsDomainRecord", localVarResponse);
        }
        return new ApiResponse<Operation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Operation>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteDnsDomainRecordRequestBuilder(UUID domainId, UUID recordId) throws ApiException {
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new ApiException(400, "Missing the required parameter 'domainId' when calling deleteDnsDomainRecord");
    }
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling deleteDnsDomainRecord");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{domain-id}/record/{record-id}"
        .replace("{domain-id}", ApiClient.urlEncode(domainId.toString()))
        .replace("{record-id}", ApiClient.urlEncode(recordId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Retrieve DNS domain details
   * 
   * @param id  (required)
   * @return DnsDomain
   * @throws ApiException if fails to make API call
   */
  public DnsDomain getDnsDomain(UUID id) throws ApiException {
    ApiResponse<DnsDomain> localVarResponse = getDnsDomainWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Retrieve DNS domain details
   * 
   * @param id  (required)
   * @return ApiResponse&lt;DnsDomain&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsDomain> getDnsDomainWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDnsDomainRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getDnsDomain", localVarResponse);
        }
        return new ApiResponse<DnsDomain>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DnsDomain>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getDnsDomainRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDnsDomain");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Retrieve DNS domain record details
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @return DnsDomainRecord
   * @throws ApiException if fails to make API call
   */
  public DnsDomainRecord getDnsDomainRecord(UUID domainId, UUID recordId) throws ApiException {
    ApiResponse<DnsDomainRecord> localVarResponse = getDnsDomainRecordWithHttpInfo(domainId, recordId);
    return localVarResponse.getData();
  }

  /**
   * Retrieve DNS domain record details
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @return ApiResponse&lt;DnsDomainRecord&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DnsDomainRecord> getDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDnsDomainRecordRequestBuilder(domainId, recordId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getDnsDomainRecord", localVarResponse);
        }
        return new ApiResponse<DnsDomainRecord>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<DnsDomainRecord>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getDnsDomainRecordRequestBuilder(UUID domainId, UUID recordId) throws ApiException {
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new ApiException(400, "Missing the required parameter 'domainId' when calling getDnsDomainRecord");
    }
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling getDnsDomainRecord");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{domain-id}/record/{record-id}"
        .replace("{domain-id}", ApiClient.urlEncode(domainId.toString()))
        .replace("{record-id}", ApiClient.urlEncode(recordId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Retrieve DNS domain zone file
   * 
   * @param id  (required)
   * @return GetDnsDomainZoneFile200Response
   * @throws ApiException if fails to make API call
   */
  public GetDnsDomainZoneFile200Response getDnsDomainZoneFile(UUID id) throws ApiException {
    ApiResponse<GetDnsDomainZoneFile200Response> localVarResponse = getDnsDomainZoneFileWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Retrieve DNS domain zone file
   * 
   * @param id  (required)
   * @return ApiResponse&lt;GetDnsDomainZoneFile200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetDnsDomainZoneFile200Response> getDnsDomainZoneFileWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getDnsDomainZoneFileRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getDnsDomainZoneFile", localVarResponse);
        }
        return new ApiResponse<GetDnsDomainZoneFile200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetDnsDomainZoneFile200Response>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getDnsDomainZoneFileRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getDnsDomainZoneFile");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{id}/zone"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List DNS domain records
   * 
   * @param domainId  (required)
   * @return ListDnsDomainRecords200Response
   * @throws ApiException if fails to make API call
   */
  public ListDnsDomainRecords200Response listDnsDomainRecords(UUID domainId) throws ApiException {
    ApiResponse<ListDnsDomainRecords200Response> localVarResponse = listDnsDomainRecordsWithHttpInfo(domainId);
    return localVarResponse.getData();
  }

  /**
   * List DNS domain records
   * 
   * @param domainId  (required)
   * @return ApiResponse&lt;ListDnsDomainRecords200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListDnsDomainRecords200Response> listDnsDomainRecordsWithHttpInfo(UUID domainId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listDnsDomainRecordsRequestBuilder(domainId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listDnsDomainRecords", localVarResponse);
        }
        return new ApiResponse<ListDnsDomainRecords200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListDnsDomainRecords200Response>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listDnsDomainRecordsRequestBuilder(UUID domainId) throws ApiException {
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new ApiException(400, "Missing the required parameter 'domainId' when calling listDnsDomainRecords");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{domain-id}/record"
        .replace("{domain-id}", ApiClient.urlEncode(domainId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * List DNS domains
   * 
   * @return ListDnsDomains200Response
   * @throws ApiException if fails to make API call
   */
  public ListDnsDomains200Response listDnsDomains() throws ApiException {
    ApiResponse<ListDnsDomains200Response> localVarResponse = listDnsDomainsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List DNS domains
   * 
   * @return ApiResponse&lt;ListDnsDomains200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListDnsDomains200Response> listDnsDomainsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listDnsDomainsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listDnsDomains", localVarResponse);
        }
        return new ApiResponse<ListDnsDomains200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListDnsDomains200Response>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder listDnsDomainsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Update DNS domain record
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @param updateDnsDomainRecordRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation updateDnsDomainRecord(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = updateDnsDomainRecordWithHttpInfo(domainId, recordId, updateDnsDomainRecordRequest);
    return localVarResponse.getData();
  }

  /**
   * Update DNS domain record
   * 
   * @param domainId  (required)
   * @param recordId  (required)
   * @param updateDnsDomainRecordRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> updateDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateDnsDomainRecordRequestBuilder(domainId, recordId, updateDnsDomainRecordRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateDnsDomainRecord", localVarResponse);
        }
        return new ApiResponse<Operation>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Operation>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateDnsDomainRecordRequestBuilder(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws ApiException {
    // verify the required parameter 'domainId' is set
    if (domainId == null) {
      throw new ApiException(400, "Missing the required parameter 'domainId' when calling updateDnsDomainRecord");
    }
    // verify the required parameter 'recordId' is set
    if (recordId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordId' when calling updateDnsDomainRecord");
    }
    // verify the required parameter 'updateDnsDomainRecordRequest' is set
    if (updateDnsDomainRecordRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDnsDomainRecordRequest' when calling updateDnsDomainRecord");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dns-domain/{domain-id}/record/{record-id}"
        .replace("{domain-id}", ApiClient.urlEncode(domainId.toString()))
        .replace("{record-id}", ApiClient.urlEncode(recordId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateDnsDomainRecordRequest);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
