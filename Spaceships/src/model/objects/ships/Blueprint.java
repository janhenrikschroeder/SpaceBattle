package model.objects.ships;

import java.util.ArrayList;

import model.objects.ships.shipProperties.ShipProperty;
import model.objects.ships.shipStats.Hull;
import model.objects.ships.shipStats.Shield;
import model.objects.ships.shipStats.Weapons;

public class Blueprint {
	private Type shipClass;
	private String name;
	private Hull hull;
	private Shield shield;
	private Weapons weapons;
	private ArrayList<ShipProperty> properties;
	private int speed;
	private int maneuverability;
}
