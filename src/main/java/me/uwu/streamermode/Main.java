package me.uwu.streamermode;

import me.uwu.streamermode.commands.CommandNick;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MOD_ID)
public class Main {
    public static boolean started = false;
    public static final String MOD_ID = "StreamerMode";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("Hello world!");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {
        ClientCommandHandler.instance.registerCommand(new CommandNick());
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        System.out.println("Hello world! 2");
        started = true;

    }
}

