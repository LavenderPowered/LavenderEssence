package dev.andus.bastom.commands;

import dev.andus.bastom.Utils;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;

public class HelpCommand extends Command {
    public HelpCommand() {
        super("help");
        setDefaultExecutor(this::execute);
    }

    private void execute(CommandSender sender, CommandContext context) {
        // Send the help contents to the sender
        sender.sendMessage(Utils.readFromFile("help.txt", "No help.txt"));
    }
}
