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
import com.exoscale.exoscale4j.model.SecurityGroupRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Security Group
 */
@JsonPropertyOrder({
  SecurityGroup.JSON_PROPERTY_ID,
  SecurityGroup.JSON_PROPERTY_NAME,
  SecurityGroup.JSON_PROPERTY_DESCRIPTION,
  SecurityGroup.JSON_PROPERTY_EXTERNAL_SOURCES,
  SecurityGroup.JSON_PROPERTY_RULES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T11:18:35.752314Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SecurityGroup {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_SOURCES = "external-sources";
  private Set<String> externalSources;

  public static final String JSON_PROPERTY_RULES = "rules";
  private Set<SecurityGroupRule> rules;

  public SecurityGroup() { 
  }

  @JsonCreator
  public SecurityGroup(
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
  this();
    this.id = id;
  }

   /**
   * Security Group ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public SecurityGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Security Group name
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


  public SecurityGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Security Group description
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


  public SecurityGroup externalSources(Set<String> externalSources) {
    this.externalSources = externalSources;
    return this;
  }

  public SecurityGroup addExternalSourcesItem(String externalSourcesItem) {
    if (this.externalSources == null) {
      this.externalSources = new LinkedHashSet<>();
    }
    this.externalSources.add(externalSourcesItem);
    return this;
  }

   /**
   * Security Group external sources
   * @return externalSources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getExternalSources() {
    return externalSources;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalSources(Set<String> externalSources) {
    this.externalSources = externalSources;
  }


  public SecurityGroup rules(Set<SecurityGroupRule> rules) {
    this.rules = rules;
    return this;
  }

  public SecurityGroup addRulesItem(SecurityGroupRule rulesItem) {
    if (this.rules == null) {
      this.rules = new LinkedHashSet<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Security Group rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SecurityGroupRule> getRules() {
    return rules;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(Set<SecurityGroupRule> rules) {
    this.rules = rules;
  }


  /**
   * Return true if this security-group object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroup securityGroup = (SecurityGroup) o;
    return Objects.equals(this.id, securityGroup.id) &&
        Objects.equals(this.name, securityGroup.name) &&
        Objects.equals(this.description, securityGroup.description) &&
        Objects.equals(this.externalSources, securityGroup.externalSources) &&
        Objects.equals(this.rules, securityGroup.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, externalSources, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalSources: ").append(toIndentedString(externalSources)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `external-sources` to the URL query string
    if (getExternalSources() != null) {
      int i = 0;
      for (String _item : getExternalSources()) {
        joiner.add(String.format("%sexternal-sources%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
      i++;
    }

    // add `rules` to the URL query string
    if (getRules() != null) {
      int i = 0;
      for (SecurityGroupRule _item : getRules()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%srules%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }
}

