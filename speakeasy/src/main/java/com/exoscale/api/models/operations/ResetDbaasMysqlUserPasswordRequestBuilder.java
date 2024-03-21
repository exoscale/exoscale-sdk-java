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


public class ResetDbaasMysqlUserPasswordRequestBuilder {

    private String serviceName;
    private String username;
    private ResetDbaasMysqlUserPasswordRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallResetDbaasMysqlUserPassword sdk;

    public ResetDbaasMysqlUserPasswordRequestBuilder(SDKMethodInterfaces.MethodCallResetDbaasMysqlUserPassword sdk) {
        this.sdk = sdk;
    }

    public ResetDbaasMysqlUserPasswordRequestBuilder serviceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
        return this;
    }

    public ResetDbaasMysqlUserPasswordRequestBuilder username(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public ResetDbaasMysqlUserPasswordRequestBuilder requestBody(ResetDbaasMysqlUserPasswordRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public ResetDbaasMysqlUserPasswordResponse call() throws Exception {

        return sdk.resetDbaasMysqlUserPassword(
            serviceName,
            username,
            requestBody);
    }
}
