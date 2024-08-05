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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AutovacuumSettings
 */
@JsonPropertyOrder({
  AutovacuumSettings.JSON_PROPERTY_LOG_AUTOVACUUM_MIN_DURATION,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_LIMIT,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_MAX_WORKERS,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_VACUUM_THRESHOLD,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_NAPTIME,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_VACUUM_SCALE_FACTOR,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_DELAY,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_ANALYZE_SCALE_FACTOR,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_ANALYZE_THRESHOLD,
  AutovacuumSettings.JSON_PROPERTY_AUTOVACUUM_FREEZE_MAX_AGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T21:53:56.743866Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AutovacuumSettings {
  public static final String JSON_PROPERTY_LOG_AUTOVACUUM_MIN_DURATION = "log_autovacuum_min_duration";
  private Integer logAutovacuumMinDuration;

  public static final String JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_LIMIT = "autovacuum_vacuum_cost_limit";
  private Integer autovacuumVacuumCostLimit;

  public static final String JSON_PROPERTY_AUTOVACUUM_MAX_WORKERS = "autovacuum_max_workers";
  private Integer autovacuumMaxWorkers;

  public static final String JSON_PROPERTY_AUTOVACUUM_VACUUM_THRESHOLD = "autovacuum_vacuum_threshold";
  private Integer autovacuumVacuumThreshold;

  public static final String JSON_PROPERTY_AUTOVACUUM_NAPTIME = "autovacuum_naptime";
  private Integer autovacuumNaptime;

  public static final String JSON_PROPERTY_AUTOVACUUM_VACUUM_SCALE_FACTOR = "autovacuum_vacuum_scale_factor";
  private BigDecimal autovacuumVacuumScaleFactor;

  public static final String JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_DELAY = "autovacuum_vacuum_cost_delay";
  private Integer autovacuumVacuumCostDelay;

  public static final String JSON_PROPERTY_AUTOVACUUM_ANALYZE_SCALE_FACTOR = "autovacuum_analyze_scale_factor";
  private BigDecimal autovacuumAnalyzeScaleFactor;

  public static final String JSON_PROPERTY_AUTOVACUUM_ANALYZE_THRESHOLD = "autovacuum_analyze_threshold";
  private Integer autovacuumAnalyzeThreshold;

  public static final String JSON_PROPERTY_AUTOVACUUM_FREEZE_MAX_AGE = "autovacuum_freeze_max_age";
  private Integer autovacuumFreezeMaxAge;

  public AutovacuumSettings() { 
  }

  public AutovacuumSettings logAutovacuumMinDuration(Integer logAutovacuumMinDuration) {
    this.logAutovacuumMinDuration = logAutovacuumMinDuration;
    return this;
  }

   /**
   * Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
   * minimum: -1
   * maximum: 2147483647
   * @return logAutovacuumMinDuration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_AUTOVACUUM_MIN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLogAutovacuumMinDuration() {
    return logAutovacuumMinDuration;
  }


  @JsonProperty(JSON_PROPERTY_LOG_AUTOVACUUM_MIN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogAutovacuumMinDuration(Integer logAutovacuumMinDuration) {
    this.logAutovacuumMinDuration = logAutovacuumMinDuration;
  }


  public AutovacuumSettings autovacuumVacuumCostLimit(Integer autovacuumVacuumCostLimit) {
    this.autovacuumVacuumCostLimit = autovacuumVacuumCostLimit;
    return this;
  }

   /**
   * Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
   * minimum: -1
   * maximum: 10000
   * @return autovacuumVacuumCostLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumVacuumCostLimit() {
    return autovacuumVacuumCostLimit;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumVacuumCostLimit(Integer autovacuumVacuumCostLimit) {
    this.autovacuumVacuumCostLimit = autovacuumVacuumCostLimit;
  }


  public AutovacuumSettings autovacuumMaxWorkers(Integer autovacuumMaxWorkers) {
    this.autovacuumMaxWorkers = autovacuumMaxWorkers;
    return this;
  }

   /**
   * Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
   * minimum: 1
   * maximum: 20
   * @return autovacuumMaxWorkers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_MAX_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumMaxWorkers() {
    return autovacuumMaxWorkers;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_MAX_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumMaxWorkers(Integer autovacuumMaxWorkers) {
    this.autovacuumMaxWorkers = autovacuumMaxWorkers;
  }


  public AutovacuumSettings autovacuumVacuumThreshold(Integer autovacuumVacuumThreshold) {
    this.autovacuumVacuumThreshold = autovacuumVacuumThreshold;
    return this;
  }

   /**
   * Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples
   * minimum: 0
   * maximum: 2147483647
   * @return autovacuumVacuumThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumVacuumThreshold() {
    return autovacuumVacuumThreshold;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumVacuumThreshold(Integer autovacuumVacuumThreshold) {
    this.autovacuumVacuumThreshold = autovacuumVacuumThreshold;
  }


  public AutovacuumSettings autovacuumNaptime(Integer autovacuumNaptime) {
    this.autovacuumNaptime = autovacuumNaptime;
    return this;
  }

   /**
   * Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute
   * minimum: 1
   * maximum: 86400
   * @return autovacuumNaptime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_NAPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumNaptime() {
    return autovacuumNaptime;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_NAPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumNaptime(Integer autovacuumNaptime) {
    this.autovacuumNaptime = autovacuumNaptime;
  }


  public AutovacuumSettings autovacuumVacuumScaleFactor(BigDecimal autovacuumVacuumScaleFactor) {
    this.autovacuumVacuumScaleFactor = autovacuumVacuumScaleFactor;
    return this;
  }

   /**
   * Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)
   * minimum: 0.0
   * maximum: 1.0
   * @return autovacuumVacuumScaleFactor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAutovacuumVacuumScaleFactor() {
    return autovacuumVacuumScaleFactor;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumVacuumScaleFactor(BigDecimal autovacuumVacuumScaleFactor) {
    this.autovacuumVacuumScaleFactor = autovacuumVacuumScaleFactor;
  }


  public AutovacuumSettings autovacuumVacuumCostDelay(Integer autovacuumVacuumCostDelay) {
    this.autovacuumVacuumCostDelay = autovacuumVacuumCostDelay;
    return this;
  }

   /**
   * Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds
   * minimum: -1
   * maximum: 100
   * @return autovacuumVacuumCostDelay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumVacuumCostDelay() {
    return autovacuumVacuumCostDelay;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_VACUUM_COST_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumVacuumCostDelay(Integer autovacuumVacuumCostDelay) {
    this.autovacuumVacuumCostDelay = autovacuumVacuumCostDelay;
  }


  public AutovacuumSettings autovacuumAnalyzeScaleFactor(BigDecimal autovacuumAnalyzeScaleFactor) {
    this.autovacuumAnalyzeScaleFactor = autovacuumAnalyzeScaleFactor;
    return this;
  }

   /**
   * Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)
   * minimum: 0.0
   * maximum: 1.0
   * @return autovacuumAnalyzeScaleFactor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_ANALYZE_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAutovacuumAnalyzeScaleFactor() {
    return autovacuumAnalyzeScaleFactor;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_ANALYZE_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumAnalyzeScaleFactor(BigDecimal autovacuumAnalyzeScaleFactor) {
    this.autovacuumAnalyzeScaleFactor = autovacuumAnalyzeScaleFactor;
  }


  public AutovacuumSettings autovacuumAnalyzeThreshold(Integer autovacuumAnalyzeThreshold) {
    this.autovacuumAnalyzeThreshold = autovacuumAnalyzeThreshold;
    return this;
  }

   /**
   * Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an ANALYZE in any one table. The default is 50 tuples.
   * minimum: 0
   * maximum: 2147483647
   * @return autovacuumAnalyzeThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_ANALYZE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumAnalyzeThreshold() {
    return autovacuumAnalyzeThreshold;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_ANALYZE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumAnalyzeThreshold(Integer autovacuumAnalyzeThreshold) {
    this.autovacuumAnalyzeThreshold = autovacuumAnalyzeThreshold;
  }


  public AutovacuumSettings autovacuumFreezeMaxAge(Integer autovacuumFreezeMaxAge) {
    this.autovacuumFreezeMaxAge = autovacuumFreezeMaxAge;
    return this;
  }

   /**
   * Specifies the maximum age (in transactions) that a table&#39;s pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
   * minimum: 200000000
   * maximum: 1500000000
   * @return autovacuumFreezeMaxAge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_FREEZE_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutovacuumFreezeMaxAge() {
    return autovacuumFreezeMaxAge;
  }


  @JsonProperty(JSON_PROPERTY_AUTOVACUUM_FREEZE_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutovacuumFreezeMaxAge(Integer autovacuumFreezeMaxAge) {
    this.autovacuumFreezeMaxAge = autovacuumFreezeMaxAge;
  }


  /**
   * Return true if this Autovacuum_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutovacuumSettings autovacuumSettings = (AutovacuumSettings) o;
    return Objects.equals(this.logAutovacuumMinDuration, autovacuumSettings.logAutovacuumMinDuration) &&
        Objects.equals(this.autovacuumVacuumCostLimit, autovacuumSettings.autovacuumVacuumCostLimit) &&
        Objects.equals(this.autovacuumMaxWorkers, autovacuumSettings.autovacuumMaxWorkers) &&
        Objects.equals(this.autovacuumVacuumThreshold, autovacuumSettings.autovacuumVacuumThreshold) &&
        Objects.equals(this.autovacuumNaptime, autovacuumSettings.autovacuumNaptime) &&
        Objects.equals(this.autovacuumVacuumScaleFactor, autovacuumSettings.autovacuumVacuumScaleFactor) &&
        Objects.equals(this.autovacuumVacuumCostDelay, autovacuumSettings.autovacuumVacuumCostDelay) &&
        Objects.equals(this.autovacuumAnalyzeScaleFactor, autovacuumSettings.autovacuumAnalyzeScaleFactor) &&
        Objects.equals(this.autovacuumAnalyzeThreshold, autovacuumSettings.autovacuumAnalyzeThreshold) &&
        Objects.equals(this.autovacuumFreezeMaxAge, autovacuumSettings.autovacuumFreezeMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logAutovacuumMinDuration, autovacuumVacuumCostLimit, autovacuumMaxWorkers, autovacuumVacuumThreshold, autovacuumNaptime, autovacuumVacuumScaleFactor, autovacuumVacuumCostDelay, autovacuumAnalyzeScaleFactor, autovacuumAnalyzeThreshold, autovacuumFreezeMaxAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutovacuumSettings {\n");
    sb.append("    logAutovacuumMinDuration: ").append(toIndentedString(logAutovacuumMinDuration)).append("\n");
    sb.append("    autovacuumVacuumCostLimit: ").append(toIndentedString(autovacuumVacuumCostLimit)).append("\n");
    sb.append("    autovacuumMaxWorkers: ").append(toIndentedString(autovacuumMaxWorkers)).append("\n");
    sb.append("    autovacuumVacuumThreshold: ").append(toIndentedString(autovacuumVacuumThreshold)).append("\n");
    sb.append("    autovacuumNaptime: ").append(toIndentedString(autovacuumNaptime)).append("\n");
    sb.append("    autovacuumVacuumScaleFactor: ").append(toIndentedString(autovacuumVacuumScaleFactor)).append("\n");
    sb.append("    autovacuumVacuumCostDelay: ").append(toIndentedString(autovacuumVacuumCostDelay)).append("\n");
    sb.append("    autovacuumAnalyzeScaleFactor: ").append(toIndentedString(autovacuumAnalyzeScaleFactor)).append("\n");
    sb.append("    autovacuumAnalyzeThreshold: ").append(toIndentedString(autovacuumAnalyzeThreshold)).append("\n");
    sb.append("    autovacuumFreezeMaxAge: ").append(toIndentedString(autovacuumFreezeMaxAge)).append("\n");
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

    // add `log_autovacuum_min_duration` to the URL query string
    if (getLogAutovacuumMinDuration() != null) {
      joiner.add(String.format("%slog_autovacuum_min_duration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogAutovacuumMinDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_vacuum_cost_limit` to the URL query string
    if (getAutovacuumVacuumCostLimit() != null) {
      joiner.add(String.format("%sautovacuum_vacuum_cost_limit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumVacuumCostLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_max_workers` to the URL query string
    if (getAutovacuumMaxWorkers() != null) {
      joiner.add(String.format("%sautovacuum_max_workers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumMaxWorkers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_vacuum_threshold` to the URL query string
    if (getAutovacuumVacuumThreshold() != null) {
      joiner.add(String.format("%sautovacuum_vacuum_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumVacuumThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_naptime` to the URL query string
    if (getAutovacuumNaptime() != null) {
      joiner.add(String.format("%sautovacuum_naptime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumNaptime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_vacuum_scale_factor` to the URL query string
    if (getAutovacuumVacuumScaleFactor() != null) {
      joiner.add(String.format("%sautovacuum_vacuum_scale_factor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumVacuumScaleFactor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_vacuum_cost_delay` to the URL query string
    if (getAutovacuumVacuumCostDelay() != null) {
      joiner.add(String.format("%sautovacuum_vacuum_cost_delay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumVacuumCostDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_analyze_scale_factor` to the URL query string
    if (getAutovacuumAnalyzeScaleFactor() != null) {
      joiner.add(String.format("%sautovacuum_analyze_scale_factor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumAnalyzeScaleFactor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_analyze_threshold` to the URL query string
    if (getAutovacuumAnalyzeThreshold() != null) {
      joiner.add(String.format("%sautovacuum_analyze_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumAnalyzeThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autovacuum_freeze_max_age` to the URL query string
    if (getAutovacuumFreezeMaxAge() != null) {
      joiner.add(String.format("%sautovacuum_freeze_max_age%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutovacuumFreezeMaxAge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

