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
import com.exoscale.sdk.model.ZoneName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instance template
 */
@JsonPropertyOrder({
  Template.JSON_PROPERTY_MAINTAINER,
  Template.JSON_PROPERTY_DESCRIPTION,
  Template.JSON_PROPERTY_SSH_KEY_ENABLED,
  Template.JSON_PROPERTY_FAMILY,
  Template.JSON_PROPERTY_NAME,
  Template.JSON_PROPERTY_DEFAULT_USER,
  Template.JSON_PROPERTY_SIZE,
  Template.JSON_PROPERTY_PASSWORD_ENABLED,
  Template.JSON_PROPERTY_BUILD,
  Template.JSON_PROPERTY_CHECKSUM,
  Template.JSON_PROPERTY_BOOT_MODE,
  Template.JSON_PROPERTY_ID,
  Template.JSON_PROPERTY_ZONES,
  Template.JSON_PROPERTY_URL,
  Template.JSON_PROPERTY_VERSION,
  Template.JSON_PROPERTY_CREATED_AT,
  Template.JSON_PROPERTY_VISIBILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Template {
  public static final String JSON_PROPERTY_MAINTAINER = "maintainer";
  private String maintainer;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SSH_KEY_ENABLED = "ssh-key-enabled";
  private Boolean sshKeyEnabled;

  public static final String JSON_PROPERTY_FAMILY = "family";
  private String family;

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

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ZONES = "zones";
  private List<ZoneName> zones;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  /**
   * Template visibility
   */
  public enum VisibilityEnum {
    PRIVATE("private"),
    
    PUBLIC("public");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private VisibilityEnum visibility;

  public Template() { 
  }

  @JsonCreator
  public Template(
    @JsonProperty(JSON_PROPERTY_MAINTAINER) String maintainer, 
    @JsonProperty(JSON_PROPERTY_FAMILY) String family, 
    @JsonProperty(JSON_PROPERTY_BUILD) String build, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_VERSION) String version, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_VISIBILITY) VisibilityEnum visibility
  ) {
  this();
    this.maintainer = maintainer;
    this.family = family;
    this.build = build;
    this.id = id;
    this.version = version;
    this.createdAt = createdAt;
    this.visibility = visibility;
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




  public Template description(String description) {
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


  public Template sshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
    return this;
  }

   /**
   * Enable SSH key-based login
   * @return sshKeyEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSH_KEY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSshKeyEnabled() {
    return sshKeyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SSH_KEY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
  }


   /**
   * Template family
   * @return family
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamily() {
    return family;
  }




  public Template name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template name
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


  public Template defaultUser(String defaultUser) {
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


  public Template size(Long size) {
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


  public Template passwordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
    return this;
  }

   /**
   * Enable password-based login
   * @return passwordEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPasswordEnabled() {
    return passwordEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
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




  public Template checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * Template MD5 checksum
   * @return checksum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChecksum() {
    return checksum;
  }


  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public Template bootMode(BootModeEnum bootMode) {
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


   /**
   * Template ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public Template zones(List<ZoneName> zones) {
    this.zones = zones;
    return this;
  }

  public Template addZonesItem(ZoneName zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Zones availability
   * @return zones
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZoneName> getZones() {
    return zones;
  }


  @JsonProperty(JSON_PROPERTY_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZones(List<ZoneName> zones) {
    this.zones = zones;
  }


  public Template url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Template source URL
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
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




   /**
   * Template creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Template visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisibilityEnum getVisibility() {
    return visibility;
  }




  /**
   * Return true if this template object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.maintainer, template.maintainer) &&
        Objects.equals(this.description, template.description) &&
        Objects.equals(this.sshKeyEnabled, template.sshKeyEnabled) &&
        Objects.equals(this.family, template.family) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this.defaultUser, template.defaultUser) &&
        Objects.equals(this.size, template.size) &&
        Objects.equals(this.passwordEnabled, template.passwordEnabled) &&
        Objects.equals(this.build, template.build) &&
        Objects.equals(this.checksum, template.checksum) &&
        Objects.equals(this.bootMode, template.bootMode) &&
        Objects.equals(this.id, template.id) &&
        Objects.equals(this.zones, template.zones) &&
        Objects.equals(this.url, template.url) &&
        Objects.equals(this.version, template.version) &&
        Objects.equals(this.createdAt, template.createdAt) &&
        Objects.equals(this.visibility, template.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintainer, description, sshKeyEnabled, family, name, defaultUser, size, passwordEnabled, build, checksum, bootMode, id, zones, url, version, createdAt, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sshKeyEnabled: ").append(toIndentedString(sshKeyEnabled)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    passwordEnabled: ").append(toIndentedString(passwordEnabled)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    bootMode: ").append(toIndentedString(bootMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

    // add `family` to the URL query string
    if (getFamily() != null) {
      joiner.add(String.format("%sfamily%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `zones` to the URL query string
    if (getZones() != null) {
      for (int i = 0; i < getZones().size(); i++) {
        if (getZones().get(i) != null) {
          joiner.add(String.format("%szones%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getZones().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `visibility` to the URL query string
    if (getVisibility() != null) {
      joiner.add(String.format("%svisibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisibility()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

