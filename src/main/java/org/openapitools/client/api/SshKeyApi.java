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

import org.openapitools.client.model.ListSshKeys200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.RegisterSshKeyRequest;
import org.openapitools.client.model.SshKey;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:42:26.601985678Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class SshKeyApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SshKeyApi() {
    this(new ApiClient());
  }

  public SshKeyApi(ApiClient apiClient) {
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
   * Delete a SSH key
   * 
   * @param name  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteSshKey(String name) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteSshKeyWithHttpInfo(name);
    return localVarResponse.getData();
  }

  /**
   * Delete a SSH key
   * 
   * @param name  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteSshKeyWithHttpInfo(String name) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteSshKeyRequestBuilder(name);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteSshKey", localVarResponse);
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

  private HttpRequest.Builder deleteSshKeyRequestBuilder(String name) throws ApiException {
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteSshKey");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/ssh-key/{name}"
        .replace("{name}", ApiClient.urlEncode(name.toString()));

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
   * Retrieve SSH key details
   * 
   * @param name  (required)
   * @return SshKey
   * @throws ApiException if fails to make API call
   */
  public SshKey getSshKey(String name) throws ApiException {
    ApiResponse<SshKey> localVarResponse = getSshKeyWithHttpInfo(name);
    return localVarResponse.getData();
  }

  /**
   * Retrieve SSH key details
   * 
   * @param name  (required)
   * @return ApiResponse&lt;SshKey&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SshKey> getSshKeyWithHttpInfo(String name) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSshKeyRequestBuilder(name);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSshKey", localVarResponse);
        }
        return new ApiResponse<SshKey>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SshKey>() {}) // closes the InputStream
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

  private HttpRequest.Builder getSshKeyRequestBuilder(String name) throws ApiException {
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getSshKey");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/ssh-key/{name}"
        .replace("{name}", ApiClient.urlEncode(name.toString()));

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
   * List SSH keys
   * 
   * @return ListSshKeys200Response
   * @throws ApiException if fails to make API call
   */
  public ListSshKeys200Response listSshKeys() throws ApiException {
    ApiResponse<ListSshKeys200Response> localVarResponse = listSshKeysWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * List SSH keys
   * 
   * @return ApiResponse&lt;ListSshKeys200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListSshKeys200Response> listSshKeysWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listSshKeysRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listSshKeys", localVarResponse);
        }
        return new ApiResponse<ListSshKeys200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListSshKeys200Response>() {}) // closes the InputStream
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

  private HttpRequest.Builder listSshKeysRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/ssh-key";

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
   * Import SSH key
   * 
   * @param registerSshKeyRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation registerSshKey(RegisterSshKeyRequest registerSshKeyRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = registerSshKeyWithHttpInfo(registerSshKeyRequest);
    return localVarResponse.getData();
  }

  /**
   * Import SSH key
   * 
   * @param registerSshKeyRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> registerSshKeyWithHttpInfo(RegisterSshKeyRequest registerSshKeyRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = registerSshKeyRequestBuilder(registerSshKeyRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("registerSshKey", localVarResponse);
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

  private HttpRequest.Builder registerSshKeyRequestBuilder(RegisterSshKeyRequest registerSshKeyRequest) throws ApiException {
    // verify the required parameter 'registerSshKeyRequest' is set
    if (registerSshKeyRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'registerSshKeyRequest' when calling registerSshKey");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/ssh-key";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(registerSshKeyRequest);
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
}
