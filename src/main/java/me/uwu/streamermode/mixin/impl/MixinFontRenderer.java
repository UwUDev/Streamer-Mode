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

    public RenameUtils renameUtils;

   @ModifyVariable(method = "renderString", at = @At("HEAD"), require = 1, ordinal = 0)
    private String renderString(final String string) {
        if (string == null)
            return null;

        String owo = string;
        if (Main.started){
            if (Minecraft.getMinecraft() != null && Minecraft.getMinecraft().getSession() != null) {
                owo = string.replace(Minecraft.getMinecraft().getSession().getUsername(), Main.instance.renameUtils.nick);
               // owo = owo.replace("Minecraft", "UwU");

                if(owo.contains("[") && owo.contains("]") && owo.contains(Main.instance.renameUtils.nick) && Main.instance.rank) {
                    int a = 0;
                    int b = 0;


                    String[] bruh = owo.split(" ");
                    for (String huh : bruh){
                        if(huh.contains("[") && huh.contains("]"))
                            b = a;
                        a++;
                    }
                    String s = bruh[b];
                    bruh[b] = s.substring(0, s.indexOf("[") - 2) + s.substring(s.indexOf("]"));
                    bruh[b].trim();
                    bruh[b] = bruh[b].replace("]", Main.instance.renameUtils.rank);

                    StringBuilder sb = new StringBuilder();

                    for (String huh : bruh)
                        sb.append(huh).append(" ");

                    owo = sb.toString().substring(0, sb.toString().length() - 1);
                }
            }
        }
        return owo;
    }

    /*public static void setNick(String nick){
       STREAMER_NAME = nick.replaceAll("&", "§");
    }*/

}
