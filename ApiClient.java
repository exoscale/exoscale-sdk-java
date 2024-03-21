package com.exoscale;

import com.exoscale.accesskey.AccessKeyRequestBuilder;
import com.exoscale.accesskeyknownoperations.AccessKeyKnownOperationsRequestBuilder;
import com.exoscale.accesskeyoperations.AccessKeyOperationsRequestBuilder;
import com.exoscale.antiaffinitygroup.AntiAffinityGroupRequestBuilder;
import com.exoscale.apikey.ApiKeyRequestBuilder;
import com.exoscale.blockstorage.BlockStorageRequestBuilder;
import com.exoscale.blockstoragesnapshot.BlockStorageSnapshotRequestBuilder;
import com.exoscale.dbaascacertificate.DbaasCaCertificateRequestBuilder;
import com.exoscale.dbaasgrafana.DbaasGrafanaRequestBuilder;
import com.exoscale.dbaasintegration.DbaasIntegrationRequestBuilder;
import com.exoscale.dbaasintegrationsettings.DbaasIntegrationSettingsRequestBuilder;
import com.exoscale.dbaasintegrationtypes.DbaasIntegrationTypesRequestBuilder;
import com.exoscale.dbaaskafka.DbaasKafkaRequestBuilder;
import com.exoscale.dbaasmigrationstatus.DbaasMigrationStatusRequestBuilder;
import com.exoscale.dbaasmysql.DbaasMysqlRequestBuilder;
import com.exoscale.dbaasopensearch.DbaasOpensearchRequestBuilder;
import com.exoscale.dbaaspostgres.DbaasPostgresRequestBuilder;
import com.exoscale.dbaasredis.DbaasRedisRequestBuilder;
import com.exoscale.dbaasservice.DbaasServiceRequestBuilder;
import com.exoscale.dbaasservicelogs.DbaasServiceLogsRequestBuilder;
import com.exoscale.dbaasservicemetrics.DbaasServiceMetricsRequestBuilder;
import com.exoscale.dbaasservicetype.DbaasServiceTypeRequestBuilder;
import com.exoscale.dbaassettingsgrafana.DbaasSettingsGrafanaRequestBuilder;
import com.exoscale.dbaassettingskafka.DbaasSettingsKafkaRequestBuilder;
import com.exoscale.dbaassettingsmysql.DbaasSettingsMysqlRequestBuilder;
import com.exoscale.dbaassettingsopensearch.DbaasSettingsOpensearchRequestBuilder;
import com.exoscale.dbaassettingspg.DbaasSettingsPgRequestBuilder;
import com.exoscale.dbaassettingsredis.DbaasSettingsRedisRequestBuilder;
import com.exoscale.dbaastask.DbaasTaskRequestBuilder;
import com.exoscale.dbaastaskmigrationcheck.DbaasTaskMigrationCheckRequestBuilder;
import com.exoscale.deploytarget.DeployTargetRequestBuilder;
import com.exoscale.dnsdomain.DnsDomainRequestBuilder;
import com.exoscale.elasticip.ElasticIpRequestBuilder;
import com.exoscale.event.EventRequestBuilder;
import com.exoscale.iamorganizationpolicy.IamOrganizationPolicyRequestBuilder;
import com.exoscale.iamrole.IamRoleRequestBuilder;
import com.exoscale.instance.InstanceRequestBuilder;
import com.exoscale.instancepool.InstancePoolRequestBuilder;
import com.exoscale.instancetype.InstanceTypeRequestBuilder;
import com.exoscale.loadbalancer.LoadBalancerRequestBuilder;
import com.exoscale.operation.OperationRequestBuilder;
import com.exoscale.privatenetwork.PrivateNetworkRequestBuilder;
import com.exoscale.quota.QuotaRequestBuilder;
import com.exoscale.reversedns.ReverseDnsRequestBuilder;
import com.exoscale.securitygroup.SecurityGroupRequestBuilder;
import com.exoscale.skscluster.SksClusterRequestBuilder;
import com.exoscale.sksclusterdeprecatedresources.SksClusterDeprecatedResourcesRequestBuilder;
import com.exoscale.sksclusterkubeconfig.SksClusterKubeconfigRequestBuilder;
import com.exoscale.sksclusterversion.SksClusterVersionRequestBuilder;
import com.exoscale.snapshot.SnapshotRequestBuilder;
import com.exoscale.sos.SosRequestBuilder;
import com.exoscale.sosbucketsusage.SosBucketsUsageRequestBuilder;
import com.exoscale.sshkey.SshKeyRequestBuilder;
import com.exoscale.template.TemplateRequestBuilder;
import com.exoscale.zone.ZoneRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiClient extends BaseRequestBuilder {
    /**
     * The accessKey property
     */
    @jakarta.annotation.Nonnull
    public AccessKeyRequestBuilder accessKey() {
        return new AccessKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The accessKeyKnownOperations property
     */
    @jakarta.annotation.Nonnull
    public AccessKeyKnownOperationsRequestBuilder accessKeyKnownOperations() {
        return new AccessKeyKnownOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The accessKeyOperations property
     */
    @jakarta.annotation.Nonnull
    public AccessKeyOperationsRequestBuilder accessKeyOperations() {
        return new AccessKeyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The antiAffinityGroup property
     */
    @jakarta.annotation.Nonnull
    public AntiAffinityGroupRequestBuilder antiAffinityGroup() {
        return new AntiAffinityGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The apiKey property
     */
    @jakarta.annotation.Nonnull
    public ApiKeyRequestBuilder apiKey() {
        return new ApiKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The blockStorage property
     */
    @jakarta.annotation.Nonnull
    public BlockStorageRequestBuilder blockStorage() {
        return new BlockStorageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The blockStorageSnapshot property
     */
    @jakarta.annotation.Nonnull
    public BlockStorageSnapshotRequestBuilder blockStorageSnapshot() {
        return new BlockStorageSnapshotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasCaCertificate property
     */
    @jakarta.annotation.Nonnull
    public DbaasCaCertificateRequestBuilder dbaasCaCertificate() {
        return new DbaasCaCertificateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasGrafana property
     */
    @jakarta.annotation.Nonnull
    public DbaasGrafanaRequestBuilder dbaasGrafana() {
        return new DbaasGrafanaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasIntegration property
     */
    @jakarta.annotation.Nonnull
    public DbaasIntegrationRequestBuilder dbaasIntegration() {
        return new DbaasIntegrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasIntegrationSettings property
     */
    @jakarta.annotation.Nonnull
    public DbaasIntegrationSettingsRequestBuilder dbaasIntegrationSettings() {
        return new DbaasIntegrationSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasIntegrationTypes property
     */
    @jakarta.annotation.Nonnull
    public DbaasIntegrationTypesRequestBuilder dbaasIntegrationTypes() {
        return new DbaasIntegrationTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasKafka property
     */
    @jakarta.annotation.Nonnull
    public DbaasKafkaRequestBuilder dbaasKafka() {
        return new DbaasKafkaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasMigrationStatus property
     */
    @jakarta.annotation.Nonnull
    public DbaasMigrationStatusRequestBuilder dbaasMigrationStatus() {
        return new DbaasMigrationStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasMysql property
     */
    @jakarta.annotation.Nonnull
    public DbaasMysqlRequestBuilder dbaasMysql() {
        return new DbaasMysqlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasOpensearch property
     */
    @jakarta.annotation.Nonnull
    public DbaasOpensearchRequestBuilder dbaasOpensearch() {
        return new DbaasOpensearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasPostgres property
     */
    @jakarta.annotation.Nonnull
    public DbaasPostgresRequestBuilder dbaasPostgres() {
        return new DbaasPostgresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasRedis property
     */
    @jakarta.annotation.Nonnull
    public DbaasRedisRequestBuilder dbaasRedis() {
        return new DbaasRedisRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasService property
     */
    @jakarta.annotation.Nonnull
    public DbaasServiceRequestBuilder dbaasService() {
        return new DbaasServiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasServiceLogs property
     */
    @jakarta.annotation.Nonnull
    public DbaasServiceLogsRequestBuilder dbaasServiceLogs() {
        return new DbaasServiceLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasServiceMetrics property
     */
    @jakarta.annotation.Nonnull
    public DbaasServiceMetricsRequestBuilder dbaasServiceMetrics() {
        return new DbaasServiceMetricsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasServiceType property
     */
    @jakarta.annotation.Nonnull
    public DbaasServiceTypeRequestBuilder dbaasServiceType() {
        return new DbaasServiceTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsGrafana property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsGrafanaRequestBuilder dbaasSettingsGrafana() {
        return new DbaasSettingsGrafanaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsKafka property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsKafkaRequestBuilder dbaasSettingsKafka() {
        return new DbaasSettingsKafkaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsMysql property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsMysqlRequestBuilder dbaasSettingsMysql() {
        return new DbaasSettingsMysqlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsOpensearch property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsOpensearchRequestBuilder dbaasSettingsOpensearch() {
        return new DbaasSettingsOpensearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsPg property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsPgRequestBuilder dbaasSettingsPg() {
        return new DbaasSettingsPgRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasSettingsRedis property
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsRedisRequestBuilder dbaasSettingsRedis() {
        return new DbaasSettingsRedisRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasTask property
     */
    @jakarta.annotation.Nonnull
    public DbaasTaskRequestBuilder dbaasTask() {
        return new DbaasTaskRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dbaasTaskMigrationCheck property
     */
    @jakarta.annotation.Nonnull
    public DbaasTaskMigrationCheckRequestBuilder dbaasTaskMigrationCheck() {
        return new DbaasTaskMigrationCheckRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The deployTarget property
     */
    @jakarta.annotation.Nonnull
    public DeployTargetRequestBuilder deployTarget() {
        return new DeployTargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The dnsDomain property
     */
    @jakarta.annotation.Nonnull
    public DnsDomainRequestBuilder dnsDomain() {
        return new DnsDomainRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The elasticIp property
     */
    @jakarta.annotation.Nonnull
    public ElasticIpRequestBuilder elasticIp() {
        return new ElasticIpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The event property
     */
    @jakarta.annotation.Nonnull
    public EventRequestBuilder event() {
        return new EventRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The iamOrganizationPolicy property
     */
    @jakarta.annotation.Nonnull
    public IamOrganizationPolicyRequestBuilder iamOrganizationPolicy() {
        return new IamOrganizationPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The iamRole property
     */
    @jakarta.annotation.Nonnull
    public IamRoleRequestBuilder iamRole() {
        return new IamRoleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instance property
     */
    @jakarta.annotation.Nonnull
    public InstanceRequestBuilder instance() {
        return new InstanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instancePool property
     */
    @jakarta.annotation.Nonnull
    public InstancePoolRequestBuilder instancePool() {
        return new InstancePoolRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instanceType property
     */
    @jakarta.annotation.Nonnull
    public InstanceTypeRequestBuilder instanceType() {
        return new InstanceTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The loadBalancer property
     */
    @jakarta.annotation.Nonnull
    public LoadBalancerRequestBuilder loadBalancer() {
        return new LoadBalancerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The operation property
     */
    @jakarta.annotation.Nonnull
    public OperationRequestBuilder operation() {
        return new OperationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The privateNetwork property
     */
    @jakarta.annotation.Nonnull
    public PrivateNetworkRequestBuilder privateNetwork() {
        return new PrivateNetworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The quota property
     */
    @jakarta.annotation.Nonnull
    public QuotaRequestBuilder quota() {
        return new QuotaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reverseDns property
     */
    @jakarta.annotation.Nonnull
    public ReverseDnsRequestBuilder reverseDns() {
        return new ReverseDnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The securityGroup property
     */
    @jakarta.annotation.Nonnull
    public SecurityGroupRequestBuilder securityGroup() {
        return new SecurityGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sksCluster property
     */
    @jakarta.annotation.Nonnull
    public SksClusterRequestBuilder sksCluster() {
        return new SksClusterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sksClusterDeprecatedResources property
     */
    @jakarta.annotation.Nonnull
    public SksClusterDeprecatedResourcesRequestBuilder sksClusterDeprecatedResources() {
        return new SksClusterDeprecatedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sksClusterKubeconfig property
     */
    @jakarta.annotation.Nonnull
    public SksClusterKubeconfigRequestBuilder sksClusterKubeconfig() {
        return new SksClusterKubeconfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sksClusterVersion property
     */
    @jakarta.annotation.Nonnull
    public SksClusterVersionRequestBuilder sksClusterVersion() {
        return new SksClusterVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The snapshot property
     */
    @jakarta.annotation.Nonnull
    public SnapshotRequestBuilder snapshot() {
        return new SnapshotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sos property
     */
    @jakarta.annotation.Nonnull
    public SosRequestBuilder sos() {
        return new SosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sosBucketsUsage property
     */
    @jakarta.annotation.Nonnull
    public SosBucketsUsageRequestBuilder sosBucketsUsage() {
        return new SosBucketsUsageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sshKey property
     */
    @jakarta.annotation.Nonnull
    public SshKeyRequestBuilder sshKey() {
        return new SshKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The template property
     */
    @jakarta.annotation.Nonnull
    public TemplateRequestBuilder template() {
        return new TemplateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The zone property
     */
    @jakarta.annotation.Nonnull
    public ZoneRequestBuilder zone() {
        return new ZoneRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ApiClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api-{zone}.exoscale.com/v2");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
