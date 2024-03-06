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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GithubAuthIntegration
 */
@JsonPropertyOrder({
  GithubAuthIntegration.JSON_PROPERTY_ALLOW_SIGN_UP,
  GithubAuthIntegration.JSON_PROPERTY_CLIENT_ID,
  GithubAuthIntegration.JSON_PROPERTY_CLIENT_SECRET,
  GithubAuthIntegration.JSON_PROPERTY_TEAM_IDS,
  GithubAuthIntegration.JSON_PROPERTY_ALLOWED_ORGANIZATIONS
})
@JsonTypeName("Github_Auth_integration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class GithubAuthIntegration {
  public static final String JSON_PROPERTY_ALLOW_SIGN_UP = "allow_sign_up";
  private Boolean allowSignUp;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_TEAM_IDS = "team_ids";
  private List<Integer> teamIds;

  public static final String JSON_PROPERTY_ALLOWED_ORGANIZATIONS = "allowed_organizations";
  private List<String> allowedOrganizations;

  public GithubAuthIntegration() {
  }

  public GithubAuthIntegration allowSignUp(Boolean allowSignUp) {
    
    this.allowSignUp = allowSignUp;
    return this;
  }

   /**
   * Get allowSignUp
   * @return allowSignUp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_SIGN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowSignUp() {
    return allowSignUp;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_SIGN_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowSignUp(Boolean allowSignUp) {
    this.allowSignUp = allowSignUp;
  }


  public GithubAuthIntegration clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public GithubAuthIntegration clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public GithubAuthIntegration teamIds(List<Integer> teamIds) {
    
    this.teamIds = teamIds;
    return this;
  }

  public GithubAuthIntegration addTeamIdsItem(Integer teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * Get teamIds
   * @return teamIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTeamIds() {
    return teamIds;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamIds(List<Integer> teamIds) {
    this.teamIds = teamIds;
  }


  public GithubAuthIntegration allowedOrganizations(List<String> allowedOrganizations) {
    
    this.allowedOrganizations = allowedOrganizations;
    return this;
  }

  public GithubAuthIntegration addAllowedOrganizationsItem(String allowedOrganizationsItem) {
    if (this.allowedOrganizations == null) {
      this.allowedOrganizations = new ArrayList<>();
    }
    this.allowedOrganizations.add(allowedOrganizationsItem);
    return this;
  }

   /**
   * Get allowedOrganizations
   * @return allowedOrganizations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedOrganizations() {
    return allowedOrganizations;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_ORGANIZATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrganizations(List<String> allowedOrganizations) {
    this.allowedOrganizations = allowedOrganizations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubAuthIntegration githubAuthIntegration = (GithubAuthIntegration) o;
    return Objects.equals(this.allowSignUp, githubAuthIntegration.allowSignUp) &&
        Objects.equals(this.clientId, githubAuthIntegration.clientId) &&
        Objects.equals(this.clientSecret, githubAuthIntegration.clientSecret) &&
        Objects.equals(this.teamIds, githubAuthIntegration.teamIds) &&
        Objects.equals(this.allowedOrganizations, githubAuthIntegration.allowedOrganizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSignUp, clientId, clientSecret, teamIds, allowedOrganizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubAuthIntegration {\n");
    sb.append("    allowSignUp: ").append(toIndentedString(allowSignUp)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    allowedOrganizations: ").append(toIndentedString(allowedOrganizations)).append("\n");
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

}

