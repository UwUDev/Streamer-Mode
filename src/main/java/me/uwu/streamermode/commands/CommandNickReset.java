package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandNickReset extends CommandBase {

    @Override
    public String getCommandName() {
        return "nickreset";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/nickreset";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
       Main.instance.renameUtils.nick = Minecraft.getMinecraft().getSession().getUsername();
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
