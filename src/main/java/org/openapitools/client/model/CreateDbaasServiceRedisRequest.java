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
import org.openapitools.client.model.JsonSchemaRedis;
import org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMaintenance;
import org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMigration;

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
 * CreateDbaasServiceRedisRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class CreateDbaasServiceRedisRequest {
  public static final String SERIALIZED_NAME_MAINTENANCE = "maintenance";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE)
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_TERMINATION_PROTECTION = "termination-protection";
  @SerializedName(SERIALIZED_NAME_TERMINATION_PROTECTION)
  private Boolean terminationProtection;

  public static final String SERIALIZED_NAME_IP_FILTER = "ip-filter";
  @SerializedName(SERIALIZED_NAME_IP_FILTER)
  private List<String> ipFilter = new ArrayList<>();

  public static final String SERIALIZED_NAME_MIGRATION = "migration";
  @SerializedName(SERIALIZED_NAME_MIGRATION)
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public static final String SERIALIZED_NAME_REDIS_SETTINGS = "redis-settings";
  @SerializedName(SERIALIZED_NAME_REDIS_SETTINGS)
  private JsonSchemaRedis redisSettings;

  public static final String SERIALIZED_NAME_FORK_FROM_SERVICE = "fork-from-service";
  @SerializedName(SERIALIZED_NAME_FORK_FROM_SERVICE)
  private String forkFromService;

  public static final String SERIALIZED_NAME_RECOVERY_BACKUP_NAME = "recovery-backup-name";
  @SerializedName(SERIALIZED_NAME_RECOVERY_BACKUP_NAME)
  private String recoveryBackupName;

  public CreateDbaasServiceRedisRequest() {
  }

  public CreateDbaasServiceRedisRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  public UpdateDbaasServiceMysqlRequestMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public CreateDbaasServiceRedisRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }


  public CreateDbaasServiceRedisRequest terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  public Boolean getTerminationProtection() {
    return terminationProtection;
  }

  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public CreateDbaasServiceRedisRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceRedisRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  public List<String> getIpFilter() {
    return ipFilter;
  }

  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  public CreateDbaasServiceRedisRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
    this.migration = migration;
    return this;
  }

   /**
   * Get migration
   * @return migration
  **/
  @javax.annotation.Nullable
  public UpdateDbaasServiceMysqlRequestMigration getMigration() {
    return migration;
  }

  public void setMigration(UpdateDbaasServiceMysqlRequestMigration migration) {
    this.migration = migration;
  }


  public CreateDbaasServiceRedisRequest redisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
    return this;
  }

   /**
   * Get redisSettings
   * @return redisSettings
  **/
  @javax.annotation.Nullable
  public JsonSchemaRedis getRedisSettings() {
    return redisSettings;
  }

  public void setRedisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
  }


  public CreateDbaasServiceRedisRequest forkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @javax.annotation.Nullable
  public String getForkFromService() {
    return forkFromService;
  }

  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }


  public CreateDbaasServiceRedisRequest recoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
    return this;
  }

   /**
   * Name of a backup to recover from for services that support backup names
   * @return recoveryBackupName
  **/
  @javax.annotation.Nullable
  public String getRecoveryBackupName() {
    return recoveryBackupName;
  }

  public void setRecoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest = (CreateDbaasServiceRedisRequest) o;
    return Objects.equals(this.maintenance, createDbaasServiceRedisRequest.maintenance) &&
        Objects.equals(this.plan, createDbaasServiceRedisRequest.plan) &&
        Objects.equals(this.terminationProtection, createDbaasServiceRedisRequest.terminationProtection) &&
        Objects.equals(this.ipFilter, createDbaasServiceRedisRequest.ipFilter) &&
        Objects.equals(this.migration, createDbaasServiceRedisRequest.migration) &&
        Objects.equals(this.redisSettings, createDbaasServiceRedisRequest.redisSettings) &&
        Objects.equals(this.forkFromService, createDbaasServiceRedisRequest.forkFromService) &&
        Objects.equals(this.recoveryBackupName, createDbaasServiceRedisRequest.recoveryBackupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, ipFilter, migration, redisSettings, forkFromService, recoveryBackupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceRedisRequest {\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    redisSettings: ").append(toIndentedString(redisSettings)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    recoveryBackupName: ").append(toIndentedString(recoveryBackupName)).append("\n");
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
    openapiFields.add("maintenance");
    openapiFields.add("plan");
    openapiFields.add("termination-protection");
    openapiFields.add("ip-filter");
    openapiFields.add("migration");
    openapiFields.add("redis-settings");
    openapiFields.add("fork-from-service");
    openapiFields.add("recovery-backup-name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("plan");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDbaasServiceRedisRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDbaasServiceRedisRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDbaasServiceRedisRequest is not found in the empty JSON string", CreateDbaasServiceRedisRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDbaasServiceRedisRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDbaasServiceRedisRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDbaasServiceRedisRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `maintenance`
      if (jsonObj.get("maintenance") != null && !jsonObj.get("maintenance").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestMaintenance.validateJsonElement(jsonObj.get("maintenance"));
      }
      if (!jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip-filter") != null && !jsonObj.get("ip-filter").isJsonNull() && !jsonObj.get("ip-filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip-filter` to be an array in the JSON string but got `%s`", jsonObj.get("ip-filter").toString()));
      }
      // validate the optional field `migration`
      if (jsonObj.get("migration") != null && !jsonObj.get("migration").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestMigration.validateJsonElement(jsonObj.get("migration"));
      }
      // validate the optional field `redis-settings`
      if (jsonObj.get("redis-settings") != null && !jsonObj.get("redis-settings").isJsonNull()) {
        JsonSchemaRedis.validateJsonElement(jsonObj.get("redis-settings"));
      }
      if ((jsonObj.get("fork-from-service") != null && !jsonObj.get("fork-from-service").isJsonNull()) && !jsonObj.get("fork-from-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fork-from-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fork-from-service").toString()));
      }
      if ((jsonObj.get("recovery-backup-name") != null && !jsonObj.get("recovery-backup-name").isJsonNull()) && !jsonObj.get("recovery-backup-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery-backup-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery-backup-name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDbaasServiceRedisRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDbaasServiceRedisRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDbaasServiceRedisRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDbaasServiceRedisRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDbaasServiceRedisRequest>() {
           @Override
           public void write(JsonWriter out, CreateDbaasServiceRedisRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDbaasServiceRedisRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDbaasServiceRedisRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDbaasServiceRedisRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDbaasServiceRedisRequest
  */
  public static CreateDbaasServiceRedisRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDbaasServiceRedisRequest.class);
  }

 /**
  * Convert an instance of CreateDbaasServiceRedisRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

