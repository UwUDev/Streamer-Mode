package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandRankDisable extends CommandBase {

    @Override
    public String getCommandName() {
        return "rankdisable";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/rankdisable";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Main.instance.rank = false;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

}
