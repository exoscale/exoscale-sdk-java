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
import com.exoscale.exoscale4j.model.ElasticIpHealthcheck;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateElasticIpRequest
 */
@JsonPropertyOrder({
  CreateElasticIpRequest.JSON_PROPERTY_ADDRESSFAMILY,
  CreateElasticIpRequest.JSON_PROPERTY_DESCRIPTION,
  CreateElasticIpRequest.JSON_PROPERTY_HEALTHCHECK,
  CreateElasticIpRequest.JSON_PROPERTY_LABELS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:01:40.924075Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateElasticIpRequest {
  /**
   * Elastic IP address family (default: :inet4)
   */
  public enum AddressfamilyEnum {
    INET4("inet4"),
    
    INET6("inet6");

    private String value;

    AddressfamilyEnum(String value) {
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
    public static AddressfamilyEnum fromValue(String value) {
      for (AddressfamilyEnum b : AddressfamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADDRESSFAMILY = "addressfamily";
  private AddressfamilyEnum addressfamily;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private ElasticIpHealthcheck healthcheck;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public CreateElasticIpRequest() { 
  }

  public CreateElasticIpRequest addressfamily(AddressfamilyEnum addressfamily) {
    this.addressfamily = addressfamily;
    return this;
  }

   /**
   * Elastic IP address family (default: :inet4)
   * @return addressfamily
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSFAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressfamilyEnum getAddressfamily() {
    return addressfamily;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSFAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressfamily(AddressfamilyEnum addressfamily) {
    this.addressfamily = addressfamily;
  }


  public CreateElasticIpRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Elastic IP description
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


  public CreateElasticIpRequest healthcheck(ElasticIpHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

   /**
   * Get healthcheck
   * @return healthcheck
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ElasticIpHealthcheck getHealthcheck() {
    return healthcheck;
  }


  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthcheck(ElasticIpHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
  }


  public CreateElasticIpRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateElasticIpRequest putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  /**
   * Return true if this create_elastic_ip_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateElasticIpRequest createElasticIpRequest = (CreateElasticIpRequest) o;
    return Objects.equals(this.addressfamily, createElasticIpRequest.addressfamily) &&
        Objects.equals(this.description, createElasticIpRequest.description) &&
        Objects.equals(this.healthcheck, createElasticIpRequest.healthcheck) &&
        Objects.equals(this.labels, createElasticIpRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressfamily, description, healthcheck, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateElasticIpRequest {\n");
    sb.append("    addressfamily: ").append(toIndentedString(addressfamily)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

    // add `addressfamily` to the URL query string
    if (getAddressfamily() != null) {
      joiner.add(String.format("%saddressfamily%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressfamily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `healthcheck` to the URL query string
    if (getHealthcheck() != null) {
      joiner.add(getHealthcheck().toUrlQueryString(prefix + "healthcheck" + suffix));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

