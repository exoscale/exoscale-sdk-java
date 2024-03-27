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
import java.util.Arrays;
import org.openapitools.client.model.ListDbaasIntegrationSettings200ResponseSettings;

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
 * ListDbaasIntegrationSettings200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ListDbaasIntegrationSettings200Response {
  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private ListDbaasIntegrationSettings200ResponseSettings settings;

  public ListDbaasIntegrationSettings200Response() {
  }

  public ListDbaasIntegrationSettings200Response settings(ListDbaasIntegrationSettings200ResponseSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public ListDbaasIntegrationSettings200ResponseSettings getSettings() {
    return settings;
  }

  public void setSettings(ListDbaasIntegrationSettings200ResponseSettings settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasIntegrationSettings200Response listDbaasIntegrationSettings200Response = (ListDbaasIntegrationSettings200Response) o;
    return Objects.equals(this.settings, listDbaasIntegrationSettings200Response.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasIntegrationSettings200Response {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListDbaasIntegrationSettings200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListDbaasIntegrationSettings200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDbaasIntegrationSettings200Response is not found in the empty JSON string", ListDbaasIntegrationSettings200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListDbaasIntegrationSettings200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDbaasIntegrationSettings200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        ListDbaasIntegrationSettings200ResponseSettings.validateJsonElement(jsonObj.get("settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListDbaasIntegrationSettings200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDbaasIntegrationSettings200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDbaasIntegrationSettings200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDbaasIntegrationSettings200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDbaasIntegrationSettings200Response>() {
           @Override
           public void write(JsonWriter out, ListDbaasIntegrationSettings200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDbaasIntegrationSettings200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDbaasIntegrationSettings200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDbaasIntegrationSettings200Response
  * @throws IOException if the JSON string is invalid with respect to ListDbaasIntegrationSettings200Response
  */
  public static ListDbaasIntegrationSettings200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDbaasIntegrationSettings200Response.class);
  }

 /**
  * Convert an instance of ListDbaasIntegrationSettings200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

