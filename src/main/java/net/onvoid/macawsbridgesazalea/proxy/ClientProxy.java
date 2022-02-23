package net.onvoid.macawsbridgesazalea.proxy;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.macawsbridgesazalea.common.MacawsBridgesAzaleaBlocks;

public class ClientProxy extends CommonProxy {

  @Override
  public void start() {
    super.start();
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    //IEventBus forgeBus = MinecraftForge.EVENT_BUS;
    modBus.addListener(this::clientSetup);
  }

  private void clientSetup(FMLClientSetupEvent e) {
    // Log Bridge Middle
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.AZALEA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_AZALEA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());

    // Log Rope Bridge Middle
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.AZALEA_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_AZALEA_LOG_ROPE_BRIDGE_MIDDLE.get(), RenderType.cutout());

    // Bridge Pier
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.AZALEA_BRIDGE_PIER.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_AZALEA_BRIDGE_PIER.get(), RenderType.cutout());

    // Bridge Stair
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.AZALEA_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_AZALEA_LOG_BRIDGE_STAIR.get(), RenderType.cutout());

    // Rail Bridge
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.AZALEA_RAIL_BRIDGE.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_AZALEA_RAIL_BRIDGE.get(), RenderType.cutout());

    // Rope Bridge Stair
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.ACACIA_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
    ItemBlockRenderTypes.setRenderLayer(MacawsBridgesAzaleaBlocks.FLOWERING_ACACIA_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
  }
}