package model.objects.ships.shipStats.weapons;

import java.util.ArrayList;

import model.objects.ships.shipStats.weapons.weaponProperties.WeaponProperty;

public class Weapon {
	private int damage;
	private int range;
	private int firingAngle;
	private ArrayList<WeaponProperty> properties;
	private String name;
	private int accuracy;
	private WeaponType type;
	
	public Weapon(){
		properties = new ArrayList<WeaponProperty>();
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getFiringAngle() {
		return firingAngle;
	}
	public void setFiringAngle(int firingAngle) {
		this.firingAngle = firingAngle;
	}
	public ArrayList<WeaponProperty> getProperties() {
		return properties;
	}
	public void setProperties(ArrayList<WeaponProperty> properties) {
		this.properties = properties;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public WeaponType getType() {
		return type;
	}
	public void setType(WeaponType type) {
		this.type = type;
	}
	
	
	
}
