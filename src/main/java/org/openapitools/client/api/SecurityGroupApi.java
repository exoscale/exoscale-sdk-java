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

import org.openapitools.client.model.AddExternalSourceToSecurityGroupRequest;
import org.openapitools.client.model.AddRuleToSecurityGroupRequest;
import org.openapitools.client.model.CreateSecurityGroupRequest;
import org.openapitools.client.model.DetachInstanceFromPrivateNetworkRequest;
import org.openapitools.client.model.ListSecurityGroups200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.RemoveExternalSourceFromSecurityGroupRequest;
import org.openapitools.client.model.SecurityGroup;
import java.util.UUID;

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
public class SecurityGroupApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SecurityGroupApi() {
    this(new ApiClient());
  }

  public SecurityGroupApi(ApiClient apiClient) {
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
   * Add an external source as a member of a Security Group
   * 
   * @param id  (required)
   * @param addExternalSourceToSecurityGroupRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation addExternalSourceToSecurityGroup(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = addExternalSourceToSecurityGroupWithHttpInfo(id, addExternalSourceToSecurityGroupRequest);
    return localVarResponse.getData();
  }

  /**
   * Add an external source as a member of a Security Group
   * 
   * @param id  (required)
   * @param addExternalSourceToSecurityGroupRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> addExternalSourceToSecurityGroupWithHttpInfo(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = addExternalSourceToSecurityGroupRequestBuilder(id, addExternalSourceToSecurityGroupRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("addExternalSourceToSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder addExternalSourceToSecurityGroupRequestBuilder(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addExternalSourceToSecurityGroup");
    }
    // verify the required parameter 'addExternalSourceToSecurityGroupRequest' is set
    if (addExternalSourceToSecurityGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'addExternalSourceToSecurityGroupRequest' when calling addExternalSourceToSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}:add-source"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(addExternalSourceToSecurityGroupRequest);
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
   * Create a Security Group rule
   * 
   * @param id  (required)
   * @param addRuleToSecurityGroupRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation addRuleToSecurityGroup(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = addRuleToSecurityGroupWithHttpInfo(id, addRuleToSecurityGroupRequest);
    return localVarResponse.getData();
  }

  /**
   * Create a Security Group rule
   * 
   * @param id  (required)
   * @param addRuleToSecurityGroupRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> addRuleToSecurityGroupWithHttpInfo(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = addRuleToSecurityGroupRequestBuilder(id, addRuleToSecurityGroupRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("addRuleToSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder addRuleToSecurityGroupRequestBuilder(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addRuleToSecurityGroup");
    }
    // verify the required parameter 'addRuleToSecurityGroupRequest' is set
    if (addRuleToSecurityGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'addRuleToSecurityGroupRequest' when calling addRuleToSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}/rules"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(addRuleToSecurityGroupRequest);
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
   * Attach a Compute instance to a Security Group
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation attachInstanceToSecurityGroup(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = attachInstanceToSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Attach a Compute instance to a Security Group
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> attachInstanceToSecurityGroupWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = attachInstanceToSecurityGroupRequestBuilder(id, detachInstanceFromPrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("attachInstanceToSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder attachInstanceToSecurityGroupRequestBuilder(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling attachInstanceToSecurityGroup");
    }
    // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
    if (detachInstanceFromPrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling attachInstanceToSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}:attach"
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
   * Create a Security Group
   * 
   * @param createSecurityGroupRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = createSecurityGroupWithHttpInfo(createSecurityGroupRequest);
    return localVarResponse.getData();
  }

  /**
   * Create a Security Group
   * 
   * @param createSecurityGroupRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> createSecurityGroupWithHttpInfo(CreateSecurityGroupRequest createSecurityGroupRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createSecurityGroupRequestBuilder(createSecurityGroupRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder createSecurityGroupRequestBuilder(CreateSecurityGroupRequest createSecurityGroupRequest) throws ApiException {
    // verify the required parameter 'createSecurityGroupRequest' is set
    if (createSecurityGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createSecurityGroupRequest' when calling createSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createSecurityGroupRequest);
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
   * Delete a Security Group rule
   * 
   * @param id  (required)
   * @param ruleId  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteRuleFromSecurityGroup(UUID id, UUID ruleId) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteRuleFromSecurityGroupWithHttpInfo(id, ruleId);
    return localVarResponse.getData();
  }

  /**
   * Delete a Security Group rule
   * 
   * @param id  (required)
   * @param ruleId  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteRuleFromSecurityGroupWithHttpInfo(UUID id, UUID ruleId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteRuleFromSecurityGroupRequestBuilder(id, ruleId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteRuleFromSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder deleteRuleFromSecurityGroupRequestBuilder(UUID id, UUID ruleId) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRuleFromSecurityGroup");
    }
    // verify the required parameter 'ruleId' is set
    if (ruleId == null) {
      throw new ApiException(400, "Missing the required parameter 'ruleId' when calling deleteRuleFromSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}/rules/{rule-id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()))
        .replace("{rule-id}", ApiClient.urlEncode(ruleId.toString()));

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
   * Delete a Security Group
   * 
   * @param id  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation deleteSecurityGroup(UUID id) throws ApiException {
    ApiResponse<Operation> localVarResponse = deleteSecurityGroupWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Delete a Security Group
   * 
   * @param id  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> deleteSecurityGroupWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteSecurityGroupRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder deleteSecurityGroupRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}"
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
   * Detach a Compute instance from a Security Group
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation detachInstanceFromSecurityGroup(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = detachInstanceFromSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
    return localVarResponse.getData();
  }

  /**
   * Detach a Compute instance from a Security Group
   * 
   * @param id  (required)
   * @param detachInstanceFromPrivateNetworkRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> detachInstanceFromSecurityGroupWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = detachInstanceFromSecurityGroupRequestBuilder(id, detachInstanceFromPrivateNetworkRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("detachInstanceFromSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder detachInstanceFromSecurityGroupRequestBuilder(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling detachInstanceFromSecurityGroup");
    }
    // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
    if (detachInstanceFromPrivateNetworkRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling detachInstanceFromSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}:detach"
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
   * Retrieve Security Group details
   * 
   * @param id  (required)
   * @return SecurityGroup
   * @throws ApiException if fails to make API call
   */
  public SecurityGroup getSecurityGroup(UUID id) throws ApiException {
    ApiResponse<SecurityGroup> localVarResponse = getSecurityGroupWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * Retrieve Security Group details
   * 
   * @param id  (required)
   * @return ApiResponse&lt;SecurityGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecurityGroup> getSecurityGroupWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSecurityGroupRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSecurityGroup", localVarResponse);
        }
        return new ApiResponse<SecurityGroup>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SecurityGroup>() {}) // closes the InputStream
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

  private HttpRequest.Builder getSecurityGroupRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}"
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
   * List Security Groups.
   * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
   * @param visibility  (optional)
   * @return ListSecurityGroups200Response
   * @throws ApiException if fails to make API call
   */
  public ListSecurityGroups200Response listSecurityGroups(String visibility) throws ApiException {
    ApiResponse<ListSecurityGroups200Response> localVarResponse = listSecurityGroupsWithHttpInfo(visibility);
    return localVarResponse.getData();
  }

  /**
   * List Security Groups.
   * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
   * @param visibility  (optional)
   * @return ApiResponse&lt;ListSecurityGroups200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListSecurityGroups200Response> listSecurityGroupsWithHttpInfo(String visibility) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listSecurityGroupsRequestBuilder(visibility);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listSecurityGroups", localVarResponse);
        }
        return new ApiResponse<ListSecurityGroups200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListSecurityGroups200Response>() {}) // closes the InputStream
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

  private HttpRequest.Builder listSecurityGroupsRequestBuilder(String visibility) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "visibility";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("visibility", visibility));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

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
   * Remove an external source from a Security Group
   * 
   * @param id  (required)
   * @param removeExternalSourceFromSecurityGroupRequest  (required)
   * @return Operation
   * @throws ApiException if fails to make API call
   */
  public Operation removeExternalSourceFromSecurityGroup(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws ApiException {
    ApiResponse<Operation> localVarResponse = removeExternalSourceFromSecurityGroupWithHttpInfo(id, removeExternalSourceFromSecurityGroupRequest);
    return localVarResponse.getData();
  }

  /**
   * Remove an external source from a Security Group
   * 
   * @param id  (required)
   * @param removeExternalSourceFromSecurityGroupRequest  (required)
   * @return ApiResponse&lt;Operation&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Operation> removeExternalSourceFromSecurityGroupWithHttpInfo(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = removeExternalSourceFromSecurityGroupRequestBuilder(id, removeExternalSourceFromSecurityGroupRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("removeExternalSourceFromSecurityGroup", localVarResponse);
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

  private HttpRequest.Builder removeExternalSourceFromSecurityGroupRequestBuilder(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeExternalSourceFromSecurityGroup");
    }
    // verify the required parameter 'removeExternalSourceFromSecurityGroupRequest' is set
    if (removeExternalSourceFromSecurityGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'removeExternalSourceFromSecurityGroupRequest' when calling removeExternalSourceFromSecurityGroup");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/security-group/{id}:remove-source"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(removeExternalSourceFromSecurityGroupRequest);
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
