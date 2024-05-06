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
 * JsonSchemaKafkaRest
 */
@JsonPropertyOrder({
  JsonSchemaKafkaRest.JSON_PROPERTY_PRODUCER_ACKS,
  JsonSchemaKafkaRest.JSON_PROPERTY_PRODUCER_COMPRESSION_TYPE,
  JsonSchemaKafkaRest.JSON_PROPERTY_PRODUCER_LINGER_MS,
  JsonSchemaKafkaRest.JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE,
  JsonSchemaKafkaRest.JSON_PROPERTY_CONSUMER_ENABLE_AUTO_COMMIT,
  JsonSchemaKafkaRest.JSON_PROPERTY_CONSUMER_REQUEST_MAX_BYTES,
  JsonSchemaKafkaRest.JSON_PROPERTY_CONSUMER_REQUEST_TIMEOUT_MS,
  JsonSchemaKafkaRest.JSON_PROPERTY_SIMPLECONSUMER_POOL_SIZE_MAX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class JsonSchemaKafkaRest {
  /**
   * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#39;all&#39; or &#39;-1&#39;, the leader will wait for the full set of in-sync replicas to acknowledge the record.
   */
  public enum ProducerAcksEnum {
    ALL("all"),
    
    _1("-1"),
    
    _0("0"),
    
    _12("1");

    private String value;

    ProducerAcksEnum(String value) {
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
    public static ProducerAcksEnum fromValue(String value) {
      for (ProducerAcksEnum b : ProducerAcksEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRODUCER_ACKS = "producer_acks";
  private ProducerAcksEnum producerAcks = ProducerAcksEnum._12;

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

  public static final String JSON_PROPERTY_PRODUCER_LINGER_MS = "producer_linger_ms";
  private Integer producerLingerMs = 0;

  public static final String JSON_PROPERTY_PRODUCER_MAX_REQUEST_SIZE = "producer_max_request_size";
  private Integer producerMaxRequestSize = 1048576;

  public static final String JSON_PROPERTY_CONSUMER_ENABLE_AUTO_COMMIT = "consumer_enable_auto_commit";
  private Boolean consumerEnableAutoCommit = true;

  public static final String JSON_PROPERTY_CONSUMER_REQUEST_MAX_BYTES = "consumer_request_max_bytes";
  private Integer consumerRequestMaxBytes = 67108864;

  /**
   * The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
   */
  public enum ConsumerRequestTimeoutMsEnum {
    NUMBER_1000(1000),
    
    NUMBER_15000(15000),
    
    NUMBER_30000(30000);

    private Integer value;

    ConsumerRequestTimeoutMsEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConsumerRequestTimeoutMsEnum fromValue(Integer value) {
      for (ConsumerRequestTimeoutMsEnum b : ConsumerRequestTimeoutMsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSUMER_REQUEST_TIMEOUT_MS = "consumer_request_timeout_ms";
  private ConsumerRequestTimeoutMsEnum consumerRequestTimeoutMs = ConsumerRequestTimeoutMsEnum.NUMBER_1000;

  public static final String JSON_PROPERTY_SIMPLECONSUMER_POOL_SIZE_MAX = "simpleconsumer_pool_size_max";
  private Integer simpleconsumerPoolSizeMax = 25;

  public JsonSchemaKafkaRest() { 
  }

  public JsonSchemaKafkaRest producerAcks(ProducerAcksEnum producerAcks) {
    this.producerAcks = producerAcks;
    return this;
  }

   /**
   * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#39;all&#39; or &#39;-1&#39;, the leader will wait for the full set of in-sync replicas to acknowledge the record.
   * @return producerAcks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCER_ACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProducerAcksEnum getProducerAcks() {
    return producerAcks;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_ACKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerAcks(ProducerAcksEnum producerAcks) {
    this.producerAcks = producerAcks;
  }


  public JsonSchemaKafkaRest producerCompressionType(ProducerCompressionTypeEnum producerCompressionType) {
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


  public JsonSchemaKafkaRest producerLingerMs(Integer producerLingerMs) {
    this.producerLingerMs = producerLingerMs;
    return this;
  }

   /**
   * Wait for up to the given delay to allow batching records together
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


  public JsonSchemaKafkaRest producerMaxRequestSize(Integer producerMaxRequestSize) {
    this.producerMaxRequestSize = producerMaxRequestSize;
    return this;
  }

   /**
   * The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.
   * minimum: 0
   * maximum: 2147483647
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


  public JsonSchemaKafkaRest consumerEnableAutoCommit(Boolean consumerEnableAutoCommit) {
    this.consumerEnableAutoCommit = consumerEnableAutoCommit;
    return this;
  }

   /**
   * If true the consumer&#39;s offset will be periodically committed to Kafka in the background
   * @return consumerEnableAutoCommit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_ENABLE_AUTO_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConsumerEnableAutoCommit() {
    return consumerEnableAutoCommit;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_ENABLE_AUTO_COMMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerEnableAutoCommit(Boolean consumerEnableAutoCommit) {
    this.consumerEnableAutoCommit = consumerEnableAutoCommit;
  }


  public JsonSchemaKafkaRest consumerRequestMaxBytes(Integer consumerRequestMaxBytes) {
    this.consumerRequestMaxBytes = consumerRequestMaxBytes;
    return this;
  }

   /**
   * Maximum number of bytes in unencoded message keys and values by a single request
   * minimum: 0
   * maximum: 671088640
   * @return consumerRequestMaxBytes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_REQUEST_MAX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConsumerRequestMaxBytes() {
    return consumerRequestMaxBytes;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_REQUEST_MAX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerRequestMaxBytes(Integer consumerRequestMaxBytes) {
    this.consumerRequestMaxBytes = consumerRequestMaxBytes;
  }


  public JsonSchemaKafkaRest consumerRequestTimeoutMs(ConsumerRequestTimeoutMsEnum consumerRequestTimeoutMs) {
    this.consumerRequestTimeoutMs = consumerRequestTimeoutMs;
    return this;
  }

   /**
   * The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
   * minimum: 1000
   * maximum: 30000
   * @return consumerRequestTimeoutMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMER_REQUEST_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerRequestTimeoutMsEnum getConsumerRequestTimeoutMs() {
    return consumerRequestTimeoutMs;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_REQUEST_TIMEOUT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerRequestTimeoutMs(ConsumerRequestTimeoutMsEnum consumerRequestTimeoutMs) {
    this.consumerRequestTimeoutMs = consumerRequestTimeoutMs;
  }


  public JsonSchemaKafkaRest simpleconsumerPoolSizeMax(Integer simpleconsumerPoolSizeMax) {
    this.simpleconsumerPoolSizeMax = simpleconsumerPoolSizeMax;
    return this;
  }

   /**
   * Maximum number of SimpleConsumers that can be instantiated per broker
   * minimum: 10
   * maximum: 250
   * @return simpleconsumerPoolSizeMax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMPLECONSUMER_POOL_SIZE_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSimpleconsumerPoolSizeMax() {
    return simpleconsumerPoolSizeMax;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLECONSUMER_POOL_SIZE_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimpleconsumerPoolSizeMax(Integer simpleconsumerPoolSizeMax) {
    this.simpleconsumerPoolSizeMax = simpleconsumerPoolSizeMax;
  }


  /**
   * Return true if this json-schema-kafka-rest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaKafkaRest jsonSchemaKafkaRest = (JsonSchemaKafkaRest) o;
    return Objects.equals(this.producerAcks, jsonSchemaKafkaRest.producerAcks) &&
        Objects.equals(this.producerCompressionType, jsonSchemaKafkaRest.producerCompressionType) &&
        Objects.equals(this.producerLingerMs, jsonSchemaKafkaRest.producerLingerMs) &&
        Objects.equals(this.producerMaxRequestSize, jsonSchemaKafkaRest.producerMaxRequestSize) &&
        Objects.equals(this.consumerEnableAutoCommit, jsonSchemaKafkaRest.consumerEnableAutoCommit) &&
        Objects.equals(this.consumerRequestMaxBytes, jsonSchemaKafkaRest.consumerRequestMaxBytes) &&
        Objects.equals(this.consumerRequestTimeoutMs, jsonSchemaKafkaRest.consumerRequestTimeoutMs) &&
        Objects.equals(this.simpleconsumerPoolSizeMax, jsonSchemaKafkaRest.simpleconsumerPoolSizeMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producerAcks, producerCompressionType, producerLingerMs, producerMaxRequestSize, consumerEnableAutoCommit, consumerRequestMaxBytes, consumerRequestTimeoutMs, simpleconsumerPoolSizeMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaKafkaRest {\n");
    sb.append("    producerAcks: ").append(toIndentedString(producerAcks)).append("\n");
    sb.append("    producerCompressionType: ").append(toIndentedString(producerCompressionType)).append("\n");
    sb.append("    producerLingerMs: ").append(toIndentedString(producerLingerMs)).append("\n");
    sb.append("    producerMaxRequestSize: ").append(toIndentedString(producerMaxRequestSize)).append("\n");
    sb.append("    consumerEnableAutoCommit: ").append(toIndentedString(consumerEnableAutoCommit)).append("\n");
    sb.append("    consumerRequestMaxBytes: ").append(toIndentedString(consumerRequestMaxBytes)).append("\n");
    sb.append("    consumerRequestTimeoutMs: ").append(toIndentedString(consumerRequestTimeoutMs)).append("\n");
    sb.append("    simpleconsumerPoolSizeMax: ").append(toIndentedString(simpleconsumerPoolSizeMax)).append("\n");
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

    // add `producer_acks` to the URL query string
    if (getProducerAcks() != null) {
      joiner.add(String.format("%sproducer_acks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerAcks()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_compression_type` to the URL query string
    if (getProducerCompressionType() != null) {
      joiner.add(String.format("%sproducer_compression_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerCompressionType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_linger_ms` to the URL query string
    if (getProducerLingerMs() != null) {
      joiner.add(String.format("%sproducer_linger_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerLingerMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `producer_max_request_size` to the URL query string
    if (getProducerMaxRequestSize() != null) {
      joiner.add(String.format("%sproducer_max_request_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProducerMaxRequestSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_enable_auto_commit` to the URL query string
    if (getConsumerEnableAutoCommit() != null) {
      joiner.add(String.format("%sconsumer_enable_auto_commit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerEnableAutoCommit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_request_max_bytes` to the URL query string
    if (getConsumerRequestMaxBytes() != null) {
      joiner.add(String.format("%sconsumer_request_max_bytes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerRequestMaxBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `consumer_request_timeout_ms` to the URL query string
    if (getConsumerRequestTimeoutMs() != null) {
      joiner.add(String.format("%sconsumer_request_timeout_ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConsumerRequestTimeoutMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `simpleconsumer_pool_size_max` to the URL query string
    if (getSimpleconsumerPoolSizeMax() != null) {
      joiner.add(String.format("%ssimpleconsumer_pool_size_max%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSimpleconsumerPoolSizeMax()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

