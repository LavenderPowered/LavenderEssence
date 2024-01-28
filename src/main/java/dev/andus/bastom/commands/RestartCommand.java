package dev.andus.bastom.commands;

import dev.andus.bastom.Server;
import net.hollowcube.minestom.extensions.ExtensionBootstrap;
import net.minestom.server.MinecraftServer;
import net.minestom.server.command.ConsoleSender;
import net.minestom.server.command.ServerSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.extensions.ExtensionManager;

import java.io.IOException;

public class RestartCommand extends Command {
    public RestartCommand() {
        super("restart");
        setCondition((sender, commandString) -> (sender instanceof ServerSender)
                || sender.hasPermission(Permissions.RESTART));
        setDefaultExecutor((sender, context) -> {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    new ProcessBuilder("./start.sh").start();
                    Server.logger.info("Start new server.");
                } catch (IOException e) {
                    if (!(sender instanceof ConsoleSender)) sender.sendMessage("Could not restart server.");
                    Server.logger.error("Could not restart server.", e);
                }
            }, "RestartHook"));
            MinecraftServer.stopCleanly();
        });
    }
}
