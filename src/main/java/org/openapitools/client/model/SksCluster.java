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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.openapitools.client.model.SksNodepool;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SKS Cluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class SksCluster {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  /**
   * Cluster CNI
   */
  @JsonAdapter(CniEnum.Adapter.class)
  public enum CniEnum {
    CALICO("calico"),
    
    CILIUM("cilium");

    private String value;

    CniEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CniEnum fromValue(String value) {
      for (CniEnum b : CniEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CniEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CniEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CniEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CniEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CniEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CNI = "cni";
  @SerializedName(SERIALIZED_NAME_CNI)
  private CniEnum cni;

  public static final String SERIALIZED_NAME_AUTO_UPGRADE = "auto-upgrade";
  @SerializedName(SERIALIZED_NAME_AUTO_UPGRADE)
  private Boolean autoUpgrade;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Cluster state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ROTATING_CCM_CREDENTIALS("rotating-ccm-credentials"),
    
    CREATING("creating"),
    
    UPGRADING("upgrading"),
    
    DELETING("deleting"),
    
    RUNNING("running"),
    
    SUSPENDING("suspending"),
    
    UPDATING("updating"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_NODEPOOLS = "nodepools";
  @SerializedName(SERIALIZED_NAME_NODEPOOLS)
  private List<SksNodepool> nodepools = new ArrayList<>();

  /**
   * Cluster level
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    STARTER("starter"),
    
    PRO("pro");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LevelEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LevelEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private LevelEnum level;

  /**
   * Gets or Sets addons
   */
  @JsonAdapter(AddonsEnum.Adapter.class)
  public enum AddonsEnum {
    EXOSCALE_CLOUD_CONTROLLER("exoscale-cloud-controller"),
    
    EXOSCALE_CONTAINER_STORAGE_INTERFACE("exoscale-container-storage-interface"),
    
    METRICS_SERVER("metrics-server");

    private String value;

    AddonsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddonsEnum fromValue(String value) {
      for (AddonsEnum b : AddonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddonsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddonsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddonsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddonsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AddonsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ADDONS = "addons";
  @SerializedName(SERIALIZED_NAME_ADDONS)
  private Set<AddonsEnum> addons = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATED_AT = "created-at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public SksCluster() {
  }

  public SksCluster(
     StateEnum state, 
     List<SksNodepool> nodepools, 
     UUID id, 
     OffsetDateTime createdAt, 
     String endpoint
  ) {
    this();
    this.state = state;
    this.nodepools = nodepools;
    this.id = id;
    this.createdAt = createdAt;
    this.endpoint = endpoint;
  }

  public SksCluster description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Cluster description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SksCluster labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SksCluster putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public SksCluster cni(CniEnum cni) {
    this.cni = cni;
    return this;
  }

   /**
   * Cluster CNI
   * @return cni
  **/
  @javax.annotation.Nullable
  public CniEnum getCni() {
    return cni;
  }

  public void setCni(CniEnum cni) {
    this.cni = cni;
  }


  public SksCluster autoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
    return this;
  }

   /**
   * Enable auto upgrade of the control plane to the latest patch version available
   * @return autoUpgrade
  **/
  @javax.annotation.Nullable
  public Boolean getAutoUpgrade() {
    return autoUpgrade;
  }

  public void setAutoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
  }


  public SksCluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


   /**
   * Cluster state
   * @return state
  **/
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }



   /**
   * Cluster Nodepools
   * @return nodepools
  **/
  @javax.annotation.Nullable
  public List<SksNodepool> getNodepools() {
    return nodepools;
  }



  public SksCluster level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Cluster level
   * @return level
  **/
  @javax.annotation.Nullable
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  public SksCluster addons(Set<AddonsEnum> addons) {
    this.addons = addons;
    return this;
  }

  public SksCluster addAddonsItem(AddonsEnum addonsItem) {
    if (this.addons == null) {
      this.addons = new LinkedHashSet<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Cluster addons
   * @return addons
  **/
  @javax.annotation.Nullable
  public Set<AddonsEnum> getAddons() {
    return addons;
  }

  public void setAddons(Set<AddonsEnum> addons) {
    this.addons = addons;
  }


   /**
   * Cluster ID
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }



  public SksCluster version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Control plane Kubernetes version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


   /**
   * Cluster creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



   /**
   * Cluster endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  public String getEndpoint() {
    return endpoint;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksCluster sksCluster = (SksCluster) o;
    return Objects.equals(this.description, sksCluster.description) &&
        Objects.equals(this.labels, sksCluster.labels) &&
        Objects.equals(this.cni, sksCluster.cni) &&
        Objects.equals(this.autoUpgrade, sksCluster.autoUpgrade) &&
        Objects.equals(this.name, sksCluster.name) &&
        Objects.equals(this.state, sksCluster.state) &&
        Objects.equals(this.nodepools, sksCluster.nodepools) &&
        Objects.equals(this.level, sksCluster.level) &&
        Objects.equals(this.addons, sksCluster.addons) &&
        Objects.equals(this.id, sksCluster.id) &&
        Objects.equals(this.version, sksCluster.version) &&
        Objects.equals(this.createdAt, sksCluster.createdAt) &&
        Objects.equals(this.endpoint, sksCluster.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, labels, cni, autoUpgrade, name, state, nodepools, level, addons, id, version, createdAt, endpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksCluster {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    cni: ").append(toIndentedString(cni)).append("\n");
    sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    nodepools: ").append(toIndentedString(nodepools)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("labels");
    openapiFields.add("cni");
    openapiFields.add("auto-upgrade");
    openapiFields.add("name");
    openapiFields.add("state");
    openapiFields.add("nodepools");
    openapiFields.add("level");
    openapiFields.add("addons");
    openapiFields.add("id");
    openapiFields.add("version");
    openapiFields.add("created-at");
    openapiFields.add("endpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SksCluster
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SksCluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SksCluster is not found in the empty JSON string", SksCluster.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SksCluster.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SksCluster` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("cni") != null && !jsonObj.get("cni").isJsonNull()) && !jsonObj.get("cni").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cni` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cni").toString()));
      }
      // validate the optional field `cni`
      if (jsonObj.get("cni") != null && !jsonObj.get("cni").isJsonNull()) {
        CniEnum.validateJsonElement(jsonObj.get("cni"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if (jsonObj.get("nodepools") != null && !jsonObj.get("nodepools").isJsonNull()) {
        JsonArray jsonArraynodepools = jsonObj.getAsJsonArray("nodepools");
        if (jsonArraynodepools != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodepools").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodepools` to be an array in the JSON string but got `%s`", jsonObj.get("nodepools").toString()));
          }

          // validate the optional field `nodepools` (array)
          for (int i = 0; i < jsonArraynodepools.size(); i++) {
            SksNodepool.validateJsonElement(jsonArraynodepools.get(i));
          };
        }
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      // validate the optional field `level`
      if (jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) {
        LevelEnum.validateJsonElement(jsonObj.get("level"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("addons") != null && !jsonObj.get("addons").isJsonNull() && !jsonObj.get("addons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addons` to be an array in the JSON string but got `%s`", jsonObj.get("addons").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SksCluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SksCluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SksCluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SksCluster.class));

       return (TypeAdapter<T>) new TypeAdapter<SksCluster>() {
           @Override
           public void write(JsonWriter out, SksCluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SksCluster read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SksCluster given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SksCluster
  * @throws IOException if the JSON string is invalid with respect to SksCluster
  */
  public static SksCluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SksCluster.class);
  }

 /**
  * Convert an instance of SksCluster to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

