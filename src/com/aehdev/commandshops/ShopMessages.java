package com.aehdev.commandshops;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

// TODO: Auto-generated Javadoc
/**
 * The Class ShopMessages.
 */
public class ShopMessages
{

	/** The chat prefix. */
	static String chatPrefix = ChatColor.DARK_AQUA + "[" + ChatColor.WHITE
			+ "Shop" + ChatColor.DARK_AQUA + "] ";

	/** The shop already exists. */
	static String shopAlreadyExists = "$CHATPREFIX $AQUA Could not create shop. $WHITE"
			+ " $SHOPNAME $AQUA already exists.";

	/**
	 * Creates the shop fail name exists.
	 * @param sender
	 * the sender
	 * @param shopName
	 * the shop name
	 */
	static public void createShopFailNameExists(CommandSender sender,
			String shopName)
	{
		String workingString = shopAlreadyExists.replace("$CHATPREFIX",
				chatPrefix);
		workingString = workingString.replace("$SHOPNAME", shopName);
		sender.sendMessage(replaceColors(workingString));
	}

	/**
	 * Replace colors.
	 * @param workingString
	 * the working string
	 * @return the string
	 */
	private static String replaceColors(String workingString)
	{
		String tempString = workingString.replace("$BLACK",
				ChatColor.BLACK.toString());
		tempString = tempString.replace("$NAVY", ChatColor.AQUA.toString());
		tempString = tempString.replace("$BLUE", ChatColor.BLUE.toString());
		tempString = tempString.replace("$DARKAQUA",
				ChatColor.DARK_AQUA.toString());
		tempString = tempString.replace("$DARKBLUE",
				ChatColor.DARK_BLUE.toString());
		tempString = tempString.replace("$DARKGRAY",
				ChatColor.DARK_GRAY.toString());
		tempString = tempString.replace("$DARKGREEN",
				ChatColor.DARK_GREEN.toString());
		tempString = tempString.replace("$DARKPURPLE",
				ChatColor.DARK_PURPLE.toString());
		tempString = tempString.replace("$DARKRED",
				ChatColor.DARK_RED.toString());
		tempString = tempString.replace("$GOLD", ChatColor.GOLD.toString());
		tempString = tempString.replace("$GRAY", ChatColor.GRAY.toString());
		tempString = tempString.replace("$GREEN", ChatColor.GREEN.toString());
		tempString = tempString.replace("$LIGHTPURPLE",
				ChatColor.LIGHT_PURPLE.toString());
		tempString = tempString.replace("$RED", ChatColor.RED.toString());
		tempString = tempString.replace("$WHITE", ChatColor.WHITE.toString());
		tempString = tempString.replace("$YELLOW", ChatColor.YELLOW.toString());

		return tempString;

	}

}
