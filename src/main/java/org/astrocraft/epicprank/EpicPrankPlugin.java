package org.astrocraft.epicprank;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

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
		 * Storing numbers
		 */
		int firstnumber = 15;
		int secondnumber = 10;
		double result = (firstnumber / secondnumber) / 3.5;

		/**
		 * sout (acronym for system out print)
		 */
		System.out.println(result);
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
}
