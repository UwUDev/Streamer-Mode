package me.uwu.streamermode.commands;

import java.util.HashMap;
import java.util.List;

import me.uwu.streamermode.utils.RenameUtils;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandNick extends CommandBase {

    public RenameUtils renameUtils = new RenameUtils();

    @Override
    public String getCommandName() {
        return "nick";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "collection <name> (use \"&\" for colors)";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {

        if (args.length < 1) {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "collection <name> (use \"&\" for §ac§bo§3l§do§5r§4s§c)"));
            return;
        }

        if (args.length == 1) {
            String nick = args[0].toLowerCase();
            if (args[0].length() < 1) {
                sender.addChatMessage(new ChatComponentText(
                        EnumChatFormatting.RED + nick.toUpperCase() + " is not valid Name"));
                return;
            }
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Nicked to " + nick));
            renameUtils.nick = nick;
        }

    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
