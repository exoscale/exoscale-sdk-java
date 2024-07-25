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


package com.exoscale.exoscale4j.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Nodepool taint
 */
@JsonPropertyOrder({
  SksNodepoolTaint.JSON_PROPERTY_VALUE,
  SksNodepoolTaint.JSON_PROPERTY_EFFECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:19:43.121270Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SksNodepoolTaint {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  /**
   * Nodepool taint effect
   */
  public enum EffectEnum {
    NOEXECUTE("NoExecute"),
    
    NOSCHEDULE("NoSchedule"),
    
    PREFERNOSCHEDULE("PreferNoSchedule");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EffectEnum fromValue(String value) {
      for (EffectEnum b : EffectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EFFECT = "effect";
  private EffectEnum effect;

  public SksNodepoolTaint() { 
  }

  public SksNodepoolTaint value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Nodepool taint value
   * @return value
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public SksNodepoolTaint effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Nodepool taint effect
   * @return effect
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EFFECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EffectEnum getEffect() {
    return effect;
  }


  @JsonProperty(JSON_PROPERTY_EFFECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }


  /**
   * Return true if this sks-nodepool-taint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksNodepoolTaint sksNodepoolTaint = (SksNodepoolTaint) o;
    return Objects.equals(this.value, sksNodepoolTaint.value) &&
        Objects.equals(this.effect, sksNodepoolTaint.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, effect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksNodepoolTaint {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `value` to the URL query string
    if (getValue() != null) {
      joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `effect` to the URL query string
    if (getEffect() != null) {
      joiner.add(String.format("%seffect%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEffect()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

