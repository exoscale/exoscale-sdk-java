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


package com.exoscale.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.exoscale.sdk.model.Zone;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CopyTemplateRequest
 */
@JsonPropertyOrder({
  CopyTemplateRequest.JSON_PROPERTY_TARGET_ZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CopyTemplateRequest {
  public static final String JSON_PROPERTY_TARGET_ZONE = "target-zone";
  private Zone targetZone;

  public CopyTemplateRequest() { 
  }

  public CopyTemplateRequest targetZone(Zone targetZone) {
    this.targetZone = targetZone;
    return this;
  }

   /**
   * Get targetZone
   * @return targetZone
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Zone getTargetZone() {
    return targetZone;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetZone(Zone targetZone) {
    this.targetZone = targetZone;
  }


  /**
   * Return true if this copy_template_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyTemplateRequest copyTemplateRequest = (CopyTemplateRequest) o;
    return Objects.equals(this.targetZone, copyTemplateRequest.targetZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyTemplateRequest {\n");
    sb.append("    targetZone: ").append(toIndentedString(targetZone)).append("\n");
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

    // add `target-zone` to the URL query string
    if (getTargetZone() != null) {
      joiner.add(getTargetZone().toUrlQueryString(prefix + "target-zone" + suffix));
    }

    return joiner.toString();
  }
}

