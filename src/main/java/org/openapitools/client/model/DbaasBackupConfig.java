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
 * DBaaS plan backup config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasBackupConfig {
  public static final String SERIALIZED_NAME_MAX_COUNT = "max-count";
  @SerializedName(SERIALIZED_NAME_MAX_COUNT)
  private Long maxCount;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Long interval;

  public static final String SERIALIZED_NAME_RECOVERY_MODE = "recovery-mode";
  @SerializedName(SERIALIZED_NAME_RECOVERY_MODE)
  private String recoveryMode;

  public static final String SERIALIZED_NAME_FREQUENT_INTERVAL_MINUTES = "frequent-interval-minutes";
  @SerializedName(SERIALIZED_NAME_FREQUENT_INTERVAL_MINUTES)
  private Long frequentIntervalMinutes;

  public static final String SERIALIZED_NAME_FREQUENT_OLDEST_AGE_MINUTES = "frequent-oldest-age-minutes";
  @SerializedName(SERIALIZED_NAME_FREQUENT_OLDEST_AGE_MINUTES)
  private Long frequentOldestAgeMinutes;

  public static final String SERIALIZED_NAME_INFREQUENT_INTERVAL_MINUTES = "infrequent-interval-minutes";
  @SerializedName(SERIALIZED_NAME_INFREQUENT_INTERVAL_MINUTES)
  private Long infrequentIntervalMinutes;

  public static final String SERIALIZED_NAME_INFREQUENT_OLDEST_AGE_MINUTES = "infrequent-oldest-age-minutes";
  @SerializedName(SERIALIZED_NAME_INFREQUENT_OLDEST_AGE_MINUTES)
  private Long infrequentOldestAgeMinutes;

  public DbaasBackupConfig() {
  }

  public DbaasBackupConfig(
     Long maxCount, 
     Long interval, 
     String recoveryMode, 
     Long frequentIntervalMinutes, 
     Long frequentOldestAgeMinutes, 
     Long infrequentIntervalMinutes, 
     Long infrequentOldestAgeMinutes
  ) {
    this();
    this.maxCount = maxCount;
    this.interval = interval;
    this.recoveryMode = recoveryMode;
    this.frequentIntervalMinutes = frequentIntervalMinutes;
    this.frequentOldestAgeMinutes = frequentOldestAgeMinutes;
    this.infrequentIntervalMinutes = infrequentIntervalMinutes;
    this.infrequentOldestAgeMinutes = infrequentOldestAgeMinutes;
  }

   /**
   * Maximum number of backups to keep. Zero when no backups are created.
   * minimum: 0
   * @return maxCount
  **/
  @javax.annotation.Nullable
  public Long getMaxCount() {
    return maxCount;
  }



   /**
   * The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that.
   * minimum: 0
   * @return interval
  **/
  @javax.annotation.Nullable
  public Long getInterval() {
    return interval;
  }



   /**
   * Mechanism how backups can be restored. &#39;regular&#39;                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             &#39;pitr&#39; means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
   * @return recoveryMode
  **/
  @javax.annotation.Nullable
  public String getRecoveryMode() {
    return recoveryMode;
  }



   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentIntervalMinutes
  **/
  @javax.annotation.Nullable
  public Long getFrequentIntervalMinutes() {
    return frequentIntervalMinutes;
  }



   /**
   * Maximum age of the oldest frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentOldestAgeMinutes
  **/
  @javax.annotation.Nullable
  public Long getFrequentOldestAgeMinutes() {
    return frequentOldestAgeMinutes;
  }



   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentIntervalMinutes
  **/
  @javax.annotation.Nullable
  public Long getInfrequentIntervalMinutes() {
    return infrequentIntervalMinutes;
  }



   /**
   * Maximum age of the oldest infrequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentOldestAgeMinutes
  **/
  @javax.annotation.Nullable
  public Long getInfrequentOldestAgeMinutes() {
    return infrequentOldestAgeMinutes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasBackupConfig dbaasBackupConfig = (DbaasBackupConfig) o;
    return Objects.equals(this.maxCount, dbaasBackupConfig.maxCount) &&
        Objects.equals(this.interval, dbaasBackupConfig.interval) &&
        Objects.equals(this.recoveryMode, dbaasBackupConfig.recoveryMode) &&
        Objects.equals(this.frequentIntervalMinutes, dbaasBackupConfig.frequentIntervalMinutes) &&
        Objects.equals(this.frequentOldestAgeMinutes, dbaasBackupConfig.frequentOldestAgeMinutes) &&
        Objects.equals(this.infrequentIntervalMinutes, dbaasBackupConfig.infrequentIntervalMinutes) &&
        Objects.equals(this.infrequentOldestAgeMinutes, dbaasBackupConfig.infrequentOldestAgeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, interval, recoveryMode, frequentIntervalMinutes, frequentOldestAgeMinutes, infrequentIntervalMinutes, infrequentOldestAgeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasBackupConfig {\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    recoveryMode: ").append(toIndentedString(recoveryMode)).append("\n");
    sb.append("    frequentIntervalMinutes: ").append(toIndentedString(frequentIntervalMinutes)).append("\n");
    sb.append("    frequentOldestAgeMinutes: ").append(toIndentedString(frequentOldestAgeMinutes)).append("\n");
    sb.append("    infrequentIntervalMinutes: ").append(toIndentedString(infrequentIntervalMinutes)).append("\n");
    sb.append("    infrequentOldestAgeMinutes: ").append(toIndentedString(infrequentOldestAgeMinutes)).append("\n");
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
    openapiFields.add("max-count");
    openapiFields.add("interval");
    openapiFields.add("recovery-mode");
    openapiFields.add("frequent-interval-minutes");
    openapiFields.add("frequent-oldest-age-minutes");
    openapiFields.add("infrequent-interval-minutes");
    openapiFields.add("infrequent-oldest-age-minutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasBackupConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasBackupConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasBackupConfig is not found in the empty JSON string", DbaasBackupConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasBackupConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasBackupConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recovery-mode") != null && !jsonObj.get("recovery-mode").isJsonNull()) && !jsonObj.get("recovery-mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery-mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery-mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasBackupConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasBackupConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasBackupConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasBackupConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasBackupConfig>() {
           @Override
           public void write(JsonWriter out, DbaasBackupConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasBackupConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasBackupConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasBackupConfig
  * @throws IOException if the JSON string is invalid with respect to DbaasBackupConfig
  */
  public static DbaasBackupConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasBackupConfig.class);
  }

 /**
  * Convert an instance of DbaasBackupConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

