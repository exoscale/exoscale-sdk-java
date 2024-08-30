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
import com.exoscale.sdk.model.DbaasOpensearchAclConfigAclsInner;
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
 * DbaasOpensearchAclConfig
 */
@JsonPropertyOrder({
  DbaasOpensearchAclConfig.JSON_PROPERTY_ACLS,
  DbaasOpensearchAclConfig.JSON_PROPERTY_ACL_ENABLED,
  DbaasOpensearchAclConfig.JSON_PROPERTY_EXTENDED_ACL_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DbaasOpensearchAclConfig {
  public static final String JSON_PROPERTY_ACLS = "acls";
  private List<DbaasOpensearchAclConfigAclsInner> acls;

  public static final String JSON_PROPERTY_ACL_ENABLED = "acl-enabled";
  private Boolean aclEnabled;

  public static final String JSON_PROPERTY_EXTENDED_ACL_ENABLED = "extended-acl-enabled";
  private Boolean extendedAclEnabled;

  public DbaasOpensearchAclConfig() { 
  }

  public DbaasOpensearchAclConfig acls(List<DbaasOpensearchAclConfigAclsInner> acls) {
    this.acls = acls;
    return this;
  }

  public DbaasOpensearchAclConfig addAclsItem(DbaasOpensearchAclConfigAclsInner aclsItem) {
    if (this.acls == null) {
      this.acls = new ArrayList<>();
    }
    this.acls.add(aclsItem);
    return this;
  }

   /**
   * List of OpenSearch ACLs
   * @return acls
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasOpensearchAclConfigAclsInner> getAcls() {
    return acls;
  }


  @JsonProperty(JSON_PROPERTY_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcls(List<DbaasOpensearchAclConfigAclsInner> acls) {
    this.acls = acls;
  }


  public DbaasOpensearchAclConfig aclEnabled(Boolean aclEnabled) {
    this.aclEnabled = aclEnabled;
    return this;
  }

   /**
   * Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
   * @return aclEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACL_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAclEnabled() {
    return aclEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ACL_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAclEnabled(Boolean aclEnabled) {
    this.aclEnabled = aclEnabled;
  }


  public DbaasOpensearchAclConfig extendedAclEnabled(Boolean extendedAclEnabled) {
    this.extendedAclEnabled = extendedAclEnabled;
    return this;
  }

   /**
   * Enable to enforce index rules in a limited fashion for requests that use the _mget, _msearch, and _bulk APIs
   * @return extendedAclEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENDED_ACL_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExtendedAclEnabled() {
    return extendedAclEnabled;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_ACL_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedAclEnabled(Boolean extendedAclEnabled) {
    this.extendedAclEnabled = extendedAclEnabled;
  }


  /**
   * Return true if this dbaas-opensearch-acl-config object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasOpensearchAclConfig dbaasOpensearchAclConfig = (DbaasOpensearchAclConfig) o;
    return Objects.equals(this.acls, dbaasOpensearchAclConfig.acls) &&
        Objects.equals(this.aclEnabled, dbaasOpensearchAclConfig.aclEnabled) &&
        Objects.equals(this.extendedAclEnabled, dbaasOpensearchAclConfig.extendedAclEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acls, aclEnabled, extendedAclEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasOpensearchAclConfig {\n");
    sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
    sb.append("    aclEnabled: ").append(toIndentedString(aclEnabled)).append("\n");
    sb.append("    extendedAclEnabled: ").append(toIndentedString(extendedAclEnabled)).append("\n");
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

    // add `acls` to the URL query string
    if (getAcls() != null) {
      for (int i = 0; i < getAcls().size(); i++) {
        if (getAcls().get(i) != null) {
          joiner.add(getAcls().get(i).toUrlQueryString(String.format("%sacls%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `acl-enabled` to the URL query string
    if (getAclEnabled() != null) {
      joiner.add(String.format("%sacl-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAclEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `extended-acl-enabled` to the URL query string
    if (getExtendedAclEnabled() != null) {
      joiner.add(String.format("%sextended-acl-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExtendedAclEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

