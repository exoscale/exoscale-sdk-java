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
 * GenericOAuthIntegration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class GenericOAuthIntegration {
  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_DOMAINS = "allowed_domains";
  @SerializedName(SERIALIZED_NAME_ALLOWED_DOMAINS)
  private List<String> allowedDomains = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWED_ORGANIZATIONS = "allowed_organizations";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ORGANIZATIONS)
  private List<String> allowedOrganizations = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_URL = "token_url";
  @SerializedName(SERIALIZED_NAME_TOKEN_URL)
  private String tokenUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AUTH_URL = "auth_url";
  @SerializedName(SERIALIZED_NAME_AUTH_URL)
  private String authUrl;

  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_AUTO_LOGIN = "auto_login";
  @SerializedName(SERIALIZED_NAME_AUTO_LOGIN)
  private Boolean autoLogin;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public static final String SERIALIZED_NAME_ALLOW_SIGN_UP = "allow_sign_up";
  @SerializedName(SERIALIZED_NAME_ALLOW_SIGN_UP)
  private Boolean allowSignUp;

  public GenericOAuthIntegration() {
  }

  public GenericOAuthIntegration scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public GenericOAuthIntegration addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public GenericOAuthIntegration allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public GenericOAuthIntegration addAllowedDomainsItem(String allowedDomainsItem) {
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


  public GenericOAuthIntegration allowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
    return this;
  }

  public GenericOAuthIntegration addAllowedOrganizationsItem(String allowedOrganizationsItem) {
    if (this.allowedOrganizations == null) {
      this.allowedOrganizations = new ArrayList<>();
    }
    this.allowedOrganizations.add(allowedOrganizationsItem);
    return this;
  }

   /**
   * Get allowedOrganizations
   * @return allowedOrganizations
  **/
  @javax.annotation.Nullable
  public List<String> getAllowedOrganizations() {
    return allowedOrganizations;
  }

  public void setAllowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
  }


  public GenericOAuthIntegration tokenUrl(String tokenUrl) {
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


  public GenericOAuthIntegration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public GenericOAuthIntegration authUrl(String authUrl) {
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


  public GenericOAuthIntegration apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * Get apiUrl
   * @return apiUrl
  **/
  @javax.annotation.Nonnull
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public GenericOAuthIntegration autoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
    return this;
  }

   /**
   * Get autoLogin
   * @return autoLogin
  **/
  @javax.annotation.Nullable
  public Boolean getAutoLogin() {
    return autoLogin;
  }

  public void setAutoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
  }


  public GenericOAuthIntegration clientId(String clientId) {
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


  public GenericOAuthIntegration clientSecret(String clientSecret) {
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


  public GenericOAuthIntegration allowSignUp(Boolean allowSignUp) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericOAuthIntegration genericOAuthIntegration = (GenericOAuthIntegration) o;
    return Objects.equals(this.scopes, genericOAuthIntegration.scopes) &&
        Objects.equals(this.allowedDomains, genericOAuthIntegration.allowedDomains) &&
        Objects.equals(this.allowedOrganizations, genericOAuthIntegration.allowedOrganizations) &&
        Objects.equals(this.tokenUrl, genericOAuthIntegration.tokenUrl) &&
        Objects.equals(this.name, genericOAuthIntegration.name) &&
        Objects.equals(this.authUrl, genericOAuthIntegration.authUrl) &&
        Objects.equals(this.apiUrl, genericOAuthIntegration.apiUrl) &&
        Objects.equals(this.autoLogin, genericOAuthIntegration.autoLogin) &&
        Objects.equals(this.clientId, genericOAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, genericOAuthIntegration.clientSecret) &&
        Objects.equals(this.allowSignUp, genericOAuthIntegration.allowSignUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopes, allowedDomains, allowedOrganizations, tokenUrl, name, authUrl, apiUrl, autoLogin, clientId, clientSecret, allowSignUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericOAuthIntegration {\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowedOrganizations: ").append(toIndentedString(allowedOrganizations)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
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
    openapiFields.add("scopes");
    openapiFields.add("allowed_domains");
    openapiFields.add("allowed_organizations");
    openapiFields.add("token_url");
    openapiFields.add("name");
    openapiFields.add("auth_url");
    openapiFields.add("api_url");
    openapiFields.add("auto_login");
    openapiFields.add("client_id");
    openapiFields.add("client_secret");
    openapiFields.add("allow_sign_up");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token_url");
    openapiRequiredFields.add("auth_url");
    openapiRequiredFields.add("api_url");
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("client_secret");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenericOAuthIntegration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenericOAuthIntegration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericOAuthIntegration is not found in the empty JSON string", GenericOAuthIntegration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenericOAuthIntegration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericOAuthIntegration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenericOAuthIntegration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull() && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_domains") != null && !jsonObj.get("allowed_domains").isJsonNull() && !jsonObj.get("allowed_domains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_domains` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_domains").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_organizations") != null && !jsonObj.get("allowed_organizations").isJsonNull() && !jsonObj.get("allowed_organizations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_organizations` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_organizations").toString()));
      }
      if (!jsonObj.get("token_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("auth_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_url").toString()));
      }
      if (!jsonObj.get("api_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_url").toString()));
      }
      if (!jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (!jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericOAuthIntegration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericOAuthIntegration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericOAuthIntegration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericOAuthIntegration.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericOAuthIntegration>() {
           @Override
           public void write(JsonWriter out, GenericOAuthIntegration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericOAuthIntegration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenericOAuthIntegration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericOAuthIntegration
  * @throws IOException if the JSON string is invalid with respect to GenericOAuthIntegration
  */
  public static GenericOAuthIntegration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericOAuthIntegration.class);
  }

 /**
  * Convert an instance of GenericOAuthIntegration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

