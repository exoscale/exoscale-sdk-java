import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Credentials;
import org.openapitools.client.api.ExoscaleApi;
import org.openapitools.client.model.*;

import java.util.UUID;

public class Main {

    public static void main(String[] args) throws ApiException, InterruptedException {

        ApiClient apiClient = new ApiClient(new Credentials("Put your Secret Key", "Put your Public Key"));
        ExoscaleApi exoscaleApi = new ExoscaleApi(apiClient);
        InstanceType instanceType = exoscaleApi.getInstanceType(UUID.fromString("b6e9d1e8-89fc-4db3-aaa4-9b4c5b1d0844"));
        System.out.println(instanceType.toString());
        Template template = exoscaleApi.getTemplate(UUID.fromString("4e4d4f64-9608-4dc3-b5f4-979c8ac39e7f"));
        CreateInstanceRequest request = new CreateInstanceRequest()
                .instanceType(instanceType)
                .template(template)
                .diskSize(50L)
                .publicIpAssignment(PublicIpAssignment.INET4);
        Operation operation = exoscaleApi.createInstance(request);
        while(Operation.StateEnum.PENDING.equals(operation.getState())) {
            operation = exoscaleApi.getOperation(operation.getId());
            Thread.sleep(1000);
        }
    }
}