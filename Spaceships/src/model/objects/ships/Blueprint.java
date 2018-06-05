package model.objects.ships;

import java.util.ArrayList;

import model.objects.ships.shipProperties.ShipProperty;
import model.objects.ships.shipStats.Hull;
import model.objects.ships.shipStats.Shield;
import model.objects.ships.shipStats.Armaments;

public class Blueprint {
	private ShipType shipClass;
	private String name;
	private Hull hull;
	private Shield shield;
	private Armaments weapons;
	private ArrayList<ShipProperty> properties;
	private int speed;
	private int maneuverability;
	private int visualSpot;
	private int radarSpot;
	private int proxySpot;
	private int visualCamo;
	private int radarCamo;
	private int resourceCost;
	
	
	public ShipType getShipClass() {
		return shipClass;
	}
	public void setShipClass(ShipType shipClass) {
		this.shipClass = shipClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hull getHull() {
		return hull;
	}
	public void setHull(Hull hull) {
		this.hull = hull;
	}
	public Shield getShield() {
		return shield;
	}
	public void setShield(Shield shield) {
		this.shield = shield;
	}
	public Armaments getWeapons() {
		return weapons;
	}
	public void setWeapons(Armaments weapons) {
		this.weapons = weapons;
	}
	public ArrayList<ShipProperty> getProperties() {
		return properties;
	}
	public void setProperties(ArrayList<ShipProperty> properties) {
		this.properties = properties;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getManeuverability() {
		return maneuverability;
	}
	public void setManeuverability(int maneuverability) {
		this.maneuverability = maneuverability;
	}
	public int getVisualSpot() {
		return visualSpot;
	}
	public void setVisualSpot(int visualSpot) {
		this.visualSpot = visualSpot;
	}
	public int getRadarSpot() {
		return radarSpot;
	}
	public void setRadarSpot(int radarSpot) {
		this.radarSpot = radarSpot;
	}
	public int getProxySpot() {
		return proxySpot;
	}
	public void setProxySpot(int proxySpot) {
		this.proxySpot = proxySpot;
	}
	public int getVisualCamo() {
		return visualCamo;
	}
	public void setVisualCamo(int visualCamo) {
		this.visualCamo = visualCamo;
	}
	public int getRadarCamo() {
		return radarCamo;
	}
	public void setRadarCamo(int radarCamo) {
		this.radarCamo = radarCamo;
	}
	public int getResourceCost() {
		return resourceCost;
	}
	public void setResourceCost(int resourceCost) {
		this.resourceCost = resourceCost;
	}
	
	
}
