package org.astrocraft.epicprank;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompMaterial;
import org.mineacademy.fo.remain.Remain;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class EpicPrankPlugin extends SimplePlugin {
	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {

		/**
		 * Storing Messages
		 */
		String hello = "Hello it's Bob! " + "lol";

		/**
		 * True or False Statment
		 */
		boolean isAlive = true;
		isAlive = false;

		/**
		 * Comparators
		 * == equals (for numbers)
		 * != not equal
		 * > greater than
		 * < less than
		 * >= greater than equal to
		 * <= less than equal to
		 *
		 * Java Conditions
		 * ? if (true)
		 * else if (above condition is false)
		 * : else (false)
		 *
		 * Logical Operators
		 * && and
		 * || or
		 * ! not
		 */
		int comparison = 5;
		int comparison2 = 5;
		boolean comparator = comparison == comparison2;

		if (5 > 3 || comparator && 10 == 10)
			System.out.println("It is true");
		else if (4 >= 5)
			System.out.println("Above was false");
		else
			System.out.println("It is false");

		/**
		 * Loops
		 * Do
		 * While
		 * For ;
		 * For Each :
		 */
		int loop = 10;
		do {
			System.out.println("Looping: " + loop);
		} while (loop++ < 20);

		for (int loop1 = 1; loop1 < 11; loop1++) {
			System.out.println("Looping 1: " + loop1);
		}
		int[] playerIds = new int[]{1, 2, 3, 4};

		for (int playerId : playerIds) {
			System.out.println("ID: " + playerId);
		}
		for (Player player : Remain.getOnlinePlayers()) {
			player.giveExpLevels(100);
		}
		/**
		 * Storing numbers
		 * + Add
		 * - Subtract
		 * * Multiply
		 * / Divide
		 * % Modulus
		 * ++ Increment +1
		 * -- Decrement -1
		 *
		 * Assignment Operators Shortcuts
		 * += Add
		 * -= Subtract
		 * *= Multiply
		 * /= Divide
		 * %= Modulus
		 */
		int firstnumber = 15; //
		firstnumber += 3; //Assignment Operators

		int secondnumber = 10;
		double result = (firstnumber / secondnumber) / 3.5;

		/**
		 * sout (acronym for system out print)
		 */
		System.out.println(++result); //Operators- Increment +1
		System.out.println("First Number " + ++firstnumber);
		System.out.println("Knock, Knock! " + (2 * 12) + " Who's There");
		System.out.println("Knock, Knock! " + (1 + 1) + " Who's There");

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {
		if (event.getRightClicked().getType() == EntityType.COW)
			event.getRightClicked().setGlowing(true);
		if (event.getRightClicked().getType() == EntityType.CHICKEN)
			event.getRightClicked().setGravity(false);
		if (event.getRightClicked().getType() == EntityType.PIG)
			event.getRightClicked().setVisualFire(true);

		if (event.getRightClicked().getType() == EntityType.SHEEP) {
			event.getRightClicked().setVisualFire(true);
			event.getRightClicked().setCustomName("Fireball");
		}
		if (event.getRightClicked().getType() == EntityType.SHEEP && event.getRightClicked().isInWater())
			event.getRightClicked().setVisualFire(false);

		//if (event.getRightClicked().getType() == EntityType.COW)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
		//if (event.getRightClicked().getType() == EntityType.ZOMBIE)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 20);
		//if (event.getRightClicked().getType() == EntityType.PIG)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 10);
		//if (event.getRightClicked().getType() == EntityType.CHICKEN)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
		//if (event.getRightClicked().getType() == EntityType.CREEPER)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
		//if (event.getRightClicked().getType() == EntityType.SKELETON)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
		//if (event.getRightClicked().getType() == EntityType.SHEEP)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
		//if (event.getRightClicked().getType() == EntityType.SPIDER)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 15);
	}

	@EventHandler
	public void onRightClickAnything(PlayerInteractEvent event) {
		System.out.println("We Started Handling Click Event!");

		if (event.getClickedBlock() != null && event.getClickedBlock().getType() == CompMaterial.GRASS_BLOCK.getMaterial()) {
			handleClickingGrass(event.getClickedBlock(), event.getPlayer());
		}
		System.out.println("... and we're done!");
	}

	void handleClickingGrass(Block block, Player player) {
		block.setType(CompMaterial.DIAMOND_BLOCK.getMaterial());
	}
}
