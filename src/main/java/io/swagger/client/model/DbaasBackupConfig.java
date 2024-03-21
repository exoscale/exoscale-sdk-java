/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DBaaS plan backup config
 */
@Schema(description = "DBaaS plan backup config")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaasBackupConfig {
  @JsonProperty("max-count")
  private Long maxCount = null;

  @JsonProperty("interval")
  private Long interval = null;

  @JsonProperty("recovery-mode")
  private String recoveryMode = null;

  @JsonProperty("frequent-interval-minutes")
  private Long frequentIntervalMinutes = null;

  @JsonProperty("frequent-oldest-age-minutes")
  private Long frequentOldestAgeMinutes = null;

  @JsonProperty("infrequent-interval-minutes")
  private Long infrequentIntervalMinutes = null;

  @JsonProperty("infrequent-oldest-age-minutes")
  private Long infrequentOldestAgeMinutes = null;

   /**
   * Maximum number of backups to keep. Zero when no backups are created.
   * minimum: 0
   * @return maxCount
  **/
  @Schema(description = "Maximum number of backups to keep. Zero when no backups are created.")
  public Long getMaxCount() {
    return maxCount;
  }

   /**
   * The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that.
   * minimum: 0
   * @return interval
  **/
  @Schema(description = "The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that.")
  public Long getInterval() {
    return interval;
  }

   /**
   * Mechanism how backups can be restored. &#x27;regular&#x27;                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             &#x27;pitr&#x27; means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
   * @return recoveryMode
  **/
  @Schema(description = "Mechanism how backups can be restored. 'regular'                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.")
  public String getRecoveryMode() {
    return recoveryMode;
  }

   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentIntervalMinutes
  **/
  @Schema(description = "Interval of taking a frequent backup in service types supporting different backup schedules")
  public Long getFrequentIntervalMinutes() {
    return frequentIntervalMinutes;
  }

   /**
   * Maximum age of the oldest frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentOldestAgeMinutes
  **/
  @Schema(description = "Maximum age of the oldest frequent backup in service types supporting different backup schedules")
  public Long getFrequentOldestAgeMinutes() {
    return frequentOldestAgeMinutes;
  }

   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentIntervalMinutes
  **/
  @Schema(description = "Interval of taking a frequent backup in service types supporting different backup schedules")
  public Long getInfrequentIntervalMinutes() {
    return infrequentIntervalMinutes;
  }

   /**
   * Maximum age of the oldest infrequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentOldestAgeMinutes
  **/
  @Schema(description = "Maximum age of the oldest infrequent backup in service types supporting different backup schedules")
  public Long getInfrequentOldestAgeMinutes() {
    return infrequentOldestAgeMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasBackupConfig dbaasBackupConfig = (DbaasBackupConfig) o;
    return Objects.equals(this.maxCount, dbaasBackupConfig.maxCount) &&
        Objects.equals(this.interval, dbaasBackupConfig.interval) &&
        Objects.equals(this.recoveryMode, dbaasBackupConfig.recoveryMode) &&
        Objects.equals(this.frequentIntervalMinutes, dbaasBackupConfig.frequentIntervalMinutes) &&
        Objects.equals(this.frequentOldestAgeMinutes, dbaasBackupConfig.frequentOldestAgeMinutes) &&
        Objects.equals(this.infrequentIntervalMinutes, dbaasBackupConfig.infrequentIntervalMinutes) &&
        Objects.equals(this.infrequentOldestAgeMinutes, dbaasBackupConfig.infrequentOldestAgeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, interval, recoveryMode, frequentIntervalMinutes, frequentOldestAgeMinutes, infrequentIntervalMinutes, infrequentOldestAgeMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasBackupConfig {\n");
    
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    recoveryMode: ").append(toIndentedString(recoveryMode)).append("\n");
    sb.append("    frequentIntervalMinutes: ").append(toIndentedString(frequentIntervalMinutes)).append("\n");
    sb.append("    frequentOldestAgeMinutes: ").append(toIndentedString(frequentOldestAgeMinutes)).append("\n");
    sb.append("    infrequentIntervalMinutes: ").append(toIndentedString(infrequentIntervalMinutes)).append("\n");
    sb.append("    infrequentOldestAgeMinutes: ").append(toIndentedString(infrequentOldestAgeMinutes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
