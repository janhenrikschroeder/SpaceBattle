package model.objects.ships;

import model.game.Player;
import model.objects.ObjectType;
import model.objects.SpaceObject;
import model.objects.ships.shipStats.Hull;

public class Ship extends Blueprint implements SpaceObject {
	private Player owner;
	private ShipType shipType;
	
	public Ship(){
		
	}
	
	public Ship(Blueprint blueprint){
		Ship clone = (Ship) blueprint;
		try {
			clone = (Ship) clone.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.shipType= clone.shipType;
		this.setHull(clone.getHull());
		this.setName(clone.getName());
		this.setShield(clone.getShield());
		this.setWeapons(clone.getWeapons());
		this.setManeuverability(clone.getManeuverability());
		this.setProperties(clone.getProperties());
		this.setProxySpot(clone.getProxySpot());
		this.setRadarSpot(clone.getRadarSpot());
		this.setVisualSpot(clone.getVisualSpot());
		this.setRadarCamo(clone.getRadarCamo());
		this.setVisualCamo(clone.getVisualCamo());
		this.setResourceCost(clone.getResourceCost());
		this.setSpeed(clone.getSpeed());
	}

	@Override
	public ObjectType getObjectType() {
		return ObjectType.SHIP;
	}

	public ShipType getShipType() {
		return shipType;
	}

	public Player getOwner() {
		return owner;
	}
	
	
	
	
}
