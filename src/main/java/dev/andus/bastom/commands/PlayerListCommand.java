package dev.andus.bastom.commands;

import net.minestom.server.MinecraftServer;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.minestom.server.entity.Player;

public class PlayerListCommand extends Command {
    public PlayerListCommand() {
        super("list", "ls");
        setDefaultExecutor(this::execute);
    }

    private void execute(CommandSender sender, CommandContext context) {
        Iterable<Player> onlinePlayers = MinecraftServer.getConnectionManager().getOnlinePlayers();

        // Build a list of player names
        StringBuilder playerList = new StringBuilder("Players on server: ");
        for (Player player : onlinePlayers) {
            playerList.append(player.getUsername()).append(", ");
        }

        // Remove the trailing comma and space
        if (onlinePlayers.iterator().hasNext()) {
            playerList.setLength(playerList.length() - 2);
        }
        sender.sendMessage(playerList.toString());
    }
}
