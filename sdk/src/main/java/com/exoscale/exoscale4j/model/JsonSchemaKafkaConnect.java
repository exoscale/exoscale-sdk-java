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
 * JsonSchemaKafkaConnect
 */
@JsonPropertyOrder({
  JsonSchemaKafkaConnect.JSON_PROPERTY_PRODUCER_BUFFER_MEMORY,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_MAX_POLL_INTERVAL_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_PRODUCER_COMPRESSION_TYPE,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY,
  JsonSchemaKafkaConnect.JSON_PROPERTY_OFFSET_FLUSH_INTERVAL_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_SCHEDULED_REBALANCE_MAX_DELAY_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_FETCH_MAX_BYTES,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_MAX_PARTITION_FETCH_BYTES,
  JsonSchemaKafkaConnect.JSON_PROPERTY_OFFSET_FLUSH_TIMEOUT_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_AUTO_OFFSET_RESET,
  JsonSchemaKafkaConnect.JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE,
  JsonSchemaKafkaConnect.JSON_PROPERTY_PRODUCER_BATCH_SIZE,
  JsonSchemaKafkaConnect.JSON_PROPERTY_SESSION_TIMEOUT_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_PRODUCER_LINGER_MS,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_ISOLATION_LEVEL,
  JsonSchemaKafkaConnect.JSON_PROPERTY_CONSUMER_MAX_POLL_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class JsonSchemaKafkaConnect {
  public static final String JSON_PROPERTY_PRODUCER_BUFFER_MEMORY = "producer_buffer_memory";
  private Integer producerBufferMemory;

  public static final String JSON_PROPERTY_CONSUMER_MAX_POLL_INTERVAL_MS = "consumer_max_poll_interval_ms";
  private Integer consumerMaxPollIntervalMs;

  /**
   * Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#39;gzip&#39;, &#39;snappy&#39;, &#39;lz4&#39;, &#39;zstd&#39;). It additionally accepts &#39;none&#39; which is the default and equivalent to no compression.
   */
  public enum ProducerCompressionTypeEnum {
    GZIP("gzip"),
    
    SNAPPY("snappy"),
    
    LZ4("lz4"),
    
    ZSTD("zstd"),
    
    NONE("none");

    private String value;

    ProducerCompressionTypeEnum(String value) {
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
    public static ProducerCompressionTypeEnum fromValue(String value) {
      for (ProducerCompressionTypeEnum b : ProducerCompressionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCER_COMPRESSION_TYPE = "producer_compression_type";
  private ProducerCompressionTypeEnum producerCompressionType;

  /**
   * Defines what client configurations can be overridden by the connector. Default is None
   */
  public enum ConnectorClientConfigOverridePolicyEnum {
    NONE("None"),
    
    ALL("All");

    private String value;

    ConnectorClientConfigOverridePolicyEnum(String value) {
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
    public static ConnectorClientConfigOverridePolicyEnum fromValue(String value) {
      for (ConnectorClientConfigOverridePolicyEnum b : ConnectorClientConfigOverridePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY = "connector_client_config_override_policy";
  private ConnectorClientConfigOverridePolicyEnum connectorClientConfigOverridePolicy;

  public static final String JSON_PROPERTY_OFFSET_FLUSH_INTERVAL_MS = "offset_flush_interval_ms";
  private Integer offsetFlushIntervalMs;

  public static final String JSON_PROPERTY_SCHEDULED_REBALANCE_MAX_DELAY_MS = "scheduled_rebalance_max_delay_ms";
  private Integer scheduledRebalanceMaxDelayMs;

  public static final String JSON_PROPERTY_CONSUMER_FETCH_MAX_BYTES = "consumer_fetch_max_bytes";
  private Integer consumerFetchMaxBytes;

  public static final String JSON_PROPERTY_CONSUMER_MAX_PARTITION_FETCH_BYTES = "consumer_max_partition_fetch_bytes";
  private Integer consumerMaxPartitionFetchBytes;

  public static final String JSON_PROPERTY_OFFSET_FLUSH_TIMEOUT_MS = "offset_flush_timeout_ms";
  private Integer offsetFlushTimeoutMs;

  /**
   * What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
   */
  public enum ConsumerAutoOffsetResetEnum {
    EARLIEST("earliest"),
    
    LATEST("latest");

    private String value;

    ConsumerAutoOffsetResetEnum(String value) {
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
    public static ConsumerAutoOffsetResetEnum fromValue(String value) {
      for (ConsumerAutoOffsetResetEnum b : ConsumerAutoOffsetResetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSUMER_AUTO_OFFSET_RESET = "consumer_auto_offset_reset";
  private ConsumerAutoOffsetResetEnum consumerAutoOffsetReset;

  public static final String JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE = "producer_max_request_size";
  private Integer producerMaxRequestSize;

  public static final String JSON_PROPERTY_PRODUCER_BATCH_SIZE = "producer_batch_size";
  private Integer producerBatchSize;

  public static final String JSON_PROPERTY_SESSION_TIMEOUT_MS = "session_timeout_ms";
  private Integer sessionTimeoutMs;

  public static final String JSON_PROPERTY_PRODUCER_LINGER_MS = "producer_linger_ms";
  private Integer producerLingerMs;

  /**
   * Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
   */
  public enum ConsumerIsolationLevelEnum {
    UNCOMMITTED("read_uncommitted"),
    
    COMMITTED("read_committed");

    private String value;

    ConsumerIsolationLevelEnum(String value) {
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
    public static ConsumerIsolationLevelEnum fromValue(String value) {
      for (ConsumerIsolationLevelEnum b : ConsumerIsolationLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSUMER_ISOLATION_LEVEL = "consumer_isolation_level";
  private ConsumerIsolationLevelEnum consumerIsolationLevel;

  public static final String JSON_PROPERTY_CONSUMER_MAX_POLL_RECORDS = "consumer_max_poll_records";
  private Integer consumerMaxPollRecords;

  public JsonSchemaKafkaConnect() { 
  }

  public JsonSchemaKafkaConnect producerBufferMemory(Integer producerBufferMemory) {
    this.producerBufferMemory = producerBufferMemory;
    return this;
  }

   /**
   * The total bytes of memory the producer can use to buffer records waiting to be sent to the broker (defaults to 33554432).
   * minimum: 5242880
   * maximum: 134217728
   * @return producerBufferMemory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_BUFFER_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProducerBufferMemory() {
    return producerBufferMemory;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_BUFFER_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerBufferMemory(Integer producerBufferMemory) {
    this.producerBufferMemory = producerBufferMemory;
  }


  public JsonSchemaKafkaConnect consumerMaxPollIntervalMs(Integer consumerMaxPollIntervalMs) {
    this.consumerMaxPollIntervalMs = consumerMaxPollIntervalMs;
    return this;
  }

   /**
   * The maximum delay in milliseconds between invocations of poll() when using consumer group management (defaults to 300000).
   * minimum: 1
   * maximum: 2147483647
   * @return consumerMaxPollIntervalMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_POLL_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConsumerMaxPollIntervalMs() {
    return consumerMaxPollIntervalMs;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_POLL_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerMaxPollIntervalMs(Integer consumerMaxPollIntervalMs) {
    this.consumerMaxPollIntervalMs = consumerMaxPollIntervalMs;
  }


  public JsonSchemaKafkaConnect producerCompressionType(ProducerCompressionTypeEnum producerCompressionType) {
    this.producerCompressionType = producerCompressionType;
    return this;
  }

   /**
   * Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#39;gzip&#39;, &#39;snappy&#39;, &#39;lz4&#39;, &#39;zstd&#39;). It additionally accepts &#39;none&#39; which is the default and equivalent to no compression.
   * @return producerCompressionType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_COMPRESSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProducerCompressionTypeEnum getProducerCompressionType() {
    return producerCompressionType;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_COMPRESSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerCompressionType(ProducerCompressionTypeEnum producerCompressionType) {
    this.producerCompressionType = producerCompressionType;
  }


  public JsonSchemaKafkaConnect connectorClientConfigOverridePolicy(ConnectorClientConfigOverridePolicyEnum connectorClientConfigOverridePolicy) {
    this.connectorClientConfigOverridePolicy = connectorClientConfigOverridePolicy;
    return this;
  }

   /**
   * Defines what client configurations can be overridden by the connector. Default is None
   * @return connectorClientConfigOverridePolicy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectorClientConfigOverridePolicyEnum getConnectorClientConfigOverridePolicy() {
    return connectorClientConfigOverridePolicy;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_CLIENT_CONFIG_OVERRIDE_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectorClientConfigOverridePolicy(ConnectorClientConfigOverridePolicyEnum connectorClientConfigOverridePolicy) {
    this.connectorClientConfigOverridePolicy = connectorClientConfigOverridePolicy;
  }


  public JsonSchemaKafkaConnect offsetFlushIntervalMs(Integer offsetFlushIntervalMs) {
    this.offsetFlushIntervalMs = offsetFlushIntervalMs;
    return this;
  }

   /**
   * The interval at which to try committing offsets for tasks (defaults to 60000).
   * minimum: 1
   * maximum: 100000000
   * @return offsetFlushIntervalMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET_FLUSH_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffsetFlushIntervalMs() {
    return offsetFlushIntervalMs;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_FLUSH_INTERVAL_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetFlushIntervalMs(Integer offsetFlushIntervalMs) {
    this.offsetFlushIntervalMs = offsetFlushIntervalMs;
  }


  public JsonSchemaKafkaConnect scheduledRebalanceMaxDelayMs(Integer scheduledRebalanceMaxDelayMs) {
    this.scheduledRebalanceMaxDelayMs = scheduledRebalanceMaxDelayMs;
    return this;
  }

   /**
   * The maximum delay that is scheduled in order to wait for the return of one or more departed workers before rebalancing and reassigning their connectors and tasks to the group. During this period the connectors and tasks of the departed workers remain unassigned. Defaults to 5 minutes.
   * minimum: 0
   * maximum: 600000
   * @return scheduledRebalanceMaxDelayMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_REBALANCE_MAX_DELAY_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduledRebalanceMaxDelayMs() {
    return scheduledRebalanceMaxDelayMs;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_REBALANCE_MAX_DELAY_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledRebalanceMaxDelayMs(Integer scheduledRebalanceMaxDelayMs) {
    this.scheduledRebalanceMaxDelayMs = scheduledRebalanceMaxDelayMs;
  }


  public JsonSchemaKafkaConnect consumerFetchMaxBytes(Integer consumerFetchMaxBytes) {
    this.consumerFetchMaxBytes = consumerFetchMaxBytes;
    return this;
  }

   /**
   * Records are fetched in batches by the consumer, and if the first record batch in the first non-empty partition of the fetch is larger than this value, the record batch will still be returned to ensure that the consumer can make progress. As such, this is not a absolute maximum.
   * minimum: 1048576
   * maximum: 104857600
   * @return consumerFetchMaxBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_FETCH_MAX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConsumerFetchMaxBytes() {
    return consumerFetchMaxBytes;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_FETCH_MAX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerFetchMaxBytes(Integer consumerFetchMaxBytes) {
    this.consumerFetchMaxBytes = consumerFetchMaxBytes;
  }


  public JsonSchemaKafkaConnect consumerMaxPartitionFetchBytes(Integer consumerMaxPartitionFetchBytes) {
    this.consumerMaxPartitionFetchBytes = consumerMaxPartitionFetchBytes;
    return this;
  }

   /**
   * Records are fetched in batches by the consumer.If the first record batch in the first non-empty partition of the fetch is larger than this limit, the batch will still be returned to ensure that the consumer can make progress. 
   * minimum: 1048576
   * maximum: 104857600
   * @return consumerMaxPartitionFetchBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_PARTITION_FETCH_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConsumerMaxPartitionFetchBytes() {
    return consumerMaxPartitionFetchBytes;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_PARTITION_FETCH_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerMaxPartitionFetchBytes(Integer consumerMaxPartitionFetchBytes) {
    this.consumerMaxPartitionFetchBytes = consumerMaxPartitionFetchBytes;
  }


  public JsonSchemaKafkaConnect offsetFlushTimeoutMs(Integer offsetFlushTimeoutMs) {
    this.offsetFlushTimeoutMs = offsetFlushTimeoutMs;
    return this;
  }

   /**
   * Maximum number of milliseconds to wait for records to flush and partition offset data to be committed to offset storage before cancelling the process and restoring the offset data to be committed in a future attempt (defaults to 5000).
   * minimum: 1
   * maximum: 2147483647
   * @return offsetFlushTimeoutMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET_FLUSH_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffsetFlushTimeoutMs() {
    return offsetFlushTimeoutMs;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_FLUSH_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetFlushTimeoutMs(Integer offsetFlushTimeoutMs) {
    this.offsetFlushTimeoutMs = offsetFlushTimeoutMs;
  }


  public JsonSchemaKafkaConnect consumerAutoOffsetReset(ConsumerAutoOffsetResetEnum consumerAutoOffsetReset) {
    this.consumerAutoOffsetReset = consumerAutoOffsetReset;
    return this;
  }

   /**
   * What to do when there is no initial offset in Kafka or if the current offset does not exist any more on the server. Default is earliest
   * @return consumerAutoOffsetReset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_AUTO_OFFSET_RESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerAutoOffsetResetEnum getConsumerAutoOffsetReset() {
    return consumerAutoOffsetReset;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_AUTO_OFFSET_RESET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerAutoOffsetReset(ConsumerAutoOffsetResetEnum consumerAutoOffsetReset) {
    this.consumerAutoOffsetReset = consumerAutoOffsetReset;
  }


  public JsonSchemaKafkaConnect producerMaxRequestSize(Integer producerMaxRequestSize) {
    this.producerMaxRequestSize = producerMaxRequestSize;
    return this;
  }

   /**
   * This setting will limit the number of record batches the producer will send in a single request to avoid sending huge requests.
   * minimum: 131072
   * maximum: 67108864
   * @return producerMaxRequestSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProducerMaxRequestSize() {
    return producerMaxRequestSize;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerMaxRequestSize(Integer producerMaxRequestSize) {
    this.producerMaxRequestSize = producerMaxRequestSize;
  }


  public JsonSchemaKafkaConnect producerBatchSize(Integer producerBatchSize) {
    this.producerBatchSize = producerBatchSize;
    return this;
  }

   /**
   * This setting gives the upper bound of the batch size to be sent. If there are fewer than this many bytes accumulated for this partition, the producer will &#39;linger&#39; for the linger.ms time waiting for more records to show up. A batch size of zero will disable batching entirely (defaults to 16384).
   * minimum: 0
   * maximum: 5242880
   * @return producerBatchSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProducerBatchSize() {
    return producerBatchSize;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_BATCH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerBatchSize(Integer producerBatchSize) {
    this.producerBatchSize = producerBatchSize;
  }


  public JsonSchemaKafkaConnect sessionTimeoutMs(Integer sessionTimeoutMs) {
    this.sessionTimeoutMs = sessionTimeoutMs;
    return this;
  }

   /**
   * The timeout in milliseconds used to detect failures when using Kafka’s group management facilities (defaults to 10000).
   * minimum: 1
   * maximum: 2147483647
   * @return sessionTimeoutMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSessionTimeoutMs() {
    return sessionTimeoutMs;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionTimeoutMs(Integer sessionTimeoutMs) {
    this.sessionTimeoutMs = sessionTimeoutMs;
  }


  public JsonSchemaKafkaConnect producerLingerMs(Integer producerLingerMs) {
    this.producerLingerMs = producerLingerMs;
    return this;
  }

   /**
   * This setting gives the upper bound on the delay for batching: once there is batch.size worth of records for a partition it will be sent immediately regardless of this setting, however if there are fewer than this many bytes accumulated for this partition the producer will &#39;linger&#39; for the specified time waiting for more records to show up. Defaults to 0.
   * minimum: 0
   * maximum: 5000
   * @return producerLingerMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_LINGER_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProducerLingerMs() {
    return producerLingerMs;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_LINGER_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerLingerMs(Integer producerLingerMs) {
    this.producerLingerMs = producerLingerMs;
  }


  public JsonSchemaKafkaConnect consumerIsolationLevel(ConsumerIsolationLevelEnum consumerIsolationLevel) {
    this.consumerIsolationLevel = consumerIsolationLevel;
    return this;
  }

   /**
   * Transaction read isolation level. read_uncommitted is the default, but read_committed can be used if consume-exactly-once behavior is desired.
   * @return consumerIsolationLevel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_ISOLATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerIsolationLevelEnum getConsumerIsolationLevel() {
    return consumerIsolationLevel;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_ISOLATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerIsolationLevel(ConsumerIsolationLevelEnum consumerIsolationLevel) {
    this.consumerIsolationLevel = consumerIsolationLevel;
  }


  public JsonSchemaKafkaConnect consumerMaxPollRecords(Integer consumerMaxPollRecords) {
    this.consumerMaxPollRecords = consumerMaxPollRecords;
    return this;
  }

   /**
   * The maximum number of records returned in a single call to poll() (defaults to 500).
   * minimum: 1
   * maximum: 10000
   * @return consumerMaxPollRecords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_POLL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConsumerMaxPollRecords() {
    return consumerMaxPollRecords;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_MAX_POLL_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerMaxPollRecords(Integer consumerMaxPollRecords) {
    this.consumerMaxPollRecords = consumerMaxPollRecords;
  }


  /**
   * Return true if this json-schema-kafka-connect object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaKafkaConnect jsonSchemaKafkaConnect = (JsonSchemaKafkaConnect) o;
    return Objects.equals(this.producerBufferMemory, jsonSchemaKafkaConnect.producerBufferMemory) &&
        Objects.equals(this.consumerMaxPollIntervalMs, jsonSchemaKafkaConnect.consumerMaxPollIntervalMs) &&
        Objects.equals(this.producerCompressionType, jsonSchemaKafkaConnect.producerCompressionType) &&
        Objects.equals(this.connectorClientConfigOverridePolicy, jsonSchemaKafkaConnect.connectorClientConfigOverridePolicy) &&
        Objects.equals(this.offsetFlushIntervalMs, jsonSchemaKafkaConnect.offsetFlushIntervalMs) &&
        Objects.equals(this.scheduledRebalanceMaxDelayMs, jsonSchemaKafkaConnect.scheduledRebalanceMaxDelayMs) &&
        Objects.equals(this.consumerFetchMaxBytes, jsonSchemaKafkaConnect.consumerFetchMaxBytes) &&
        Objects.equals(this.consumerMaxPartitionFetchBytes, jsonSchemaKafkaConnect.consumerMaxPartitionFetchBytes) &&
        Objects.equals(this.offsetFlushTimeoutMs, jsonSchemaKafkaConnect.offsetFlushTimeoutMs) &&
        Objects.equals(this.consumerAutoOffsetReset, jsonSchemaKafkaConnect.consumerAutoOffsetReset) &&
        Objects.equals(this.producerMaxRequestSize, jsonSchemaKafkaConnect.producerMaxRequestSize) &&
        Objects.equals(this.producerBatchSize, jsonSchemaKafkaConnect.producerBatchSize) &&
        Objects.equals(this.sessionTimeoutMs, jsonSchemaKafkaConnect.sessionTimeoutMs) &&
        Objects.equals(this.producerLingerMs, jsonSchemaKafkaConnect.producerLingerMs) &&
        Objects.equals(this.consumerIsolationLevel, jsonSchemaKafkaConnect.consumerIsolationLevel) &&
        Objects.equals(this.consumerMaxPollRecords, jsonSchemaKafkaConnect.consumerMaxPollRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerBufferMemory, consumerMaxPollIntervalMs, producerCompressionType, connectorClientConfigOverridePolicy, offsetFlushIntervalMs, scheduledRebalanceMaxDelayMs, consumerFetchMaxBytes, consumerMaxPartitionFetchBytes, offsetFlushTimeoutMs, consumerAutoOffsetReset, producerMaxRequestSize, producerBatchSize, sessionTimeoutMs, producerLingerMs, consumerIsolationLevel, consumerMaxPollRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaKafkaConnect {\n");
    sb.append("    producerBufferMemory: ").append(toIndentedString(producerBufferMemory)).append("\n");
    sb.append("    consumerMaxPollIntervalMs: ").append(toIndentedString(consumerMaxPollIntervalMs)).append("\n");
    sb.append("    producerCompressionType: ").append(toIndentedString(producerCompressionType)).append("\n");
    sb.append("    connectorClientConfigOverridePolicy: ").append(toIndentedString(connectorClientConfigOverridePolicy)).append("\n");
    sb.append("    offsetFlushIntervalMs: ").append(toIndentedString(offsetFlushIntervalMs)).append("\n");
    sb.append("    scheduledRebalanceMaxDelayMs: ").append(toIndentedString(scheduledRebalanceMaxDelayMs)).append("\n");
    sb.append("    consumerFetchMaxBytes: ").append(toIndentedString(consumerFetchMaxBytes)).append("\n");
    sb.append("    consumerMaxPartitionFetchBytes: ").append(toIndentedString(consumerMaxPartitionFetchBytes)).append("\n");
    sb.append("    offsetFlushTimeoutMs: ").append(toIndentedString(offsetFlushTimeoutMs)).append("\n");
    sb.append("    consumerAutoOffsetReset: ").append(toIndentedString(consumerAutoOffsetReset)).append("\n");
    sb.append("    producerMaxRequestSize: ").append(toIndentedString(producerMaxRequestSize)).append("\n");
    sb.append("    producerBatchSize: ").append(toIndentedString(producerBatchSize)).append("\n");
    sb.append("    sessionTimeoutMs: ").append(toIndentedString(sessionTimeoutMs)).append("\n");
    sb.append("    producerLingerMs: ").append(toIndentedString(producerLingerMs)).append("\n");
    sb.append("    consumerIsolationLevel: ").append(toIndentedString(consumerIsolationLevel)).append("\n");
    sb.append("    consumerMaxPollRecords: ").append(toIndentedString(consumerMaxPollRecords)).append("\n");
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

    // add `producer_buffer_memory` to the URL query string
    if (getProducerBufferMemory() != null) {
      joiner.add(String.format("%sproducer_buffer_memory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerBufferMemory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_max_poll_interval_ms` to the URL query string
    if (getConsumerMaxPollIntervalMs() != null) {
      joiner.add(String.format("%sconsumer_max_poll_interval_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerMaxPollIntervalMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_compression_type` to the URL query string
    if (getProducerCompressionType() != null) {
      joiner.add(String.format("%sproducer_compression_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerCompressionType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_client_config_override_policy` to the URL query string
    if (getConnectorClientConfigOverridePolicy() != null) {
      joiner.add(String.format("%sconnector_client_config_override_policy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectorClientConfigOverridePolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `offset_flush_interval_ms` to the URL query string
    if (getOffsetFlushIntervalMs() != null) {
      joiner.add(String.format("%soffset_flush_interval_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffsetFlushIntervalMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `scheduled_rebalance_max_delay_ms` to the URL query string
    if (getScheduledRebalanceMaxDelayMs() != null) {
      joiner.add(String.format("%sscheduled_rebalance_max_delay_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScheduledRebalanceMaxDelayMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_fetch_max_bytes` to the URL query string
    if (getConsumerFetchMaxBytes() != null) {
      joiner.add(String.format("%sconsumer_fetch_max_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerFetchMaxBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_max_partition_fetch_bytes` to the URL query string
    if (getConsumerMaxPartitionFetchBytes() != null) {
      joiner.add(String.format("%sconsumer_max_partition_fetch_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerMaxPartitionFetchBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `offset_flush_timeout_ms` to the URL query string
    if (getOffsetFlushTimeoutMs() != null) {
      joiner.add(String.format("%soffset_flush_timeout_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffsetFlushTimeoutMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_auto_offset_reset` to the URL query string
    if (getConsumerAutoOffsetReset() != null) {
      joiner.add(String.format("%sconsumer_auto_offset_reset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerAutoOffsetReset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_max_request_size` to the URL query string
    if (getProducerMaxRequestSize() != null) {
      joiner.add(String.format("%sproducer_max_request_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerMaxRequestSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_batch_size` to the URL query string
    if (getProducerBatchSize() != null) {
      joiner.add(String.format("%sproducer_batch_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerBatchSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `session_timeout_ms` to the URL query string
    if (getSessionTimeoutMs() != null) {
      joiner.add(String.format("%ssession_timeout_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionTimeoutMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_linger_ms` to the URL query string
    if (getProducerLingerMs() != null) {
      joiner.add(String.format("%sproducer_linger_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerLingerMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_isolation_level` to the URL query string
    if (getConsumerIsolationLevel() != null) {
      joiner.add(String.format("%sconsumer_isolation_level%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerIsolationLevel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_max_poll_records` to the URL query string
    if (getConsumerMaxPollRecords() != null) {
      joiner.add(String.format("%sconsumer_max_poll_records%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerMaxPollRecords()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

