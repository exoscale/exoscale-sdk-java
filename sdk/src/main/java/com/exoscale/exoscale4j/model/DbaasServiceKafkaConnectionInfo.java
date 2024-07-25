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
 * Kafka connection information properties
 */
@JsonPropertyOrder({
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_NODES,
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_ACCESS_CERT,
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_ACCESS_KEY,
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_CONNECT_URI,
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_REST_URI,
  DbaasServiceKafkaConnectionInfo.JSON_PROPERTY_REGISTRY_URI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:26:02.309598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceKafkaConnectionInfo {
  public static final String JSON_PROPERTY_NODES = "nodes";
  private List<String> nodes;

  public static final String JSON_PROPERTY_ACCESS_CERT = "access-cert";
  private String accessCert;

  public static final String JSON_PROPERTY_ACCESS_KEY = "access-key";
  private String accessKey;

  public static final String JSON_PROPERTY_CONNECT_URI = "connect-uri";
  private String connectUri;

  public static final String JSON_PROPERTY_REST_URI = "rest-uri";
  private String restUri;

  public static final String JSON_PROPERTY_REGISTRY_URI = "registry-uri";
  private String registryUri;

  public DbaasServiceKafkaConnectionInfo() { 
  }

  public DbaasServiceKafkaConnectionInfo nodes(List<String> nodes) {
    this.nodes = nodes;
    return this;
  }

  public DbaasServiceKafkaConnectionInfo addNodesItem(String nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNodes() {
    return nodes;
  }


  @JsonProperty(JSON_PROPERTY_NODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodes(List<String> nodes) {
    this.nodes = nodes;
  }


  public DbaasServiceKafkaConnectionInfo accessCert(String accessCert) {
    this.accessCert = accessCert;
    return this;
  }

   /**
   * Get accessCert
   * @return accessCert
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessCert() {
    return accessCert;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCert(String accessCert) {
    this.accessCert = accessCert;
  }


  public DbaasServiceKafkaConnectionInfo accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKey() {
    return accessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public DbaasServiceKafkaConnectionInfo connectUri(String connectUri) {
    this.connectUri = connectUri;
    return this;
  }

   /**
   * Get connectUri
   * @return connectUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectUri() {
    return connectUri;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectUri(String connectUri) {
    this.connectUri = connectUri;
  }


  public DbaasServiceKafkaConnectionInfo restUri(String restUri) {
    this.restUri = restUri;
    return this;
  }

   /**
   * Get restUri
   * @return restUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REST_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRestUri() {
    return restUri;
  }


  @JsonProperty(JSON_PROPERTY_REST_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestUri(String restUri) {
    this.restUri = restUri;
  }


  public DbaasServiceKafkaConnectionInfo registryUri(String registryUri) {
    this.registryUri = registryUri;
    return this;
  }

   /**
   * Get registryUri
   * @return registryUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTRY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistryUri() {
    return registryUri;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistryUri(String registryUri) {
    this.registryUri = registryUri;
  }


  /**
   * Return true if this dbaas_service_kafka_connection_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceKafkaConnectionInfo dbaasServiceKafkaConnectionInfo = (DbaasServiceKafkaConnectionInfo) o;
    return Objects.equals(this.nodes, dbaasServiceKafkaConnectionInfo.nodes) &&
        Objects.equals(this.accessCert, dbaasServiceKafkaConnectionInfo.accessCert) &&
        Objects.equals(this.accessKey, dbaasServiceKafkaConnectionInfo.accessKey) &&
        Objects.equals(this.connectUri, dbaasServiceKafkaConnectionInfo.connectUri) &&
        Objects.equals(this.restUri, dbaasServiceKafkaConnectionInfo.restUri) &&
        Objects.equals(this.registryUri, dbaasServiceKafkaConnectionInfo.registryUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, accessCert, accessKey, connectUri, restUri, registryUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceKafkaConnectionInfo {\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    accessCert: ").append(toIndentedString(accessCert)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    connectUri: ").append(toIndentedString(connectUri)).append("\n");
    sb.append("    restUri: ").append(toIndentedString(restUri)).append("\n");
    sb.append("    registryUri: ").append(toIndentedString(registryUri)).append("\n");
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

    // add `nodes` to the URL query string
    if (getNodes() != null) {
      for (int i = 0; i < getNodes().size(); i++) {
        joiner.add(String.format("%snodes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getNodes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `access-cert` to the URL query string
    if (getAccessCert() != null) {
      joiner.add(String.format("%saccess-cert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessCert()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `access-key` to the URL query string
    if (getAccessKey() != null) {
      joiner.add(String.format("%saccess-key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connect-uri` to the URL query string
    if (getConnectUri() != null) {
      joiner.add(String.format("%sconnect-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rest-uri` to the URL query string
    if (getRestUri() != null) {
      joiner.add(String.format("%srest-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRestUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `registry-uri` to the URL query string
    if (getRegistryUri() != null) {
      joiner.add(String.format("%sregistry-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRegistryUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

