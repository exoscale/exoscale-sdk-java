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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Update waiting to be installed
 */
@JsonPropertyOrder({
  DbaasServiceUpdate.JSON_PROPERTY_DESCRIPTION,
  DbaasServiceUpdate.JSON_PROPERTY_DEADLINE,
  DbaasServiceUpdate.JSON_PROPERTY_START_AFTER,
  DbaasServiceUpdate.JSON_PROPERTY_START_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:42:26.601985678Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasServiceUpdate {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEADLINE = "deadline";
  private OffsetDateTime deadline;

  public static final String JSON_PROPERTY_START_AFTER = "start-after";
  private OffsetDateTime startAfter;

  public static final String JSON_PROPERTY_START_AT = "start-at";
  private OffsetDateTime startAt;

  public DbaasServiceUpdate() { 
  }

  public DbaasServiceUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the update
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DbaasServiceUpdate deadline(OffsetDateTime deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * Deadline for installing the update
   * @return deadline
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeadline() {
    return deadline;
  }


  @JsonProperty(JSON_PROPERTY_DEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeadline(OffsetDateTime deadline) {
    this.deadline = deadline;
  }


  public DbaasServiceUpdate startAfter(OffsetDateTime startAfter) {
    this.startAfter = startAfter;
    return this;
  }

   /**
   * The earliest time the update will be automatically applied
   * @return startAfter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartAfter() {
    return startAfter;
  }


  @JsonProperty(JSON_PROPERTY_START_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAfter(OffsetDateTime startAfter) {
    this.startAfter = startAfter;
  }


  public DbaasServiceUpdate startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * The time when the update will be automatically applied
   * @return startAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }


  /**
   * Return true if this dbaas-service-update object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceUpdate dbaasServiceUpdate = (DbaasServiceUpdate) o;
    return Objects.equals(this.description, dbaasServiceUpdate.description) &&
        Objects.equals(this.deadline, dbaasServiceUpdate.deadline) &&
        Objects.equals(this.startAfter, dbaasServiceUpdate.startAfter) &&
        Objects.equals(this.startAt, dbaasServiceUpdate.startAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, deadline, startAfter, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    startAfter: ").append(toIndentedString(startAfter)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deadline` to the URL query string
    if (getDeadline() != null) {
      joiner.add(String.format("%sdeadline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeadline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start-after` to the URL query string
    if (getStartAfter() != null) {
      joiner.add(String.format("%sstart-after%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartAfter()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start-at` to the URL query string
    if (getStartAt() != null) {
      joiner.add(String.format("%sstart-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

