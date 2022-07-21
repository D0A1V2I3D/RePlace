package the.david.replace.events;

import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PlayerPlace implements Listener {
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        PlayerInventory inv = player.getInventory();
        ItemStack offhand = inv.getItemInOffHand();
        NBTItem nbt = new NBTItem(offhand);
        Block block = e.getBlockPlaced();
        if (offhand.getType() == Material.CARROT_ON_A_STICK && nbt.hasTag("RPWrench")) {
            //
        }
    }
}
