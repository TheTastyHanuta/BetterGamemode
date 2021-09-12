package az.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import az.commands.Gamemode;
import az.commands.gm;

public class Mainclass extends JavaPlugin{
	
	public static String prefix = "§8[§3Bettergamemode§8] ";
	public static String noPerm = prefix + "§cDu hast keine Rechte dazu!";
	
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(prefix+ "§7enabled");
		this.getCommand("gm").setExecutor(new gm());
		this.getCommand("gamemode").setExecutor(new Gamemode());
	}
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(prefix+ "§7disabled");
	}

}
