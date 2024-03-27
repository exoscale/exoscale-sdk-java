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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JsonSchemaRedis
 */
@JsonPropertyOrder({
  JsonSchemaRedis.JSON_PROPERTY_SSL,
  JsonSchemaRedis.JSON_PROPERTY_LFU_LOG_FACTOR,
  JsonSchemaRedis.JSON_PROPERTY_MAXMEMORY_POLICY,
  JsonSchemaRedis.JSON_PROPERTY_IO_THREADS,
  JsonSchemaRedis.JSON_PROPERTY_LFU_DECAY_TIME,
  JsonSchemaRedis.JSON_PROPERTY_PUBSUB_CLIENT_OUTPUT_BUFFER_LIMIT,
  JsonSchemaRedis.JSON_PROPERTY_NOTIFY_KEYSPACE_EVENTS,
  JsonSchemaRedis.JSON_PROPERTY_PERSISTENCE,
  JsonSchemaRedis.JSON_PROPERTY_TIMEOUT,
  JsonSchemaRedis.JSON_PROPERTY_ACL_CHANNELS_DEFAULT,
  JsonSchemaRedis.JSON_PROPERTY_NUMBER_OF_DATABASES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class JsonSchemaRedis {
  public static final String JSON_PROPERTY_SSL = "ssl";
  private Boolean ssl = true;

  public static final String JSON_PROPERTY_LFU_LOG_FACTOR = "lfu_log_factor";
  private Integer lfuLogFactor = 10;

  /**
   * Gets or Sets maxmemoryPolicy
   */
  public enum MaxmemoryPolicyEnum {
    NOEVICTION("noeviction"),
    
    ALLKEYS_LRU("allkeys-lru"),
    
    VOLATILE_LRU("volatile-lru"),
    
    ALLKEYS_RANDOM("allkeys-random"),
    
    VOLATILE_RANDOM("volatile-random"),
    
    VOLATILE_TTL("volatile-ttl"),
    
    VOLATILE_LFU("volatile-lfu"),
    
    ALLKEYS_LFU("allkeys-lfu");

    private String value;

    MaxmemoryPolicyEnum(String value) {
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
    public static MaxmemoryPolicyEnum fromValue(String value) {
      for (MaxmemoryPolicyEnum b : MaxmemoryPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_MAXMEMORY_POLICY = "maxmemory_policy";
  private JsonNullable<MaxmemoryPolicyEnum> maxmemoryPolicy = JsonNullable.<MaxmemoryPolicyEnum>of(MaxmemoryPolicyEnum.NOEVICTION);

  public static final String JSON_PROPERTY_IO_THREADS = "io_threads";
  private Integer ioThreads;

  public static final String JSON_PROPERTY_LFU_DECAY_TIME = "lfu_decay_time";
  private Integer lfuDecayTime = 1;

  public static final String JSON_PROPERTY_PUBSUB_CLIENT_OUTPUT_BUFFER_LIMIT = "pubsub_client_output_buffer_limit";
  private Integer pubsubClientOutputBufferLimit;

  public static final String JSON_PROPERTY_NOTIFY_KEYSPACE_EVENTS = "notify_keyspace_events";
  private String notifyKeyspaceEvents = "";

  /**
   * When persistence is &#39;rdb&#39;, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is &#39;off&#39;, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can&#39;t be forked.
   */
  public enum PersistenceEnum {
    OFF("off"),
    
    RDB("rdb");

    private String value;

    PersistenceEnum(String value) {
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
    public static PersistenceEnum fromValue(String value) {
      for (PersistenceEnum b : PersistenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERSISTENCE = "persistence";
  private PersistenceEnum persistence;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Integer timeout = 300;

  /**
   * Determines default pub/sub channels&#39; ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn&#39;t affect Redis configuration acl-pubsub-default.
   */
  public enum AclChannelsDefaultEnum {
    ALLCHANNELS("allchannels"),
    
    RESETCHANNELS("resetchannels");

    private String value;

    AclChannelsDefaultEnum(String value) {
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
    public static AclChannelsDefaultEnum fromValue(String value) {
      for (AclChannelsDefaultEnum b : AclChannelsDefaultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACL_CHANNELS_DEFAULT = "acl_channels_default";
  private AclChannelsDefaultEnum aclChannelsDefault;

  public static final String JSON_PROPERTY_NUMBER_OF_DATABASES = "number_of_databases";
  private Integer numberOfDatabases;

  public JsonSchemaRedis() { 
  }

  public JsonSchemaRedis ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Get ssl
   * @return ssl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSsl() {
    return ssl;
  }


  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public JsonSchemaRedis lfuLogFactor(Integer lfuLogFactor) {
    this.lfuLogFactor = lfuLogFactor;
    return this;
  }

   /**
   * Get lfuLogFactor
   * minimum: 0
   * maximum: 100
   * @return lfuLogFactor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LFU_LOG_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLfuLogFactor() {
    return lfuLogFactor;
  }


  @JsonProperty(JSON_PROPERTY_LFU_LOG_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLfuLogFactor(Integer lfuLogFactor) {
    this.lfuLogFactor = lfuLogFactor;
  }


  public JsonSchemaRedis maxmemoryPolicy(MaxmemoryPolicyEnum maxmemoryPolicy) {
    this.maxmemoryPolicy = JsonNullable.<MaxmemoryPolicyEnum>of(maxmemoryPolicy);
    return this;
  }

   /**
   * Get maxmemoryPolicy
   * @return maxmemoryPolicy
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MaxmemoryPolicyEnum getMaxmemoryPolicy() {
        return maxmemoryPolicy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXMEMORY_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MaxmemoryPolicyEnum> getMaxmemoryPolicy_JsonNullable() {
    return maxmemoryPolicy;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXMEMORY_POLICY)
  public void setMaxmemoryPolicy_JsonNullable(JsonNullable<MaxmemoryPolicyEnum> maxmemoryPolicy) {
    this.maxmemoryPolicy = maxmemoryPolicy;
  }

  public void setMaxmemoryPolicy(MaxmemoryPolicyEnum maxmemoryPolicy) {
    this.maxmemoryPolicy = JsonNullable.<MaxmemoryPolicyEnum>of(maxmemoryPolicy);
  }


  public JsonSchemaRedis ioThreads(Integer ioThreads) {
    this.ioThreads = ioThreads;
    return this;
  }

   /**
   * Set Redis IO thread count. Changing this will cause a restart of the Redis service.
   * minimum: 1
   * maximum: 32
   * @return ioThreads
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IO_THREADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIoThreads() {
    return ioThreads;
  }


  @JsonProperty(JSON_PROPERTY_IO_THREADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIoThreads(Integer ioThreads) {
    this.ioThreads = ioThreads;
  }


  public JsonSchemaRedis lfuDecayTime(Integer lfuDecayTime) {
    this.lfuDecayTime = lfuDecayTime;
    return this;
  }

   /**
   * Get lfuDecayTime
   * minimum: 1
   * maximum: 120
   * @return lfuDecayTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LFU_DECAY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLfuDecayTime() {
    return lfuDecayTime;
  }


  @JsonProperty(JSON_PROPERTY_LFU_DECAY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLfuDecayTime(Integer lfuDecayTime) {
    this.lfuDecayTime = lfuDecayTime;
  }


  public JsonSchemaRedis pubsubClientOutputBufferLimit(Integer pubsubClientOutputBufferLimit) {
    this.pubsubClientOutputBufferLimit = pubsubClientOutputBufferLimit;
    return this;
  }

   /**
   * Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
   * minimum: 32
   * maximum: 512
   * @return pubsubClientOutputBufferLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBSUB_CLIENT_OUTPUT_BUFFER_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPubsubClientOutputBufferLimit() {
    return pubsubClientOutputBufferLimit;
  }


  @JsonProperty(JSON_PROPERTY_PUBSUB_CLIENT_OUTPUT_BUFFER_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPubsubClientOutputBufferLimit(Integer pubsubClientOutputBufferLimit) {
    this.pubsubClientOutputBufferLimit = pubsubClientOutputBufferLimit;
  }


  public JsonSchemaRedis notifyKeyspaceEvents(String notifyKeyspaceEvents) {
    this.notifyKeyspaceEvents = notifyKeyspaceEvents;
    return this;
  }

   /**
   * Get notifyKeyspaceEvents
   * @return notifyKeyspaceEvents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_KEYSPACE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyKeyspaceEvents() {
    return notifyKeyspaceEvents;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_KEYSPACE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyKeyspaceEvents(String notifyKeyspaceEvents) {
    this.notifyKeyspaceEvents = notifyKeyspaceEvents;
  }


  public JsonSchemaRedis persistence(PersistenceEnum persistence) {
    this.persistence = persistence;
    return this;
  }

   /**
   * When persistence is &#39;rdb&#39;, Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is &#39;off&#39;, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can&#39;t be forked.
   * @return persistence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSISTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersistenceEnum getPersistence() {
    return persistence;
  }


  @JsonProperty(JSON_PROPERTY_PERSISTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersistence(PersistenceEnum persistence) {
    this.persistence = persistence;
  }


  public JsonSchemaRedis timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * minimum: 0
   * maximum: 31536000
   * @return timeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeout() {
    return timeout;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public JsonSchemaRedis aclChannelsDefault(AclChannelsDefaultEnum aclChannelsDefault) {
    this.aclChannelsDefault = aclChannelsDefault;
    return this;
  }

   /**
   * Determines default pub/sub channels&#39; ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn&#39;t affect Redis configuration acl-pubsub-default.
   * @return aclChannelsDefault
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACL_CHANNELS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AclChannelsDefaultEnum getAclChannelsDefault() {
    return aclChannelsDefault;
  }


  @JsonProperty(JSON_PROPERTY_ACL_CHANNELS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAclChannelsDefault(AclChannelsDefaultEnum aclChannelsDefault) {
    this.aclChannelsDefault = aclChannelsDefault;
  }


  public JsonSchemaRedis numberOfDatabases(Integer numberOfDatabases) {
    this.numberOfDatabases = numberOfDatabases;
    return this;
  }

   /**
   * Set number of Redis databases. Changing this will cause a restart of the Redis service.
   * minimum: 1
   * maximum: 128
   * @return numberOfDatabases
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfDatabases() {
    return numberOfDatabases;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDatabases(Integer numberOfDatabases) {
    this.numberOfDatabases = numberOfDatabases;
  }


  /**
   * Return true if this json-schema-redis object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaRedis jsonSchemaRedis = (JsonSchemaRedis) o;
    return Objects.equals(this.ssl, jsonSchemaRedis.ssl) &&
        Objects.equals(this.lfuLogFactor, jsonSchemaRedis.lfuLogFactor) &&
        equalsNullable(this.maxmemoryPolicy, jsonSchemaRedis.maxmemoryPolicy) &&
        Objects.equals(this.ioThreads, jsonSchemaRedis.ioThreads) &&
        Objects.equals(this.lfuDecayTime, jsonSchemaRedis.lfuDecayTime) &&
        Objects.equals(this.pubsubClientOutputBufferLimit, jsonSchemaRedis.pubsubClientOutputBufferLimit) &&
        Objects.equals(this.notifyKeyspaceEvents, jsonSchemaRedis.notifyKeyspaceEvents) &&
        Objects.equals(this.persistence, jsonSchemaRedis.persistence) &&
        Objects.equals(this.timeout, jsonSchemaRedis.timeout) &&
        Objects.equals(this.aclChannelsDefault, jsonSchemaRedis.aclChannelsDefault) &&
        Objects.equals(this.numberOfDatabases, jsonSchemaRedis.numberOfDatabases);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssl, lfuLogFactor, hashCodeNullable(maxmemoryPolicy), ioThreads, lfuDecayTime, pubsubClientOutputBufferLimit, notifyKeyspaceEvents, persistence, timeout, aclChannelsDefault, numberOfDatabases);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaRedis {\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    lfuLogFactor: ").append(toIndentedString(lfuLogFactor)).append("\n");
    sb.append("    maxmemoryPolicy: ").append(toIndentedString(maxmemoryPolicy)).append("\n");
    sb.append("    ioThreads: ").append(toIndentedString(ioThreads)).append("\n");
    sb.append("    lfuDecayTime: ").append(toIndentedString(lfuDecayTime)).append("\n");
    sb.append("    pubsubClientOutputBufferLimit: ").append(toIndentedString(pubsubClientOutputBufferLimit)).append("\n");
    sb.append("    notifyKeyspaceEvents: ").append(toIndentedString(notifyKeyspaceEvents)).append("\n");
    sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    aclChannelsDefault: ").append(toIndentedString(aclChannelsDefault)).append("\n");
    sb.append("    numberOfDatabases: ").append(toIndentedString(numberOfDatabases)).append("\n");
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

    // add `ssl` to the URL query string
    if (getSsl() != null) {
      joiner.add(String.format("%sssl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lfu_log_factor` to the URL query string
    if (getLfuLogFactor() != null) {
      joiner.add(String.format("%slfu_log_factor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLfuLogFactor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maxmemory_policy` to the URL query string
    if (getMaxmemoryPolicy() != null) {
      joiner.add(String.format("%smaxmemory_policy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxmemoryPolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `io_threads` to the URL query string
    if (getIoThreads() != null) {
      joiner.add(String.format("%sio_threads%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIoThreads()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lfu_decay_time` to the URL query string
    if (getLfuDecayTime() != null) {
      joiner.add(String.format("%slfu_decay_time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLfuDecayTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pubsub_client_output_buffer_limit` to the URL query string
    if (getPubsubClientOutputBufferLimit() != null) {
      joiner.add(String.format("%spubsub_client_output_buffer_limit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPubsubClientOutputBufferLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `notify_keyspace_events` to the URL query string
    if (getNotifyKeyspaceEvents() != null) {
      joiner.add(String.format("%snotify_keyspace_events%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyKeyspaceEvents()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `persistence` to the URL query string
    if (getPersistence() != null) {
      joiner.add(String.format("%spersistence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPersistence()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeout` to the URL query string
    if (getTimeout() != null) {
      joiner.add(String.format("%stimeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `acl_channels_default` to the URL query string
    if (getAclChannelsDefault() != null) {
      joiner.add(String.format("%sacl_channels_default%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAclChannelsDefault()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number_of_databases` to the URL query string
    if (getNumberOfDatabases() != null) {
      joiner.add(String.format("%snumber_of_databases%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfDatabases()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

