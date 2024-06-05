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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RegisterTemplateRequest
 */
@JsonPropertyOrder({
  RegisterTemplateRequest.JSON_PROPERTY_MAINTAINER,
  RegisterTemplateRequest.JSON_PROPERTY_DESCRIPTION,
  RegisterTemplateRequest.JSON_PROPERTY_SSH_KEY_ENABLED,
  RegisterTemplateRequest.JSON_PROPERTY_NAME,
  RegisterTemplateRequest.JSON_PROPERTY_DEFAULT_USER,
  RegisterTemplateRequest.JSON_PROPERTY_SIZE,
  RegisterTemplateRequest.JSON_PROPERTY_PASSWORD_ENABLED,
  RegisterTemplateRequest.JSON_PROPERTY_BUILD,
  RegisterTemplateRequest.JSON_PROPERTY_CHECKSUM,
  RegisterTemplateRequest.JSON_PROPERTY_BOOT_MODE,
  RegisterTemplateRequest.JSON_PROPERTY_URL,
  RegisterTemplateRequest.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T10:50:16.155057+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class RegisterTemplateRequest {
  public static final String JSON_PROPERTY_MAINTAINER = "maintainer";
  private String maintainer;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SSH_KEY_ENABLED = "ssh-key-enabled";
  private Boolean sshKeyEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFAULT_USER = "default-user";
  private String defaultUser;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_PASSWORD_ENABLED = "password-enabled";
  private Boolean passwordEnabled;

  public static final String JSON_PROPERTY_BUILD = "build";
  private String build;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  /**
   * Boot mode (default: legacy)
   */
  public enum BootModeEnum {
    LEGACY("legacy"),
    
    UEFI("uefi");

    private String value;

    BootModeEnum(String value) {
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
    public static BootModeEnum fromValue(String value) {
      for (BootModeEnum b : BootModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BOOT_MODE = "boot-mode";
  private BootModeEnum bootMode;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public RegisterTemplateRequest() { 
  }

  public RegisterTemplateRequest maintainer(String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

   /**
   * Template maintainer
   * @return maintainer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaintainer() {
    return maintainer;
  }


  @JsonProperty(JSON_PROPERTY_MAINTAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintainer(String maintainer) {
    this.maintainer = maintainer;
  }


  public RegisterTemplateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Template description
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


  public RegisterTemplateRequest sshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
    return this;
  }

   /**
   * Enable SSH key-based login
   * @return sshKeyEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SSH_KEY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSshKeyEnabled() {
    return sshKeyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SSH_KEY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
  }


  public RegisterTemplateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RegisterTemplateRequest defaultUser(String defaultUser) {
    this.defaultUser = defaultUser;
    return this;
  }

   /**
   * Template default user
   * @return defaultUser
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultUser() {
    return defaultUser;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultUser(String defaultUser) {
    this.defaultUser = defaultUser;
  }


  public RegisterTemplateRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Template size
   * minimum: 0
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public RegisterTemplateRequest passwordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
    return this;
  }

   /**
   * Enable password-based login
   * @return passwordEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPasswordEnabled() {
    return passwordEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPasswordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
  }


  public RegisterTemplateRequest build(String build) {
    this.build = build;
    return this;
  }

   /**
   * Template build
   * @return build
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuild() {
    return build;
  }


  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuild(String build) {
    this.build = build;
  }


  public RegisterTemplateRequest checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * Template MD5 checksum
   * @return checksum
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChecksum() {
    return checksum;
  }


  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public RegisterTemplateRequest bootMode(BootModeEnum bootMode) {
    this.bootMode = bootMode;
    return this;
  }

   /**
   * Boot mode (default: legacy)
   * @return bootMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOOT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BootModeEnum getBootMode() {
    return bootMode;
  }


  @JsonProperty(JSON_PROPERTY_BOOT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBootMode(BootModeEnum bootMode) {
    this.bootMode = bootMode;
  }


  public RegisterTemplateRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Template source URL
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public RegisterTemplateRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Template version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this register_template_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterTemplateRequest registerTemplateRequest = (RegisterTemplateRequest) o;
    return Objects.equals(this.maintainer, registerTemplateRequest.maintainer) &&
        Objects.equals(this.description, registerTemplateRequest.description) &&
        Objects.equals(this.sshKeyEnabled, registerTemplateRequest.sshKeyEnabled) &&
        Objects.equals(this.name, registerTemplateRequest.name) &&
        Objects.equals(this.defaultUser, registerTemplateRequest.defaultUser) &&
        Objects.equals(this.size, registerTemplateRequest.size) &&
        Objects.equals(this.passwordEnabled, registerTemplateRequest.passwordEnabled) &&
        Objects.equals(this.build, registerTemplateRequest.build) &&
        Objects.equals(this.checksum, registerTemplateRequest.checksum) &&
        Objects.equals(this.bootMode, registerTemplateRequest.bootMode) &&
        Objects.equals(this.url, registerTemplateRequest.url) &&
        Objects.equals(this.version, registerTemplateRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintainer, description, sshKeyEnabled, name, defaultUser, size, passwordEnabled, build, checksum, bootMode, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterTemplateRequest {\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sshKeyEnabled: ").append(toIndentedString(sshKeyEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    passwordEnabled: ").append(toIndentedString(passwordEnabled)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    bootMode: ").append(toIndentedString(bootMode)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `maintainer` to the URL query string
    if (getMaintainer() != null) {
      joiner.add(String.format("%smaintainer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaintainer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssh-key-enabled` to the URL query string
    if (getSshKeyEnabled() != null) {
      joiner.add(String.format("%sssh-key-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSshKeyEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `default-user` to the URL query string
    if (getDefaultUser() != null) {
      joiner.add(String.format("%sdefault-user%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultUser()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password-enabled` to the URL query string
    if (getPasswordEnabled() != null) {
      joiner.add(String.format("%spassword-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPasswordEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `build` to the URL query string
    if (getBuild() != null) {
      joiner.add(String.format("%sbuild%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBuild()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `checksum` to the URL query string
    if (getChecksum() != null) {
      joiner.add(String.format("%schecksum%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChecksum()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `boot-mode` to the URL query string
    if (getBootMode() != null) {
      joiner.add(String.format("%sboot-mode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBootMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

