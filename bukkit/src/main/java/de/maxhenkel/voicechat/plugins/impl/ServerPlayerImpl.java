package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.ServerLevel;
import de.maxhenkel.voicechat.api.ServerPlayer;
import org.bukkit.entity.Player;

public class ServerPlayerImpl extends PlayerImpl implements ServerPlayer {

    private boolean blocked = false;

    public ServerPlayerImpl(Player entity) {
        super(entity);
    }

    public Player getRealServerPlayer() {
        return (Player) entity;
    }

    @Override
    public ServerLevel getServerLevel() {
        return new ServerLevelImpl(entity.getWorld());
    }

    @Override
    public boolean isBlocked() {
        return blocked;
    }

    @Override
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
