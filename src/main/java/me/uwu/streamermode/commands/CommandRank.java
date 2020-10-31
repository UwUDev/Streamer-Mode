package me.uwu.streamermode.commands;

import me.uwu.streamermode.Main;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class CommandRank extends CommandBase {

    @Override
    public String getCommandName() {
        return "rank";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/rank <rank> (use \"&\" for §ac§bo§3l§do§5r§4s§c)";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {

        if (args.length < 1) {
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "/rank <rank> (use \"&\" for §ac§bo§3l§do§5r§4s§c)"));
            return;
        }

        if (args.length == 1) {
            String rank = args[0];
            if (args[0].length() < 1) {
                sender.addChatMessage(new ChatComponentText(
                        EnumChatFormatting.RED + rank + " is not valid rank"));
                return;
            }

            Main.instance.rank = true;
            Main.instance.stream = true;
            sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Ranked to " + colorFix(rank)));
            Main.instance.renameUtils.rank = colorFix(rank);

        }

    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    public String colorFix(String data){
        data = data.replace("&0", EnumChatFormatting.BLACK.toString());
        data = data.replace("&1", EnumChatFormatting.DARK_BLUE.toString());
        data = data.replace("&2", EnumChatFormatting.DARK_GREEN.toString());
        data = data.replace("&3", EnumChatFormatting.DARK_AQUA.toString());
        data = data.replace("&4", EnumChatFormatting.DARK_RED.toString());
        data = data.replace("&5", EnumChatFormatting.DARK_PURPLE.toString());
        data = data.replace("&6", EnumChatFormatting.GOLD.toString());
        data = data.replace("&7", EnumChatFormatting.GRAY.toString());
        data = data.replace("&8", EnumChatFormatting.DARK_GRAY.toString());
        data = data.replace("&9", EnumChatFormatting.BLUE.toString());
        data = data.replace("&a", EnumChatFormatting.GREEN.toString());
        data = data.replace("&b", EnumChatFormatting.AQUA.toString());
        data = data.replace("&c", EnumChatFormatting.RED.toString());
        data = data.replace("&d", EnumChatFormatting.LIGHT_PURPLE.toString());
        data = data.replace("&e", EnumChatFormatting.YELLOW.toString());
        data = data.replace("&f", EnumChatFormatting.WHITE.toString());
        data = data.replace("&l", EnumChatFormatting.BOLD.toString());
        data = data.replace("&n", EnumChatFormatting.UNDERLINE.toString());
        data = data.replace("&o", EnumChatFormatting.ITALIC.toString());
        data = data.replace("&m", EnumChatFormatting.STRIKETHROUGH.toString());
        data = data.replace("&k", EnumChatFormatting.OBFUSCATED.toString());
        data = data.replace("&r", EnumChatFormatting.RESET.toString());

        return data;
    }

}
