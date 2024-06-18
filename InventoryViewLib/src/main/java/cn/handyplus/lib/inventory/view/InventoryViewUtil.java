package cn.handyplus.lib.inventory.view;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryHolder;

/**
 * InventoryView工具类
 *
 * @author handy
 */
public class InventoryViewUtil {

    private InventoryViewUtil() {

    }

    /**
     * 获取InventoryHolder
     *
     * @param player 玩家
     * @return InventoryHolder
     * @since 1.0.0
     */
    public static InventoryHolder getHolder(Player player) {
        if (InventoryViewVersionEnum.isNew()) {
            return InventoryViewNewUtil.getHolder(player);
        }
        return InventoryViewOldUtil.getHolder(player);
    }

    /**
     * 获取InventoryType
     *
     * @param event 事件
     * @return InventoryHolder
     * @since 1.0.0
     */
    public static InventoryType getInventoryType(InventoryClickEvent event) {
        if (InventoryViewVersionEnum.isNew()) {
            return InventoryViewNewUtil.getInventoryType(event);
        }
        return InventoryViewOldUtil.getInventoryType(event);
    }

}
