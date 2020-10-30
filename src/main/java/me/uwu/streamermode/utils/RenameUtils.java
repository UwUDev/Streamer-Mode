package me.uwu.streamermode.utils;

import me.uwu.streamermode.mixin.impl.MixinFontRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;

public class RenameUtils {

   /* public static String changeName(String text){
                return text.replace(Minecraft.getMinecraft().getSession().getUsername(), MixinFontRenderer.STREAMER_NAME);
    }*/

    public String nick = "UwU";
    public String rank = EnumChatFormatting.BLUE.toString() + "[Noob]";
}
