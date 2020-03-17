package sauce.seos.gg.effectlistener;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class EffectListener extends JavaPlugin {




    @Override
    public void onEnable() {
        effectList.putIfAbsent("- Poisons the Enemy" , "");
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new OnHit(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
