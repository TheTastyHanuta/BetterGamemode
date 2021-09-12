package az.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import az.main.Mainclass;

public class gm implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
		
		Player p =(Player)sender;
		
		if(cmd.getName().equalsIgnoreCase("gm")){
			if(p.hasPermission("system.gm")){
				if(args.length == 0){
					p.sendMessage(Mainclass.prefix + "§cVerwende /gm 0/1/2/3");
				}else if(args.length == 1){
					if(args[0].equalsIgnoreCase("0")){
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage(Mainclass.prefix + "§aDu bist nun im Überlebens-Modus!");
					}else if(args[0].equalsIgnoreCase("1")){
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage(Mainclass.prefix + "§aDu bist nun im Kreativ-Modus!");
					}else if(args[0].equalsIgnoreCase("2")){
						p.setGameMode(GameMode.ADVENTURE);
						p.sendMessage(Mainclass.prefix + "§aDu bist nun im Abenteuer-Modus!");
					}else if(args[0].equalsIgnoreCase("3")){
						p.setGameMode(GameMode.SPECTATOR);
						p.sendMessage(Mainclass.prefix + "§aDu bist nun im Zuschauer-Modus!");	
					}else {
						p.sendMessage(Mainclass.prefix+ "§cVerwende /gm 0/1/2/3!");
					}
				}else if(args.length == 2){
					Player p2 = Bukkit.getPlayer(args[1]);
						if(p2 != null) {
									
					if(args[0].equalsIgnoreCase("0")){
						p.sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Überlebens-Modus gesetzt!");
						p2.setGameMode(GameMode.SURVIVAL);
						p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Überlebens-Modus!");
					}else if(args[0].equalsIgnoreCase("1")){
						p.sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Kreativ-Modus gesetzt!");
						p2.setGameMode(GameMode.CREATIVE);
						p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Kreativ-Modus!");
					}else if(args[0].equalsIgnoreCase("2")){
						p.sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Abenteuer-Modus gesetzt!");
						p2.setGameMode(GameMode.ADVENTURE);
						p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Abenteuer-Modus!");
					}else if(args[0].equalsIgnoreCase("3")){
						p.sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Zuschauer-Modus gesetzt!");
						p2.setGameMode(GameMode.SPECTATOR);
						p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Zuschauer-Modus!");	
					}else {
						p.sendMessage(Mainclass.prefix+ "§cVerwende /gm 0/1/2/3 <Spieler>!");
					}
					}else {
						p.sendMessage(Mainclass.prefix + "§cDer angegebene Spieler ist nicht online! Verwende /gm 0/1/2/3 <Spieler>!");
					}
					
				}else {
					p.sendMessage(Mainclass.prefix+ "§cVerwende /gm 0/1/2/3 <Spieler>!");
				}
				}else{
					p.sendMessage(Mainclass.noPerm);
			}
			}
		
		}else {
			if(args.length ==2) {
				Player p2 = Bukkit.getPlayer(args[1]);
				if(p2 == null) {
					Bukkit.getConsoleSender().sendMessage(Mainclass.prefix+ "§cDer angegebene Spieler ist nicht online! Verwende /gm 0/1/2/3 <Spieler>!");
				}else {
				
			
			if(args[0].equalsIgnoreCase("0")){
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Überlebens-Modus gesetzt!");
				p2.setGameMode(GameMode.SURVIVAL);
				p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Überlebens-Modus!");
			}else if(args[0].equalsIgnoreCase("1")){
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Kreativ-Modus gesetzt!");
				p2.setGameMode(GameMode.CREATIVE);
				p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Kreativ-Modus!");
			}else if(args[0].equalsIgnoreCase("2")){
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Abenteuer-Modus gesetzt!");
				p2.setGameMode(GameMode.ADVENTURE);
				p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Abenteuer-Modus!");
			}else if(args[0].equalsIgnoreCase("3")){
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix + "§aDu hast den Spieler in den Zuschauer-Modus gesetzt!");
				p2.setGameMode(GameMode.SPECTATOR);
				p2.sendMessage(Mainclass.prefix + "§aDu bist nun im Zuschauer-Modus!");	
			}else {
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix+ "§cVerwende /gm 0/1/2/3 <Spieler>!");
			}
				}
			}else {
				Bukkit.getConsoleSender().sendMessage(Mainclass.prefix+"§cVerwende /gm 0/1/2/3 <Spieler>!");
			}
		}
		
		return true;
	}


}
