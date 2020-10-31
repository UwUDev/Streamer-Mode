package me.uwu.streamermode;

import me.uwu.streamermode.commands.*;
import me.uwu.streamermode.utils.RenameUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID)
public class Main {

    public static Main instance = new Main();
    public RenameUtils renameUtils = new RenameUtils();
    public boolean rank = false;
    public boolean stream = true;

    public static boolean started = false;
    public static final String MOD_ID = "StreamerMode";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("Vous aimez le jambon ?");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        ClientCommandHandler.instance.registerCommand(new CommandStream());

        ClientCommandHandler.instance.registerCommand(new CommandNick());
        ClientCommandHandler.instance.registerCommand(new CommandBlur());
        ClientCommandHandler.instance.registerCommand(new CommandNickReset());

        ClientCommandHandler.instance.registerCommand(new CommandRank());
        ClientCommandHandler.instance.registerCommand(new CommandRankEnable());
        ClientCommandHandler.instance.registerCommand(new CommandRankDisable());
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        System.out.println("Moi perso j'aime bien ca");
        started = true;
        instance.renameUtils.nick = Minecraft.getMinecraft().getSession().getUsername();
    }
}

