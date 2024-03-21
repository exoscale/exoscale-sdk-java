/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * JsonSchemaKafkaRest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class JsonSchemaKafkaRest {
  /**
   * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#x27;all&#x27; or &#x27;-1&#x27;, the leader will wait for the full set of in-sync replicas to acknowledge the record.
   */
  public enum ProducerAcksEnum {
    ALL("all"),
    _1("-1"),
    _0("0"),
    _1_3("1");

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
    public static ProducerAcksEnum fromValue(String input) {
      for (ProducerAcksEnum b : ProducerAcksEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("producer_acks")
  private ProducerAcksEnum producerAcks = ProducerAcksEnum._1_3;

  /**
   * Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#x27;gzip&#x27;, &#x27;snappy&#x27;, &#x27;lz4&#x27;, &#x27;zstd&#x27;). It additionally accepts &#x27;none&#x27; which is the default and equivalent to no compression.
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
    public static ProducerCompressionTypeEnum fromValue(String input) {
      for (ProducerCompressionTypeEnum b : ProducerCompressionTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("producer_compression_type")
  private ProducerCompressionTypeEnum producerCompressionType = null;

  @JsonProperty("producer_linger_ms")
  private Integer producerLingerMs = 0;

  @JsonProperty("producer_max_request_size")
  private Integer producerMaxRequestSize = 1048576;

  @JsonProperty("consumer_enable_auto_commit")
  private Boolean consumerEnableAutoCommit = true;

  @JsonProperty("consumer_request_max_bytes")
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
    public static ConsumerRequestTimeoutMsEnum fromValue(Integer input) {
      for (ConsumerRequestTimeoutMsEnum b : ConsumerRequestTimeoutMsEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("consumer_request_timeout_ms")
  private ConsumerRequestTimeoutMsEnum consumerRequestTimeoutMs = ConsumerRequestTimeoutMsEnum.NUMBER_1000;

  @JsonProperty("simpleconsumer_pool_size_max")
  private Integer simpleconsumerPoolSizeMax = 25;

  public JsonSchemaKafkaRest producerAcks(ProducerAcksEnum producerAcks) {
    this.producerAcks = producerAcks;
    return this;
  }

   /**
   * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to &#x27;all&#x27; or &#x27;-1&#x27;, the leader will wait for the full set of in-sync replicas to acknowledge the record.
   * @return producerAcks
  **/
  @Schema(description = "The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.")
  public ProducerAcksEnum getProducerAcks() {
    return producerAcks;
  }

  public void setProducerAcks(ProducerAcksEnum producerAcks) {
    this.producerAcks = producerAcks;
  }

  public JsonSchemaKafkaRest producerCompressionType(ProducerCompressionTypeEnum producerCompressionType) {
    this.producerCompressionType = producerCompressionType;
    return this;
  }

   /**
   * Specify the default compression type for producers. This configuration accepts the standard compression codecs (&#x27;gzip&#x27;, &#x27;snappy&#x27;, &#x27;lz4&#x27;, &#x27;zstd&#x27;). It additionally accepts &#x27;none&#x27; which is the default and equivalent to no compression.
   * @return producerCompressionType
  **/
  @Schema(description = "Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.")
  public ProducerCompressionTypeEnum getProducerCompressionType() {
    return producerCompressionType;
  }

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
  @Schema(description = "Wait for up to the given delay to allow batching records together")
  public Integer getProducerLingerMs() {
    return producerLingerMs;
  }

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
  @Schema(description = "The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.")
  public Integer getProducerMaxRequestSize() {
    return producerMaxRequestSize;
  }

  public void setProducerMaxRequestSize(Integer producerMaxRequestSize) {
    this.producerMaxRequestSize = producerMaxRequestSize;
  }

  public JsonSchemaKafkaRest consumerEnableAutoCommit(Boolean consumerEnableAutoCommit) {
    this.consumerEnableAutoCommit = consumerEnableAutoCommit;
    return this;
  }

   /**
   * If true the consumer&#x27;s offset will be periodically committed to Kafka in the background
   * @return consumerEnableAutoCommit
  **/
  @Schema(description = "If true the consumer's offset will be periodically committed to Kafka in the background")
  public Boolean isConsumerEnableAutoCommit() {
    return consumerEnableAutoCommit;
  }

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
  @Schema(description = "Maximum number of bytes in unencoded message keys and values by a single request")
  public Integer getConsumerRequestMaxBytes() {
    return consumerRequestMaxBytes;
  }

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
  @Schema(description = "The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached")
  public ConsumerRequestTimeoutMsEnum getConsumerRequestTimeoutMs() {
    return consumerRequestTimeoutMs;
  }

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
  @Schema(description = "Maximum number of SimpleConsumers that can be instantiated per broker")
  public Integer getSimpleconsumerPoolSizeMax() {
    return simpleconsumerPoolSizeMax;
  }

  public void setSimpleconsumerPoolSizeMax(Integer simpleconsumerPoolSizeMax) {
    this.simpleconsumerPoolSizeMax = simpleconsumerPoolSizeMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
