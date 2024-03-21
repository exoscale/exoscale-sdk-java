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


public class ListSshKeysRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListSshKeys sdk;

    public ListSshKeysRequestBuilder(SDKMethodInterfaces.MethodCallListSshKeys sdk) {
        this.sdk = sdk;
    }

    public ListSshKeysResponse call() throws Exception {

        return sdk.listSshKeysDirect();
    }
}
