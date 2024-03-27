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
 * Load Balancer Service healthcheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class LoadBalancerServiceHealthcheck {
  /**
   * Healthcheck mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    TCP("tcp"),
    
    HTTP("http"),
    
    HTTPS("https");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ModeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Long interval;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Long port;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Long timeout;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Long retries;

  public static final String SERIALIZED_NAME_TLS_SNI = "tls-sni";
  @SerializedName(SERIALIZED_NAME_TLS_SNI)
  private String tlsSni;

  public LoadBalancerServiceHealthcheck() {
  }

  public LoadBalancerServiceHealthcheck mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Healthcheck mode
   * @return mode
  **/
  @javax.annotation.Nullable
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public LoadBalancerServiceHealthcheck interval(Long interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Healthcheck interval (default: 10). Must be greater than or equal to Timeout
   * minimum: 5
   * maximum: 300
   * @return interval
  **/
  @javax.annotation.Nullable
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }


  public LoadBalancerServiceHealthcheck uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * An endpoint to use for the HTTP healthcheck, e.g. &#39;/status&#39;
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  public LoadBalancerServiceHealthcheck port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Healthcheck port
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }


  public LoadBalancerServiceHealthcheck timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Healthcheck timeout value (default: 2). Must be lower than or equal to Interval
   * minimum: 2
   * maximum: 60
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public LoadBalancerServiceHealthcheck retries(Long retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Number of retries before considering a Service failed
   * minimum: 1
   * maximum: 20
   * @return retries
  **/
  @javax.annotation.Nullable
  public Long getRetries() {
    return retries;
  }

  public void setRetries(Long retries) {
    this.retries = retries;
  }


  public LoadBalancerServiceHealthcheck tlsSni(String tlsSni) {
    this.tlsSni = tlsSni;
    return this;
  }

   /**
   * SNI domain for HTTPS healthchecks
   * @return tlsSni
  **/
  @javax.annotation.Nullable
  public String getTlsSni() {
    return tlsSni;
  }

  public void setTlsSni(String tlsSni) {
    this.tlsSni = tlsSni;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerServiceHealthcheck loadBalancerServiceHealthcheck = (LoadBalancerServiceHealthcheck) o;
    return Objects.equals(this.mode, loadBalancerServiceHealthcheck.mode) &&
        Objects.equals(this.interval, loadBalancerServiceHealthcheck.interval) &&
        Objects.equals(this.uri, loadBalancerServiceHealthcheck.uri) &&
        Objects.equals(this.port, loadBalancerServiceHealthcheck.port) &&
        Objects.equals(this.timeout, loadBalancerServiceHealthcheck.timeout) &&
        Objects.equals(this.retries, loadBalancerServiceHealthcheck.retries) &&
        Objects.equals(this.tlsSni, loadBalancerServiceHealthcheck.tlsSni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, interval, uri, port, timeout, retries, tlsSni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerServiceHealthcheck {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    tlsSni: ").append(toIndentedString(tlsSni)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("interval");
    openapiFields.add("uri");
    openapiFields.add("port");
    openapiFields.add("timeout");
    openapiFields.add("retries");
    openapiFields.add("tls-sni");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoadBalancerServiceHealthcheck
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadBalancerServiceHealthcheck.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancerServiceHealthcheck is not found in the empty JSON string", LoadBalancerServiceHealthcheck.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancerServiceHealthcheck.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancerServiceHealthcheck` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      // validate the optional field `mode`
      if (jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) {
        ModeEnum.validateJsonElement(jsonObj.get("mode"));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("tls-sni") != null && !jsonObj.get("tls-sni").isJsonNull()) && !jsonObj.get("tls-sni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tls-sni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tls-sni").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadBalancerServiceHealthcheck.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancerServiceHealthcheck' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancerServiceHealthcheck> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancerServiceHealthcheck.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancerServiceHealthcheck>() {
           @Override
           public void write(JsonWriter out, LoadBalancerServiceHealthcheck value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancerServiceHealthcheck read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancerServiceHealthcheck given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancerServiceHealthcheck
  * @throws IOException if the JSON string is invalid with respect to LoadBalancerServiceHealthcheck
  */
  public static LoadBalancerServiceHealthcheck fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancerServiceHealthcheck.class);
  }

 /**
  * Convert an instance of LoadBalancerServiceHealthcheck to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

