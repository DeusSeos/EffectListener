package sauce.seos.gg.effectlistener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

public class OnHit implements Listener {


    @EventHandler
    public void OnDamage(EntityDamageByEntityEvent e){
        LivingEntity entityAttacked = (LivingEntity) e.getEntity();
        Entity entityAttacking = e.getDamager();
        if (entityAttacking.getType().equals(EntityType.PLAYER)){
            if (e.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)){
                Player player = (Player) entityAttacking;
                ItemStack mainhand = player.getInventory().getItemInMainHand();
                player.addPotionEffect();
            }


        }else if (entityAttacking instanceof LivingEntity);

    }

}
