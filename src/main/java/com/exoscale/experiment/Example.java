package com.exoscale.experiment;

import com.exoscale.model.AntiAffinityGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        logger.info("New AniAffinity Group form will be created...");

        AntiAffinityGroup antiAffinityGroup = new AntiAffinityGroup();

        antiAffinityGroup.name("TestAntiAffinityGroupV");
        exoscaleController.createNewAntiAffinityGroup(antiAffinityGroup);
    }

}
