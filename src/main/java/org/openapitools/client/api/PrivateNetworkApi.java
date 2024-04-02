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

import org.openapitools.client.model.AttachInstanceToPrivateNetworkRequest;
import org.openapitools.client.model.CreatePrivateNetworkRequest;
import org.openapitools.client.model.DetachInstanceFromPrivateNetworkRequest;
import org.openapitools.client.model.ListPrivateNetworks200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.PrivateNetwork;
import java.util.UUID;
import org.openapitools.client.model.UpdatePrivateNetworkInstanceIpRequest;
import org.openapitools.client.model.UpdatePrivateNetworkRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-02T12:56:21.011484+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class PrivateNetworkApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public PrivateNetworkApi() {
    this(new ApiClient());
  }

  public PrivateNetworkApi(ApiClient apiClient) {
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
   * Attach a Compute instance to a Private Network
   * 
   * @param id  (required)
   * @param attachInstanceToPrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation attachInstanceToPrivateNetwork(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = attachInstanceToPrivateNetworkWithHttpInfo(id, attachInstanceToPrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Attach a Compute instance to a Private Network
   * 
   * @param id  (required)
   * @param attachInstanceToPrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> attachInstanceToPrivateNetworkWithHttpInfo(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = attachInstanceToPrivateNetworkRequestBuilder(id, attachInstanceToPrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("attachInstanceToPrivateNetwork", localVarResponse);
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

  private HttpRequest.Builder attachInstanceToPrivateNetworkRequestBuilder(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling attachInstanceToPrivateNetwork");
    }
    // verify the required parameter 'attachInstanceToPrivateNetworkRequest' is set
    if (attachInstanceToPrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'attachInstanceToPrivateNetworkRequest' when calling attachInstanceToPrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}:attach"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(attachInstanceToPrivateNetworkRequest);
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
   * Create a Private Network
   * 
   * @param createPrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation createPrivateNetwork(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = createPrivateNetworkWithHttpInfo(createPrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Create a Private Network
   * 
   * @param createPrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> createPrivateNetworkWithHttpInfo(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createPrivateNetworkRequestBuilder(createPrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createPrivateNetwork", localVarResponse);
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

  private HttpRequest.Builder createPrivateNetworkRequestBuilder(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'createPrivateNetworkRequest' is set
    if (createPrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPrivateNetworkRequest' when calling createPrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createPrivateNetworkRequest);
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
   * Delete a Private Network
   * 
   * @param id  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deletePrivateNetwork(UUID id) throws ApiException {
    ApiResponse<Operation> localVarResponse = deletePrivateNetworkWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Delete a Private Network
   * 
   * @param id  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deletePrivateNetworkWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deletePrivateNetworkRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deletePrivateNetwork", localVarResponse);
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

  private HttpRequest.Builder deletePrivateNetworkRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}"
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
   * Detach a Compute instance from a Private Network
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation detachInstanceFromPrivateNetwork(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = detachInstanceFromPrivateNetworkWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Detach a Compute instance from a Private Network
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> detachInstanceFromPrivateNetworkWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = detachInstanceFromPrivateNetworkRequestBuilder(id, detachInstanceFromPrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("detachInstanceFromPrivateNetwork", localVarResponse);
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

  private HttpRequest.Builder detachInstanceFromPrivateNetworkRequestBuilder(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling detachInstanceFromPrivateNetwork");
    }
    // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
    if (detachInstanceFromPrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling detachInstanceFromPrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}:detach"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(detachInstanceFromPrivateNetworkRequest);
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
   * Retrieve Private Network details
   * 
   * @param id  (required)
   * @return PrivateNetwork
   * @throws ApiException if fails to make API call
   */
  public PrivateNetwork getPrivateNetwork(UUID id) throws ApiException {
    ApiResponse<PrivateNetwork> localVarResponse = getPrivateNetworkWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Retrieve Private Network details
   * 
   * @param id  (required)
   * @return ApiResponse&lt;PrivateNetwork&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrivateNetwork> getPrivateNetworkWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPrivateNetworkRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getPrivateNetwork", localVarResponse);
        }
        return new ApiResponse<PrivateNetwork>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PrivateNetwork>() {}) // closes the InputStream
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

  private HttpRequest.Builder getPrivateNetworkRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}"
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
   * List Private Networks
   * 
   * @return ListPrivateNetworks200Response
   * @throws ApiException if fails to make API call
   */
  public ListPrivateNetworks200Response listPrivateNetworks() throws ApiException {
    ApiResponse<ListPrivateNetworks200Response> localVarResponse = listPrivateNetworksWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List Private Networks
   * 
   * @return ApiResponse&lt;ListPrivateNetworks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListPrivateNetworks200Response> listPrivateNetworksWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listPrivateNetworksRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listPrivateNetworks", localVarResponse);
        }
        return new ApiResponse<ListPrivateNetworks200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListPrivateNetworks200Response>() {}) // closes the InputStream
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

  private HttpRequest.Builder listPrivateNetworksRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network";

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
   * Reset Private Network field
   * 
   * @param id  (required)
   * @param field  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation resetPrivateNetworkField(UUID id, String field) throws ApiException {
    ApiResponse<Operation> localVarResponse = resetPrivateNetworkFieldWithHttpInfo(id, field);
    return localVarResponse.getData();
  }

  /**
   * Reset Private Network field
   * 
   * @param id  (required)
   * @param field  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> resetPrivateNetworkFieldWithHttpInfo(UUID id, String field) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = resetPrivateNetworkFieldRequestBuilder(id, field);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("resetPrivateNetworkField", localVarResponse);
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

  private HttpRequest.Builder resetPrivateNetworkFieldRequestBuilder(UUID id, String field) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resetPrivateNetworkField");
    }
    // verify the required parameter 'field' is set
    if (field == null) {
      throw new ApiException(400, "Missing the required parameter 'field' when calling resetPrivateNetworkField");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}/{field}"
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
   * Update a Private Network
   * 
   * @param id  (required)
   * @param updatePrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation updatePrivateNetwork(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = updatePrivateNetworkWithHttpInfo(id, updatePrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Update a Private Network
   * 
   * @param id  (required)
   * @param updatePrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> updatePrivateNetworkWithHttpInfo(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updatePrivateNetworkRequestBuilder(id, updatePrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updatePrivateNetwork", localVarResponse);
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

  private HttpRequest.Builder updatePrivateNetworkRequestBuilder(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePrivateNetwork");
    }
    // verify the required parameter 'updatePrivateNetworkRequest' is set
    if (updatePrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePrivateNetworkRequest' when calling updatePrivateNetwork");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updatePrivateNetworkRequest);
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
   * Update the IP address of an instance attached to a managed private network
   * 
   * @param id  (required)
   * @param updatePrivateNetworkInstanceIpRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation updatePrivateNetworkInstanceIp(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = updatePrivateNetworkInstanceIpWithHttpInfo(id, updatePrivateNetworkInstanceIpRequest);
    return localVarResponse.getData();
  }

  /**
   * Update the IP address of an instance attached to a managed private network
   * 
   * @param id  (required)
   * @param updatePrivateNetworkInstanceIpRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> updatePrivateNetworkInstanceIpWithHttpInfo(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updatePrivateNetworkInstanceIpRequestBuilder(id, updatePrivateNetworkInstanceIpRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updatePrivateNetworkInstanceIp", localVarResponse);
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

  private HttpRequest.Builder updatePrivateNetworkInstanceIpRequestBuilder(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePrivateNetworkInstanceIp");
    }
    // verify the required parameter 'updatePrivateNetworkInstanceIpRequest' is set
    if (updatePrivateNetworkInstanceIpRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePrivateNetworkInstanceIpRequest' when calling updatePrivateNetworkInstanceIp");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/private-network/{id}:update-ip"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updatePrivateNetworkInstanceIpRequest);
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
