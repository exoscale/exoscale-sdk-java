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
import com.exoscale.exoscale4j.model.IamApiKey;
import com.exoscale.exoscale4j.model.IamRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A notable Mutation Event which happened on the infrastructure
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_REQUEST_ID,
  Event.JSON_PROPERTY_IAM_ROLE,
  Event.JSON_PROPERTY_ZONE,
  Event.JSON_PROPERTY_GET_PARAMS,
  Event.JSON_PROPERTY_BODY_PARAMS,
  Event.JSON_PROPERTY_STATUS,
  Event.JSON_PROPERTY_SOURCE_IP,
  Event.JSON_PROPERTY_IAM_API_KEY,
  Event.JSON_PROPERTY_URI,
  Event.JSON_PROPERTY_ELAPSED_MS,
  Event.JSON_PROPERTY_TIMESTAMP,
  Event.JSON_PROPERTY_PATH_PARAMS,
  Event.JSON_PROPERTY_HANDLER,
  Event.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class Event {
  public static final String JSON_PROPERTY_REQUEST_ID = "request-id";
  private String requestId;

  public static final String JSON_PROPERTY_IAM_ROLE = "iam-role";
  private IamRole iamRole;

  public static final String JSON_PROPERTY_ZONE = "zone";
  private String zone;

  public static final String JSON_PROPERTY_GET_PARAMS = "get-params";
  private Object getParams;

  public static final String JSON_PROPERTY_BODY_PARAMS = "body-params";
  private Object bodyParams;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Long status;

  public static final String JSON_PROPERTY_SOURCE_IP = "source-ip";
  private String sourceIp;

  public static final String JSON_PROPERTY_IAM_API_KEY = "iam-api-key";
  private IamApiKey iamApiKey;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ELAPSED_MS = "elapsed-ms";
  private Long elapsedMs;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_PATH_PARAMS = "path-params";
  private Object pathParams;

  public static final String JSON_PROPERTY_HANDLER = "handler";
  private String handler;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public Event() { 
  }

  public Event requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Operation unique identifier
   * @return requestId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public Event iamRole(IamRole iamRole) {
    this.iamRole = iamRole;
    return this;
  }

   /**
   * Get iamRole
   * @return iamRole
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IAM_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IamRole getIamRole() {
    return iamRole;
  }


  @JsonProperty(JSON_PROPERTY_IAM_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIamRole(IamRole iamRole) {
    this.iamRole = iamRole;
  }


  public Event zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Operation targeted zone
   * @return zone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZone() {
    return zone;
  }


  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZone(String zone) {
    this.zone = zone;
  }


  public Event getParams(Object getParams) {
    this.getParams = getParams;
    return this;
  }

   /**
   * Query string parameters (free form map)
   * @return getParams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GET_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getGetParams() {
    return getParams;
  }


  @JsonProperty(JSON_PROPERTY_GET_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGetParams(Object getParams) {
    this.getParams = getParams;
  }


  public Event bodyParams(Object bodyParams) {
    this.bodyParams = bodyParams;
    return this;
  }

   /**
   * Body parameters (free form map)
   * @return bodyParams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBodyParams() {
    return bodyParams;
  }


  @JsonProperty(JSON_PROPERTY_BODY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBodyParams(Object bodyParams) {
    this.bodyParams = bodyParams;
  }


  public Event status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * Operation HTTP status
   * minimum: 0
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Long status) {
    this.status = status;
  }


  public Event sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Client IP address
   * @return sourceIp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceIp() {
    return sourceIp;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }


  public Event iamApiKey(IamApiKey iamApiKey) {
    this.iamApiKey = iamApiKey;
    return this;
  }

   /**
   * Get iamApiKey
   * @return iamApiKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IAM_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IamApiKey getIamApiKey() {
    return iamApiKey;
  }


  @JsonProperty(JSON_PROPERTY_IAM_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIamApiKey(IamApiKey iamApiKey) {
    this.iamApiKey = iamApiKey;
  }


  public Event uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Operation request URI
   * @return uri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public Event elapsedMs(Long elapsedMs) {
    this.elapsedMs = elapsedMs;
    return this;
  }

   /**
   * Operation processing time
   * minimum: 0
   * @return elapsedMs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELAPSED_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getElapsedMs() {
    return elapsedMs;
  }


  @JsonProperty(JSON_PROPERTY_ELAPSED_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElapsedMs(Long elapsedMs) {
    this.elapsedMs = elapsedMs;
  }


  public Event timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Time at which the event happened, millisecond resolution
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public Event pathParams(Object pathParams) {
    this.pathParams = pathParams;
    return this;
  }

   /**
   * URI path parameters (free form map)
   * @return pathParams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPathParams() {
    return pathParams;
  }


  @JsonProperty(JSON_PROPERTY_PATH_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathParams(Object pathParams) {
    this.pathParams = pathParams;
  }


  public Event handler(String handler) {
    this.handler = handler;
    return this;
  }

   /**
   * Operation handler name
   * @return handler
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHandler() {
    return handler;
  }


  @JsonProperty(JSON_PROPERTY_HANDLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandler(String handler) {
    this.handler = handler;
  }


  public Event message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Operation message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.requestId, event.requestId) &&
        Objects.equals(this.iamRole, event.iamRole) &&
        Objects.equals(this.zone, event.zone) &&
        Objects.equals(this.getParams, event.getParams) &&
        Objects.equals(this.bodyParams, event.bodyParams) &&
        Objects.equals(this.status, event.status) &&
        Objects.equals(this.sourceIp, event.sourceIp) &&
        Objects.equals(this.iamApiKey, event.iamApiKey) &&
        Objects.equals(this.uri, event.uri) &&
        Objects.equals(this.elapsedMs, event.elapsedMs) &&
        Objects.equals(this.timestamp, event.timestamp) &&
        Objects.equals(this.pathParams, event.pathParams) &&
        Objects.equals(this.handler, event.handler) &&
        Objects.equals(this.message, event.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, iamRole, zone, getParams, bodyParams, status, sourceIp, iamApiKey, uri, elapsedMs, timestamp, pathParams, handler, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    iamRole: ").append(toIndentedString(iamRole)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    getParams: ").append(toIndentedString(getParams)).append("\n");
    sb.append("    bodyParams: ").append(toIndentedString(bodyParams)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    iamApiKey: ").append(toIndentedString(iamApiKey)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    elapsedMs: ").append(toIndentedString(elapsedMs)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    pathParams: ").append(toIndentedString(pathParams)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    // add `request-id` to the URL query string
    if (getRequestId() != null) {
      joiner.add(String.format("%srequest-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `iam-role` to the URL query string
    if (getIamRole() != null) {
      joiner.add(getIamRole().toUrlQueryString(prefix + "iam-role" + suffix));
    }

    // add `zone` to the URL query string
    if (getZone() != null) {
      joiner.add(String.format("%szone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getZone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `get-params` to the URL query string
    if (getGetParams() != null) {
      joiner.add(String.format("%sget-params%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGetParams()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `body-params` to the URL query string
    if (getBodyParams() != null) {
      joiner.add(String.format("%sbody-params%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBodyParams()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source-ip` to the URL query string
    if (getSourceIp() != null) {
      joiner.add(String.format("%ssource-ip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `iam-api-key` to the URL query string
    if (getIamApiKey() != null) {
      joiner.add(getIamApiKey().toUrlQueryString(prefix + "iam-api-key" + suffix));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `elapsed-ms` to the URL query string
    if (getElapsedMs() != null) {
      joiner.add(String.format("%selapsed-ms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getElapsedMs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timestamp` to the URL query string
    if (getTimestamp() != null) {
      joiner.add(String.format("%stimestamp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimestamp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `path-params` to the URL query string
    if (getPathParams() != null) {
      joiner.add(String.format("%spath-params%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPathParams()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `handler` to the URL query string
    if (getHandler() != null) {
      joiner.add(String.format("%shandler%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHandler()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

