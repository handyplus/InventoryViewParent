package cn.handyplus.lib.inventory.view;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryHolder;

/**
 * 1.20.6-处理
 *
 * @author handy
 * @since 1.0.0
 */
public class InventoryViewOldUtil {

    /**
     * 获取InventoryHolder
     *
     * @param player 玩家
     * @return InventoryHolder
     * @since 1.0.0
     */
    protected static InventoryHolder getHolder(Player player) {
        return player.getOpenInventory().getTopInventory().getHolder();
    }

    /**
     * 获取InventoryType
     *
     * @param event 事件
     * @return InventoryHolder
     * @since 1.0.0
     */
    protected static InventoryType getInventoryType(InventoryClickEvent event) {
        return event.getView().getType();
    }

}
