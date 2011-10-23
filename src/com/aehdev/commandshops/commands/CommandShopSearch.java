package com.aehdev.commandshops.commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.aehdev.commandshops.CommandShops;
import com.aehdev.commandshops.ItemInfo;
import com.aehdev.commandshops.Search;

// TODO: Auto-generated Javadoc
/**
 * The Class CommandShopSearch.
 */
public class CommandShopSearch extends Command
{

	/**
	 * Instantiates a new command shop search.
	 * @param plugin
	 * the plugin
	 * @param commandLabel
	 * the command label
	 * @param sender
	 * the sender
	 * @param command
	 * the command
	 */
	public CommandShopSearch(CommandShops plugin, String commandLabel,
			CommandSender sender, String command)
	{
		super(plugin, commandLabel, sender, command);
	}

	/**
	 * Instantiates a new command shop search.
	 * @param plugin
	 * the plugin
	 * @param commandLabel
	 * the command label
	 * @param sender
	 * the sender
	 * @param command
	 * the command
	 */
	public CommandShopSearch(CommandShops plugin, String commandLabel,
			CommandSender sender, String[] command)
	{
		super(plugin, commandLabel, sender, command);
	}

	/* (non-Javadoc)
	 * @see com.aehdev.commandshops.commands.Command#process() */
	public boolean process()
	{
		Pattern pattern = Pattern.compile("(?i)search\\s+(.*)");
		Matcher matcher = pattern.matcher(command);
		if(matcher.find())
		{
			String name = matcher.group(1);
			ItemInfo found = Search.itemByName(name);
			if(found == null)
			{
				sender.sendMessage(String.format(
						"No item was not found matching \"%s\"", name));
			}else
			{
				sender.sendMessage(found.toString());
			}
			return true;
		}

		// Show search stuff
		sender.sendMessage(ChatColor.WHITE + "   /" + commandLabel
				+ " search [item name]" + ChatColor.DARK_AQUA
				+ " - Searches for and displays information about an item.");
		return true;
	}
}