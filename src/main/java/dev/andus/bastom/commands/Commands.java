package dev.andus.bastom.commands;

import net.minestom.server.command.builder.Command;

public class Commands {
    // Microstom
    public static final Command SHUTDOWN = new ShutdownCommand();
    public static final Command RESTART = new RestartCommand();
    // Bastom
    public static final Command EXTENSIONS = new ExtensionsCommand();
    public static final Command HELP = new HelpCommand();
    public static final Command PLAYER_LIST = new PlayerListCommand();
    public static final Command SERVER_INFO = new ServerInfoCommand();
}
