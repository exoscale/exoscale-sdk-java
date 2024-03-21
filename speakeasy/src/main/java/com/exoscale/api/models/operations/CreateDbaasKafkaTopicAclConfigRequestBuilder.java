/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.models.errors.SDKError;
import com.exoscale.api.utils.LazySingletonValue;
import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateDbaasKafkaTopicAclConfigRequestBuilder {

    private String name;
    private com.exoscale.api.models.components.DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry;
    private final SDKMethodInterfaces.MethodCallCreateDbaasKafkaTopicAclConfig sdk;

    public CreateDbaasKafkaTopicAclConfigRequestBuilder(SDKMethodInterfaces.MethodCallCreateDbaasKafkaTopicAclConfig sdk) {
        this.sdk = sdk;
    }

    public CreateDbaasKafkaTopicAclConfigRequestBuilder name(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CreateDbaasKafkaTopicAclConfigRequestBuilder dbaasKafkaTopicAclEntry(com.exoscale.api.models.components.DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry) {
        Utils.checkNotNull(dbaasKafkaTopicAclEntry, "dbaasKafkaTopicAclEntry");
        this.dbaasKafkaTopicAclEntry = dbaasKafkaTopicAclEntry;
        return this;
    }

    public CreateDbaasKafkaTopicAclConfigResponse call() throws Exception {

        return sdk.createDbaasKafkaTopicAclConfig(
            name,
            dbaasKafkaTopicAclEntry);
    }
}
