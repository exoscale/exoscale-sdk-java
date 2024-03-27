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
import org.openapitools.client.model.BlockStorageVolume;

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
 * ListBlockStorageVolumes200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ListBlockStorageVolumes200Response {
  public static final String SERIALIZED_NAME_BLOCK_STORAGE_VOLUMES = "block-storage-volumes";
  @SerializedName(SERIALIZED_NAME_BLOCK_STORAGE_VOLUMES)
  private List<BlockStorageVolume> blockStorageVolumes = new ArrayList<>();

  public ListBlockStorageVolumes200Response() {
  }

  public ListBlockStorageVolumes200Response blockStorageVolumes(List<BlockStorageVolume> blockStorageVolumes) {
    this.blockStorageVolumes = blockStorageVolumes;
    return this;
  }

  public ListBlockStorageVolumes200Response addBlockStorageVolumesItem(BlockStorageVolume blockStorageVolumesItem) {
    if (this.blockStorageVolumes == null) {
      this.blockStorageVolumes = new ArrayList<>();
    }
    this.blockStorageVolumes.add(blockStorageVolumesItem);
    return this;
  }

   /**
   * Get blockStorageVolumes
   * @return blockStorageVolumes
  **/
  @javax.annotation.Nullable
  public List<BlockStorageVolume> getBlockStorageVolumes() {
    return blockStorageVolumes;
  }

  public void setBlockStorageVolumes(List<BlockStorageVolume> blockStorageVolumes) {
    this.blockStorageVolumes = blockStorageVolumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBlockStorageVolumes200Response listBlockStorageVolumes200Response = (ListBlockStorageVolumes200Response) o;
    return Objects.equals(this.blockStorageVolumes, listBlockStorageVolumes200Response.blockStorageVolumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockStorageVolumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBlockStorageVolumes200Response {\n");
    sb.append("    blockStorageVolumes: ").append(toIndentedString(blockStorageVolumes)).append("\n");
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
    openapiFields.add("block-storage-volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListBlockStorageVolumes200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBlockStorageVolumes200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBlockStorageVolumes200Response is not found in the empty JSON string", ListBlockStorageVolumes200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBlockStorageVolumes200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBlockStorageVolumes200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("block-storage-volumes") != null && !jsonObj.get("block-storage-volumes").isJsonNull()) {
        JsonArray jsonArrayblockStorageVolumes = jsonObj.getAsJsonArray("block-storage-volumes");
        if (jsonArrayblockStorageVolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("block-storage-volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `block-storage-volumes` to be an array in the JSON string but got `%s`", jsonObj.get("block-storage-volumes").toString()));
          }

          // validate the optional field `block-storage-volumes` (array)
          for (int i = 0; i < jsonArrayblockStorageVolumes.size(); i++) {
            BlockStorageVolume.validateJsonElement(jsonArrayblockStorageVolumes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBlockStorageVolumes200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBlockStorageVolumes200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBlockStorageVolumes200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBlockStorageVolumes200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBlockStorageVolumes200Response>() {
           @Override
           public void write(JsonWriter out, ListBlockStorageVolumes200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBlockStorageVolumes200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListBlockStorageVolumes200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListBlockStorageVolumes200Response
  * @throws IOException if the JSON string is invalid with respect to ListBlockStorageVolumes200Response
  */
  public static ListBlockStorageVolumes200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBlockStorageVolumes200Response.class);
  }

 /**
  * Convert an instance of ListBlockStorageVolumes200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

