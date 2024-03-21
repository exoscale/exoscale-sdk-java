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


public class UpdateDbaasServiceOpensearchRequestBuilder {

    private String name;
    private UpdateDbaasServiceOpensearchRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateDbaasServiceOpensearch sdk;

    public UpdateDbaasServiceOpensearchRequestBuilder(SDKMethodInterfaces.MethodCallUpdateDbaasServiceOpensearch sdk) {
        this.sdk = sdk;
    }

    public UpdateDbaasServiceOpensearchRequestBuilder name(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public UpdateDbaasServiceOpensearchRequestBuilder requestBody(UpdateDbaasServiceOpensearchRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateDbaasServiceOpensearchResponse call() throws Exception {

        return sdk.updateDbaasServiceOpensearch(
            name,
            requestBody);
    }
}
