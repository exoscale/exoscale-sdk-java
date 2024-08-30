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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StartInstanceRequest
 */
@JsonPropertyOrder({
  StartInstanceRequest.JSON_PROPERTY_RESCUE_PROFILE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T13:37:22.669691+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class StartInstanceRequest {
  /**
   * Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
   */
  public enum RescueProfileEnum {
    NETBOOT_EFI("netboot-efi"),
    
    NETBOOT("netboot");

    private String value;

    RescueProfileEnum(String value) {
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
    public static RescueProfileEnum fromValue(String value) {
      for (RescueProfileEnum b : RescueProfileEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESCUE_PROFILE = "rescue-profile";
  private RescueProfileEnum rescueProfile;

  public StartInstanceRequest() { 
  }

  public StartInstanceRequest rescueProfile(RescueProfileEnum rescueProfile) {
    this.rescueProfile = rescueProfile;
    return this;
  }

   /**
   * Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
   * @return rescueProfile
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESCUE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RescueProfileEnum getRescueProfile() {
    return rescueProfile;
  }


  @JsonProperty(JSON_PROPERTY_RESCUE_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRescueProfile(RescueProfileEnum rescueProfile) {
    this.rescueProfile = rescueProfile;
  }


  /**
   * Return true if this start_instance_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartInstanceRequest startInstanceRequest = (StartInstanceRequest) o;
    return Objects.equals(this.rescueProfile, startInstanceRequest.rescueProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rescueProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartInstanceRequest {\n");
    sb.append("    rescueProfile: ").append(toIndentedString(rescueProfile)).append("\n");
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

    // add `rescue-profile` to the URL query string
    if (getRescueProfile() != null) {
      joiner.add(String.format("%srescue-profile%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRescueProfile()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

