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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enum-mysql-authentication-plugin
 */
@JsonAdapter(EnumMysqlAuthenticationPlugin.Adapter.class)
public enum EnumMysqlAuthenticationPlugin {
  
  CACHING_SHA2_PASSWORD("caching_sha2_password"),
  
  MYSQL_NATIVE_PASSWORD("mysql_native_password");

  private String value;

  EnumMysqlAuthenticationPlugin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumMysqlAuthenticationPlugin fromValue(String value) {
    for (EnumMysqlAuthenticationPlugin b : EnumMysqlAuthenticationPlugin.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EnumMysqlAuthenticationPlugin> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumMysqlAuthenticationPlugin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumMysqlAuthenticationPlugin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumMysqlAuthenticationPlugin.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    EnumMysqlAuthenticationPlugin.fromValue(value);
  }
}

