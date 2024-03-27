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

import org.openapitools.client.model.AttachBlockStorageVolumeToInstanceRequest;
import org.openapitools.client.model.CreateElasticIpRequest;
import org.openapitools.client.model.ElasticIp;
import org.openapitools.client.model.ListElasticIps200Response;
import org.openapitools.client.model.Operation;
import java.util.UUID;
import org.openapitools.client.model.UpdateElasticIpRequest;

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
public class ElasticIpApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ElasticIpApi() {
    this(new ApiClient());
  }

  public ElasticIpApi(ApiClient apiClient) {
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
   * Attach a Compute instance to an Elastic IP
   * 
   * @param id  (required)
   * @param attachBlockStorageVolumeToInstanceRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation attachInstanceToElasticIp(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = attachInstanceToElasticIpWithHttpInfo(id, attachBlockStorageVolumeToInstanceRequest);
    return localVarResponse.getData();
  }

  /**
   * Attach a Compute instance to an Elastic IP
   * 
   * @param id  (required)
   * @param attachBlockStorageVolumeToInstanceRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> attachInstanceToElasticIpWithHttpInfo(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = attachInstanceToElasticIpRequestBuilder(id, attachBlockStorageVolumeToInstanceRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("attachInstanceToElasticIp", localVarResponse);
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

  private HttpRequest.Builder attachInstanceToElasticIpRequestBuilder(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling attachInstanceToElasticIp");
    }
    // verify the required parameter 'attachBlockStorageVolumeToInstanceRequest' is set
    if (attachBlockStorageVolumeToInstanceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'attachBlockStorageVolumeToInstanceRequest' when calling attachInstanceToElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}:attach"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(attachBlockStorageVolumeToInstanceRequest);
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
  /**
   * Create an Elastic IP
   * 
   * @param createElasticIpRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation createElasticIp(CreateElasticIpRequest createElasticIpRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = createElasticIpWithHttpInfo(createElasticIpRequest);
    return localVarResponse.getData();
  }

  /**
   * Create an Elastic IP
   * 
   * @param createElasticIpRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> createElasticIpWithHttpInfo(CreateElasticIpRequest createElasticIpRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createElasticIpRequestBuilder(createElasticIpRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createElasticIp", localVarResponse);
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

  private HttpRequest.Builder createElasticIpRequestBuilder(CreateElasticIpRequest createElasticIpRequest) throws ApiException {
    // verify the required parameter 'createElasticIpRequest' is set
    if (createElasticIpRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createElasticIpRequest' when calling createElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createElasticIpRequest);
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
   * Delete an Elastic IP
   * 
   * @param id  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteElasticIp(UUID id) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteElasticIpWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Delete an Elastic IP
   * 
   * @param id  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteElasticIpWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteElasticIpRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteElasticIp", localVarResponse);
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

  private HttpRequest.Builder deleteElasticIpRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}"
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
   * Detach a Compute instance from an Elastic IP
   * 
   * @param id  (required)
   * @param attachBlockStorageVolumeToInstanceRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation detachInstanceFromElasticIp(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = detachInstanceFromElasticIpWithHttpInfo(id, attachBlockStorageVolumeToInstanceRequest);
    return localVarResponse.getData();
  }

  /**
   * Detach a Compute instance from an Elastic IP
   * 
   * @param id  (required)
   * @param attachBlockStorageVolumeToInstanceRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> detachInstanceFromElasticIpWithHttpInfo(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = detachInstanceFromElasticIpRequestBuilder(id, attachBlockStorageVolumeToInstanceRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("detachInstanceFromElasticIp", localVarResponse);
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

  private HttpRequest.Builder detachInstanceFromElasticIpRequestBuilder(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling detachInstanceFromElasticIp");
    }
    // verify the required parameter 'attachBlockStorageVolumeToInstanceRequest' is set
    if (attachBlockStorageVolumeToInstanceRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'attachBlockStorageVolumeToInstanceRequest' when calling detachInstanceFromElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}:detach"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(attachBlockStorageVolumeToInstanceRequest);
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
  /**
   * Retrieve Elastic IP details
   * 
   * @param id  (required)
   * @return ElasticIp
   * @throws ApiException if fails to make API call
   */
  public ElasticIp getElasticIp(UUID id) throws ApiException {
    ApiResponse<ElasticIp> localVarResponse = getElasticIpWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Retrieve Elastic IP details
   * 
   * @param id  (required)
   * @return ApiResponse&lt;ElasticIp&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ElasticIp> getElasticIpWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getElasticIpRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getElasticIp", localVarResponse);
        }
        return new ApiResponse<ElasticIp>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ElasticIp>() {}) // closes the InputStream
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

  private HttpRequest.Builder getElasticIpRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}"
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
   * List Elastic IPs
   * 
   * @return ListElasticIps200Response
   * @throws ApiException if fails to make API call
   */
  public ListElasticIps200Response listElasticIps() throws ApiException {
    ApiResponse<ListElasticIps200Response> localVarResponse = listElasticIpsWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List Elastic IPs
   * 
   * @return ApiResponse&lt;ListElasticIps200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListElasticIps200Response> listElasticIpsWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listElasticIpsRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listElasticIps", localVarResponse);
        }
        return new ApiResponse<ListElasticIps200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListElasticIps200Response>() {}) // closes the InputStream
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

  private HttpRequest.Builder listElasticIpsRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip";

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
   * Reset an Elastic IP field to its default value
   * 
   * @param id  (required)
   * @param field  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation resetElasticIpField(UUID id, String field) throws ApiException {
    ApiResponse<Operation> localVarResponse = resetElasticIpFieldWithHttpInfo(id, field);
    return localVarResponse.getData();
  }

  /**
   * Reset an Elastic IP field to its default value
   * 
   * @param id  (required)
   * @param field  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> resetElasticIpFieldWithHttpInfo(UUID id, String field) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resetElasticIpFieldRequestBuilder(id, field);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resetElasticIpField", localVarResponse);
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

  private HttpRequest.Builder resetElasticIpFieldRequestBuilder(UUID id, String field) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resetElasticIpField");
    }
    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling resetElasticIpField");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}/{field}"
        .replace("{id}", ApiClient.urlEncode(id.toString()))
        .replace("{field}", ApiClient.urlEncode(field.toString()));

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
   * Update an Elastic IP
   * 
   * @param id  (required)
   * @param updateElasticIpRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation updateElasticIp(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = updateElasticIpWithHttpInfo(id, updateElasticIpRequest);
    return localVarResponse.getData();
  }

  /**
   * Update an Elastic IP
   * 
   * @param id  (required)
   * @param updateElasticIpRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> updateElasticIpWithHttpInfo(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateElasticIpRequestBuilder(id, updateElasticIpRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateElasticIp", localVarResponse);
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

  private HttpRequest.Builder updateElasticIpRequestBuilder(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateElasticIp");
    }
    // verify the required parameter 'updateElasticIpRequest' is set
    if (updateElasticIpRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateElasticIpRequest' when calling updateElasticIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/elastic-ip/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateElasticIpRequest);
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
