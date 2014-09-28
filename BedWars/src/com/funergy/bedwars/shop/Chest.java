/*******************************************************************
 * Copyright (c) 2014 Soulpoint Company
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS 
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR 
 * DISTRIBUTION OF THE PROGRAM CONSTITUTES RECIPIENT’S ACCEPTANCE
 * OF THIS AGREEMENT. The full license is available at:
 * http://www.eclipse.org/org/documents/epl-v10.php
 ******************************************************************/
package com.funergy.bedwars.shop;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.funergy.bedwars.gamemanager.InGameHandler;
import com.funergy.bedwars.shop.nms.Currency;
import com.funergy.bedwars.shop.nms.Item;
import com.funergy.bedwars.shop.nms.Merchant;
import com.funergy.bedwars.shop.nms.MerchantOffer;

/**
 * @author Funergy
 *
 */
public class Chest {
	 public static void open(Player p)
	  {
	    Merchant inv = new Merchant();
	    inv.setTitle("Chests");

	    Item chest = new Item(Material.CHEST, 1);

	    Item enderchest = new Item(Material.ENDER_CHEST, 1);
	    String team = InGameHandler.getTeam(p);
	    if(team.equalsIgnoreCase("blue")){
		    enderchest.setName("TeamChest [Blue]");
	    }
	    if(team.equalsIgnoreCase("red")){
		    enderchest.setName("TeamChest [Red]");
	    }
	    if(team.equalsIgnoreCase("blue")){
		    enderchest.setName("TeamChest [Green]");
	    }
	    if(team.equalsIgnoreCase("yellow")){
		    enderchest.setName("TeamChest [Yellow]");
	    }

	    inv.addOffer(new MerchantOffer(Currency.getIron(p, 1), chest.getItem()));
	    inv.addOffer(new MerchantOffer(Currency.getIron(p, 7), enderchest.getItem()));

	    inv.setCustomer(p);
	    inv.openTrading(p);
	  }

}
