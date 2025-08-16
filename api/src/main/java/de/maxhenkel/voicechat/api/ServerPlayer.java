package de.maxhenkel.voicechat.api;

public interface ServerPlayer extends Player {

    /**
     * @return the level of the player
     */
    ServerLevel getServerLevel();

    /**
     * Checks if the player is blocked from sending voice messages.
     *
     * @return true if the player is blocked, false otherwise
     */
    boolean isBlocked();

    /**
     * Sets whether the player is blocked from sending voice messages.
     *
     * @param blocked true if the player is blocked, false otherwise
     */
    void setBlocked(boolean blocked);

}
