import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Client;
import org.openapitools.client.Credentials;
import org.openapitools.client.api.ExoscaleApi;
import org.openapitools.client.model.*;

import java.util.UUID;

public class Main {

    public static void main(String[] args) throws ApiException, InterruptedException {

        Client client = new Client(new Credentials("Put your Public Key", "Put your Secret Key"));

        InstanceType instanceType = client.getInstanceType(UUID.fromString("b6e9d1e8-89fc-4db3-aaa4-9b4c5b1d0844"));
        System.out.println(instanceType.toString());
        Template template = client.getTemplate(UUID.fromString("0e96fc01-885a-4e74-91bb-d233ac58fa3a"));
        CreateInstanceRequest request = new CreateInstanceRequest()
                .instanceType(instanceType)
                .template(template)
                .diskSize(50L)
                .publicIpAssignment(PublicIpAssignment.INET4);
        Operation operation = client.createInstance(request);
        while(Operation.StateEnum.PENDING.equals(operation.getState())) {
            operation = client.getOperation(operation.getId());
            Thread.sleep(1000);
        }
    }
}