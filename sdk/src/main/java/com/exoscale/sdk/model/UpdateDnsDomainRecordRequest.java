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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateDnsDomainRecordRequest
 */
@JsonPropertyOrder({
  UpdateDnsDomainRecordRequest.JSON_PROPERTY_NAME,
  UpdateDnsDomainRecordRequest.JSON_PROPERTY_CONTENT,
  UpdateDnsDomainRecordRequest.JSON_PROPERTY_TTL,
  UpdateDnsDomainRecordRequest.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateDnsDomainRecordRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_TTL = "ttl";
  private Long ttl;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public UpdateDnsDomainRecordRequest() { 
  }

  public UpdateDnsDomainRecordRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DNS domain record name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateDnsDomainRecordRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * DNS domain record content
   * @return content
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public UpdateDnsDomainRecordRequest ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * DNS domain record TTL
   * minimum: 0
   * @return ttl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTtl() {
    return ttl;
  }


  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public UpdateDnsDomainRecordRequest priority(Long priority) {
    this.priority = priority;
    return this;
  }

   /**
   * DNS domain record priority
   * minimum: 0
   * @return priority
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Long priority) {
    this.priority = priority;
  }


  /**
   * Return true if this update_dns_domain_record_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest = (UpdateDnsDomainRecordRequest) o;
    return Objects.equals(this.name, updateDnsDomainRecordRequest.name) &&
        Objects.equals(this.content, updateDnsDomainRecordRequest.content) &&
        Objects.equals(this.ttl, updateDnsDomainRecordRequest.ttl) &&
        Objects.equals(this.priority, updateDnsDomainRecordRequest.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content, ttl, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDnsDomainRecordRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ttl` to the URL query string
    if (getTtl() != null) {
      joiner.add(String.format("%sttl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTtl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `priority` to the URL query string
    if (getPriority() != null) {
      joiner.add(String.format("%spriority%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriority()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

