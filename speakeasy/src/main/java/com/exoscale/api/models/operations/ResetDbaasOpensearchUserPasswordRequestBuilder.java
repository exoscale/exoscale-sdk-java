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


public class ResetDbaasOpensearchUserPasswordRequestBuilder {

    private String serviceName;
    private String username;
    private ResetDbaasOpensearchUserPasswordRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallResetDbaasOpensearchUserPassword sdk;

    public ResetDbaasOpensearchUserPasswordRequestBuilder(SDKMethodInterfaces.MethodCallResetDbaasOpensearchUserPassword sdk) {
        this.sdk = sdk;
    }

    public ResetDbaasOpensearchUserPasswordRequestBuilder serviceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
        return this;
    }

    public ResetDbaasOpensearchUserPasswordRequestBuilder username(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public ResetDbaasOpensearchUserPasswordRequestBuilder requestBody(ResetDbaasOpensearchUserPasswordRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public ResetDbaasOpensearchUserPasswordResponse call() throws Exception {

        return sdk.resetDbaasOpensearchUserPassword(
            serviceName,
            username,
            requestBody);
    }
}
