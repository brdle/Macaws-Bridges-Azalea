package net.onvoid.macawsbridgesazalea;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.onvoid.macawsbridgesazalea.proxy.ClientProxy;
import net.onvoid.macawsbridgesazalea.proxy.CommonProxy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("macawsbridgesazalea")
public class MacawsBridgesAzalea {
  public static final String MODID = "macawsbridgesazalea";
  public static MacawsBridgesAzalea instance;
  public static CommonProxy proxy;
  private static final Logger LOGGER = LogManager.getLogger();

  public MacawsBridgesAzalea() {
      instance = this;

      proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
      proxy.start();
  }

  public Logger getLogger() {
      return this.LOGGER;
  }
}
