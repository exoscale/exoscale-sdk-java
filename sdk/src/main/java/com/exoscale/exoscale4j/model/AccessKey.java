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
import com.exoscale.exoscale4j.model.AccessKeyResource;
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
 * IAM Access Key
 */
@JsonPropertyOrder({
  AccessKey.JSON_PROPERTY_NAME,
  AccessKey.JSON_PROPERTY_KEY,
  AccessKey.JSON_PROPERTY_SECRET,
  AccessKey.JSON_PROPERTY_TYPE,
  AccessKey.JSON_PROPERTY_VERSION,
  AccessKey.JSON_PROPERTY_TAGS,
  AccessKey.JSON_PROPERTY_OPERATIONS,
  AccessKey.JSON_PROPERTY_RESOURCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:19:43.121270Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccessKey {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  /**
   * IAM Access Key type
   */
  public enum TypeEnum {
    RESTRICTED("restricted"),
    
    UNRESTRICTED("unrestricted");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * IAM Access Key version
   */
  public enum VersionEnum {
    V2("v2"),
    
    V1("v1");

    private String value;

    VersionEnum(String value) {
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
    public static VersionEnum fromValue(String value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERSION = "version";
  private VersionEnum version;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  private List<String> operations;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private List<AccessKeyResource> resources;

  public AccessKey() { 
  }

  @JsonCreator
  public AccessKey(
    @JsonProperty(JSON_PROPERTY_SECRET) String secret, 
    @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type
  ) {
  this();
    this.secret = secret;
    this.type = type;
  }

  public AccessKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * IAM Access Key name
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


  public AccessKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * IAM Access Key
   * @return key
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


   /**
   * IAM Access Key Secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }




   /**
   * IAM Access Key type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }




  public AccessKey version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * IAM Access Key version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VersionEnum getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  public AccessKey tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AccessKey addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * IAM Access Key tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public AccessKey operations(List<String> operations) {
    this.operations = operations;
    return this;
  }

  public AccessKey addOperationsItem(String operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * IAM Access Key operations
   * @return operations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(List<String> operations) {
    this.operations = operations;
  }


  public AccessKey resources(List<AccessKeyResource> resources) {
    this.resources = resources;
    return this;
  }

  public AccessKey addResourcesItem(AccessKeyResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * IAM Access Key Resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccessKeyResource> getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResources(List<AccessKeyResource> resources) {
    this.resources = resources;
  }


  /**
   * Return true if this access-key object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKey accessKey = (AccessKey) o;
    return Objects.equals(this.name, accessKey.name) &&
        Objects.equals(this.key, accessKey.key) &&
        Objects.equals(this.secret, accessKey.secret) &&
        Objects.equals(this.type, accessKey.type) &&
        Objects.equals(this.version, accessKey.version) &&
        Objects.equals(this.tags, accessKey.tags) &&
        Objects.equals(this.operations, accessKey.operations) &&
        Objects.equals(this.resources, accessKey.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, secret, type, version, tags, operations, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKey {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secret` to the URL query string
    if (getSecret() != null) {
      joiner.add(String.format("%ssecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getTags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `operations` to the URL query string
    if (getOperations() != null) {
      for (int i = 0; i < getOperations().size(); i++) {
        joiner.add(String.format("%soperations%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getOperations().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `resources` to the URL query string
    if (getResources() != null) {
      for (int i = 0; i < getResources().size(); i++) {
        if (getResources().get(i) != null) {
          joiner.add(getResources().get(i).toUrlQueryString(String.format("%sresources%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

