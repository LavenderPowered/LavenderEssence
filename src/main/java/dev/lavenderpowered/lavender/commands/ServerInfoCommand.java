package dev.lavenderpowered.lavender.commands;

import dev.lavenderpowered.lavender.Server;
import net.minestom.server.MinecraftServer;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.ServerSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;

public class ServerInfoCommand extends Command {
    public ServerInfoCommand() {
        super("serverinfo", "srvinfo");
        setCondition((sender, commandString) -> (sender instanceof ServerSender)
                || sender.hasPermission(Permissions.SERVER_INFO));
        setDefaultExecutor(this::execute);
    }

    private void execute(CommandSender sender, CommandContext context) {
        String javaVer = String.valueOf(Runtime.version());
        String bastomVer = Server.VERSION;
        String minestomVer = "&commit";
        String protocolVer = MinecraftServer.PROTOCOL_VERSION + "(" + MinecraftServer.VERSION_NAME + ")";

        StringBuilder serverInfoOutput = new StringBuilder("Server Information: ").append("\n");
        serverInfoOutput.append("Java Version: " + javaVer).append("\n");
        serverInfoOutput.append("Bastom Version: " + bastomVer).append("\n");
        serverInfoOutput.append("Minestom commit: " + minestomVer).append("\n");
        serverInfoOutput.append("Protocol Version: " + protocolVer).append("\n");
        serverInfoOutput.append("Online Players: " + MinecraftServer.getConnectionManager().getOnlinePlayers().size());

        sender.sendMessage(serverInfoOutput.toString());
    }
}
