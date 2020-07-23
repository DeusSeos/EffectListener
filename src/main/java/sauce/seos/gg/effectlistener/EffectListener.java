package sauce.seos.gg.effectlistener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public final class EffectListener extends JavaPlugin {


    @Override
    public void onEnable() {

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new OnHit(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
