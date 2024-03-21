package com.exoscale.api.experiment;

import java.util.Base64;

/**
 * Utility class providing cloud-init user data for Exoscale instances.
 */
public class CloudInitUserData {
    /**
     * Generates the Base64 encoded cloud-init user data.
     * This user data is used to perform initial setup tasks on Exoscale instances.
     *
     * @return A Base64 encoded string containing the cloud-init script.
     */
    public static String getCloudInitUserData() {
        String cloudInitScript = "#cloud-config\n" +
                "runcmd:\n" +
                "  - apt-get update && apt-get install -y docker.io\n" +
                "  - systemctl start docker\n" +
                "  - docker pull nginx\n" +
                "  - docker run --name webserver -d -p 80:80 nginx\n";
        return Base64.getEncoder().encodeToString(cloudInitScript.getBytes());
    }
}
