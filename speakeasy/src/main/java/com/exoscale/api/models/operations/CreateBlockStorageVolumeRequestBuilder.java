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


public class CreateBlockStorageVolumeRequestBuilder {

    private CreateBlockStorageVolumeRequestBody request;
    private final SDKMethodInterfaces.MethodCallCreateBlockStorageVolume sdk;

    public CreateBlockStorageVolumeRequestBuilder(SDKMethodInterfaces.MethodCallCreateBlockStorageVolume sdk) {
        this.sdk = sdk;
    }

    public CreateBlockStorageVolumeRequestBuilder request(CreateBlockStorageVolumeRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateBlockStorageVolumeResponse call() throws Exception {

        return sdk.createBlockStorageVolume(
            request);
    }
}
