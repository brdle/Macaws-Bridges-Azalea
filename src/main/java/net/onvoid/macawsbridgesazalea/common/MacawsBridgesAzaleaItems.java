package net.onvoid.macawsbridgesazalea.common;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.onvoid.macawsbridgesazalea.MacawsBridgesAzalea;

public class MacawsBridgesAzaleaItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsBridgesAzalea.MODID);

  public static void create(IEventBus bus) {
    ITEMS.register(bus);
  }
}
