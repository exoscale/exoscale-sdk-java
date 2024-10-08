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
 * Exported snapshot information
 */
@JsonPropertyOrder({
  SnapshotExport.JSON_PROPERTY_PRESIGNED_URL,
  SnapshotExport.JSON_PROPERTY_MD5SUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SnapshotExport {
  public static final String JSON_PROPERTY_PRESIGNED_URL = "presigned-url";
  private String presignedUrl;

  public static final String JSON_PROPERTY_MD5SUM = "md5sum";
  private String md5sum;

  public SnapshotExport() { 
  }

  public SnapshotExport presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
    return this;
  }

   /**
   * Exported snapshot disk file pre-signed URL
   * @return presignedUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRESIGNED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPresignedUrl() {
    return presignedUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRESIGNED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPresignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
  }


  public SnapshotExport md5sum(String md5sum) {
    this.md5sum = md5sum;
    return this;
  }

   /**
   * Exported snapshot disk file MD5 checksum
   * @return md5sum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MD5SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd5sum() {
    return md5sum;
  }


  @JsonProperty(JSON_PROPERTY_MD5SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd5sum(String md5sum) {
    this.md5sum = md5sum;
  }


  /**
   * Return true if this snapshot_export object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotExport snapshotExport = (SnapshotExport) o;
    return Objects.equals(this.presignedUrl, snapshotExport.presignedUrl) &&
        Objects.equals(this.md5sum, snapshotExport.md5sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presignedUrl, md5sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotExport {\n");
    sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
    sb.append("    md5sum: ").append(toIndentedString(md5sum)).append("\n");
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

    // add `presigned-url` to the URL query string
    if (getPresignedUrl() != null) {
      joiner.add(String.format("%spresigned-url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPresignedUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `md5sum` to the URL query string
    if (getMd5sum() != null) {
      joiner.add(String.format("%smd5sum%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMd5sum()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

