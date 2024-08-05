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
import com.exoscale.exoscale4j.model.DbaasOpensearchAclConfigAclsInnerRulesInner;
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
 * DbaasOpensearchAclConfigAclsInner
 */
@JsonPropertyOrder({
  DbaasOpensearchAclConfigAclsInner.JSON_PROPERTY_RULES,
  DbaasOpensearchAclConfigAclsInner.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T21:53:56.743866Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasOpensearchAclConfigAclsInner {
  public static final String JSON_PROPERTY_RULES = "rules";
  private List<DbaasOpensearchAclConfigAclsInnerRulesInner> rules;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public DbaasOpensearchAclConfigAclsInner() { 
  }

  public DbaasOpensearchAclConfigAclsInner rules(List<DbaasOpensearchAclConfigAclsInnerRulesInner> rules) {
    this.rules = rules;
    return this;
  }

  public DbaasOpensearchAclConfigAclsInner addRulesItem(DbaasOpensearchAclConfigAclsInnerRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasOpensearchAclConfigAclsInnerRulesInner> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<DbaasOpensearchAclConfigAclsInnerRulesInner> rules) {
    this.rules = rules;
  }


  public DbaasOpensearchAclConfigAclsInner username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this dbaas_opensearch_acl_config_acls_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasOpensearchAclConfigAclsInner dbaasOpensearchAclConfigAclsInner = (DbaasOpensearchAclConfigAclsInner) o;
    return Objects.equals(this.rules, dbaasOpensearchAclConfigAclsInner.rules) &&
        Objects.equals(this.username, dbaasOpensearchAclConfigAclsInner.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasOpensearchAclConfigAclsInner {\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

    // add `rules` to the URL query string
    if (getRules() != null) {
      for (int i = 0; i < getRules().size(); i++) {
        if (getRules().get(i) != null) {
          joiner.add(getRules().get(i).toUrlQueryString(String.format("%srules%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

