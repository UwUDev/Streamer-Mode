package me.uwu.streamermode.mixin.impl;

import me.uwu.streamermode.Main;
import me.uwu.streamermode.commands.CommandNick;
import me.uwu.streamermode.utils.RenameUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(FontRenderer.class)
public class MixinFontRenderer {

    private static String STREAMER_NAME = "UwU";

   @ModifyVariable(method = "renderString", at = @At("HEAD"), require = 1, ordinal = 0)
    private String renderString(final String string) {
        if (string == null)
            return null;

       CommandNick commandNick = new CommandNick();

        String owo = string;
        if (Main.started){
            if (Minecraft.getMinecraft() != null && Minecraft.getMinecraft().getSession() != null) {
                owo = string.replace(Minecraft.getMinecraft().getSession().getUsername(), commandNick.renameUtils.nick);
               // owo = owo.replace("Minecraft", "UwU");
            }
        }
        return owo;
    }

    /*public static void setNick(String nick){
       STREAMER_NAME = nick.replaceAll("&", "§");
    }*/

}
