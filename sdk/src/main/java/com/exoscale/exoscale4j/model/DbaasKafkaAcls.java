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
import com.exoscale.exoscale4j.model.DbaasKafkaSchemaRegistryAclEntry;
import com.exoscale.exoscale4j.model.DbaasKafkaTopicAclEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasKafkaAcls
 */
@JsonPropertyOrder({
  DbaasKafkaAcls.JSON_PROPERTY_TOPIC_ACL,
  DbaasKafkaAcls.JSON_PROPERTY_SCHEMA_REGISTRY_ACL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T15:12:02.588416+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasKafkaAcls {
  public static final String JSON_PROPERTY_TOPIC_ACL = "topic-acl";
  private List<DbaasKafkaTopicAclEntry> topicAcl;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY_ACL = "schema-registry-acl";
  private List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl;

  public DbaasKafkaAcls() { 
  }

  public DbaasKafkaAcls topicAcl(List<DbaasKafkaTopicAclEntry> topicAcl) {
    this.topicAcl = topicAcl;
    return this;
  }

  public DbaasKafkaAcls addTopicAclItem(DbaasKafkaTopicAclEntry topicAclItem) {
    if (this.topicAcl == null) {
      this.topicAcl = new ArrayList<>();
    }
    this.topicAcl.add(topicAclItem);
    return this;
  }

   /**
   * Get topicAcl
   * @return topicAcl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPIC_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasKafkaTopicAclEntry> getTopicAcl() {
    return topicAcl;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopicAcl(List<DbaasKafkaTopicAclEntry> topicAcl) {
    this.topicAcl = topicAcl;
  }


  public DbaasKafkaAcls schemaRegistryAcl(List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) {
    this.schemaRegistryAcl = schemaRegistryAcl;
    return this;
  }

  public DbaasKafkaAcls addSchemaRegistryAclItem(DbaasKafkaSchemaRegistryAclEntry schemaRegistryAclItem) {
    if (this.schemaRegistryAcl == null) {
      this.schemaRegistryAcl = new ArrayList<>();
    }
    this.schemaRegistryAcl.add(schemaRegistryAclItem);
    return this;
  }

   /**
   * Get schemaRegistryAcl
   * @return schemaRegistryAcl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasKafkaSchemaRegistryAclEntry> getSchemaRegistryAcl() {
    return schemaRegistryAcl;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistryAcl(List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) {
    this.schemaRegistryAcl = schemaRegistryAcl;
  }


  /**
   * Return true if this dbaas-kafka-acls object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasKafkaAcls dbaasKafkaAcls = (DbaasKafkaAcls) o;
    return Objects.equals(this.topicAcl, dbaasKafkaAcls.topicAcl) &&
        Objects.equals(this.schemaRegistryAcl, dbaasKafkaAcls.schemaRegistryAcl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicAcl, schemaRegistryAcl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasKafkaAcls {\n");
    sb.append("    topicAcl: ").append(toIndentedString(topicAcl)).append("\n");
    sb.append("    schemaRegistryAcl: ").append(toIndentedString(schemaRegistryAcl)).append("\n");
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

    // add `topic-acl` to the URL query string
    if (getTopicAcl() != null) {
      for (int i = 0; i < getTopicAcl().size(); i++) {
        if (getTopicAcl().get(i) != null) {
          joiner.add(getTopicAcl().get(i).toUrlQueryString(String.format("%stopic-acl%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `schema-registry-acl` to the URL query string
    if (getSchemaRegistryAcl() != null) {
      for (int i = 0; i < getSchemaRegistryAcl().size(); i++) {
        if (getSchemaRegistryAcl().get(i) != null) {
          joiner.add(getSchemaRegistryAcl().get(i).toUrlQueryString(String.format("%sschema-registry-acl%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

