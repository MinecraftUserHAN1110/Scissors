package io.github.unongmilkumk.Scissors.protocol;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import io.github.unongmilkumk.Scissors.protocol.listeners.ScissorsProtocolListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Protocol {
    private JavaPlugin plugin;
    private ProtocolManager manager;
    public Protocol(JavaPlugin plugin) {
        this.plugin = plugin;
        this.manager = ProtocolLibrary.getProtocolManager();
    }

    public static Protocol INSTANCE;
    public static void init(JavaPlugin plugin) {
        INSTANCE = new Protocol(plugin);
    }

    private void inject() {
        manager.addPacketListener(new ScissorsProtocolListener(plugin));
    }
}
