package model.objects.ships.shipStats;

import java.util.ArrayList;

import model.objects.ships.shipStats.weapons.Weapon;

public class Armaments {
	private ArrayList<Weapon> frontGuns;
	private ArrayList<Weapon> rearGuns;
	private ArrayList<Weapon> leftGuns;
	private ArrayList<Weapon> rightGuns;
	
	public Armaments(){
		frontGuns = new ArrayList<Weapon>();
		rearGuns = new ArrayList<Weapon>();
		leftGuns = new ArrayList<Weapon>();
		rightGuns = new ArrayList<Weapon>();
	}
	
	public ArrayList<Weapon> getFrontGuns() {
		return frontGuns;
	}
	public void setFrontGuns(ArrayList<Weapon> frontGuns) {
		this.frontGuns = frontGuns;
	}
	public ArrayList<Weapon> getRearGuns() {
		return rearGuns;
	}
	public void setRearGuns(ArrayList<Weapon> rearGuns) {
		this.rearGuns = rearGuns;
	}
	public ArrayList<Weapon> getLeftGuns() {
		return leftGuns;
	}
	public void setLeftGuns(ArrayList<Weapon> leftGuns) {
		this.leftGuns = leftGuns;
	}
	public ArrayList<Weapon> getRightGuns() {
		return rightGuns;
	}
	public void setRightGuns(ArrayList<Weapon> rightGuns) {
		this.rightGuns = rightGuns;
	}
	
	
}
