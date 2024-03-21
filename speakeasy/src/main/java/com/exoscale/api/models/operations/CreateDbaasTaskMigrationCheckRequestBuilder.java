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


public class CreateDbaasTaskMigrationCheckRequestBuilder {

    private String service;
    private CreateDbaasTaskMigrationCheckRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateDbaasTaskMigrationCheck sdk;

    public CreateDbaasTaskMigrationCheckRequestBuilder(SDKMethodInterfaces.MethodCallCreateDbaasTaskMigrationCheck sdk) {
        this.sdk = sdk;
    }

    public CreateDbaasTaskMigrationCheckRequestBuilder service(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    public CreateDbaasTaskMigrationCheckRequestBuilder requestBody(CreateDbaasTaskMigrationCheckRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateDbaasTaskMigrationCheckResponse call() throws Exception {

        return sdk.createDbaasTaskMigrationCheck(
            service,
            requestBody);
    }
}
