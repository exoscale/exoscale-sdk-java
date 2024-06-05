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
import com.exoscale.exoscale4j.model.EnumOpensearchRulePermission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasOpensearchAclConfigAclsInnerRulesInner
 */
@JsonPropertyOrder({
  DbaasOpensearchAclConfigAclsInnerRulesInner.JSON_PROPERTY_INDEX,
  DbaasOpensearchAclConfigAclsInnerRulesInner.JSON_PROPERTY_PERMISSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T10:50:16.155057+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasOpensearchAclConfigAclsInnerRulesInner {
  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private EnumOpensearchRulePermission permission;

  public DbaasOpensearchAclConfigAclsInnerRulesInner() { 
  }

  public DbaasOpensearchAclConfigAclsInnerRulesInner index(String index) {
    this.index = index;
    return this;
  }

   /**
   * OpenSearch index pattern
   * @return index
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndex(String index) {
    this.index = index;
  }


  public DbaasOpensearchAclConfigAclsInnerRulesInner permission(EnumOpensearchRulePermission permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumOpensearchRulePermission getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermission(EnumOpensearchRulePermission permission) {
    this.permission = permission;
  }


  /**
   * Return true if this dbaas_opensearch_acl_config_acls_inner_rules_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasOpensearchAclConfigAclsInnerRulesInner dbaasOpensearchAclConfigAclsInnerRulesInner = (DbaasOpensearchAclConfigAclsInnerRulesInner) o;
    return Objects.equals(this.index, dbaasOpensearchAclConfigAclsInnerRulesInner.index) &&
        Objects.equals(this.permission, dbaasOpensearchAclConfigAclsInnerRulesInner.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasOpensearchAclConfigAclsInnerRulesInner {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `permission` to the URL query string
    if (getPermission() != null) {
      joiner.add(String.format("%spermission%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPermission()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

