package com.aehdev.commandshops.commands;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.aehdev.commandshops.CommandShops;
import com.aehdev.commandshops.PlayerData;
import com.aehdev.commandshops.Shop;

// TODO: Auto-generated Javadoc
/**
 * The Class CommandShopDebug.
 */
public class CommandShopDebug extends Command
{

	/**
	 * Instantiates a new command shop debug.
	 * @param plugin
	 * the plugin
	 * @param commandLabel
	 * the command label
	 * @param sender
	 * the sender
	 * @param command
	 * the command
	 */
	public CommandShopDebug(CommandShops plugin, String commandLabel,
			CommandSender sender, String command)
	{
		super(plugin, commandLabel, sender, command);
	}

	/**
	 * Instantiates a new command shop debug.
	 * @param plugin
	 * the plugin
	 * @param commandLabel
	 * the command label
	 * @param sender
	 * the sender
	 * @param command
	 * the command
	 */
	public CommandShopDebug(CommandShops plugin, String commandLabel,
			CommandSender sender, String[] command)
	{
		super(plugin, commandLabel, sender, command);
	}

	/* (non-Javadoc)
	 * @see com.aehdev.commandshops.commands.Command#process() */
	public boolean process()
	{
		Shop shop = null;
		if(sender instanceof Player)
		{
			Player player = (Player)sender;
			PlayerData pData = plugin.getPlayerData().get(player.getName());

			// info (player only command)
			Pattern pattern = Pattern.compile("(?i)debug$");
			Matcher matcher = pattern.matcher(command);
			if(matcher.find())
			{
				// Get Current Shop
				UUID shopUuid = pData.getCurrentShop();
				if(shopUuid != null)
				{
					shop = plugin.getShopData().getShop(shopUuid);
				}
				if(shop == null)
				{
					sender.sendMessage("You are not in a shop!");
					return false;
				}
			}
		}else
		{
			// ignore?
		}

		// info id
		Pattern pattern = Pattern.compile("(?i)debug\\s+(.*)$");
		Matcher matcher = pattern.matcher(command);
		if(matcher.find())
		{
			String input = matcher.group(1);
			shop = plugin.getShopData().getShop(input);
			if(shop == null)
			{
				sender.sendMessage("Could not find shop with ID " + input);
				return false;
			}
		}

		if(shop != null)
		{
			shop.log();
			if(sender instanceof Player)
			{
				sender.sendMessage("Shop has been logged to console!");
			}
			return true;
		}else
		{
			sender.sendMessage("Could not find shop!");
			return false;
		}
	}

}
