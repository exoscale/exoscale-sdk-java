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
import org.openapitools.client.model.EnumIntegrationTypes;

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
 * CreateDbaasIntegrationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class CreateDbaasIntegrationRequest {
  public static final String SERIALIZED_NAME_INTEGRATION_TYPE = "integration-type";
  @SerializedName(SERIALIZED_NAME_INTEGRATION_TYPE)
  private EnumIntegrationTypes integrationType;

  public static final String SERIALIZED_NAME_SOURCE_SERVICE = "source-service";
  @SerializedName(SERIALIZED_NAME_SOURCE_SERVICE)
  private String sourceService;

  public static final String SERIALIZED_NAME_DEST_SERVICE = "dest-service";
  @SerializedName(SERIALIZED_NAME_DEST_SERVICE)
  private String destService;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Object settings;

  public CreateDbaasIntegrationRequest() {
  }

  public CreateDbaasIntegrationRequest integrationType(EnumIntegrationTypes integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Get integrationType
   * @return integrationType
  **/
  @javax.annotation.Nonnull
  public EnumIntegrationTypes getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(EnumIntegrationTypes integrationType) {
    this.integrationType = integrationType;
  }


  public CreateDbaasIntegrationRequest sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

   /**
   * Get sourceService
   * @return sourceService
  **/
  @javax.annotation.Nonnull
  public String getSourceService() {
    return sourceService;
  }

  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }


  public CreateDbaasIntegrationRequest destService(String destService) {
    this.destService = destService;
    return this;
  }

   /**
   * Get destService
   * @return destService
  **/
  @javax.annotation.Nonnull
  public String getDestService() {
    return destService;
  }

  public void setDestService(String destService) {
    this.destService = destService;
  }


  public CreateDbaasIntegrationRequest settings(Object settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Integration settings
   * @return settings
  **/
  @javax.annotation.Nullable
  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
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
    CreateDbaasIntegrationRequest createDbaasIntegrationRequest = (CreateDbaasIntegrationRequest) o;
    return Objects.equals(this.integrationType, createDbaasIntegrationRequest.integrationType) &&
        Objects.equals(this.sourceService, createDbaasIntegrationRequest.sourceService) &&
        Objects.equals(this.destService, createDbaasIntegrationRequest.destService) &&
        Objects.equals(this.settings, createDbaasIntegrationRequest.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationType, sourceService, destService, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasIntegrationRequest {\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    destService: ").append(toIndentedString(destService)).append("\n");
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
    openapiFields.add("integration-type");
    openapiFields.add("source-service");
    openapiFields.add("dest-service");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("integration-type");
    openapiRequiredFields.add("source-service");
    openapiRequiredFields.add("dest-service");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDbaasIntegrationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDbaasIntegrationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDbaasIntegrationRequest is not found in the empty JSON string", CreateDbaasIntegrationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDbaasIntegrationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDbaasIntegrationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDbaasIntegrationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `integration-type`
      EnumIntegrationTypes.validateJsonElement(jsonObj.get("integration-type"));
      if (!jsonObj.get("source-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source-service").toString()));
      }
      if (!jsonObj.get("dest-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dest-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dest-service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDbaasIntegrationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDbaasIntegrationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDbaasIntegrationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDbaasIntegrationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDbaasIntegrationRequest>() {
           @Override
           public void write(JsonWriter out, CreateDbaasIntegrationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDbaasIntegrationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDbaasIntegrationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDbaasIntegrationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDbaasIntegrationRequest
  */
  public static CreateDbaasIntegrationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDbaasIntegrationRequest.class);
  }

 /**
  * Convert an instance of CreateDbaasIntegrationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

