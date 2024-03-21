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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
/**
 * IAM API Key
 */
@Schema(description = "IAM API Key")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class IamApiKeyCreated {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("secret")
  private String secret = null;

  @JsonProperty("role-id")
  private UUID roleId = null;

  public IamApiKeyCreated name(String name) {
    this.name = name;
    return this;
  }

   /**
   * IAM API Key name
   * @return name
  **/
  @Schema(description = "IAM API Key name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IamApiKeyCreated key(String key) {
    this.key = key;
    return this;
  }

   /**
   * IAM API Key
   * @return key
  **/
  @Schema(description = "IAM API Key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

   /**
   * IAM API Key Secret
   * @return secret
  **/
  @Schema(description = "IAM API Key Secret")
  public String getSecret() {
    return secret;
  }

  public IamApiKeyCreated roleId(UUID roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * IAM API Key Role ID
   * @return roleId
  **/
  @Schema(description = "IAM API Key Role ID")
  public UUID getRoleId() {
    return roleId;
  }

  public void setRoleId(UUID roleId) {
    this.roleId = roleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IamApiKeyCreated iamApiKeyCreated = (IamApiKeyCreated) o;
    return Objects.equals(this.name, iamApiKeyCreated.name) &&
        Objects.equals(this.key, iamApiKeyCreated.key) &&
        Objects.equals(this.secret, iamApiKeyCreated.secret) &&
        Objects.equals(this.roleId, iamApiKeyCreated.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, secret, roleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IamApiKeyCreated {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
