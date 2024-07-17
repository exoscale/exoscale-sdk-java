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
 * DbaasKafkaTopicAclEntry
 */
@JsonPropertyOrder({
  DbaasKafkaTopicAclEntry.JSON_PROPERTY_ID,
  DbaasKafkaTopicAclEntry.JSON_PROPERTY_USERNAME,
  DbaasKafkaTopicAclEntry.JSON_PROPERTY_TOPIC,
  DbaasKafkaTopicAclEntry.JSON_PROPERTY_PERMISSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T16:12:55.204771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasKafkaTopicAclEntry {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  /**
   * Kafka permission
   */
  public enum PermissionEnum {
    ADMIN("admin"),
    
    READ("read"),
    
    READWRITE("readwrite"),
    
    WRITE("write");

    private String value;

    PermissionEnum(String value) {
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
    public static PermissionEnum fromValue(String value) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private PermissionEnum permission;

  public DbaasKafkaTopicAclEntry() { 
  }

  public DbaasKafkaTopicAclEntry id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public DbaasKafkaTopicAclEntry username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Kafka username or username pattern
   * @return username
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  public DbaasKafkaTopicAclEntry topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Kafka topic name or pattern
   * @return topic
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  public DbaasKafkaTopicAclEntry permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Kafka permission
   * @return permission
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PermissionEnum getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }


  /**
   * Return true if this dbaas-kafka-topic-acl-entry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry = (DbaasKafkaTopicAclEntry) o;
    return Objects.equals(this.id, dbaasKafkaTopicAclEntry.id) &&
        Objects.equals(this.username, dbaasKafkaTopicAclEntry.username) &&
        Objects.equals(this.topic, dbaasKafkaTopicAclEntry.topic) &&
        Objects.equals(this.permission, dbaasKafkaTopicAclEntry.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, topic, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasKafkaTopicAclEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `topic` to the URL query string
    if (getTopic() != null) {
      joiner.add(String.format("%stopic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTopic()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `permission` to the URL query string
    if (getPermission() != null) {
      joiner.add(String.format("%spermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

