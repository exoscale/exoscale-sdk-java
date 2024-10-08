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
import com.exoscale.sdk.model.DeployTarget;
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
 * ListDeployTargets200Response
 */
@JsonPropertyOrder({
  ListDeployTargets200Response.JSON_PROPERTY_DEPLOY_TARGETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ListDeployTargets200Response {
  public static final String JSON_PROPERTY_DEPLOY_TARGETS = "deploy-targets";
  private List<DeployTarget> deployTargets;

  public ListDeployTargets200Response() { 
  }

  public ListDeployTargets200Response deployTargets(List<DeployTarget> deployTargets) {
    this.deployTargets = deployTargets;
    return this;
  }

  public ListDeployTargets200Response addDeployTargetsItem(DeployTarget deployTargetsItem) {
    if (this.deployTargets == null) {
      this.deployTargets = new ArrayList<>();
    }
    this.deployTargets.add(deployTargetsItem);
    return this;
  }

   /**
   * Get deployTargets
   * @return deployTargets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeployTarget> getDeployTargets() {
    return deployTargets;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployTargets(List<DeployTarget> deployTargets) {
    this.deployTargets = deployTargets;
  }


  /**
   * Return true if this list_deploy_targets_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeployTargets200Response listDeployTargets200Response = (ListDeployTargets200Response) o;
    return Objects.equals(this.deployTargets, listDeployTargets200Response.deployTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeployTargets200Response {\n");
    sb.append("    deployTargets: ").append(toIndentedString(deployTargets)).append("\n");
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

    // add `deploy-targets` to the URL query string
    if (getDeployTargets() != null) {
      for (int i = 0; i < getDeployTargets().size(); i++) {
        if (getDeployTargets().get(i) != null) {
          joiner.add(getDeployTargets().get(i).toUrlQueryString(String.format("%sdeploy-targets%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

