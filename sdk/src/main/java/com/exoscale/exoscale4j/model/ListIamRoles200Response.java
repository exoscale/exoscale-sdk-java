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
import com.exoscale.exoscale4j.model.IamRole;
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
 * ListIamRoles200Response
 */
@JsonPropertyOrder({
  ListIamRoles200Response.JSON_PROPERTY_IAM_ROLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T17:28:20.527227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListIamRoles200Response {
  public static final String JSON_PROPERTY_IAM_ROLES = "iam-roles";
  private List<IamRole> iamRoles;

  public ListIamRoles200Response() { 
  }

  public ListIamRoles200Response iamRoles(List<IamRole> iamRoles) {
    this.iamRoles = iamRoles;
    return this;
  }

  public ListIamRoles200Response addIamRolesItem(IamRole iamRolesItem) {
    if (this.iamRoles == null) {
      this.iamRoles = new ArrayList<>();
    }
    this.iamRoles.add(iamRolesItem);
    return this;
  }

   /**
   * Get iamRoles
   * @return iamRoles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IAM_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IamRole> getIamRoles() {
    return iamRoles;
  }


  @JsonProperty(JSON_PROPERTY_IAM_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIamRoles(List<IamRole> iamRoles) {
    this.iamRoles = iamRoles;
  }


  /**
   * Return true if this list_iam_roles_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListIamRoles200Response listIamRoles200Response = (ListIamRoles200Response) o;
    return Objects.equals(this.iamRoles, listIamRoles200Response.iamRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iamRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListIamRoles200Response {\n");
    sb.append("    iamRoles: ").append(toIndentedString(iamRoles)).append("\n");
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

    // add `iam-roles` to the URL query string
    if (getIamRoles() != null) {
      for (int i = 0; i < getIamRoles().size(); i++) {
        if (getIamRoles().get(i) != null) {
          joiner.add(getIamRoles().get(i).toUrlQueryString(String.format("%siam-roles%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

