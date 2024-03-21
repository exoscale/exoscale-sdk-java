/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.AccessKeyResource;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * IAM Access Key
 */
@Schema(description = "IAM Access Key")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class AccessKey {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("secret")
  private String secret = null;

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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

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
    public static VersionEnum fromValue(String input) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("version")
  private VersionEnum version = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("operations")
  private List<String> operations = null;

  @JsonProperty("resources")
  private List<AccessKeyResource> resources = null;

  public AccessKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * IAM Access Key name
   * @return name
  **/
  @Schema(description = "IAM Access Key name")
  public String getName() {
    return name;
  }

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
  @Schema(description = "IAM Access Key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

   /**
   * IAM Access Key Secret
   * @return secret
  **/
  @Schema(description = "IAM Access Key Secret")
  public String getSecret() {
    return secret;
  }

   /**
   * IAM Access Key type
   * @return type
  **/
  @Schema(description = "IAM Access Key type")
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
  @Schema(description = "IAM Access Key version")
  public VersionEnum getVersion() {
    return version;
  }

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
  @Schema(description = "IAM Access Key tags")
  public List<String> getTags() {
    return tags;
  }

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
  @Schema(description = "IAM Access Key operations")
  public List<String> getOperations() {
    return operations;
  }

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
  @Schema(description = "IAM Access Key Resources")
  public List<AccessKeyResource> getResources() {
    return resources;
  }

  public void setResources(List<AccessKeyResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
