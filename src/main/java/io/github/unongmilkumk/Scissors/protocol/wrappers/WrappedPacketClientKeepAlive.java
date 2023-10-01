package io.github.unongmilkumk.Scissors.protocol.wrappers;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrappedPacketClientKeepAlive extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.KEEP_ALIVE;

    public WrappedPacketClientKeepAlive() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrappedPacketClientKeepAlive(PacketContainer packet) {
        super(packet, TYPE);
    }

    public long getKeepAliveId() {
        return handle.getLongs().read(0);
    }
}
