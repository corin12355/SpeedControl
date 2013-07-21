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
	
	
	//Enable plugin
	public void onEnable()
	{
		logger.info("You are running Speed Control version 1.0 by bhallowitz");
	}
	
	//Disable plugin
	public void onDisable()
	{
		logger.info("Goodbye cruel world!");
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
			else if(!(sender.hasPermission("speedcontrol.use"))) {
				//
				sender.sendMessage(ChatColor.RED + "You do not have the required permissions to preform this command!");
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
				float speed = 0;
				try {
					speed = Float.parseFloat(args[0]);
				}catch(Exception e) {
					return false;
				}
				Player player = (Player) sender;
				
				player.setWalkSpeed(speed/10);
				player.sendMessage(ChatColor.GOLD + "Your walk speed has been set to "+speed);
			}

		return true;
		}
		
	return false;
	}
	
}
