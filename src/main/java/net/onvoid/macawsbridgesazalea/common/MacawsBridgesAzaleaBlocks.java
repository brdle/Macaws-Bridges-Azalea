package net.onvoid.macawsbridgesazalea.common;

import com.mcwbridges.kikoz.MacawsBridges;
import com.mcwbridges.kikoz.objects.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.macawsbridgesazalea.MacawsBridgesAzalea;

import java.util.function.Supplier;

public class MacawsBridgesAzaleaBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsBridgesAzalea.MODID);

  public static final RegistryObject<Block> AZALEA_LOG_BRIDGE_MIDDLE = createBlock("azalea_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_AZALEA_LOG_BRIDGE_MIDDLE = createBlock("flowering_azalea_log_bridge_middle", () -> new Log_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

  public static final RegistryObject<Block> AZALEA_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_azalea_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_AZALEA_LOG_ROPE_BRIDGE_MIDDLE = createBlock("rope_flowering_azalea_bridge", () -> new Rope_Bridge(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

  public static final RegistryObject<Block> AZALEA_BRIDGE_PIER = createBlock("azalea_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_AZALEA_BRIDGE_PIER = createBlock("flowering_azalea_bridge_pier", () -> new Support_Pillar(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

  public static final RegistryObject<Block> AZALEA_LOG_BRIDGE_STAIR = createBlock("azalea_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_AZALEA_LOG_BRIDGE_STAIR = createBlock("flowering_azalea_log_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD)));

  public static final RegistryObject<Block> AZALEA_RAIL_BRIDGE = createBlock("azalea_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_AZALEA_RAIL_BRIDGE = createBlock("flowering_azalea_rail_bridge", () -> new Rail_Bridge(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(0.5F, 2.5F).sound(SoundType.WOOD)));

  public static final RegistryObject<Block> ACACIA_ROPE_BRIDGE_STAIR = createBlock("azalea_rope_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.8F, 2.0F).sound(SoundType.WOOD)));
  public static final RegistryObject<Block> FLOWERING_ACACIA_ROPE_BRIDGE_STAIR = createBlock("flowering_azalea_rope_bridge_stair", () -> new Iron_Stair(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(0.8F, 2.0F).sound(SoundType.WOOD)));

  public static void create(IEventBus bus) {
    BLOCKS.register(bus);
  }

  public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
  {
    RegistryObject<Block> block = BLOCKS.register(name, supplier);
    MacawsBridgesAzaleaItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MacawsBridges.BridgesItemGroup)));
    return block;
  }
}
