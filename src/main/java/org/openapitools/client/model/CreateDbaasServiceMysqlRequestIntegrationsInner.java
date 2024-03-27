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
 * CreateDbaasServiceMysqlRequestIntegrationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class CreateDbaasServiceMysqlRequestIntegrationsInner {
  /**
   * Integration type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    READ_REPLICA("read_replica");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SOURCE_SERVICE = "source-service";
  @SerializedName(SERIALIZED_NAME_SOURCE_SERVICE)
  private String sourceService;

  public static final String SERIALIZED_NAME_DEST_SERVICE = "dest-service";
  @SerializedName(SERIALIZED_NAME_DEST_SERVICE)
  private String destService;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Object settings;

  public CreateDbaasServiceMysqlRequestIntegrationsInner() {
  }

  public CreateDbaasServiceMysqlRequestIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Integration type
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

   /**
   * Get sourceService
   * @return sourceService
  **/
  @javax.annotation.Nullable
  public String getSourceService() {
    return sourceService;
  }

  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner destService(String destService) {
    this.destService = destService;
    return this;
  }

   /**
   * Get destService
   * @return destService
  **/
  @javax.annotation.Nullable
  public String getDestService() {
    return destService;
  }

  public void setDestService(String destService) {
    this.destService = destService;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner settings(Object settings) {
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
    CreateDbaasServiceMysqlRequestIntegrationsInner createDbaasServiceMysqlRequestIntegrationsInner = (CreateDbaasServiceMysqlRequestIntegrationsInner) o;
    return Objects.equals(this.type, createDbaasServiceMysqlRequestIntegrationsInner.type) &&
        Objects.equals(this.sourceService, createDbaasServiceMysqlRequestIntegrationsInner.sourceService) &&
        Objects.equals(this.destService, createDbaasServiceMysqlRequestIntegrationsInner.destService) &&
        Objects.equals(this.settings, createDbaasServiceMysqlRequestIntegrationsInner.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceService, destService, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceMysqlRequestIntegrationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("source-service");
    openapiFields.add("dest-service");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDbaasServiceMysqlRequestIntegrationsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDbaasServiceMysqlRequestIntegrationsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDbaasServiceMysqlRequestIntegrationsInner is not found in the empty JSON string", CreateDbaasServiceMysqlRequestIntegrationsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDbaasServiceMysqlRequestIntegrationsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDbaasServiceMysqlRequestIntegrationsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDbaasServiceMysqlRequestIntegrationsInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("source-service") != null && !jsonObj.get("source-service").isJsonNull()) && !jsonObj.get("source-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source-service").toString()));
      }
      if ((jsonObj.get("dest-service") != null && !jsonObj.get("dest-service").isJsonNull()) && !jsonObj.get("dest-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dest-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dest-service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDbaasServiceMysqlRequestIntegrationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDbaasServiceMysqlRequestIntegrationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDbaasServiceMysqlRequestIntegrationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDbaasServiceMysqlRequestIntegrationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDbaasServiceMysqlRequestIntegrationsInner>() {
           @Override
           public void write(JsonWriter out, CreateDbaasServiceMysqlRequestIntegrationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDbaasServiceMysqlRequestIntegrationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDbaasServiceMysqlRequestIntegrationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDbaasServiceMysqlRequestIntegrationsInner
  * @throws IOException if the JSON string is invalid with respect to CreateDbaasServiceMysqlRequestIntegrationsInner
  */
  public static CreateDbaasServiceMysqlRequestIntegrationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDbaasServiceMysqlRequestIntegrationsInner.class);
  }

 /**
  * Convert an instance of CreateDbaasServiceMysqlRequestIntegrationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

