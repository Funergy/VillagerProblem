/*******************************************************************
 * Copyright (c) 2014 Soulpoint Company
 * THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS 
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR 
 * DISTRIBUTION OF THE PROGRAM CONSTITUTES RECIPIENT’S ACCEPTANCE
 * OF THIS AGREEMENT. The full license is available at:
 * http://www.eclipse.org/org/documents/epl-v10.php
 ******************************************************************/
package com.funergy.bedwars.categorychooser;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.funergy.bedwars.shop.Armor;
import com.funergy.bedwars.shop.Blocks;
import com.funergy.bedwars.shop.Bows;
import com.funergy.bedwars.shop.Chest;
import com.funergy.bedwars.shop.Food;
import com.funergy.bedwars.shop.Pickaxe;
import com.funergy.bedwars.shop.Potions;
import com.funergy.bedwars.shop.Special;
import com.funergy.bedwars.shop.Weapons;
import com.funergy.bedwars.utils.SimpleItemStack;

/**
 * @author Funergy
 *
 */
public class ShopCategories implements Listener {
	public static void showShop(Player p){
		Inventory inv = Bukkit.createInventory(null, 9,"ShopCategories");
		
		ItemStack blocks = SimpleItemStack.itemStack(Material.SANDSTONE, 1, ChatColor.GOLD+"BuildingBlocks", "Click to view category"); 
		ItemStack armor  = SimpleItemStack.itemStack(Material.LEATHER_CHESTPLATE, 1, ChatColor.GOLD+"Armor", "Click to view category"); 
		ItemStack bows = SimpleItemStack.itemStack(Material.BOW, 1, ChatColor.GOLD+"Bows", "Click to view category"); 
		ItemStack chest = SimpleItemStack.itemStack(Material.CHEST, 1, ChatColor.GOLD+"Chests", "Click to view category"); 
		ItemStack food = SimpleItemStack.itemStack(Material.APPLE, 1, ChatColor.GOLD+"Apple", "Click to view category"); 
		ItemStack pickaxe = SimpleItemStack.itemStack(Material.WOOD_PICKAXE, 1, ChatColor.GOLD+"Pickaxes", "Click to view category"); 
		ItemStack potions = SimpleItemStack.itemStack(Material.POTION, 1, ChatColor.GOLD+"Potions", "Click to view category");
		ItemStack special = SimpleItemStack.itemStack(Material.FLINT_AND_STEEL, 1, ChatColor.RED+"Specials", "Click to view category"); 
		ItemStack weapons = SimpleItemStack.itemStack(Material.GOLD_SWORD, 1, ChatColor.GOLD+"Combat Weapons", "Click to view category"); 

		inv.setItem(0,blocks);
		inv.setItem(1,bows);
		inv.setItem(2,chest);
		inv.setItem(3,food);
		inv.setItem(4,pickaxe);
		inv.setItem(5,potions);
		inv.setItem(6,special);
		inv.setItem(7,weapons);
		inv.setItem(8,armor);
		
		p.openInventory(inv);

	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e){
		if(e.getInventory().getTitle().equalsIgnoreCase("ShopCategories")){
			Player p = (Player) e.getWhoClicked();
			if(e.getCurrentItem().getType() == Material.SANDSTONE){
				Blocks.open(p);
			}
			if(e.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE){
				Armor.open(p);
			}
			if(e.getCurrentItem().getType() == Material.BOW){
				Bows.open(p);
			}
			if(e.getCurrentItem().getType() == Material.CHEST){
				Chest.open(p);
			}
			if(e.getCurrentItem().getType() == Material.APPLE){
				Food.open(p);
			}
			if(e.getCurrentItem().getType() == Material.WOOD_PICKAXE){
				Pickaxe.open(p);
			}
			if(e.getCurrentItem().getType() == Material.POTION){
				Potions.open(p);
			}
			if(e.getCurrentItem().getType() == Material.FLINT_AND_STEEL){
				Special.open(p);
			}
			if(e.getCurrentItem().getType() == Material.GOLD_SWORD){
				Weapons.open(p);
			}
			e.setCancelled(true);
		}
	}

}
