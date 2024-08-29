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
import com.exoscale.sdk.model.ZoneName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Compute instance type
 */
@JsonPropertyOrder({
  InstanceType.JSON_PROPERTY_ID,
  InstanceType.JSON_PROPERTY_SIZE,
  InstanceType.JSON_PROPERTY_FAMILY,
  InstanceType.JSON_PROPERTY_CPUS,
  InstanceType.JSON_PROPERTY_GPUS,
  InstanceType.JSON_PROPERTY_AUTHORIZED,
  InstanceType.JSON_PROPERTY_MEMORY,
  InstanceType.JSON_PROPERTY_ZONES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InstanceType {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * Instance type size
   */
  public enum SizeEnum {
    LARGE("large"),
    
    HUGE("huge"),
    
    JUMBO("jumbo"),
    
    MEDIUM("medium"),
    
    MEGA("mega"),
    
    SMALL("small"),
    
    EXTRA_LARGE("extra-large"),
    
    TITAN("titan"),
    
    MICRO("micro"),
    
    COLOSSUS("colossus"),
    
    TINY("tiny");

    private String value;

    SizeEnum(String value) {
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
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIZE = "size";
  private SizeEnum size;

  /**
   * Instance type family
   */
  public enum FamilyEnum {
    GPU3("gpu3"),
    
    GPU2("gpu2"),
    
    GPU("gpu"),
    
    MEMORY("memory"),
    
    STORAGE("storage"),
    
    STANDARD("standard"),
    
    COLOSSUS("colossus"),
    
    CPU("cpu");

    private String value;

    FamilyEnum(String value) {
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
    public static FamilyEnum fromValue(String value) {
      for (FamilyEnum b : FamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FAMILY = "family";
  private FamilyEnum family;

  public static final String JSON_PROPERTY_CPUS = "cpus";
  private Long cpus;

  public static final String JSON_PROPERTY_GPUS = "gpus";
  private Long gpus;

  public static final String JSON_PROPERTY_AUTHORIZED = "authorized";
  private Boolean authorized;

  public static final String JSON_PROPERTY_MEMORY = "memory";
  private Long memory;

  public static final String JSON_PROPERTY_ZONES = "zones";
  private List<ZoneName> zones;

  public InstanceType() { 
  }

  @JsonCreator
  public InstanceType(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_SIZE) SizeEnum size, 
    @JsonProperty(JSON_PROPERTY_FAMILY) FamilyEnum family, 
    @JsonProperty(JSON_PROPERTY_CPUS) Long cpus, 
    @JsonProperty(JSON_PROPERTY_GPUS) Long gpus, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZED) Boolean authorized, 
    @JsonProperty(JSON_PROPERTY_MEMORY) Long memory, 
    @JsonProperty(JSON_PROPERTY_ZONES) List<ZoneName> zones
  ) {
  this();
    this.id = id;
    this.size = size;
    this.family = family;
    this.cpus = cpus;
    this.gpus = gpus;
    this.authorized = authorized;
    this.memory = memory;
    this.zones = zones;
  }

   /**
   * Instance type ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Instance type size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SizeEnum getSize() {
    return size;
  }




   /**
   * Instance type family
   * @return family
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FamilyEnum getFamily() {
    return family;
  }




   /**
   * CPU count
   * minimum: 0
   * @return cpus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpus() {
    return cpus;
  }




   /**
   * GPU count
   * minimum: 0
   * @return gpus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGpus() {
    return gpus;
  }




   /**
   * Requires authorization or publicly available
   * @return authorized
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthorized() {
    return authorized;
  }




   /**
   * Available memory
   * minimum: 0
   * @return memory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMemory() {
    return memory;
  }




   /**
   * Instance Type available zones
   * @return zones
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZoneName> getZones() {
    return zones;
  }




  /**
   * Return true if this instance-type object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceType instanceType = (InstanceType) o;
    return Objects.equals(this.id, instanceType.id) &&
        Objects.equals(this.size, instanceType.size) &&
        Objects.equals(this.family, instanceType.family) &&
        Objects.equals(this.cpus, instanceType.cpus) &&
        Objects.equals(this.gpus, instanceType.gpus) &&
        Objects.equals(this.authorized, instanceType.authorized) &&
        Objects.equals(this.memory, instanceType.memory) &&
        Objects.equals(this.zones, instanceType.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, size, family, cpus, gpus, authorized, memory, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    gpus: ").append(toIndentedString(gpus)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `family` to the URL query string
    if (getFamily() != null) {
      joiner.add(String.format("%sfamily%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cpus` to the URL query string
    if (getCpus() != null) {
      joiner.add(String.format("%scpus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCpus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `gpus` to the URL query string
    if (getGpus() != null) {
      joiner.add(String.format("%sgpus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGpus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authorized` to the URL query string
    if (getAuthorized() != null) {
      joiner.add(String.format("%sauthorized%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorized()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `memory` to the URL query string
    if (getMemory() != null) {
      joiner.add(String.format("%smemory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMemory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `zones` to the URL query string
    if (getZones() != null) {
      for (int i = 0; i < getZones().size(); i++) {
        if (getZones().get(i) != null) {
          joiner.add(String.format("%szones%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getZones().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}

