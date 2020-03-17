package sauce.seos.gg.effectlistener;

import org.bukkit.Bukkit;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;

public class EffectMap {

    private HashMap<String, PotionEffectType> effectList = new HashMap<String, PotionEffectType>();

    public HashMap<String, PotionEffectType> getEffectList() {
        return effectList;
    }

    public void setupEffectList() {
        EffectListener.getConfig()

    }
}
