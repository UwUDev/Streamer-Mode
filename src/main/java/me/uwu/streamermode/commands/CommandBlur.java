package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.EnumChatFormatting;

public class CommandBlur extends CommandBase {

    @Override
    public String getCommandName() {
        return "blur";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/blur";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Main.instance.renameUtils.nick = EnumChatFormatting.RED.toString() + EnumChatFormatting.OBFUSCATED.toString() + Minecraft.getMinecraft().getSession().getUsername();
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
