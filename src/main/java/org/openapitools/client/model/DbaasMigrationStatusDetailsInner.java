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
import org.openapitools.client.model.EnumMigrationStatus;

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
 * DbaasMigrationStatusDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasMigrationStatusDetailsInner {
  public static final String SERIALIZED_NAME_DBNAME = "dbname";
  @SerializedName(SERIALIZED_NAME_DBNAME)
  private String dbname;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private EnumMigrationStatus status;

  public DbaasMigrationStatusDetailsInner() {
  }

  public DbaasMigrationStatusDetailsInner dbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

   /**
   * Migrated db name (PG) or number (Redis)
   * @return dbname
  **/
  @javax.annotation.Nullable
  public String getDbname() {
    return dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }


  public DbaasMigrationStatusDetailsInner error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message in case that migration has failed
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public DbaasMigrationStatusDetailsInner method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Migration method
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  public DbaasMigrationStatusDetailsInner status(EnumMigrationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public EnumMigrationStatus getStatus() {
    return status;
  }

  public void setStatus(EnumMigrationStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasMigrationStatusDetailsInner dbaasMigrationStatusDetailsInner = (DbaasMigrationStatusDetailsInner) o;
    return Objects.equals(this.dbname, dbaasMigrationStatusDetailsInner.dbname) &&
        Objects.equals(this.error, dbaasMigrationStatusDetailsInner.error) &&
        Objects.equals(this.method, dbaasMigrationStatusDetailsInner.method) &&
        Objects.equals(this.status, dbaasMigrationStatusDetailsInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbname, error, method, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasMigrationStatusDetailsInner {\n");
    sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("dbname");
    openapiFields.add("error");
    openapiFields.add("method");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasMigrationStatusDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasMigrationStatusDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasMigrationStatusDetailsInner is not found in the empty JSON string", DbaasMigrationStatusDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasMigrationStatusDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasMigrationStatusDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dbname") != null && !jsonObj.get("dbname").isJsonNull()) && !jsonObj.get("dbname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbname").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        EnumMigrationStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasMigrationStatusDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasMigrationStatusDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasMigrationStatusDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasMigrationStatusDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasMigrationStatusDetailsInner>() {
           @Override
           public void write(JsonWriter out, DbaasMigrationStatusDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasMigrationStatusDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasMigrationStatusDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasMigrationStatusDetailsInner
  * @throws IOException if the JSON string is invalid with respect to DbaasMigrationStatusDetailsInner
  */
  public static DbaasMigrationStatusDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasMigrationStatusDetailsInner.class);
  }

 /**
  * Convert an instance of DbaasMigrationStatusDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

