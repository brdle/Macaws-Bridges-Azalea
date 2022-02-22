package net.onvoid.macawsbridgesazalea.proxy;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.macawsbridgesazalea.common.MacawsBridgesAzaleaBlocks;
import net.onvoid.macawsbridgesazalea.common.MacawsBridgesAzaleaItems;;

public class CommonProxy {

  public void start() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    //IEventBus forgeBus = MinecraftForge.EVENT_BUS;
    MacawsBridgesAzaleaBlocks.create(modBus);
    MacawsBridgesAzaleaItems.create(modBus);
  }
}