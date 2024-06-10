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
 * GrafanaDateFormatSpecifications
 */
@JsonPropertyOrder({
  GrafanaDateFormatSpecifications.JSON_PROPERTY_DEFAULT_TIMEZONE,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_FULL_DATE,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_DAY,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_HOUR,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_MINUTE,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_MONTH,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_SECOND,
  GrafanaDateFormatSpecifications.JSON_PROPERTY_INTERVAL_YEAR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:13:25.453512+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class GrafanaDateFormatSpecifications {
  public static final String JSON_PROPERTY_DEFAULT_TIMEZONE = "default_timezone";
  private String defaultTimezone;

  public static final String JSON_PROPERTY_FULL_DATE = "full_date";
  private String fullDate;

  public static final String JSON_PROPERTY_INTERVAL_DAY = "interval_day";
  private String intervalDay;

  public static final String JSON_PROPERTY_INTERVAL_HOUR = "interval_hour";
  private String intervalHour;

  public static final String JSON_PROPERTY_INTERVAL_MINUTE = "interval_minute";
  private String intervalMinute;

  public static final String JSON_PROPERTY_INTERVAL_MONTH = "interval_month";
  private String intervalMonth;

  public static final String JSON_PROPERTY_INTERVAL_SECOND = "interval_second";
  private String intervalSecond;

  public static final String JSON_PROPERTY_INTERVAL_YEAR = "interval_year";
  private String intervalYear;

  public GrafanaDateFormatSpecifications() { 
  }

  public GrafanaDateFormatSpecifications defaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
    return this;
  }

   /**
   * Get defaultTimezone
   * @return defaultTimezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultTimezone() {
    return defaultTimezone;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultTimezone(String defaultTimezone) {
    this.defaultTimezone = defaultTimezone;
  }


  public GrafanaDateFormatSpecifications fullDate(String fullDate) {
    this.fullDate = fullDate;
    return this;
  }

   /**
   * Get fullDate
   * @return fullDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullDate() {
    return fullDate;
  }


  @JsonProperty(JSON_PROPERTY_FULL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullDate(String fullDate) {
    this.fullDate = fullDate;
  }


  public GrafanaDateFormatSpecifications intervalDay(String intervalDay) {
    this.intervalDay = intervalDay;
    return this;
  }

   /**
   * Get intervalDay
   * @return intervalDay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalDay() {
    return intervalDay;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalDay(String intervalDay) {
    this.intervalDay = intervalDay;
  }


  public GrafanaDateFormatSpecifications intervalHour(String intervalHour) {
    this.intervalHour = intervalHour;
    return this;
  }

   /**
   * Get intervalHour
   * @return intervalHour
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalHour() {
    return intervalHour;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalHour(String intervalHour) {
    this.intervalHour = intervalHour;
  }


  public GrafanaDateFormatSpecifications intervalMinute(String intervalMinute) {
    this.intervalMinute = intervalMinute;
    return this;
  }

   /**
   * Get intervalMinute
   * @return intervalMinute
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalMinute() {
    return intervalMinute;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalMinute(String intervalMinute) {
    this.intervalMinute = intervalMinute;
  }


  public GrafanaDateFormatSpecifications intervalMonth(String intervalMonth) {
    this.intervalMonth = intervalMonth;
    return this;
  }

   /**
   * Get intervalMonth
   * @return intervalMonth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalMonth() {
    return intervalMonth;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalMonth(String intervalMonth) {
    this.intervalMonth = intervalMonth;
  }


  public GrafanaDateFormatSpecifications intervalSecond(String intervalSecond) {
    this.intervalSecond = intervalSecond;
    return this;
  }

   /**
   * Get intervalSecond
   * @return intervalSecond
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalSecond() {
    return intervalSecond;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_SECOND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalSecond(String intervalSecond) {
    this.intervalSecond = intervalSecond;
  }


  public GrafanaDateFormatSpecifications intervalYear(String intervalYear) {
    this.intervalYear = intervalYear;
    return this;
  }

   /**
   * Get intervalYear
   * @return intervalYear
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntervalYear() {
    return intervalYear;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalYear(String intervalYear) {
    this.intervalYear = intervalYear;
  }


  /**
   * Return true if this Grafana_date_format_specifications object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrafanaDateFormatSpecifications grafanaDateFormatSpecifications = (GrafanaDateFormatSpecifications) o;
    return Objects.equals(this.defaultTimezone, grafanaDateFormatSpecifications.defaultTimezone) &&
        Objects.equals(this.fullDate, grafanaDateFormatSpecifications.fullDate) &&
        Objects.equals(this.intervalDay, grafanaDateFormatSpecifications.intervalDay) &&
        Objects.equals(this.intervalHour, grafanaDateFormatSpecifications.intervalHour) &&
        Objects.equals(this.intervalMinute, grafanaDateFormatSpecifications.intervalMinute) &&
        Objects.equals(this.intervalMonth, grafanaDateFormatSpecifications.intervalMonth) &&
        Objects.equals(this.intervalSecond, grafanaDateFormatSpecifications.intervalSecond) &&
        Objects.equals(this.intervalYear, grafanaDateFormatSpecifications.intervalYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTimezone, fullDate, intervalDay, intervalHour, intervalMinute, intervalMonth, intervalSecond, intervalYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrafanaDateFormatSpecifications {\n");
    sb.append("    defaultTimezone: ").append(toIndentedString(defaultTimezone)).append("\n");
    sb.append("    fullDate: ").append(toIndentedString(fullDate)).append("\n");
    sb.append("    intervalDay: ").append(toIndentedString(intervalDay)).append("\n");
    sb.append("    intervalHour: ").append(toIndentedString(intervalHour)).append("\n");
    sb.append("    intervalMinute: ").append(toIndentedString(intervalMinute)).append("\n");
    sb.append("    intervalMonth: ").append(toIndentedString(intervalMonth)).append("\n");
    sb.append("    intervalSecond: ").append(toIndentedString(intervalSecond)).append("\n");
    sb.append("    intervalYear: ").append(toIndentedString(intervalYear)).append("\n");
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

    // add `default_timezone` to the URL query string
    if (getDefaultTimezone() != null) {
      joiner.add(String.format("%sdefault_timezone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultTimezone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `full_date` to the URL query string
    if (getFullDate() != null) {
      joiner.add(String.format("%sfull_date%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFullDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_day` to the URL query string
    if (getIntervalDay() != null) {
      joiner.add(String.format("%sinterval_day%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_hour` to the URL query string
    if (getIntervalHour() != null) {
      joiner.add(String.format("%sinterval_hour%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalHour()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_minute` to the URL query string
    if (getIntervalMinute() != null) {
      joiner.add(String.format("%sinterval_minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalMinute()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_month` to the URL query string
    if (getIntervalMonth() != null) {
      joiner.add(String.format("%sinterval_month%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalMonth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_second` to the URL query string
    if (getIntervalSecond() != null) {
      joiner.add(String.format("%sinterval_second%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalSecond()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval_year` to the URL query string
    if (getIntervalYear() != null) {
      joiner.add(String.format("%sinterval_year%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntervalYear()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

