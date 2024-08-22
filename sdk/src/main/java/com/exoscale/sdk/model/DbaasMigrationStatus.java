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
import com.exoscale.sdk.model.DbaasMigrationStatusDetailsInner;
import com.exoscale.sdk.model.EnumMasterLinkStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasMigrationStatus
 */
@JsonPropertyOrder({
  DbaasMigrationStatus.JSON_PROPERTY_ERROR,
  DbaasMigrationStatus.JSON_PROPERTY_MASTER_LAST_IO_SECONDS_AGO,
  DbaasMigrationStatus.JSON_PROPERTY_MASTER_LINK_STATUS,
  DbaasMigrationStatus.JSON_PROPERTY_METHOD,
  DbaasMigrationStatus.JSON_PROPERTY_STATUS,
  DbaasMigrationStatus.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasMigrationStatus {
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_MASTER_LAST_IO_SECONDS_AGO = "master-last-io-seconds-ago";
  private Long masterLastIoSecondsAgo;

  public static final String JSON_PROPERTY_MASTER_LINK_STATUS = "master-link-status";
  private EnumMasterLinkStatus masterLinkStatus;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<DbaasMigrationStatusDetailsInner> details;

  public DbaasMigrationStatus() { 
  }

  public DbaasMigrationStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message in case that migration has failed
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public DbaasMigrationStatus masterLastIoSecondsAgo(Long masterLastIoSecondsAgo) {
    this.masterLastIoSecondsAgo = masterLastIoSecondsAgo;
    return this;
  }

   /**
   * Redis only: how many seconds since last I/O with redis master
   * @return masterLastIoSecondsAgo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_LAST_IO_SECONDS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMasterLastIoSecondsAgo() {
    return masterLastIoSecondsAgo;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_LAST_IO_SECONDS_AGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterLastIoSecondsAgo(Long masterLastIoSecondsAgo) {
    this.masterLastIoSecondsAgo = masterLastIoSecondsAgo;
  }


  public DbaasMigrationStatus masterLinkStatus(EnumMasterLinkStatus masterLinkStatus) {
    this.masterLinkStatus = masterLinkStatus;
    return this;
  }

   /**
   * Get masterLinkStatus
   * @return masterLinkStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumMasterLinkStatus getMasterLinkStatus() {
    return masterLinkStatus;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_LINK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterLinkStatus(EnumMasterLinkStatus masterLinkStatus) {
    this.masterLinkStatus = masterLinkStatus;
  }


  public DbaasMigrationStatus method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Migration method. Empty in case of multiple methods or error
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public DbaasMigrationStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Migration status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public DbaasMigrationStatus details(List<DbaasMigrationStatusDetailsInner> details) {
    this.details = details;
    return this;
  }

  public DbaasMigrationStatus addDetailsItem(DbaasMigrationStatusDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Migration status per database
   * @return details
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasMigrationStatusDetailsInner> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(List<DbaasMigrationStatusDetailsInner> details) {
    this.details = details;
  }


  /**
   * Return true if this dbaas-migration-status object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasMigrationStatus dbaasMigrationStatus = (DbaasMigrationStatus) o;
    return Objects.equals(this.error, dbaasMigrationStatus.error) &&
        Objects.equals(this.masterLastIoSecondsAgo, dbaasMigrationStatus.masterLastIoSecondsAgo) &&
        Objects.equals(this.masterLinkStatus, dbaasMigrationStatus.masterLinkStatus) &&
        Objects.equals(this.method, dbaasMigrationStatus.method) &&
        Objects.equals(this.status, dbaasMigrationStatus.status) &&
        Objects.equals(this.details, dbaasMigrationStatus.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, masterLastIoSecondsAgo, masterLinkStatus, method, status, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasMigrationStatus {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    masterLastIoSecondsAgo: ").append(toIndentedString(masterLastIoSecondsAgo)).append("\n");
    sb.append("    masterLinkStatus: ").append(toIndentedString(masterLinkStatus)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `master-last-io-seconds-ago` to the URL query string
    if (getMasterLastIoSecondsAgo() != null) {
      joiner.add(String.format("%smaster-last-io-seconds-ago%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMasterLastIoSecondsAgo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `master-link-status` to the URL query string
    if (getMasterLinkStatus() != null) {
      joiner.add(String.format("%smaster-link-status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMasterLinkStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `details` to the URL query string
    if (getDetails() != null) {
      for (int i = 0; i < getDetails().size(); i++) {
        if (getDetails().get(i) != null) {
          joiner.add(getDetails().get(i).toUrlQueryString(String.format("%sdetails%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

