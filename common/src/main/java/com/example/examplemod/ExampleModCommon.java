package com.example.examplemod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleModCommon {
    // This value MUST match one in root gradle.properties
    public static final String MOD_ID = "examplemod";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

    public static void init() {
        LOG.info("{} mod is loading!", MOD_ID);

        // See https://stonecutter.kikugie.dev/wiki/config/params
        // for stonecutter syntax

        //? if 1.21.1 {
        LOG.info("Current version is 1.21.1");
        //? } else {
        /*LOG.info("Current version is not 1.21.1");
        *///? }

        //? if 1.21.11
        //LOG.info("Version comments can only cover one line if there are no brackets");
        LOG.info("This line is not affected by the `? if 1.21.11`!");

        //? if minecraft: <=1.21.1
        LOG.info("Dependency's name can be specified like this. Or minecraft dependency can be omitted like in previous examples");

        LOG.info("Check ExampleFabric or ExampleNeoForge too see other dependencies in action");
        LOG.info("Note that this conditions are checked on source code level. NOT RUNTIME!!");
        LOG.info("Code in unmatched conditions does not get compiled at all!");
    }
}
