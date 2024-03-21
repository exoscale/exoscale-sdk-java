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


public class GetSshKeyRequestBuilder {

    private String name;
    private final SDKMethodInterfaces.MethodCallGetSshKey sdk;

    public GetSshKeyRequestBuilder(SDKMethodInterfaces.MethodCallGetSshKey sdk) {
        this.sdk = sdk;
    }

    public GetSshKeyRequestBuilder name(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetSshKeyResponse call() throws Exception {

        return sdk.getSshKey(
            name);
    }
}
