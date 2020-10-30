package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandResetNick extends CommandBase {

    @Override
    public String getCommandName() {
        return "resetnick";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/resetnick";
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
