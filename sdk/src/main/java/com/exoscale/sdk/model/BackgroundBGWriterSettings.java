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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BackgroundBGWriterSettings
 */
@JsonPropertyOrder({
  BackgroundBGWriterSettings.JSON_PROPERTY_BGWRITER_DELAY,
  BackgroundBGWriterSettings.JSON_PROPERTY_BGWRITER_FLUSH_AFTER,
  BackgroundBGWriterSettings.JSON_PROPERTY_BGWRITER_LRU_MAXPAGES,
  BackgroundBGWriterSettings.JSON_PROPERTY_BGWRITER_LRU_MULTIPLIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BackgroundBGWriterSettings {
  public static final String JSON_PROPERTY_BGWRITER_DELAY = "bgwriter_delay";
  private Integer bgwriterDelay;

  public static final String JSON_PROPERTY_BGWRITER_FLUSH_AFTER = "bgwriter_flush_after";
  private Integer bgwriterFlushAfter;

  public static final String JSON_PROPERTY_BGWRITER_LRU_MAXPAGES = "bgwriter_lru_maxpages";
  private Integer bgwriterLruMaxpages;

  public static final String JSON_PROPERTY_BGWRITER_LRU_MULTIPLIER = "bgwriter_lru_multiplier";
  private BigDecimal bgwriterLruMultiplier;

  public BackgroundBGWriterSettings() { 
  }

  public BackgroundBGWriterSettings bgwriterDelay(Integer bgwriterDelay) {
    this.bgwriterDelay = bgwriterDelay;
    return this;
  }

   /**
   * Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
   * minimum: 10
   * maximum: 10000
   * @return bgwriterDelay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGWRITER_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBgwriterDelay() {
    return bgwriterDelay;
  }


  @JsonProperty(JSON_PROPERTY_BGWRITER_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgwriterDelay(Integer bgwriterDelay) {
    this.bgwriterDelay = bgwriterDelay;
  }


  public BackgroundBGWriterSettings bgwriterFlushAfter(Integer bgwriterFlushAfter) {
    this.bgwriterFlushAfter = bgwriterFlushAfter;
    return this;
  }

   /**
   * Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
   * minimum: 0
   * maximum: 2048
   * @return bgwriterFlushAfter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGWRITER_FLUSH_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBgwriterFlushAfter() {
    return bgwriterFlushAfter;
  }


  @JsonProperty(JSON_PROPERTY_BGWRITER_FLUSH_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgwriterFlushAfter(Integer bgwriterFlushAfter) {
    this.bgwriterFlushAfter = bgwriterFlushAfter;
  }


  public BackgroundBGWriterSettings bgwriterLruMaxpages(Integer bgwriterLruMaxpages) {
    this.bgwriterLruMaxpages = bgwriterLruMaxpages;
    return this;
  }

   /**
   * In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
   * minimum: 0
   * maximum: 1073741823
   * @return bgwriterLruMaxpages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGWRITER_LRU_MAXPAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBgwriterLruMaxpages() {
    return bgwriterLruMaxpages;
  }


  @JsonProperty(JSON_PROPERTY_BGWRITER_LRU_MAXPAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgwriterLruMaxpages(Integer bgwriterLruMaxpages) {
    this.bgwriterLruMaxpages = bgwriterLruMaxpages;
  }


  public BackgroundBGWriterSettings bgwriterLruMultiplier(BigDecimal bgwriterLruMultiplier) {
    this.bgwriterLruMultiplier = bgwriterLruMultiplier;
    return this;
  }

   /**
   * The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a “just in time” policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
   * minimum: 0
   * maximum: 10
   * @return bgwriterLruMultiplier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BGWRITER_LRU_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBgwriterLruMultiplier() {
    return bgwriterLruMultiplier;
  }


  @JsonProperty(JSON_PROPERTY_BGWRITER_LRU_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBgwriterLruMultiplier(BigDecimal bgwriterLruMultiplier) {
    this.bgwriterLruMultiplier = bgwriterLruMultiplier;
  }


  /**
   * Return true if this Background__BG__writer_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackgroundBGWriterSettings backgroundBGWriterSettings = (BackgroundBGWriterSettings) o;
    return Objects.equals(this.bgwriterDelay, backgroundBGWriterSettings.bgwriterDelay) &&
        Objects.equals(this.bgwriterFlushAfter, backgroundBGWriterSettings.bgwriterFlushAfter) &&
        Objects.equals(this.bgwriterLruMaxpages, backgroundBGWriterSettings.bgwriterLruMaxpages) &&
        Objects.equals(this.bgwriterLruMultiplier, backgroundBGWriterSettings.bgwriterLruMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgwriterDelay, bgwriterFlushAfter, bgwriterLruMaxpages, bgwriterLruMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundBGWriterSettings {\n");
    sb.append("    bgwriterDelay: ").append(toIndentedString(bgwriterDelay)).append("\n");
    sb.append("    bgwriterFlushAfter: ").append(toIndentedString(bgwriterFlushAfter)).append("\n");
    sb.append("    bgwriterLruMaxpages: ").append(toIndentedString(bgwriterLruMaxpages)).append("\n");
    sb.append("    bgwriterLruMultiplier: ").append(toIndentedString(bgwriterLruMultiplier)).append("\n");
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

    // add `bgwriter_delay` to the URL query string
    if (getBgwriterDelay() != null) {
      joiner.add(String.format("%sbgwriter_delay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBgwriterDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bgwriter_flush_after` to the URL query string
    if (getBgwriterFlushAfter() != null) {
      joiner.add(String.format("%sbgwriter_flush_after%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBgwriterFlushAfter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bgwriter_lru_maxpages` to the URL query string
    if (getBgwriterLruMaxpages() != null) {
      joiner.add(String.format("%sbgwriter_lru_maxpages%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBgwriterLruMaxpages()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bgwriter_lru_multiplier` to the URL query string
    if (getBgwriterLruMultiplier() != null) {
      joiner.add(String.format("%sbgwriter_lru_multiplier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBgwriterLruMultiplier()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

