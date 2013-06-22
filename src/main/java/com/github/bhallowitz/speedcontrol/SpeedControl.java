/*************************************************
 * Speed Control - By bhallowitz                 *
 *                                               *
 * To-Do:                                        *
 *                                               *
 * Add permissions support.                      *
 * Add a help command with usage information.    *
 *************************************************/


package com.github.bhallowitz.speedcontrol;

//Importing stuff

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SpeedControl extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	
	//Plugin enabled message
	public void onEnable()
	{
		logger.info("Speed Control v1.0 by bhallowitz has been: ENABLED");
	}
	
	//Plugin disabled message
	public void onDisable()
	{
		logger.info("Speed Control v1.0 by bhallowitz has been: DISABLED");
	}
	
	//The good stuff
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		//Check if the user types the root command for our plugin
		if(commandLabel.equalsIgnoreCase("speed"))
		{
			//Make sure that the user is a player and not the console
			if(!(sender instanceof Player))
			{
				//If it is the console, tell them to GTFO
				sender.sendMessage("This command is only available to players!");
			}
			//Check to make sure that the right number of arguments is given
			else if(args.length == 0 || args.length > 1)
			{
				//If it is the wrong number of arguments, let them know
				sender.sendMessage(ChatColor.RED + "Unkown speed setting. Type /help for correct usage.");
			}
			else
			//See how fast the player wishes to travel and set their speed accordingly
			{
			//Speed 10
			if(args[0].equalsIgnoreCase("10"))
				
			{
				Player player = (Player) sender;
				
				player.setWalkSpeed(1);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 10");
			}
			//Speed 9
			else if(args[0].equalsIgnoreCase("9"))
				
			{
				Player player = (Player) sender;
				
				player.setWalkSpeed((float) 0.9);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 9");
			}
			//speed 8
			else if(args[0].equalsIgnoreCase("8"))
				
			{
				Player player = (Player) sender;
				
				player.setWalkSpeed((float) 0.8);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 8");
			}
			//Speed 7
			else if(args[0].equalsIgnoreCase("7"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.7);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 7");
			}
			//Speed 6
			else if(args[0].equalsIgnoreCase("6"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.6);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 6");
			}
			//Speed 5
			else if(args[0].equalsIgnoreCase("5"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.5);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 5");
			}
			//Speed 4
			else if(args[0].equalsIgnoreCase("4"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.4);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 4");
			}
			//Speed 3
			else if(args[0].equalsIgnoreCase("3"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.3);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 3");
			}
			//Speed 2
			else if(args[0].equalsIgnoreCase("2"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.2);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 2");
			}
			//Speed 1
			else if(args[0].equalsIgnoreCase("1"))
	
			{
				Player player = (Player) sender;
	
				player.setWalkSpeed((float) 0.1);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to 1");
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "Unkown speed setting. Type /speed help for correct usage.");
			}
			
			}

		return true;
		}
		
	return false;
	}
	
}
