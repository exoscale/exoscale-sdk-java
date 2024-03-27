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
import org.openapitools.client.model.DbaasNodeStateProgressUpdate;

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
 * Automatic maintenance settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasNodeState {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROGRESS_UPDATES = "progress-updates";
  @SerializedName(SERIALIZED_NAME_PROGRESS_UPDATES)
  private List<DbaasNodeStateProgressUpdate> progressUpdates = new ArrayList<>();

  /**
   * Role of this node. Only returned for a subset of service types
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    STANDBY("standby"),
    
    MASTER("master"),
    
    READ_REPLICA("read-replica");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RoleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  /**
   * Current state of the service node
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    LEAVING("leaving"),
    
    RUNNING("running"),
    
    SYNCING_DATA("syncing_data"),
    
    SETTING_UP_VM("setting_up_vm"),
    
    UNKNOWN("unknown");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public DbaasNodeState() {
  }

  public DbaasNodeState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the service node
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DbaasNodeState progressUpdates(List<DbaasNodeStateProgressUpdate> progressUpdates) {
    this.progressUpdates = progressUpdates;
    return this;
  }

  public DbaasNodeState addProgressUpdatesItem(DbaasNodeStateProgressUpdate progressUpdatesItem) {
    if (this.progressUpdates == null) {
      this.progressUpdates = new ArrayList<>();
    }
    this.progressUpdates.add(progressUpdatesItem);
    return this;
  }

   /**
   * Extra information regarding the progress for current state
   * @return progressUpdates
  **/
  @javax.annotation.Nullable
  public List<DbaasNodeStateProgressUpdate> getProgressUpdates() {
    return progressUpdates;
  }

  public void setProgressUpdates(List<DbaasNodeStateProgressUpdate> progressUpdates) {
    this.progressUpdates = progressUpdates;
  }


  public DbaasNodeState role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Role of this node. Only returned for a subset of service types
   * @return role
  **/
  @javax.annotation.Nullable
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public DbaasNodeState state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current state of the service node
   * @return state
  **/
  @javax.annotation.Nonnull
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasNodeState dbaasNodeState = (DbaasNodeState) o;
    return Objects.equals(this.name, dbaasNodeState.name) &&
        Objects.equals(this.progressUpdates, dbaasNodeState.progressUpdates) &&
        Objects.equals(this.role, dbaasNodeState.role) &&
        Objects.equals(this.state, dbaasNodeState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, progressUpdates, role, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasNodeState {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progressUpdates: ").append(toIndentedString(progressUpdates)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("progress-updates");
    openapiFields.add("role");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasNodeState
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasNodeState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasNodeState is not found in the empty JSON string", DbaasNodeState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasNodeState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasNodeState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbaasNodeState.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("progress-updates") != null && !jsonObj.get("progress-updates").isJsonNull()) {
        JsonArray jsonArrayprogressUpdates = jsonObj.getAsJsonArray("progress-updates");
        if (jsonArrayprogressUpdates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("progress-updates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `progress-updates` to be an array in the JSON string but got `%s`", jsonObj.get("progress-updates").toString()));
          }

          // validate the optional field `progress-updates` (array)
          for (int i = 0; i < jsonArrayprogressUpdates.size(); i++) {
            DbaasNodeStateProgressUpdate.validateJsonElement(jsonArrayprogressUpdates.get(i));
          };
        }
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) {
        RoleEnum.validateJsonElement(jsonObj.get("role"));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the required field `state`
      StateEnum.validateJsonElement(jsonObj.get("state"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasNodeState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasNodeState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasNodeState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasNodeState.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasNodeState>() {
           @Override
           public void write(JsonWriter out, DbaasNodeState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasNodeState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasNodeState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasNodeState
  * @throws IOException if the JSON string is invalid with respect to DbaasNodeState
  */
  public static DbaasNodeState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasNodeState.class);
  }

 /**
  * Convert an instance of DbaasNodeState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

