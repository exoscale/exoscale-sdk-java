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
import com.exoscale.exoscale4j.model.DbaasTaskResultCodesInner;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasTask
 */
@JsonPropertyOrder({
  DbaasTask.JSON_PROPERTY_ID,
  DbaasTask.JSON_PROPERTY_CREATE_TIME,
  DbaasTask.JSON_PROPERTY_RESULT,
  DbaasTask.JSON_PROPERTY_RESULT_CODES,
  DbaasTask.JSON_PROPERTY_SUCCESS,
  DbaasTask.JSON_PROPERTY_TASK_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class DbaasTask {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATE_TIME = "create-time";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_RESULT_CODES = "result-codes";
  private List<DbaasTaskResultCodesInner> resultCodes;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_TASK_TYPE = "task-type";
  private String taskType;

  public DbaasTask() { 
  }

  public DbaasTask id(UUID id) {
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

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public DbaasTask createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }


  public DbaasTask result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }


  public DbaasTask resultCodes(List<DbaasTaskResultCodesInner> resultCodes) {
    this.resultCodes = resultCodes;
    return this;
  }

  public DbaasTask addResultCodesItem(DbaasTaskResultCodesInner resultCodesItem) {
    if (this.resultCodes == null) {
      this.resultCodes = new ArrayList<>();
    }
    this.resultCodes.add(resultCodesItem);
    return this;
  }

   /**
   * Get resultCodes
   * @return resultCodes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasTaskResultCodesInner> getResultCodes() {
    return resultCodes;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCodes(List<DbaasTaskResultCodesInner> resultCodes) {
    this.resultCodes = resultCodes;
  }


  public DbaasTask success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public DbaasTask taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskType() {
    return taskType;
  }


  @JsonProperty(JSON_PROPERTY_TASK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }


  /**
   * Return true if this dbaas-task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasTask dbaasTask = (DbaasTask) o;
    return Objects.equals(this.id, dbaasTask.id) &&
        Objects.equals(this.createTime, dbaasTask.createTime) &&
        Objects.equals(this.result, dbaasTask.result) &&
        Objects.equals(this.resultCodes, dbaasTask.resultCodes) &&
        Objects.equals(this.success, dbaasTask.success) &&
        Objects.equals(this.taskType, dbaasTask.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createTime, result, resultCodes, success, taskType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultCodes: ").append(toIndentedString(resultCodes)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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

    // add `create-time` to the URL query string
    if (getCreateTime() != null) {
      joiner.add(String.format("%screate-time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `result` to the URL query string
    if (getResult() != null) {
      joiner.add(String.format("%sresult%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResult()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `result-codes` to the URL query string
    if (getResultCodes() != null) {
      for (int i = 0; i < getResultCodes().size(); i++) {
        if (getResultCodes().get(i) != null) {
          joiner.add(getResultCodes().get(i).toUrlQueryString(String.format("%sresult-codes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `success` to the URL query string
    if (getSuccess() != null) {
      joiner.add(String.format("%ssuccess%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccess()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `task-type` to the URL query string
    if (getTaskType() != null) {
      joiner.add(String.format("%stask-type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaskType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

