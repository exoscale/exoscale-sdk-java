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
 * AzureADOAuthIntegration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class AzureADOAuthIntegration {
  public static final String SERIALIZED_NAME_ALLOW_SIGN_UP = "allow_sign_up";
  @SerializedName(SERIALIZED_NAME_ALLOW_SIGN_UP)
  private Boolean allowSignUp;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_AUTH_URL = "auth_url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_TOKEN_URL = "token_url";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public static final String SERIALIZED_NAME_ALLOWED_GROUPS = "allowed_groups";
  @SerializedName(SERIALIZED_NAME_ALLOWED_GROUPS)
  private List<String> allowedGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed_domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private List<String> allowedDomains = new ArrayList<>();

  public AzureADOAuthIntegration() {
  }

  public AzureADOAuthIntegration allowSignUp(Boolean allowSignUp) {
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


  public AzureADOAuthIntegration clientId(String clientId) {
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


  public AzureADOAuthIntegration clientSecret(String clientSecret) {
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


  public AzureADOAuthIntegration authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * Get authUrl
   * @return authUrl
  **/
  @javax.annotation.Nonnull
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }


  public AzureADOAuthIntegration tokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Get tokenUrl
   * @return tokenUrl
  **/
  @javax.annotation.Nonnull
  public String getTokenUrl() {
    return tokenUrl;
  }

  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  public AzureADOAuthIntegration allowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
    return this;
  }

  public AzureADOAuthIntegration addAllowedGroupsItem(String allowedGroupsItem) {
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
  @javax.annotation.Nullable
  public List<String> getAllowedGroups() {
    return allowedGroups;
  }

  public void setAllowedGroups(List<String> allowedGroups) {
    this.allowedGroups = allowedGroups;
  }


  public AzureADOAuthIntegration allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public AzureADOAuthIntegration addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new ArrayList<>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

   /**
   * Get allowedDomains
   * @return allowedDomains
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureADOAuthIntegration azureADOAuthIntegration = (AzureADOAuthIntegration) o;
    return Objects.equals(this.allowSignUp, azureADOAuthIntegration.allowSignUp) &&
        Objects.equals(this.clientId, azureADOAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, azureADOAuthIntegration.clientSecret) &&
        Objects.equals(this.authUrl, azureADOAuthIntegration.authUrl) &&
        Objects.equals(this.tokenUrl, azureADOAuthIntegration.tokenUrl) &&
        Objects.equals(this.allowedGroups, azureADOAuthIntegration.allowedGroups) &&
        Objects.equals(this.allowedDomains, azureADOAuthIntegration.allowedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, clientId, clientSecret, authUrl, tokenUrl, allowedGroups, allowedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureADOAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    allowedGroups: ").append(toIndentedString(allowedGroups)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("auth_url");
    openapiFields.add("token_url");
    openapiFields.add("allowed_groups");
    openapiFields.add("allowed_domains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_secret");
    openapiRequiredFields.add("auth_url");
    openapiRequiredFields.add("token_url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AzureADOAuthIntegration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AzureADOAuthIntegration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AzureADOAuthIntegration is not found in the empty JSON string", AzureADOAuthIntegration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AzureADOAuthIntegration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AzureADOAuthIntegration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AzureADOAuthIntegration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (!jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
      if (!jsonObj.get("auth_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_url").toString()));
      }
      if (!jsonObj.get("token_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_groups") != null && !jsonObj.get("allowed_groups").isJsonNull() && !jsonObj.get("allowed_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_groups` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_groups").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_domains") != null && !jsonObj.get("allowed_domains").isJsonNull() && !jsonObj.get("allowed_domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_domains` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_domains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AzureADOAuthIntegration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AzureADOAuthIntegration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AzureADOAuthIntegration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AzureADOAuthIntegration.class));

       return (TypeAdapter<T>) new TypeAdapter<AzureADOAuthIntegration>() {
           @Override
           public void write(JsonWriter out, AzureADOAuthIntegration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AzureADOAuthIntegration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AzureADOAuthIntegration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AzureADOAuthIntegration
  * @throws IOException if the JSON string is invalid with respect to AzureADOAuthIntegration
  */
  public static AzureADOAuthIntegration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AzureADOAuthIntegration.class);
  }

 /**
  * Convert an instance of AzureADOAuthIntegration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

