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
 * ConfigureLogCleanerForTopicCompaction
 */
@JsonPropertyOrder({
  ConfigureLogCleanerForTopicCompaction.JSON_PROPERTY_LOG_CLEANER_DELETE_RETENTION_MS,
  ConfigureLogCleanerForTopicCompaction.JSON_PROPERTY_LOG_CLEANER_MAX_COMPACTION_LAG_MS,
  ConfigureLogCleanerForTopicCompaction.JSON_PROPERTY_LOG_CLEANER_MIN_CLEANABLE_RATIO,
  ConfigureLogCleanerForTopicCompaction.JSON_PROPERTY_LOG_CLEANER_MIN_COMPACTION_LAG_MS,
  ConfigureLogCleanerForTopicCompaction.JSON_PROPERTY_LOG_CLEANUP_POLICY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConfigureLogCleanerForTopicCompaction {
  public static final String JSON_PROPERTY_LOG_CLEANER_DELETE_RETENTION_MS = "log_cleaner_delete_retention_ms";
  private Integer logCleanerDeleteRetentionMs;

  public static final String JSON_PROPERTY_LOG_CLEANER_MAX_COMPACTION_LAG_MS = "log_cleaner_max_compaction_lag_ms";
  private Integer logCleanerMaxCompactionLagMs;

  public static final String JSON_PROPERTY_LOG_CLEANER_MIN_CLEANABLE_RATIO = "log_cleaner_min_cleanable_ratio";
  private BigDecimal logCleanerMinCleanableRatio;

  public static final String JSON_PROPERTY_LOG_CLEANER_MIN_COMPACTION_LAG_MS = "log_cleaner_min_compaction_lag_ms";
  private Integer logCleanerMinCompactionLagMs;

  /**
   * The default cleanup policy for segments beyond the retention window
   */
  public enum LogCleanupPolicyEnum {
    DELETE("delete"),
    
    COMPACT("compact"),
    
    COMPACT_DELETE("compact,delete");

    private String value;

    LogCleanupPolicyEnum(String value) {
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
    public static LogCleanupPolicyEnum fromValue(String value) {
      for (LogCleanupPolicyEnum b : LogCleanupPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LOG_CLEANUP_POLICY = "log_cleanup_policy";
  private LogCleanupPolicyEnum logCleanupPolicy;

  public ConfigureLogCleanerForTopicCompaction() { 
  }

  public ConfigureLogCleanerForTopicCompaction logCleanerDeleteRetentionMs(Integer logCleanerDeleteRetentionMs) {
    this.logCleanerDeleteRetentionMs = logCleanerDeleteRetentionMs;
    return this;
  }

   /**
   * How long are delete records retained?
   * minimum: 0
   * maximum: 315569260000
   * @return logCleanerDeleteRetentionMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_DELETE_RETENTION_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLogCleanerDeleteRetentionMs() {
    return logCleanerDeleteRetentionMs;
  }


  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_DELETE_RETENTION_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogCleanerDeleteRetentionMs(Integer logCleanerDeleteRetentionMs) {
    this.logCleanerDeleteRetentionMs = logCleanerDeleteRetentionMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMaxCompactionLagMs(Integer logCleanerMaxCompactionLagMs) {
    this.logCleanerMaxCompactionLagMs = logCleanerMaxCompactionLagMs;
    return this;
  }

   /**
   * The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
   * minimum: 30000
   * maximum: 9223372036854775807
   * @return logCleanerMaxCompactionLagMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MAX_COMPACTION_LAG_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLogCleanerMaxCompactionLagMs() {
    return logCleanerMaxCompactionLagMs;
  }


  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MAX_COMPACTION_LAG_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogCleanerMaxCompactionLagMs(Integer logCleanerMaxCompactionLagMs) {
    this.logCleanerMaxCompactionLagMs = logCleanerMaxCompactionLagMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMinCleanableRatio(BigDecimal logCleanerMinCleanableRatio) {
    this.logCleanerMinCleanableRatio = logCleanerMinCleanableRatio;
    return this;
  }

   /**
   * Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
   * minimum: 0.2
   * maximum: 0.9
   * @return logCleanerMinCleanableRatio
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MIN_CLEANABLE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLogCleanerMinCleanableRatio() {
    return logCleanerMinCleanableRatio;
  }


  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MIN_CLEANABLE_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogCleanerMinCleanableRatio(BigDecimal logCleanerMinCleanableRatio) {
    this.logCleanerMinCleanableRatio = logCleanerMinCleanableRatio;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMinCompactionLagMs(Integer logCleanerMinCompactionLagMs) {
    this.logCleanerMinCompactionLagMs = logCleanerMinCompactionLagMs;
    return this;
  }

   /**
   * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
   * minimum: 0
   * maximum: 9223372036854775807
   * @return logCleanerMinCompactionLagMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MIN_COMPACTION_LAG_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLogCleanerMinCompactionLagMs() {
    return logCleanerMinCompactionLagMs;
  }


  @JsonProperty(JSON_PROPERTY_LOG_CLEANER_MIN_COMPACTION_LAG_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogCleanerMinCompactionLagMs(Integer logCleanerMinCompactionLagMs) {
    this.logCleanerMinCompactionLagMs = logCleanerMinCompactionLagMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanupPolicy(LogCleanupPolicyEnum logCleanupPolicy) {
    this.logCleanupPolicy = logCleanupPolicy;
    return this;
  }

   /**
   * The default cleanup policy for segments beyond the retention window
   * @return logCleanupPolicy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOG_CLEANUP_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogCleanupPolicyEnum getLogCleanupPolicy() {
    return logCleanupPolicy;
  }


  @JsonProperty(JSON_PROPERTY_LOG_CLEANUP_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogCleanupPolicy(LogCleanupPolicyEnum logCleanupPolicy) {
    this.logCleanupPolicy = logCleanupPolicy;
  }


  /**
   * Return true if this Configure_log_cleaner_for_topic_compaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureLogCleanerForTopicCompaction configureLogCleanerForTopicCompaction = (ConfigureLogCleanerForTopicCompaction) o;
    return Objects.equals(this.logCleanerDeleteRetentionMs, configureLogCleanerForTopicCompaction.logCleanerDeleteRetentionMs) &&
        Objects.equals(this.logCleanerMaxCompactionLagMs, configureLogCleanerForTopicCompaction.logCleanerMaxCompactionLagMs) &&
        Objects.equals(this.logCleanerMinCleanableRatio, configureLogCleanerForTopicCompaction.logCleanerMinCleanableRatio) &&
        Objects.equals(this.logCleanerMinCompactionLagMs, configureLogCleanerForTopicCompaction.logCleanerMinCompactionLagMs) &&
        Objects.equals(this.logCleanupPolicy, configureLogCleanerForTopicCompaction.logCleanupPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logCleanerDeleteRetentionMs, logCleanerMaxCompactionLagMs, logCleanerMinCleanableRatio, logCleanerMinCompactionLagMs, logCleanupPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureLogCleanerForTopicCompaction {\n");
    sb.append("    logCleanerDeleteRetentionMs: ").append(toIndentedString(logCleanerDeleteRetentionMs)).append("\n");
    sb.append("    logCleanerMaxCompactionLagMs: ").append(toIndentedString(logCleanerMaxCompactionLagMs)).append("\n");
    sb.append("    logCleanerMinCleanableRatio: ").append(toIndentedString(logCleanerMinCleanableRatio)).append("\n");
    sb.append("    logCleanerMinCompactionLagMs: ").append(toIndentedString(logCleanerMinCompactionLagMs)).append("\n");
    sb.append("    logCleanupPolicy: ").append(toIndentedString(logCleanupPolicy)).append("\n");
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

    // add `log_cleaner_delete_retention_ms` to the URL query string
    if (getLogCleanerDeleteRetentionMs() != null) {
      joiner.add(String.format("%slog_cleaner_delete_retention_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogCleanerDeleteRetentionMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `log_cleaner_max_compaction_lag_ms` to the URL query string
    if (getLogCleanerMaxCompactionLagMs() != null) {
      joiner.add(String.format("%slog_cleaner_max_compaction_lag_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogCleanerMaxCompactionLagMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `log_cleaner_min_cleanable_ratio` to the URL query string
    if (getLogCleanerMinCleanableRatio() != null) {
      joiner.add(String.format("%slog_cleaner_min_cleanable_ratio%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogCleanerMinCleanableRatio()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `log_cleaner_min_compaction_lag_ms` to the URL query string
    if (getLogCleanerMinCompactionLagMs() != null) {
      joiner.add(String.format("%slog_cleaner_min_compaction_lag_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogCleanerMinCompactionLagMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `log_cleanup_policy` to the URL query string
    if (getLogCleanupPolicy() != null) {
      joiner.add(String.format("%slog_cleanup_policy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogCleanupPolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

