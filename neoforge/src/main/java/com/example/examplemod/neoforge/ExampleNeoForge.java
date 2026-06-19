package com.example.examplemod.neoforge;

import com.example.examplemod.ExampleModCommon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(ExampleModCommon.MOD_ID)
public class ExampleNeoForge {
    public ExampleNeoForge(IEventBus bus, ModContainer container) {
        ExampleModCommon.init(); // call our common initializer. It does not get called by mod loader

        //? if neoforge: <21.11.42
        ExampleModCommon.LOG.info("NeoForge version during compilation is lower then 21.11.42");
    }
}
