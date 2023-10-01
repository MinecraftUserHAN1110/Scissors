package io.github.unongmilkumk.Scissors.protocol.events;

import com.comphenix.protocol.PacketType;
import io.github.unongmilkumk.Scissors.protocol.wrappers.AbstractPacket;
import io.github.unongmilkumk.Scissors.protocol.wrappers.WrappedPacketClientKeepAlive;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PacketReceiveEvent extends Event {
    public static final HandlerList HANDLERS = new HandlerList();
    private PacketType type;
    private AbstractPacket targetClass;

    public PacketReceiveEvent(PacketType type, AbstractPacket targetClass) {
        this.type = type;
        this.targetClass = targetClass;
    }
    @Override
    public final HandlerList getHandlers() {
        return HANDLERS;
    }

    public static final HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PacketType getPacket() {
        return type;
    }

    public AbstractPacket getPacketClass() {
        return targetClass;
    }
}
