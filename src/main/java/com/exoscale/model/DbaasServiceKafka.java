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
import com.exoscale.model.DbaasIntegration;
import com.exoscale.model.DbaasNodeState;
import com.exoscale.model.DbaasServiceBackup;
import com.exoscale.model.DbaasServiceKafkaAuthenticationMethods;
import com.exoscale.model.DbaasServiceKafkaComponentsInner;
import com.exoscale.model.DbaasServiceKafkaConnectionInfo;
import com.exoscale.model.DbaasServiceKafkaUsersInner;
import com.exoscale.model.DbaasServiceMaintenance;
import com.exoscale.model.DbaasServiceNotification;
import com.exoscale.model.EnumServiceState;
import com.exoscale.model.JsonSchemaKafka;
import com.exoscale.model.JsonSchemaKafkaConnect;
import com.exoscale.model.JsonSchemaKafkaRest;
import com.exoscale.model.JsonSchemaSchemaRegistry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DbaasServiceKafka
 */
@JsonPropertyOrder({
  DbaasServiceKafka.JSON_PROPERTY_UPDATED_AT,
  DbaasServiceKafka.JSON_PROPERTY_AUTHENTICATION_METHODS,
  DbaasServiceKafka.JSON_PROPERTY_NODE_COUNT,
  DbaasServiceKafka.JSON_PROPERTY_CONNECTION_INFO,
  DbaasServiceKafka.JSON_PROPERTY_NODE_CPU_COUNT,
  DbaasServiceKafka.JSON_PROPERTY_KAFKA_REST_ENABLED,
  DbaasServiceKafka.JSON_PROPERTY_INTEGRATIONS,
  DbaasServiceKafka.JSON_PROPERTY_ZONE,
  DbaasServiceKafka.JSON_PROPERTY_NODE_STATES,
  DbaasServiceKafka.JSON_PROPERTY_NAME,
  DbaasServiceKafka.JSON_PROPERTY_KAFKA_CONNECT_ENABLED,
  DbaasServiceKafka.JSON_PROPERTY_TYPE,
  DbaasServiceKafka.JSON_PROPERTY_STATE,
  DbaasServiceKafka.JSON_PROPERTY_IP_FILTER,
  DbaasServiceKafka.JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS,
  DbaasServiceKafka.JSON_PROPERTY_BACKUPS,
  DbaasServiceKafka.JSON_PROPERTY_KAFKA_REST_SETTINGS,
  DbaasServiceKafka.JSON_PROPERTY_TERMINATION_PROTECTION,
  DbaasServiceKafka.JSON_PROPERTY_NOTIFICATIONS,
  DbaasServiceKafka.JSON_PROPERTY_KAFKA_CONNECT_SETTINGS,
  DbaasServiceKafka.JSON_PROPERTY_COMPONENTS,
  DbaasServiceKafka.JSON_PROPERTY_MAINTENANCE,
  DbaasServiceKafka.JSON_PROPERTY_KAFKA_SETTINGS,
  DbaasServiceKafka.JSON_PROPERTY_DISK_SIZE,
  DbaasServiceKafka.JSON_PROPERTY_NODE_MEMORY,
  DbaasServiceKafka.JSON_PROPERTY_URI,
  DbaasServiceKafka.JSON_PROPERTY_URI_PARAMS,
  DbaasServiceKafka.JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED,
  DbaasServiceKafka.JSON_PROPERTY_VERSION,
  DbaasServiceKafka.JSON_PROPERTY_CREATED_AT,
  DbaasServiceKafka.JSON_PROPERTY_PLAN,
  DbaasServiceKafka.JSON_PROPERTY_USERS
})
@JsonTypeName("dbaas-service-kafka")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class DbaasServiceKafka {
  public static final String JSON_PROPERTY_UPDATED_AT = "updated-at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_AUTHENTICATION_METHODS = "authentication-methods";
  private DbaasServiceKafkaAuthenticationMethods authenticationMethods;

  public static final String JSON_PROPERTY_NODE_COUNT = "node-count";
  private Long nodeCount;

  public static final String JSON_PROPERTY_CONNECTION_INFO = "connection-info";
  private DbaasServiceKafkaConnectionInfo connectionInfo;

  public static final String JSON_PROPERTY_NODE_CPU_COUNT = "node-cpu-count";
  private Long nodeCpuCount;

  public static final String JSON_PROPERTY_KAFKA_REST_ENABLED = "kafka-rest-enabled";
  private Boolean kafkaRestEnabled;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<DbaasIntegration> integrations;

  public static final String JSON_PROPERTY_ZONE = "zone";
  private String zone;

  public static final String JSON_PROPERTY_NODE_STATES = "node-states";
  private List<DbaasNodeState> nodeStates;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KAFKA_CONNECT_ENABLED = "kafka-connect-enabled";
  private Boolean kafkaConnectEnabled;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_STATE = "state";
  private EnumServiceState state;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS = "schema-registry-settings";
  private JsonSchemaSchemaRegistry schemaRegistrySettings;

  public static final String JSON_PROPERTY_BACKUPS = "backups";
  private List<DbaasServiceBackup> backups;

  public static final String JSON_PROPERTY_KAFKA_REST_SETTINGS = "kafka-rest-settings";
  private JsonSchemaKafkaRest kafkaRestSettings;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<DbaasServiceNotification> notifications;

  public static final String JSON_PROPERTY_KAFKA_CONNECT_SETTINGS = "kafka-connect-settings";
  private JsonSchemaKafkaConnect kafkaConnectSettings;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<DbaasServiceKafkaComponentsInner> components;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private DbaasServiceMaintenance maintenance;

  public static final String JSON_PROPERTY_KAFKA_SETTINGS = "kafka-settings";
  private JsonSchemaKafka kafkaSettings =new JsonSchemaKafka(); //{};

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_NODE_MEMORY = "node-memory";
  private Long nodeMemory;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_URI_PARAMS = "uri-params";
  private Object uriParams;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED = "schema-registry-enabled";
  private Boolean schemaRegistryEnabled;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<DbaasServiceKafkaUsersInner> users;

  public DbaasServiceKafka() {
  }

  public DbaasServiceKafka updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Service last update timestamp (ISO 8601)
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DbaasServiceKafka authenticationMethods(DbaasServiceKafkaAuthenticationMethods authenticationMethods) {
    
    this.authenticationMethods = authenticationMethods;
    return this;
  }

   /**
   * Get authenticationMethods
   * @return authenticationMethods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasServiceKafkaAuthenticationMethods getAuthenticationMethods() {
    return authenticationMethods;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMethods(DbaasServiceKafkaAuthenticationMethods authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  public DbaasServiceKafka nodeCount(Long nodeCount) {
    
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * Number of service nodes in the active plan
   * minimum: 0
   * @return nodeCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeCount() {
    return nodeCount;
  }


  @JsonProperty(JSON_PROPERTY_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }


  public DbaasServiceKafka connectionInfo(DbaasServiceKafkaConnectionInfo connectionInfo) {
    
    this.connectionInfo = connectionInfo;
    return this;
  }

   /**
   * Get connectionInfo
   * @return connectionInfo
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasServiceKafkaConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionInfo(DbaasServiceKafkaConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
  }


  public DbaasServiceKafka nodeCpuCount(Long nodeCpuCount) {
    
    this.nodeCpuCount = nodeCpuCount;
    return this;
  }

   /**
   * Number of CPUs for each node
   * minimum: 0
   * @return nodeCpuCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_CPU_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeCpuCount() {
    return nodeCpuCount;
  }


  @JsonProperty(JSON_PROPERTY_NODE_CPU_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeCpuCount(Long nodeCpuCount) {
    this.nodeCpuCount = nodeCpuCount;
  }


  public DbaasServiceKafka kafkaRestEnabled(Boolean kafkaRestEnabled) {
    
    this.kafkaRestEnabled = kafkaRestEnabled;
    return this;
  }

   /**
   * Whether Kafka REST is enabled
   * @return kafkaRestEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_REST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKafkaRestEnabled() {
    return kafkaRestEnabled;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_REST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaRestEnabled(Boolean kafkaRestEnabled) {
    this.kafkaRestEnabled = kafkaRestEnabled;
  }


  public DbaasServiceKafka integrations(List<DbaasIntegration> integrations) {
    
    this.integrations = integrations;
    return this;
  }

  public DbaasServiceKafka addIntegrationsItem(DbaasIntegration integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Service integrations
   * @return integrations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasIntegration> getIntegrations() {
    return integrations;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrations(List<DbaasIntegration> integrations) {
    this.integrations = integrations;
  }


  public DbaasServiceKafka zone(String zone) {
    
    this.zone = zone;
    return this;
  }

   /**
   * The zone where the service is running
   * @return zone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZone() {
    return zone;
  }


  @JsonProperty(JSON_PROPERTY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZone(String zone) {
    this.zone = zone;
  }


  public DbaasServiceKafka nodeStates(List<DbaasNodeState> nodeStates) {
    
    this.nodeStates = nodeStates;
    return this;
  }

  public DbaasServiceKafka addNodeStatesItem(DbaasNodeState nodeStatesItem) {
    if (this.nodeStates == null) {
      this.nodeStates = new ArrayList<>();
    }
    this.nodeStates.add(nodeStatesItem);
    return this;
  }

   /**
   * State of individual service nodes
   * @return nodeStates
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasNodeState> getNodeStates() {
    return nodeStates;
  }


  @JsonProperty(JSON_PROPERTY_NODE_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeStates(List<DbaasNodeState> nodeStates) {
    this.nodeStates = nodeStates;
  }


  public DbaasServiceKafka name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public DbaasServiceKafka kafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    
    this.kafkaConnectEnabled = kafkaConnectEnabled;
    return this;
  }

   /**
   * Whether Kafka Connect is enabled
   * @return kafkaConnectEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKafkaConnectEnabled() {
    return kafkaConnectEnabled;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    this.kafkaConnectEnabled = kafkaConnectEnabled;
  }


  public DbaasServiceKafka type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public DbaasServiceKafka state(EnumServiceState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumServiceState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(EnumServiceState state) {
    this.state = state;
  }


  public DbaasServiceKafka ipFilter(List<String> ipFilter) {
    
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaasServiceKafka addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpFilter() {
    return ipFilter;
  }


  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  public DbaasServiceKafka schemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    
    this.schemaRegistrySettings = schemaRegistrySettings;
    return this;
  }

   /**
   * Get schemaRegistrySettings
   * @return schemaRegistrySettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaSchemaRegistry getSchemaRegistrySettings() {
    return schemaRegistrySettings;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    this.schemaRegistrySettings = schemaRegistrySettings;
  }


  public DbaasServiceKafka backups(List<DbaasServiceBackup> backups) {
    
    this.backups = backups;
    return this;
  }

  public DbaasServiceKafka addBackupsItem(DbaasServiceBackup backupsItem) {
    if (this.backups == null) {
      this.backups = new ArrayList<>();
    }
    this.backups.add(backupsItem);
    return this;
  }

   /**
   * List of backups for the service
   * @return backups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceBackup> getBackups() {
    return backups;
  }


  @JsonProperty(JSON_PROPERTY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackups(List<DbaasServiceBackup> backups) {
    this.backups = backups;
  }


  public DbaasServiceKafka kafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    
    this.kafkaRestSettings = kafkaRestSettings;
    return this;
  }

   /**
   * Get kafkaRestSettings
   * @return kafkaRestSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_REST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafkaRest getKafkaRestSettings() {
    return kafkaRestSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_REST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    this.kafkaRestSettings = kafkaRestSettings;
  }


  public DbaasServiceKafka terminationProtection(Boolean terminationProtection) {
    
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTerminationProtection() {
    return terminationProtection;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public DbaasServiceKafka notifications(List<DbaasServiceNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public DbaasServiceKafka addNotificationsItem(DbaasServiceNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Service notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceNotification> getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(List<DbaasServiceNotification> notifications) {
    this.notifications = notifications;
  }


  public DbaasServiceKafka kafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    
    this.kafkaConnectSettings = kafkaConnectSettings;
    return this;
  }

   /**
   * Get kafkaConnectSettings
   * @return kafkaConnectSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafkaConnect getKafkaConnectSettings() {
    return kafkaConnectSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    this.kafkaConnectSettings = kafkaConnectSettings;
  }


  public DbaasServiceKafka components(List<DbaasServiceKafkaComponentsInner> components) {
    
    this.components = components;
    return this;
  }

  public DbaasServiceKafka addComponentsItem(DbaasServiceKafkaComponentsInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Service component information objects
   * @return components
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceKafkaComponentsInner> getComponents() {
    return components;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponents(List<DbaasServiceKafkaComponentsInner> components) {
    this.components = components;
  }


  public DbaasServiceKafka maintenance(DbaasServiceMaintenance maintenance) {
    
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasServiceMaintenance getMaintenance() {
    return maintenance;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenance(DbaasServiceMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public DbaasServiceKafka kafkaSettings(JsonSchemaKafka kafkaSettings) {
    
    this.kafkaSettings = kafkaSettings;
    return this;
  }

   /**
   * Get kafkaSettings
   * @return kafkaSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafka getKafkaSettings() {
    return kafkaSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaSettings(JsonSchemaKafka kafkaSettings) {
    this.kafkaSettings = kafkaSettings;
  }


  public DbaasServiceKafka diskSize(Long diskSize) {
    
    this.diskSize = diskSize;
    return this;
  }

   /**
   * TODO UNIT disk space for data storage
   * minimum: 0
   * @return diskSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiskSize() {
    return diskSize;
  }


  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public DbaasServiceKafka nodeMemory(Long nodeMemory) {
    
    this.nodeMemory = nodeMemory;
    return this;
  }

   /**
   * TODO UNIT of memory for each node
   * minimum: 0
   * @return nodeMemory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeMemory() {
    return nodeMemory;
  }


  @JsonProperty(JSON_PROPERTY_NODE_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeMemory(Long nodeMemory) {
    this.nodeMemory = nodeMemory;
  }


  public DbaasServiceKafka uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI for connecting to the service (may be absent)
   * @return uri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public DbaasServiceKafka uriParams(Object uriParams) {
    
    this.uriParams = uriParams;
    return this;
  }

   /**
   * service_uri parameterized into key-value pairs
   * @return uriParams
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getUriParams() {
    return uriParams;
  }


  @JsonProperty(JSON_PROPERTY_URI_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriParams(Object uriParams) {
    this.uriParams = uriParams;
  }


  public DbaasServiceKafka schemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    
    this.schemaRegistryEnabled = schemaRegistryEnabled;
    return this;
  }

   /**
   * Whether Schema-Registry is enabled
   * @return schemaRegistryEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSchemaRegistryEnabled() {
    return schemaRegistryEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    this.schemaRegistryEnabled = schemaRegistryEnabled;
  }


  public DbaasServiceKafka version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Kafka version
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


  public DbaasServiceKafka createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Service creation timestamp (ISO 8601)
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DbaasServiceKafka plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public DbaasServiceKafka users(List<DbaasServiceKafkaUsersInner> users) {
    
    this.users = users;
    return this;
  }

  public DbaasServiceKafka addUsersItem(DbaasServiceKafkaUsersInner usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of service users
   * @return users
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceKafkaUsersInner> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<DbaasServiceKafkaUsersInner> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceKafka dbaasServiceKafka = (DbaasServiceKafka) o;
    return Objects.equals(this.updatedAt, dbaasServiceKafka.updatedAt) &&
        Objects.equals(this.authenticationMethods, dbaasServiceKafka.authenticationMethods) &&
        Objects.equals(this.nodeCount, dbaasServiceKafka.nodeCount) &&
        Objects.equals(this.connectionInfo, dbaasServiceKafka.connectionInfo) &&
        Objects.equals(this.nodeCpuCount, dbaasServiceKafka.nodeCpuCount) &&
        Objects.equals(this.kafkaRestEnabled, dbaasServiceKafka.kafkaRestEnabled) &&
        Objects.equals(this.integrations, dbaasServiceKafka.integrations) &&
        Objects.equals(this.zone, dbaasServiceKafka.zone) &&
        Objects.equals(this.nodeStates, dbaasServiceKafka.nodeStates) &&
        Objects.equals(this.name, dbaasServiceKafka.name) &&
        Objects.equals(this.kafkaConnectEnabled, dbaasServiceKafka.kafkaConnectEnabled) &&
        Objects.equals(this.type, dbaasServiceKafka.type) &&
        Objects.equals(this.state, dbaasServiceKafka.state) &&
        Objects.equals(this.ipFilter, dbaasServiceKafka.ipFilter) &&
        Objects.equals(this.schemaRegistrySettings, dbaasServiceKafka.schemaRegistrySettings) &&
        Objects.equals(this.backups, dbaasServiceKafka.backups) &&
        Objects.equals(this.kafkaRestSettings, dbaasServiceKafka.kafkaRestSettings) &&
        Objects.equals(this.terminationProtection, dbaasServiceKafka.terminationProtection) &&
        Objects.equals(this.notifications, dbaasServiceKafka.notifications) &&
        Objects.equals(this.kafkaConnectSettings, dbaasServiceKafka.kafkaConnectSettings) &&
        Objects.equals(this.components, dbaasServiceKafka.components) &&
        Objects.equals(this.maintenance, dbaasServiceKafka.maintenance) &&
        Objects.equals(this.kafkaSettings, dbaasServiceKafka.kafkaSettings) &&
        Objects.equals(this.diskSize, dbaasServiceKafka.diskSize) &&
        Objects.equals(this.nodeMemory, dbaasServiceKafka.nodeMemory) &&
        Objects.equals(this.uri, dbaasServiceKafka.uri) &&
        Objects.equals(this.uriParams, dbaasServiceKafka.uriParams) &&
        Objects.equals(this.schemaRegistryEnabled, dbaasServiceKafka.schemaRegistryEnabled) &&
        Objects.equals(this.version, dbaasServiceKafka.version) &&
        Objects.equals(this.createdAt, dbaasServiceKafka.createdAt) &&
        Objects.equals(this.plan, dbaasServiceKafka.plan) &&
        Objects.equals(this.users, dbaasServiceKafka.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAt, authenticationMethods, nodeCount, connectionInfo, nodeCpuCount, kafkaRestEnabled, integrations, zone, nodeStates, name, kafkaConnectEnabled, type, state, ipFilter, schemaRegistrySettings, backups, kafkaRestSettings, terminationProtection, notifications, kafkaConnectSettings, components, maintenance, kafkaSettings, diskSize, nodeMemory, uri, uriParams, schemaRegistryEnabled, version, createdAt, plan, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceKafka {\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    nodeCpuCount: ").append(toIndentedString(nodeCpuCount)).append("\n");
    sb.append("    kafkaRestEnabled: ").append(toIndentedString(kafkaRestEnabled)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    nodeStates: ").append(toIndentedString(nodeStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kafkaConnectEnabled: ").append(toIndentedString(kafkaConnectEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    schemaRegistrySettings: ").append(toIndentedString(schemaRegistrySettings)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    kafkaRestSettings: ").append(toIndentedString(kafkaRestSettings)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    kafkaConnectSettings: ").append(toIndentedString(kafkaConnectSettings)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    kafkaSettings: ").append(toIndentedString(kafkaSettings)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    nodeMemory: ").append(toIndentedString(nodeMemory)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriParams: ").append(toIndentedString(uriParams)).append("\n");
    sb.append("    schemaRegistryEnabled: ").append(toIndentedString(schemaRegistryEnabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

