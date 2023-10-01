package io.github.unongmilkumk.Scissors.protocol.listeners;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import io.github.unongmilkumk.Scissors.protocol.events.PacketReceiveEvent;
import io.github.unongmilkumk.Scissors.protocol.wrappers.WrappedPacketClientKeepAlive;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class ScissorsProtocolListener extends PacketAdapter {
    public ScissorsProtocolListener(JavaPlugin plugin) {
        super(plugin, ListenerPriority.NORMAL);
    }

    @Override
    public void onPacketReceiving(PacketEvent e) {
        if (e.getPacketType() == PacketType.Play.Client.KEEP_ALIVE) {
            PacketReceiveEvent pre = new PacketReceiveEvent(e.getPacketType(), new WrappedPacketClientKeepAlive(e.getPacket()));
            Bukkit.getPluginManager().callEvent(pre);
        }
    }
}
