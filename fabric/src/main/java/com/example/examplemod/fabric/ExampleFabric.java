package com.example.examplemod.fabric;

import com.example.examplemod.ExampleModCommon;
import net.fabricmc.api.ModInitializer;

public class ExampleFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleModCommon.init(); // call our common initializer. It does not get called by mod loader

        //? if fabric_api: >0.116.12
        //ExampleModCommon.LOG.info("Fabric API's version is greater then 0.116.12");
    }
}
