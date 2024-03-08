package com.exoscale.experiment;

import com.exoscale.model.*;
import com.exoscale.model.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
public class Example implements CommandLineRunner {

    private final ExoscaleController exoscaleController;

    @Autowired
    public Example(ExoscaleController exoscaleController) {
        this.exoscaleController = exoscaleController;
    }

    @Override
    public void run(String... args) {

        Logger logger = LoggerFactory.getLogger(Example.class);
        // Creating new Instance, Initialize it and add the required fields
        logger.info("New Compute Instance form will be created...");
        Instance newInstance = new Instance();
        newInstance.setName("Java-SDK-Test-Experiment-Instance");
        // Initialize  InstanceType and adding Id to it
        InstanceType instanceType = new InstanceType();
        instanceType.setId(UUID.fromString("71004023-bb72-4a97-b1e9-bc66dfce9470"));
        newInstance.setInstanceType(instanceType);
        // Setting the DiskSize
        newInstance.setDiskSize(10L);
        // Initialize  template and adding Id to it
        Template template = new Template();
        template.setId(UUID.fromString("4440e341-5259-4c7e-a777-53e87281d547"));
        newInstance.setTemplate(template);
        // Initialize  securityGroup and adding Id to it
        SecurityGroup securityGroup = new SecurityGroup();
        securityGroup.setId(UUID.fromString("79918028-a79c-4a14-b97e-11217e0c6812"));
        newInstance.setSecurityGroups(Collections.singletonList(securityGroup));

        // Creating new Instance
        exoscaleController.createNewComputeInstance(newInstance);
        logger.info("New AniAffinity Group form will be created...");

        // Creating new Anti-Affinity-Group, Initialize it and add the fields to it
        AntiAffinityGroup antiAffinityGroup = new AntiAffinityGroup();
        antiAffinityGroup.name("Test-Anti-Affinity-Group-V1");
        antiAffinityGroup.description("The Anti Affinity Group was created for code test purpose!");
        exoscaleController.createNewAntiAffinityGroup(antiAffinityGroup);
    }

}
