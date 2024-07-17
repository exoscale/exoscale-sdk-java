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
 * UpdateDbaasServiceOpensearchRequestIndexPatternsInner
 */
@JsonPropertyOrder({
  UpdateDbaasServiceOpensearchRequestIndexPatternsInner.JSON_PROPERTY_MAX_INDEX_COUNT,
  UpdateDbaasServiceOpensearchRequestIndexPatternsInner.JSON_PROPERTY_SORTING_ALGORITHM,
  UpdateDbaasServiceOpensearchRequestIndexPatternsInner.JSON_PROPERTY_PATTERN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T16:12:55.204771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateDbaasServiceOpensearchRequestIndexPatternsInner {
  public static final String JSON_PROPERTY_MAX_INDEX_COUNT = "max-index-count";
  private Long maxIndexCount;

  /**
   * Deletion sorting algorithm
   */
  public enum SortingAlgorithmEnum {
    ALPHABETICAL("alphabetical"),
    
    CREATION_DATE("creation_date");

    private String value;

    SortingAlgorithmEnum(String value) {
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
    public static SortingAlgorithmEnum fromValue(String value) {
      for (SortingAlgorithmEnum b : SortingAlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORTING_ALGORITHM = "sorting-algorithm";
  private SortingAlgorithmEnum sortingAlgorithm;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public UpdateDbaasServiceOpensearchRequestIndexPatternsInner() { 
  }

  public UpdateDbaasServiceOpensearchRequestIndexPatternsInner maxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
    return this;
  }

   /**
   * Maximum number of indexes to keep
   * minimum: 0
   * @return maxIndexCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_INDEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxIndexCount() {
    return maxIndexCount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_INDEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
  }


  public UpdateDbaasServiceOpensearchRequestIndexPatternsInner sortingAlgorithm(SortingAlgorithmEnum sortingAlgorithm) {
    this.sortingAlgorithm = sortingAlgorithm;
    return this;
  }

   /**
   * Deletion sorting algorithm
   * @return sortingAlgorithm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORTING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SortingAlgorithmEnum getSortingAlgorithm() {
    return sortingAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_SORTING_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortingAlgorithm(SortingAlgorithmEnum sortingAlgorithm) {
    this.sortingAlgorithm = sortingAlgorithm;
  }


  public UpdateDbaasServiceOpensearchRequestIndexPatternsInner pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * fnmatch pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  /**
   * Return true if this update_dbaas_service_opensearch_request_index_patterns_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceOpensearchRequestIndexPatternsInner updateDbaasServiceOpensearchRequestIndexPatternsInner = (UpdateDbaasServiceOpensearchRequestIndexPatternsInner) o;
    return Objects.equals(this.maxIndexCount, updateDbaasServiceOpensearchRequestIndexPatternsInner.maxIndexCount) &&
        Objects.equals(this.sortingAlgorithm, updateDbaasServiceOpensearchRequestIndexPatternsInner.sortingAlgorithm) &&
        Objects.equals(this.pattern, updateDbaasServiceOpensearchRequestIndexPatternsInner.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxIndexCount, sortingAlgorithm, pattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceOpensearchRequestIndexPatternsInner {\n");
    sb.append("    maxIndexCount: ").append(toIndentedString(maxIndexCount)).append("\n");
    sb.append("    sortingAlgorithm: ").append(toIndentedString(sortingAlgorithm)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

    // add `max-index-count` to the URL query string
    if (getMaxIndexCount() != null) {
      joiner.add(String.format("%smax-index-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxIndexCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sorting-algorithm` to the URL query string
    if (getSortingAlgorithm() != null) {
      joiner.add(String.format("%ssorting-algorithm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortingAlgorithm()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pattern` to the URL query string
    if (getPattern() != null) {
      joiner.add(String.format("%spattern%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPattern()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

