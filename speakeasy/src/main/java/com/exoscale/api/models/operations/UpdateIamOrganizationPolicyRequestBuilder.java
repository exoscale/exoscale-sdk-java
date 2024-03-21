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


public class UpdateIamOrganizationPolicyRequestBuilder {

    private com.exoscale.api.models.components.IamPolicy request;
    private final SDKMethodInterfaces.MethodCallUpdateIamOrganizationPolicy sdk;

    public UpdateIamOrganizationPolicyRequestBuilder(SDKMethodInterfaces.MethodCallUpdateIamOrganizationPolicy sdk) {
        this.sdk = sdk;
    }

    public UpdateIamOrganizationPolicyRequestBuilder request(com.exoscale.api.models.components.IamPolicy request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateIamOrganizationPolicyResponse call() throws Exception {

        return sdk.updateIamOrganizationPolicy(
            request);
    }
}
