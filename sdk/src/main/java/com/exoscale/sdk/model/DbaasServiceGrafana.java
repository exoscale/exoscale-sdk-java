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
import com.exoscale.sdk.model.DbaasIntegration;
import com.exoscale.sdk.model.DbaasNodeState;
import com.exoscale.sdk.model.DbaasServiceBackup;
import com.exoscale.sdk.model.DbaasServiceGrafanaConnectionInfo;
import com.exoscale.sdk.model.DbaasServiceGrafanaUsersInner;
import com.exoscale.sdk.model.DbaasServiceMaintenance;
import com.exoscale.sdk.model.DbaasServiceMysqlComponentsInner;
import com.exoscale.sdk.model.DbaasServiceNotification;
import com.exoscale.sdk.model.EnumServiceState;
import com.exoscale.sdk.model.JsonSchemaGrafana;
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


/**
 * DbaasServiceGrafana
 */
@JsonPropertyOrder({
  DbaasServiceGrafana.JSON_PROPERTY_DESCRIPTION,
  DbaasServiceGrafana.JSON_PROPERTY_UPDATED_AT,
  DbaasServiceGrafana.JSON_PROPERTY_NODE_COUNT,
  DbaasServiceGrafana.JSON_PROPERTY_CONNECTION_INFO,
  DbaasServiceGrafana.JSON_PROPERTY_NODE_CPU_COUNT,
  DbaasServiceGrafana.JSON_PROPERTY_INTEGRATIONS,
  DbaasServiceGrafana.JSON_PROPERTY_ZONE,
  DbaasServiceGrafana.JSON_PROPERTY_NODE_STATES,
  DbaasServiceGrafana.JSON_PROPERTY_NAME,
  DbaasServiceGrafana.JSON_PROPERTY_TYPE,
  DbaasServiceGrafana.JSON_PROPERTY_STATE,
  DbaasServiceGrafana.JSON_PROPERTY_GRAFANA_SETTINGS,
  DbaasServiceGrafana.JSON_PROPERTY_IP_FILTER,
  DbaasServiceGrafana.JSON_PROPERTY_BACKUPS,
  DbaasServiceGrafana.JSON_PROPERTY_TERMINATION_PROTECTION,
  DbaasServiceGrafana.JSON_PROPERTY_NOTIFICATIONS,
  DbaasServiceGrafana.JSON_PROPERTY_COMPONENTS,
  DbaasServiceGrafana.JSON_PROPERTY_MAINTENANCE,
  DbaasServiceGrafana.JSON_PROPERTY_DISK_SIZE,
  DbaasServiceGrafana.JSON_PROPERTY_NODE_MEMORY,
  DbaasServiceGrafana.JSON_PROPERTY_URI,
  DbaasServiceGrafana.JSON_PROPERTY_URI_PARAMS,
  DbaasServiceGrafana.JSON_PROPERTY_VERSION,
  DbaasServiceGrafana.JSON_PROPERTY_CREATED_AT,
  DbaasServiceGrafana.JSON_PROPERTY_PLAN,
  DbaasServiceGrafana.JSON_PROPERTY_USERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceGrafana {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated-at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_NODE_COUNT = "node-count";
  private Long nodeCount;

  public static final String JSON_PROPERTY_CONNECTION_INFO = "connection-info";
  private DbaasServiceGrafanaConnectionInfo connectionInfo;

  public static final String JSON_PROPERTY_NODE_CPU_COUNT = "node-cpu-count";
  private Long nodeCpuCount;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<DbaasIntegration> integrations;

  public static final String JSON_PROPERTY_ZONE = "zone";
  private String zone;

  public static final String JSON_PROPERTY_NODE_STATES = "node-states";
  private List<DbaasNodeState> nodeStates;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_STATE = "state";
  private EnumServiceState state;

  public static final String JSON_PROPERTY_GRAFANA_SETTINGS = "grafana-settings";
  private JsonSchemaGrafana grafanaSettings;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_BACKUPS = "backups";
  private List<DbaasServiceBackup> backups;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<DbaasServiceNotification> notifications;

  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<DbaasServiceMysqlComponentsInner> components;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private DbaasServiceMaintenance maintenance;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_NODE_MEMORY = "node-memory";
  private Long nodeMemory;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_URI_PARAMS = "uri-params";
  private Object uriParams;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<DbaasServiceGrafanaUsersInner> users;

  public DbaasServiceGrafana() { 
  }

  public DbaasServiceGrafana description(String description) {
    this.description = description;
    return this;
  }

   /**
   * DbaaS service description
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


  public DbaasServiceGrafana updatedAt(OffsetDateTime updatedAt) {
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


  public DbaasServiceGrafana nodeCount(Long nodeCount) {
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


  public DbaasServiceGrafana connectionInfo(DbaasServiceGrafanaConnectionInfo connectionInfo) {
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

  public DbaasServiceGrafanaConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionInfo(DbaasServiceGrafanaConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
  }


  public DbaasServiceGrafana nodeCpuCount(Long nodeCpuCount) {
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


  public DbaasServiceGrafana integrations(List<DbaasIntegration> integrations) {
    this.integrations = integrations;
    return this;
  }

  public DbaasServiceGrafana addIntegrationsItem(DbaasIntegration integrationsItem) {
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


  public DbaasServiceGrafana zone(String zone) {
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


  public DbaasServiceGrafana nodeStates(List<DbaasNodeState> nodeStates) {
    this.nodeStates = nodeStates;
    return this;
  }

  public DbaasServiceGrafana addNodeStatesItem(DbaasNodeState nodeStatesItem) {
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


  public DbaasServiceGrafana name(String name) {
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


  public DbaasServiceGrafana type(String type) {
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


  public DbaasServiceGrafana state(EnumServiceState state) {
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


  public DbaasServiceGrafana grafanaSettings(JsonSchemaGrafana grafanaSettings) {
    this.grafanaSettings = grafanaSettings;
    return this;
  }

   /**
   * Get grafanaSettings
   * @return grafanaSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAFANA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaGrafana getGrafanaSettings() {
    return grafanaSettings;
  }


  @JsonProperty(JSON_PROPERTY_GRAFANA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrafanaSettings(JsonSchemaGrafana grafanaSettings) {
    this.grafanaSettings = grafanaSettings;
  }


  public DbaasServiceGrafana ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaasServiceGrafana addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allowed CIDR address blocks for incoming connections
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


  public DbaasServiceGrafana backups(List<DbaasServiceBackup> backups) {
    this.backups = backups;
    return this;
  }

  public DbaasServiceGrafana addBackupsItem(DbaasServiceBackup backupsItem) {
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


  public DbaasServiceGrafana terminationProtection(Boolean terminationProtection) {
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


  public DbaasServiceGrafana notifications(List<DbaasServiceNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public DbaasServiceGrafana addNotificationsItem(DbaasServiceNotification notificationsItem) {
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


  public DbaasServiceGrafana components(List<DbaasServiceMysqlComponentsInner> components) {
    this.components = components;
    return this;
  }

  public DbaasServiceGrafana addComponentsItem(DbaasServiceMysqlComponentsInner componentsItem) {
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

  public List<DbaasServiceMysqlComponentsInner> getComponents() {
    return components;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComponents(List<DbaasServiceMysqlComponentsInner> components) {
    this.components = components;
  }


  public DbaasServiceGrafana maintenance(DbaasServiceMaintenance maintenance) {
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


  public DbaasServiceGrafana diskSize(Long diskSize) {
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


  public DbaasServiceGrafana nodeMemory(Long nodeMemory) {
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


  public DbaasServiceGrafana uri(String uri) {
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


  public DbaasServiceGrafana uriParams(Object uriParams) {
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


  public DbaasServiceGrafana version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Grafana version
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


  public DbaasServiceGrafana createdAt(OffsetDateTime createdAt) {
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


  public DbaasServiceGrafana plan(String plan) {
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


  public DbaasServiceGrafana users(List<DbaasServiceGrafanaUsersInner> users) {
    this.users = users;
    return this;
  }

  public DbaasServiceGrafana addUsersItem(DbaasServiceGrafanaUsersInner usersItem) {
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

  public List<DbaasServiceGrafanaUsersInner> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<DbaasServiceGrafanaUsersInner> users) {
    this.users = users;
  }


  /**
   * Return true if this dbaas-service-grafana object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceGrafana dbaasServiceGrafana = (DbaasServiceGrafana) o;
    return Objects.equals(this.description, dbaasServiceGrafana.description) &&
        Objects.equals(this.updatedAt, dbaasServiceGrafana.updatedAt) &&
        Objects.equals(this.nodeCount, dbaasServiceGrafana.nodeCount) &&
        Objects.equals(this.connectionInfo, dbaasServiceGrafana.connectionInfo) &&
        Objects.equals(this.nodeCpuCount, dbaasServiceGrafana.nodeCpuCount) &&
        Objects.equals(this.integrations, dbaasServiceGrafana.integrations) &&
        Objects.equals(this.zone, dbaasServiceGrafana.zone) &&
        Objects.equals(this.nodeStates, dbaasServiceGrafana.nodeStates) &&
        Objects.equals(this.name, dbaasServiceGrafana.name) &&
        Objects.equals(this.type, dbaasServiceGrafana.type) &&
        Objects.equals(this.state, dbaasServiceGrafana.state) &&
        Objects.equals(this.grafanaSettings, dbaasServiceGrafana.grafanaSettings) &&
        Objects.equals(this.ipFilter, dbaasServiceGrafana.ipFilter) &&
        Objects.equals(this.backups, dbaasServiceGrafana.backups) &&
        Objects.equals(this.terminationProtection, dbaasServiceGrafana.terminationProtection) &&
        Objects.equals(this.notifications, dbaasServiceGrafana.notifications) &&
        Objects.equals(this.components, dbaasServiceGrafana.components) &&
        Objects.equals(this.maintenance, dbaasServiceGrafana.maintenance) &&
        Objects.equals(this.diskSize, dbaasServiceGrafana.diskSize) &&
        Objects.equals(this.nodeMemory, dbaasServiceGrafana.nodeMemory) &&
        Objects.equals(this.uri, dbaasServiceGrafana.uri) &&
        Objects.equals(this.uriParams, dbaasServiceGrafana.uriParams) &&
        Objects.equals(this.version, dbaasServiceGrafana.version) &&
        Objects.equals(this.createdAt, dbaasServiceGrafana.createdAt) &&
        Objects.equals(this.plan, dbaasServiceGrafana.plan) &&
        Objects.equals(this.users, dbaasServiceGrafana.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, updatedAt, nodeCount, connectionInfo, nodeCpuCount, integrations, zone, nodeStates, name, type, state, grafanaSettings, ipFilter, backups, terminationProtection, notifications, components, maintenance, diskSize, nodeMemory, uri, uriParams, version, createdAt, plan, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceGrafana {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    nodeCpuCount: ").append(toIndentedString(nodeCpuCount)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    nodeStates: ").append(toIndentedString(nodeStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    grafanaSettings: ").append(toIndentedString(grafanaSettings)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    nodeMemory: ").append(toIndentedString(nodeMemory)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriParams: ").append(toIndentedString(uriParams)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updated-at` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-count` to the URL query string
    if (getNodeCount() != null) {
      joiner.add(String.format("%snode-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connection-info` to the URL query string
    if (getConnectionInfo() != null) {
      joiner.add(getConnectionInfo().toUrlQueryString(prefix + "connection-info" + suffix));
    }

    // add `node-cpu-count` to the URL query string
    if (getNodeCpuCount() != null) {
      joiner.add(String.format("%snode-cpu-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeCpuCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `integrations` to the URL query string
    if (getIntegrations() != null) {
      for (int i = 0; i < getIntegrations().size(); i++) {
        if (getIntegrations().get(i) != null) {
          joiner.add(getIntegrations().get(i).toUrlQueryString(String.format("%sintegrations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `zone` to the URL query string
    if (getZone() != null) {
      joiner.add(String.format("%szone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getZone()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-states` to the URL query string
    if (getNodeStates() != null) {
      for (int i = 0; i < getNodeStates().size(); i++) {
        if (getNodeStates().get(i) != null) {
          joiner.add(getNodeStates().get(i).toUrlQueryString(String.format("%snode-states%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `grafana-settings` to the URL query string
    if (getGrafanaSettings() != null) {
      joiner.add(getGrafanaSettings().toUrlQueryString(prefix + "grafana-settings" + suffix));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `backups` to the URL query string
    if (getBackups() != null) {
      for (int i = 0; i < getBackups().size(); i++) {
        if (getBackups().get(i) != null) {
          joiner.add(getBackups().get(i).toUrlQueryString(String.format("%sbackups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `notifications` to the URL query string
    if (getNotifications() != null) {
      for (int i = 0; i < getNotifications().size(); i++) {
        if (getNotifications().get(i) != null) {
          joiner.add(getNotifications().get(i).toUrlQueryString(String.format("%snotifications%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `components` to the URL query string
    if (getComponents() != null) {
      for (int i = 0; i < getComponents().size(); i++) {
        if (getComponents().get(i) != null) {
          joiner.add(getComponents().get(i).toUrlQueryString(String.format("%scomponents%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-memory` to the URL query string
    if (getNodeMemory() != null) {
      joiner.add(String.format("%snode-memory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeMemory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uri-params` to the URL query string
    if (getUriParams() != null) {
      joiner.add(String.format("%suri-params%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUriParams()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      for (int i = 0; i < getUsers().size(); i++) {
        if (getUsers().get(i) != null) {
          joiner.add(getUsers().get(i).toUrlQueryString(String.format("%susers%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

