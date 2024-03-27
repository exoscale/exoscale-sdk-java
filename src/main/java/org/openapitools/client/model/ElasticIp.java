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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.ElasticIpHealthcheck;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Elastic IP
 */
@JsonPropertyOrder({
  ElasticIp.JSON_PROPERTY_ID,
  ElasticIp.JSON_PROPERTY_IP,
  ElasticIp.JSON_PROPERTY_ADDRESSFAMILY,
  ElasticIp.JSON_PROPERTY_CIDR,
  ElasticIp.JSON_PROPERTY_DESCRIPTION,
  ElasticIp.JSON_PROPERTY_HEALTHCHECK,
  ElasticIp.JSON_PROPERTY_LABELS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ElasticIp {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  /**
   * Elastic IP address family
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

  public static final String JSON_PROPERTY_CIDR = "cidr";
  private String cidr;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private ElasticIpHealthcheck healthcheck;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public ElasticIp() { 
  }

  @JsonCreator
  public ElasticIp(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_IP) String ip, 
    @JsonProperty(JSON_PROPERTY_ADDRESSFAMILY) AddressfamilyEnum addressfamily, 
    @JsonProperty(JSON_PROPERTY_CIDR) String cidr
  ) {
  this();
    this.id = id;
    this.ip = ip;
    this.addressfamily = addressfamily;
    this.cidr = cidr;
  }

   /**
   * Elastic IP ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Elastic IP address
   * @return ip
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }




   /**
   * Elastic IP address family
   * @return addressfamily
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSFAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressfamilyEnum getAddressfamily() {
    return addressfamily;
  }




   /**
   * Elastic IP cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CIDR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCidr() {
    return cidr;
  }




  public ElasticIp description(String description) {
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


  public ElasticIp healthcheck(ElasticIpHealthcheck healthcheck) {
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


  public ElasticIp labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ElasticIp putLabelsItem(String key, String labelsItem) {
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
   * Return true if this elastic-ip object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticIp elasticIp = (ElasticIp) o;
    return Objects.equals(this.id, elasticIp.id) &&
        Objects.equals(this.ip, elasticIp.ip) &&
        Objects.equals(this.addressfamily, elasticIp.addressfamily) &&
        Objects.equals(this.cidr, elasticIp.cidr) &&
        Objects.equals(this.description, elasticIp.description) &&
        Objects.equals(this.healthcheck, elasticIp.healthcheck) &&
        Objects.equals(this.labels, elasticIp.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ip, addressfamily, cidr, description, healthcheck, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticIp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    addressfamily: ").append(toIndentedString(addressfamily)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addressfamily` to the URL query string
    if (getAddressfamily() != null) {
      joiner.add(String.format("%saddressfamily%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressfamily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cidr` to the URL query string
    if (getCidr() != null) {
      joiner.add(String.format("%scidr%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCidr()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

