import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.InstanceApi;
import org.openapitools.client.api.InstanceTypeApi;
import org.openapitools.client.api.OperationApi;
import org.openapitools.client.api.TemplateApi;
import org.openapitools.client.model.*;

import java.util.UUID;

public class Main {

    public static void main(String[] args) throws ApiException, InterruptedException {
        ApiClient apiClient = new ApiClient();


        InstanceTypeApi instanceTypeApi = new InstanceTypeApi(apiClient);
        InstanceApi instanceApi = new InstanceApi(apiClient);
        TemplateApi templateApi = new TemplateApi(apiClient);
        OperationApi operationApi = new OperationApi(apiClient);

        InstanceType instanceType = instanceTypeApi.getInstanceType(UUID.fromString("b6e9d1e8-89fc-4db3-aaa4-9b4c5b1d0844"));
        Template template = templateApi.getTemplate(UUID.fromString("4e4d4f64-9608-4dc3-b5f4-979c8ac39e7f"));


        CreateInstanceRequest request = new CreateInstanceRequest()
                .instanceType(instanceType)
                .template(template)
                .diskSize(50L)
                .publicIpAssignment(PublicIpAssignment.INET4);
        Operation operation = instanceApi.createInstance(request);
        while(Operation.StateEnum.PENDING.equals(operation.getState())) {
            operation = operationApi.getOperation(operation.getId());
            Thread.sleep(1000);
        }
    }
}
