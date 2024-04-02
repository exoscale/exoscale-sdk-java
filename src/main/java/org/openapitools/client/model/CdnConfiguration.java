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
 * CDN configuration
 */
@JsonPropertyOrder({
  CdnConfiguration.JSON_PROPERTY_BUCKET,
  CdnConfiguration.JSON_PROPERTY_STATUS,
  CdnConfiguration.JSON_PROPERTY_FQDN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:42:26.601985678Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class CdnConfiguration {
  public static final String JSON_PROPERTY_BUCKET = "bucket";
  private String bucket;

  /**
   * CDN configuration status
   */
  public enum StatusEnum {
    DEACTIVATED("deactivated"),
    
    PENDING("pending"),
    
    ACTIVATED("activated");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_FQDN = "fqdn";
  private String fqdn;

  public CdnConfiguration() { 
  }

  @JsonCreator
  public CdnConfiguration(
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_FQDN) String fqdn
  ) {
  this();
    this.status = status;
    this.fqdn = fqdn;
  }

  public CdnConfiguration bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * CDN configuration bucket name
   * @return bucket
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUCKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucket() {
    return bucket;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


   /**
   * CDN configuration status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * FQDN that serves the bucket contents
   * @return fqdn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FQDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFqdn() {
    return fqdn;
  }




  /**
   * Return true if this cdn-configuration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnConfiguration cdnConfiguration = (CdnConfiguration) o;
    return Objects.equals(this.bucket, cdnConfiguration.bucket) &&
        Objects.equals(this.status, cdnConfiguration.status) &&
        Objects.equals(this.fqdn, cdnConfiguration.fqdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, status, fqdn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdnConfiguration {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
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

    // add `bucket` to the URL query string
    if (getBucket() != null) {
      joiner.add(String.format("%sbucket%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBucket()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fqdn` to the URL query string
    if (getFqdn() != null) {
      joiner.add(String.format("%sfqdn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFqdn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

