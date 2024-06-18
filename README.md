# InventoryViewLib

> 同时适配1.21+和1.20.6-的InventoryView

## 本依赖存在原因

| 类名            | 类型        | 版本      |
|---------------|-----------|---------|
| InventoryView | class     | 1.20.6- |
| InventoryView | interface | 1.21+   |

类型的修改会导致出现如下报错

```log
Caused by: java.lang.IncompatibleClassChangeError: Found class org.bukkit.inventory.InventoryView, but interface was expected
```

## 使用方法(本jar已经发布到maven中央仓库)

[![Maven Central](https://img.shields.io/maven-central/v/cn.handyplus.lib.inventory.view/InventoryViewLib.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22cn.handyplus.lib.inventory.view%22%20AND%20a:%22InventoryViewLib%22)

1. maven引入
   ```xml
    <dependency>
        <groupId>cn.handyplus.lib.inventory.view</groupId>
        <artifactId>InventoryViewLib</artifactId>
        <version>最新版本</version>
    </dependency>
   ```

2. 使用示例 详见[JAVADOC](https://handyplus.github.io/InventoryViewParent/)

    * 获取InventoryHolder  
      InventoryViewUtil.getHolder(Player player);

    * 获取InventoryType
      InventoryViewUtil.getInventoryType(InventoryClickEvent event);

## 建议

可以在[issues](https://github.com/handyplus/InventoryViewParent/issues)提出

## 贡献者

[![Contrib](https://contrib.rocks/image?repo=handyplus/InventoryViewParent)](https://github.com/handyplus/InventoryViewParent/graphs/contributors)

## Star History

[![Star History Chart](https://api.star-history.com/svg?repos=handyplus/InventoryViewParent&type=Date)](https://star-history.com/#handyplus/InventoryViewParent&Date)
