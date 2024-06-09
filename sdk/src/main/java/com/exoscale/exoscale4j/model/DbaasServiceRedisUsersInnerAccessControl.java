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
 * DbaasServiceRedisUsersInnerAccessControl
 */
@JsonPropertyOrder({
  DbaasServiceRedisUsersInnerAccessControl.JSON_PROPERTY_CATEGORIES,
  DbaasServiceRedisUsersInnerAccessControl.JSON_PROPERTY_CHANNELS,
  DbaasServiceRedisUsersInnerAccessControl.JSON_PROPERTY_COMMANDS,
  DbaasServiceRedisUsersInnerAccessControl.JSON_PROPERTY_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T22:11:49.172310+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceRedisUsersInnerAccessControl {
  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories;

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<String> channels;

  public static final String JSON_PROPERTY_COMMANDS = "commands";
  private List<String> commands;

  public static final String JSON_PROPERTY_KEYS = "keys";
  private List<String> keys;

  public DbaasServiceRedisUsersInnerAccessControl() { 
  }

  public DbaasServiceRedisUsersInnerAccessControl categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public DbaasServiceRedisUsersInnerAccessControl channels(List<String> channels) {
    this.channels = channels;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(List<String> channels) {
    this.channels = channels;
  }


  public DbaasServiceRedisUsersInnerAccessControl commands(List<String> commands) {
    this.commands = commands;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addCommandsItem(String commandsItem) {
    if (this.commands == null) {
      this.commands = new ArrayList<>();
    }
    this.commands.add(commandsItem);
    return this;
  }

   /**
   * Get commands
   * @return commands
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCommands() {
    return commands;
  }


  @JsonProperty(JSON_PROPERTY_COMMANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommands(List<String> commands) {
    this.commands = commands;
  }


  public DbaasServiceRedisUsersInnerAccessControl keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public DbaasServiceRedisUsersInnerAccessControl addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKeys() {
    return keys;
  }


  @JsonProperty(JSON_PROPERTY_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  /**
   * Return true if this dbaas_service_redis_users_inner_access_control object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceRedisUsersInnerAccessControl dbaasServiceRedisUsersInnerAccessControl = (DbaasServiceRedisUsersInnerAccessControl) o;
    return Objects.equals(this.categories, dbaasServiceRedisUsersInnerAccessControl.categories) &&
        Objects.equals(this.channels, dbaasServiceRedisUsersInnerAccessControl.channels) &&
        Objects.equals(this.commands, dbaasServiceRedisUsersInnerAccessControl.commands) &&
        Objects.equals(this.keys, dbaasServiceRedisUsersInnerAccessControl.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, channels, commands, keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceRedisUsersInnerAccessControl {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

    // add `categories` to the URL query string
    if (getCategories() != null) {
      for (int i = 0; i < getCategories().size(); i++) {
        joiner.add(String.format("%scategories%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getCategories().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `channels` to the URL query string
    if (getChannels() != null) {
      for (int i = 0; i < getChannels().size(); i++) {
        joiner.add(String.format("%schannels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getChannels().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `commands` to the URL query string
    if (getCommands() != null) {
      for (int i = 0; i < getCommands().size(); i++) {
        joiner.add(String.format("%scommands%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getCommands().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `keys` to the URL query string
    if (getKeys() != null) {
      for (int i = 0; i < getKeys().size(); i++) {
        joiner.add(String.format("%skeys%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getKeys().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

