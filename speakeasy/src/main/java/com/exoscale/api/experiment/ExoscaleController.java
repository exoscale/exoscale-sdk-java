package com.exoscale.api.experiment;

import com.exoscale.experiment.exception.InstanceCreationException;
import com.exoscale.model.AntiAffinityGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ExoscaleController {
    private static final Logger logger = LoggerFactory.getLogger(ExoscaleController.class);
    private final ExoscaleService exoscaleService;

    /**
     * Constructor to autowire ExoscaleService.
     *
     * @param exoscaleService The service to manage Exoscale instances.
     */
    @Autowired
    public ExoscaleController(ExoscaleService exoscaleService) {
        this.exoscaleService = exoscaleService;
    }

    /**
     * Endpoint to handle the creation of a new Exoscale compute instance.
     *
     * @param instance Instance data received from the request body.
     * @return ResponseEntity containing the creation result or error information.
     */

    public ResponseEntity<?> createNewComputeInstance( Instance instance) {

        try {
            String requestBody = exoscaleService.createRequestBodyWithGson(instance);
            InstanceResponse response = exoscaleService.createComputeInstance(requestBody);

            logger.info("Compute Instance created successfully: {}", response.getId());
            return ResponseEntity.ok(response);
        } catch (InstanceCreationException e) {
            logger.error("Error creating Compute Instance: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }

    public  ResponseEntity<?> createNewAntiAffinityGroup(AntiAffinityGroup antiAffinityGroup) {
        try {
            String requestBody = exoscaleService.createAntiAffinityGroupRequestBodyWithGson(antiAffinityGroup);
            InstanceResponse response = exoscaleService.createAntiAffinityGroup(requestBody);
            logger.info("Anti Affinity Group created successfully: {}", response.getId());
            return ResponseEntity.ok(response);
        } catch (InstanceCreationException e) {
            logger.error("Error creating Anti Affinity Group: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            logger.error("Unexpected error: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error occurred");
        }
    }
}
