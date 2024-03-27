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
import org.openapitools.client.model.PrivateNetwork;

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
 * ListPrivateNetworks200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ListPrivateNetworks200Response {
  public static final String SERIALIZED_NAME_PRIVATE_NETWORKS = "private-networks";
  @SerializedName(SERIALIZED_NAME_PRIVATE_NETWORKS)
  private List<PrivateNetwork> privateNetworks = new ArrayList<>();

  public ListPrivateNetworks200Response() {
  }

  public ListPrivateNetworks200Response privateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public ListPrivateNetworks200Response addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Get privateNetworks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }

  public void setPrivateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPrivateNetworks200Response listPrivateNetworks200Response = (ListPrivateNetworks200Response) o;
    return Objects.equals(this.privateNetworks, listPrivateNetworks200Response.privateNetworks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateNetworks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPrivateNetworks200Response {\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
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
    openapiFields.add("private-networks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListPrivateNetworks200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPrivateNetworks200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPrivateNetworks200Response is not found in the empty JSON string", ListPrivateNetworks200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPrivateNetworks200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPrivateNetworks200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("private-networks") != null && !jsonObj.get("private-networks").isJsonNull()) {
        JsonArray jsonArrayprivateNetworks = jsonObj.getAsJsonArray("private-networks");
        if (jsonArrayprivateNetworks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("private-networks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `private-networks` to be an array in the JSON string but got `%s`", jsonObj.get("private-networks").toString()));
          }

          // validate the optional field `private-networks` (array)
          for (int i = 0; i < jsonArrayprivateNetworks.size(); i++) {
            PrivateNetwork.validateJsonElement(jsonArrayprivateNetworks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPrivateNetworks200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPrivateNetworks200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPrivateNetworks200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPrivateNetworks200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPrivateNetworks200Response>() {
           @Override
           public void write(JsonWriter out, ListPrivateNetworks200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPrivateNetworks200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPrivateNetworks200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPrivateNetworks200Response
  * @throws IOException if the JSON string is invalid with respect to ListPrivateNetworks200Response
  */
  public static ListPrivateNetworks200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPrivateNetworks200Response.class);
  }

 /**
  * Convert an instance of ListPrivateNetworks200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

