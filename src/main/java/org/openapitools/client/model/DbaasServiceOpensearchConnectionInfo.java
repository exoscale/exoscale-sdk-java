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
 * Opensearch connection information properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasServiceOpensearchConnectionInfo {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private List<String> uri = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_DASHBOARD_URI = "dashboard-uri";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_URI)
  private String dashboardUri;

  public DbaasServiceOpensearchConnectionInfo() {
  }

  public DbaasServiceOpensearchConnectionInfo uri(List<String> uri) {
    this.uri = uri;
    return this;
  }

  public DbaasServiceOpensearchConnectionInfo addUriItem(String uriItem) {
    if (this.uri == null) {
      this.uri = new ArrayList<>();
    }
    this.uri.add(uriItem);
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public List<String> getUri() {
    return uri;
  }

  public void setUri(List<String> uri) {
    this.uri = uri;
  }


  public DbaasServiceOpensearchConnectionInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public DbaasServiceOpensearchConnectionInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public DbaasServiceOpensearchConnectionInfo dashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
    return this;
  }

   /**
   * Get dashboardUri
   * @return dashboardUri
  **/
  @javax.annotation.Nullable
  public String getDashboardUri() {
    return dashboardUri;
  }

  public void setDashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceOpensearchConnectionInfo dbaasServiceOpensearchConnectionInfo = (DbaasServiceOpensearchConnectionInfo) o;
    return Objects.equals(this.uri, dbaasServiceOpensearchConnectionInfo.uri) &&
        Objects.equals(this.username, dbaasServiceOpensearchConnectionInfo.username) &&
        Objects.equals(this.password, dbaasServiceOpensearchConnectionInfo.password) &&
        Objects.equals(this.dashboardUri, dbaasServiceOpensearchConnectionInfo.dashboardUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, username, password, dashboardUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceOpensearchConnectionInfo {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    dashboardUri: ").append(toIndentedString(dashboardUri)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("dashboard-uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceOpensearchConnectionInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceOpensearchConnectionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceOpensearchConnectionInfo is not found in the empty JSON string", DbaasServiceOpensearchConnectionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceOpensearchConnectionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceOpensearchConnectionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull() && !jsonObj.get("uri").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be an array in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("dashboard-uri") != null && !jsonObj.get("dashboard-uri").isJsonNull()) && !jsonObj.get("dashboard-uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dashboard-uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dashboard-uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceOpensearchConnectionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceOpensearchConnectionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceOpensearchConnectionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceOpensearchConnectionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceOpensearchConnectionInfo>() {
           @Override
           public void write(JsonWriter out, DbaasServiceOpensearchConnectionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceOpensearchConnectionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceOpensearchConnectionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceOpensearchConnectionInfo
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceOpensearchConnectionInfo
  */
  public static DbaasServiceOpensearchConnectionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceOpensearchConnectionInfo.class);
  }

 /**
  * Convert an instance of DbaasServiceOpensearchConnectionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

