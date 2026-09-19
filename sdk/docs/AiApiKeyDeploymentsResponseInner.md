

# AiApiKeyDeploymentsResponseInner

## oneOf schemas
* [AiApiKeyDeploymentRef](AiApiKeyDeploymentRef.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.exoscale.sdk.model.AiApiKeyDeploymentsResponseInner;
import com.exoscale.sdk.model.AiApiKeyDeploymentRef;
import com.exoscale.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        AiApiKeyDeploymentsResponseInner exampleAiApiKeyDeploymentsResponseInner = new AiApiKeyDeploymentsResponseInner();

        // create a new AiApiKeyDeploymentRef
        AiApiKeyDeploymentRef exampleAiApiKeyDeploymentRef = new AiApiKeyDeploymentRef();
        // set AiApiKeyDeploymentsResponseInner to AiApiKeyDeploymentRef
        exampleAiApiKeyDeploymentsResponseInner.setActualInstance(exampleAiApiKeyDeploymentRef);
        // to get back the AiApiKeyDeploymentRef set earlier
        AiApiKeyDeploymentRef testAiApiKeyDeploymentRef = (AiApiKeyDeploymentRef) exampleAiApiKeyDeploymentsResponseInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set AiApiKeyDeploymentsResponseInner to String
        exampleAiApiKeyDeploymentsResponseInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAiApiKeyDeploymentsResponseInner.getActualInstance();
    }
}
```


