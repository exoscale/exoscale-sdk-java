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
 * WriteAheadLogWALSettings
 */
@JsonPropertyOrder({
  WriteAheadLogWALSettings.JSON_PROPERTY_MAX_SLOT_WAL_KEEP_SIZE,
  WriteAheadLogWALSettings.JSON_PROPERTY_MAX_WAL_SENDERS,
  WriteAheadLogWALSettings.JSON_PROPERTY_WAL_SENDER_TIMEOUT,
  WriteAheadLogWALSettings.JSON_PROPERTY_WAL_WRITER_DELAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class WriteAheadLogWALSettings {
  public static final String JSON_PROPERTY_MAX_SLOT_WAL_KEEP_SIZE = "max_slot_wal_keep_size";
  private Integer maxSlotWalKeepSize;

  public static final String JSON_PROPERTY_MAX_WAL_SENDERS = "max_wal_senders";
  private Integer maxWalSenders;

  public static final String JSON_PROPERTY_WAL_SENDER_TIMEOUT = "wal_sender_timeout";
  private Integer walSenderTimeout;

  public static final String JSON_PROPERTY_WAL_WRITER_DELAY = "wal_writer_delay";
  private Integer walWriterDelay;

  public WriteAheadLogWALSettings() { 
  }

  public WriteAheadLogWALSettings maxSlotWalKeepSize(Integer maxSlotWalKeepSize) {
    this.maxSlotWalKeepSize = maxSlotWalKeepSize;
    return this;
  }

   /**
   * PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
   * minimum: -1
   * maximum: 2147483647
   * @return maxSlotWalKeepSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_SLOT_WAL_KEEP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSlotWalKeepSize() {
    return maxSlotWalKeepSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SLOT_WAL_KEEP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSlotWalKeepSize(Integer maxSlotWalKeepSize) {
    this.maxSlotWalKeepSize = maxSlotWalKeepSize;
  }


  public WriteAheadLogWALSettings maxWalSenders(Integer maxWalSenders) {
    this.maxWalSenders = maxWalSenders;
    return this;
  }

   /**
   * PostgreSQL maximum WAL senders
   * minimum: 20
   * maximum: 64
   * @return maxWalSenders
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_WAL_SENDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxWalSenders() {
    return maxWalSenders;
  }


  @JsonProperty(JSON_PROPERTY_MAX_WAL_SENDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWalSenders(Integer maxWalSenders) {
    this.maxWalSenders = maxWalSenders;
  }


  public WriteAheadLogWALSettings walSenderTimeout(Integer walSenderTimeout) {
    this.walSenderTimeout = walSenderTimeout;
    return this;
  }

   /**
   * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds.
   * minimum: 0
   * maximum: 10800000
   * @return walSenderTimeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAL_SENDER_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWalSenderTimeout() {
    return walSenderTimeout;
  }


  @JsonProperty(JSON_PROPERTY_WAL_SENDER_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalSenderTimeout(Integer walSenderTimeout) {
    this.walSenderTimeout = walSenderTimeout;
  }


  public WriteAheadLogWALSettings walWriterDelay(Integer walWriterDelay) {
    this.walWriterDelay = walWriterDelay;
    return this;
  }

   /**
   * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
   * minimum: 10
   * maximum: 200
   * @return walWriterDelay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAL_WRITER_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWalWriterDelay() {
    return walWriterDelay;
  }


  @JsonProperty(JSON_PROPERTY_WAL_WRITER_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalWriterDelay(Integer walWriterDelay) {
    this.walWriterDelay = walWriterDelay;
  }


  /**
   * Return true if this Write_ahead_log__WAL__settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteAheadLogWALSettings writeAheadLogWALSettings = (WriteAheadLogWALSettings) o;
    return Objects.equals(this.maxSlotWalKeepSize, writeAheadLogWALSettings.maxSlotWalKeepSize) &&
        Objects.equals(this.maxWalSenders, writeAheadLogWALSettings.maxWalSenders) &&
        Objects.equals(this.walSenderTimeout, writeAheadLogWALSettings.walSenderTimeout) &&
        Objects.equals(this.walWriterDelay, writeAheadLogWALSettings.walWriterDelay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSlotWalKeepSize, maxWalSenders, walSenderTimeout, walWriterDelay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteAheadLogWALSettings {\n");
    sb.append("    maxSlotWalKeepSize: ").append(toIndentedString(maxSlotWalKeepSize)).append("\n");
    sb.append("    maxWalSenders: ").append(toIndentedString(maxWalSenders)).append("\n");
    sb.append("    walSenderTimeout: ").append(toIndentedString(walSenderTimeout)).append("\n");
    sb.append("    walWriterDelay: ").append(toIndentedString(walWriterDelay)).append("\n");
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

    // add `max_slot_wal_keep_size` to the URL query string
    if (getMaxSlotWalKeepSize() != null) {
      joiner.add(String.format("%smax_slot_wal_keep_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxSlotWalKeepSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max_wal_senders` to the URL query string
    if (getMaxWalSenders() != null) {
      joiner.add(String.format("%smax_wal_senders%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxWalSenders()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `wal_sender_timeout` to the URL query string
    if (getWalSenderTimeout() != null) {
      joiner.add(String.format("%swal_sender_timeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalSenderTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `wal_writer_delay` to the URL query string
    if (getWalWriterDelay() != null) {
      joiner.add(String.format("%swal_writer_delay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalWriterDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

