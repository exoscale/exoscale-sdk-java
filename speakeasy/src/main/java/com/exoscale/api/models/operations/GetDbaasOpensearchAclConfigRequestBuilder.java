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


public class GetDbaasOpensearchAclConfigRequestBuilder {

    private String name;
    private final SDKMethodInterfaces.MethodCallGetDbaasOpensearchAclConfig sdk;

    public GetDbaasOpensearchAclConfigRequestBuilder(SDKMethodInterfaces.MethodCallGetDbaasOpensearchAclConfig sdk) {
        this.sdk = sdk;
    }

    public GetDbaasOpensearchAclConfigRequestBuilder name(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetDbaasOpensearchAclConfigResponse call() throws Exception {

        return sdk.getDbaasOpensearchAclConfig(
            name);
    }
}
