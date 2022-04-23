package io.th0rgal.oraxen.events;

import io.th0rgal.oraxen.mechanics.provided.gameplay.noteblock.NoteBlockMechanic;
import org.bukkit.block.Block;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

public class OraxenNoteBlockInteractEvent extends Event implements Cancellable {

    NoteBlockMechanic noteBlockMechanic;
    Player player;
    PlayerInteractEvent interactEvent;
    boolean isCancelled;
    private static final HandlerList HANDLERS  = new HandlerList();

    public OraxenNoteBlockInteractEvent(NoteBlockMechanic mechanic, PlayerInteractEvent interactEvent, Player player) {
        this.noteBlockMechanic = mechanic;
        this.player = player;
        this.interactEvent = interactEvent;
        this.isCancelled = false;
    }



    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }


    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * @return The note block mechanic
     */
    public NoteBlockMechanic getNoteBlockMechanic() {
        return noteBlockMechanic;
    }

    /**
     * @return The player who broke the note block
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return The interact event
     */
    public PlayerInteractEvent getInteractEvent() {
        return interactEvent;
    }
}
