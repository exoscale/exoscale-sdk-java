package com.exoscale.client;


import com.exoscale.api.ExoscaleApi;
import com.exoscale.model.Operation;

/**
* High-level wrapper for interacting with Exoscale API.
* Takes care of the setup ad configuration of the underlying ApiClient
*/
public class Client extends ExoscaleApi {
/**
*
* @param credentials The credentials used to authenticate with the Exoscale API.
*/

public Client(Credentials credentials){
super(new ApiClient(credentials));
}

/**
* Waits for a given operation to complete.
*
* @param operation The operation to wait for.
* @return The updated operation after reaching a terminal state.
* @throws RuntimeException If there is an error during the polling process
*/
public Operation wait(Operation operation){
while(Operation.StateEnum.PENDING.equals(operation.getState())) {

try {
operation = this.getOperation(operation.getId());
Thread.sleep(1000);
} catch (Exception e) {
throw new RuntimeException(e);
}
}
return operation;
}
}
