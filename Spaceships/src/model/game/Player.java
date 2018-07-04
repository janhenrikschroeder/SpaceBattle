package model.game;

import java.util.ArrayList;
import model.objects.ships.Ship;

public class Player {
	private int ID;
	private String name;
	private int resources;
	private ArrayList<Ship> shipList;
	
	public Player(String name, int ID){
		this.name=name;
		this.ID =ID;
		resources = 0;
		shipList= new ArrayList<Ship>();
	}
	
	public void addResources(int resourceGain) {
		resources+= resourceGain;	
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResources() {
		return resources;
	}

	public void setResources(int resources) {
		this.resources = resources;
	}

	public ArrayList<Ship> getShipList() {
		return shipList;
	}

	public void setShipList(ArrayList<Ship> shipList) {
		this.shipList = shipList;
	}
	
	
}
