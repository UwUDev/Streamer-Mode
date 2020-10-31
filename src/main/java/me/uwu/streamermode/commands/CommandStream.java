package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandStream extends CommandBase {

    @Override
    public String getCommandName() {
        return "stream";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/stream";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        boolean xTrM_SKID = Main.instance.stream;

        if (xTrM_SKID) {
            Main.instance.stream = false;
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Streamer mode disabled."));
        }
        else{
            Main.instance.stream = true;
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Streamer mode enabled."));
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
