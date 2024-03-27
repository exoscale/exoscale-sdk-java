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
 * DbaasServiceRedisUsersInnerAccessControl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasServiceRedisUsersInnerAccessControl {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private List<String> channels = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMANDS = "commands";
  @SerializedName(SERIALIZED_NAME_COMMANDS)
  private List<String> commands = new ArrayList<>();

  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<String> keys = new ArrayList<>();

  public DbaasServiceRedisUsersInnerAccessControl() {
  }

  public DbaasServiceRedisUsersInnerAccessControl categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public DbaasServiceRedisUsersInnerAccessControl channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  public List<String> getChannels() {
    return channels;
  }

  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  public DbaasServiceRedisUsersInnerAccessControl commands(List<String> commands) {
    this.commands = commands;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addCommandsItem(String commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Get commands
   * @return commands
  **/
  @javax.annotation.Nullable
  public List<String> getCommands() {
    return commands;
  }

  public void setCommands(List<String> commands) {
    this.commands = commands;
  }


  public DbaasServiceRedisUsersInnerAccessControl keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceRedisUsersInnerAccessControl dbaasServiceRedisUsersInnerAccessControl = (DbaasServiceRedisUsersInnerAccessControl) o;
    return Objects.equals(this.categories, dbaasServiceRedisUsersInnerAccessControl.categories) &&
        Objects.equals(this.channels, dbaasServiceRedisUsersInnerAccessControl.channels) &&
        Objects.equals(this.commands, dbaasServiceRedisUsersInnerAccessControl.commands) &&
        Objects.equals(this.keys, dbaasServiceRedisUsersInnerAccessControl.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, channels, commands, keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceRedisUsersInnerAccessControl {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("channels");
    openapiFields.add("commands");
    openapiFields.add("keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceRedisUsersInnerAccessControl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceRedisUsersInnerAccessControl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceRedisUsersInnerAccessControl is not found in the empty JSON string", DbaasServiceRedisUsersInnerAccessControl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceRedisUsersInnerAccessControl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceRedisUsersInnerAccessControl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull() && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonNull() && !jsonObj.get("channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string but got `%s`", jsonObj.get("channels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("commands") != null && !jsonObj.get("commands").isJsonNull() && !jsonObj.get("commands").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commands` to be an array in the JSON string but got `%s`", jsonObj.get("commands").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keys") != null && !jsonObj.get("keys").isJsonNull() && !jsonObj.get("keys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceRedisUsersInnerAccessControl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceRedisUsersInnerAccessControl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceRedisUsersInnerAccessControl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceRedisUsersInnerAccessControl.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceRedisUsersInnerAccessControl>() {
           @Override
           public void write(JsonWriter out, DbaasServiceRedisUsersInnerAccessControl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceRedisUsersInnerAccessControl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceRedisUsersInnerAccessControl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceRedisUsersInnerAccessControl
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceRedisUsersInnerAccessControl
  */
  public static DbaasServiceRedisUsersInnerAccessControl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceRedisUsersInnerAccessControl.class);
  }

 /**
  * Convert an instance of DbaasServiceRedisUsersInnerAccessControl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

