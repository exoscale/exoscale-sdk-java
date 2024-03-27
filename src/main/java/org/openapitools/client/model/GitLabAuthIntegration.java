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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * GitLabAuthIntegration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class GitLabAuthIntegration {
  public static final String SERIALIZED_NAME_ALLOW_SIGN_UP = "allow_sign_up";
  @SerializedName(SERIALIZED_NAME_ALLOW_SIGN_UP)
  private Boolean allowSignUp;

  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_AUTH_URL = "auth_url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_ALLOWED_GROUPS = "allowed_groups";
  @SerializedName(SERIALIZED_NAME_ALLOWED_GROUPS)
  private List<String> allowedGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_URL = "token_url";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public GitLabAuthIntegration() {
  }

  public GitLabAuthIntegration allowSignUp(Boolean allowSignUp) {
    this.allowSignUp = allowSignUp;
    return this;
  }

   /**
   * Get allowSignUp
   * @return allowSignUp
  **/
  @javax.annotation.Nullable
  public Boolean getAllowSignUp() {
    return allowSignUp;
  }

  public void setAllowSignUp(Boolean allowSignUp) {
    this.allowSignUp = allowSignUp;
  }


  public GitLabAuthIntegration apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nullable
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public GitLabAuthIntegration authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  @javax.annotation.Nullable
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public GitLabAuthIntegration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nonnull
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public GitLabAuthIntegration clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nonnull
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public GitLabAuthIntegration allowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
    return this;
  }

  public GitLabAuthIntegration addAllowedGroupsItem(String allowedGroupsItem) {
    if (this.allowedGroups == null) {
      this.allowedGroups = new ArrayList<>();
    }
    this.allowedGroups.add(allowedGroupsItem);
    return this;
  }

   /**
   * Get allowedGroups
   * @return allowedGroups
  **/
  @javax.annotation.Nonnull
  public List<String> getAllowedGroups() {
    return allowedGroups;
  }

  public void setAllowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
  }


  public GitLabAuthIntegration tokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Get tokenUrl
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  public String getTokenUrl() {
    return tokenUrl;
  }

  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitLabAuthIntegration gitLabAuthIntegration = (GitLabAuthIntegration) o;
    return Objects.equals(this.allowSignUp, gitLabAuthIntegration.allowSignUp) &&
        Objects.equals(this.apiUrl, gitLabAuthIntegration.apiUrl) &&
        Objects.equals(this.authUrl, gitLabAuthIntegration.authUrl) &&
        Objects.equals(this.clientId, gitLabAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, gitLabAuthIntegration.clientSecret) &&
        Objects.equals(this.allowedGroups, gitLabAuthIntegration.allowedGroups) &&
        Objects.equals(this.tokenUrl, gitLabAuthIntegration.tokenUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, apiUrl, authUrl, clientId, clientSecret, allowedGroups, tokenUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitLabAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allow_sign_up");
    openapiFields.add("api_url");
    openapiFields.add("auth_url");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("allowed_groups");
    openapiFields.add("token_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_secret");
    openapiRequiredFields.add("allowed_groups");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GitLabAuthIntegration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GitLabAuthIntegration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GitLabAuthIntegration is not found in the empty JSON string", GitLabAuthIntegration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GitLabAuthIntegration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GitLabAuthIntegration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GitLabAuthIntegration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("api_url") != null && !jsonObj.get("api_url").isJsonNull()) && !jsonObj.get("api_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_url").toString()));
      }
      if ((jsonObj.get("auth_url") != null && !jsonObj.get("auth_url").isJsonNull()) && !jsonObj.get("auth_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_url").toString()));
      }
      if (!jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (!jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("allowed_groups") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("allowed_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_groups` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_groups").toString()));
      }
      if ((jsonObj.get("token_url") != null && !jsonObj.get("token_url").isJsonNull()) && !jsonObj.get("token_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GitLabAuthIntegration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GitLabAuthIntegration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GitLabAuthIntegration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GitLabAuthIntegration.class));

       return (TypeAdapter<T>) new TypeAdapter<GitLabAuthIntegration>() {
           @Override
           public void write(JsonWriter out, GitLabAuthIntegration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GitLabAuthIntegration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GitLabAuthIntegration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GitLabAuthIntegration
  * @throws IOException if the JSON string is invalid with respect to GitLabAuthIntegration
  */
  public static GitLabAuthIntegration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GitLabAuthIntegration.class);
  }

 /**
  * Convert an instance of GitLabAuthIntegration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

