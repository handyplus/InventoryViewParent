package cn.handyplus.lib.inventory.view;

/**
 * InventoryView版本
 *
 * @author handy
 * @since 1.0.0
 */
enum InventoryViewVersionEnum {
    /**
     * 旧 1.20.6-
     */
    OLD,
    /**
     * 新 1.21+
     */
    NEW;

    /**
     * 缓存
     */
    private static Boolean IS_NEW;

    /**
     * 是否新版本
     *
     * @return true是
     * @since 1.0.0
     */
    static boolean isNew() {
        if (IS_NEW != null) {
            return IS_NEW;
        }
        IS_NEW = InventoryViewVersionEnum.NEW.equals(getVersion());
        return IS_NEW;
    }

    /**
     * 获取当前是哪个版本
     *
     * @return 版本
     * @since 1.0.0
     */
    private static InventoryViewVersionEnum getVersion() {
        try {
            Class<?> aClass = Class.forName("org.bukkit.inventory.InventoryView");
            return aClass.isInterface() ? NEW : OLD;
        } catch (ClassNotFoundException e) {
            return OLD;
        }
    }

}
