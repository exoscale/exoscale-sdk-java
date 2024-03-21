package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPgAutovacuum implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)
     */
    private Double autovacuumAnalyzeScaleFactor;
    /**
     * Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.
     */
    private Integer autovacuumAnalyzeThreshold;
    /**
     * Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     */
    private Integer autovacuumFreezeMaxAge;
    /**
     * Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     */
    private Integer autovacuumMaxWorkers;
    /**
     * Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute
     */
    private Integer autovacuumNaptime;
    /**
     * Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds
     */
    private Integer autovacuumVacuumCostDelay;
    /**
     * Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     */
    private Integer autovacuumVacuumCostLimit;
    /**
     * Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)
     */
    private Double autovacuumVacuumScaleFactor;
    /**
     * Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples
     */
    private Integer autovacuumVacuumThreshold;
    /**
     * Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     */
    private Integer logAutovacuumMinDuration;
    /**
     * Instantiates a new JsonSchemaPgAutovacuum and sets the default values.
     */
    public JsonSchemaPgAutovacuum() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPgAutovacuum
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPgAutovacuum createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPgAutovacuum();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the autovacuum_analyze_scale_factor property value. Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAutovacuumAnalyzeScaleFactor() {
        return this.autovacuumAnalyzeScaleFactor;
    }
    /**
     * Gets the autovacuum_analyze_threshold property value. Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumAnalyzeThreshold() {
        return this.autovacuumAnalyzeThreshold;
    }
    /**
     * Gets the autovacuum_freeze_max_age property value. Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumFreezeMaxAge() {
        return this.autovacuumFreezeMaxAge;
    }
    /**
     * Gets the autovacuum_max_workers property value. Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumMaxWorkers() {
        return this.autovacuumMaxWorkers;
    }
    /**
     * Gets the autovacuum_naptime property value. Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumNaptime() {
        return this.autovacuumNaptime;
    }
    /**
     * Gets the autovacuum_vacuum_cost_delay property value. Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumVacuumCostDelay() {
        return this.autovacuumVacuumCostDelay;
    }
    /**
     * Gets the autovacuum_vacuum_cost_limit property value. Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumVacuumCostLimit() {
        return this.autovacuumVacuumCostLimit;
    }
    /**
     * Gets the autovacuum_vacuum_scale_factor property value. Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getAutovacuumVacuumScaleFactor() {
        return this.autovacuumVacuumScaleFactor;
    }
    /**
     * Gets the autovacuum_vacuum_threshold property value. Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutovacuumVacuumThreshold() {
        return this.autovacuumVacuumThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("autovacuum_analyze_scale_factor", (n) -> { this.setAutovacuumAnalyzeScaleFactor(n.getDoubleValue()); });
        deserializerMap.put("autovacuum_analyze_threshold", (n) -> { this.setAutovacuumAnalyzeThreshold(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_freeze_max_age", (n) -> { this.setAutovacuumFreezeMaxAge(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_max_workers", (n) -> { this.setAutovacuumMaxWorkers(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_naptime", (n) -> { this.setAutovacuumNaptime(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_vacuum_cost_delay", (n) -> { this.setAutovacuumVacuumCostDelay(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_vacuum_cost_limit", (n) -> { this.setAutovacuumVacuumCostLimit(n.getIntegerValue()); });
        deserializerMap.put("autovacuum_vacuum_scale_factor", (n) -> { this.setAutovacuumVacuumScaleFactor(n.getDoubleValue()); });
        deserializerMap.put("autovacuum_vacuum_threshold", (n) -> { this.setAutovacuumVacuumThreshold(n.getIntegerValue()); });
        deserializerMap.put("log_autovacuum_min_duration", (n) -> { this.setLogAutovacuumMinDuration(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the log_autovacuum_min_duration property value. Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogAutovacuumMinDuration() {
        return this.logAutovacuumMinDuration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("autovacuum_analyze_scale_factor", this.getAutovacuumAnalyzeScaleFactor());
        writer.writeIntegerValue("autovacuum_analyze_threshold", this.getAutovacuumAnalyzeThreshold());
        writer.writeIntegerValue("autovacuum_freeze_max_age", this.getAutovacuumFreezeMaxAge());
        writer.writeIntegerValue("autovacuum_max_workers", this.getAutovacuumMaxWorkers());
        writer.writeIntegerValue("autovacuum_naptime", this.getAutovacuumNaptime());
        writer.writeIntegerValue("autovacuum_vacuum_cost_delay", this.getAutovacuumVacuumCostDelay());
        writer.writeIntegerValue("autovacuum_vacuum_cost_limit", this.getAutovacuumVacuumCostLimit());
        writer.writeDoubleValue("autovacuum_vacuum_scale_factor", this.getAutovacuumVacuumScaleFactor());
        writer.writeIntegerValue("autovacuum_vacuum_threshold", this.getAutovacuumVacuumThreshold());
        writer.writeIntegerValue("log_autovacuum_min_duration", this.getLogAutovacuumMinDuration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the autovacuum_analyze_scale_factor property value. Specifies a fraction of the table size to add to autovacuum_analyze_threshold when deciding whether to trigger an ANALYZE. The default is 0.2 (20% of table size)
     * @param value Value to set for the autovacuum_analyze_scale_factor property.
     */
    public void setAutovacuumAnalyzeScaleFactor(@jakarta.annotation.Nullable final Double value) {
        this.autovacuumAnalyzeScaleFactor = value;
    }
    /**
     * Sets the autovacuum_analyze_threshold property value. Specifies the minimum number of inserted, updated or deleted tuples needed to trigger an  ANALYZE in any one table. The default is 50 tuples.
     * @param value Value to set for the autovacuum_analyze_threshold property.
     */
    public void setAutovacuumAnalyzeThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumAnalyzeThreshold = value;
    }
    /**
     * Sets the autovacuum_freeze_max_age property value. Specifies the maximum age (in transactions) that a table's pg_class.relfrozenxid field can attain before a VACUUM operation is forced to prevent transaction ID wraparound within the table. Note that the system will launch autovacuum processes to prevent wraparound even when autovacuum is otherwise disabled. This parameter will cause the server to be restarted.
     * @param value Value to set for the autovacuum_freeze_max_age property.
     */
    public void setAutovacuumFreezeMaxAge(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumFreezeMaxAge = value;
    }
    /**
     * Sets the autovacuum_max_workers property value. Specifies the maximum number of autovacuum processes (other than the autovacuum launcher) that may be running at any one time. The default is three. This parameter can only be set at server start.
     * @param value Value to set for the autovacuum_max_workers property.
     */
    public void setAutovacuumMaxWorkers(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumMaxWorkers = value;
    }
    /**
     * Sets the autovacuum_naptime property value. Specifies the minimum delay between autovacuum runs on any given database. The delay is measured in seconds, and the default is one minute
     * @param value Value to set for the autovacuum_naptime property.
     */
    public void setAutovacuumNaptime(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumNaptime = value;
    }
    /**
     * Sets the autovacuum_vacuum_cost_delay property value. Specifies the cost delay value that will be used in automatic VACUUM operations. If -1 is specified, the regular vacuum_cost_delay value will be used. The default value is 20 milliseconds
     * @param value Value to set for the autovacuum_vacuum_cost_delay property.
     */
    public void setAutovacuumVacuumCostDelay(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumVacuumCostDelay = value;
    }
    /**
     * Sets the autovacuum_vacuum_cost_limit property value. Specifies the cost limit value that will be used in automatic VACUUM operations. If -1 is specified (which is the default), the regular vacuum_cost_limit value will be used.
     * @param value Value to set for the autovacuum_vacuum_cost_limit property.
     */
    public void setAutovacuumVacuumCostLimit(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumVacuumCostLimit = value;
    }
    /**
     * Sets the autovacuum_vacuum_scale_factor property value. Specifies a fraction of the table size to add to autovacuum_vacuum_threshold when deciding whether to trigger a VACUUM. The default is 0.2 (20% of table size)
     * @param value Value to set for the autovacuum_vacuum_scale_factor property.
     */
    public void setAutovacuumVacuumScaleFactor(@jakarta.annotation.Nullable final Double value) {
        this.autovacuumVacuumScaleFactor = value;
    }
    /**
     * Sets the autovacuum_vacuum_threshold property value. Specifies the minimum number of updated or deleted tuples needed to trigger a VACUUM in any one table. The default is 50 tuples
     * @param value Value to set for the autovacuum_vacuum_threshold property.
     */
    public void setAutovacuumVacuumThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.autovacuumVacuumThreshold = value;
    }
    /**
     * Sets the log_autovacuum_min_duration property value. Causes each action executed by autovacuum to be logged if it ran for at least the specified number of milliseconds. Setting this to zero logs all autovacuum actions. Minus-one (the default) disables logging autovacuum actions.
     * @param value Value to set for the log_autovacuum_min_duration property.
     */
    public void setLogAutovacuumMinDuration(@jakarta.annotation.Nullable final Integer value) {
        this.logAutovacuumMinDuration = value;
    }
}
