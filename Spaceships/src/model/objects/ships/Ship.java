package model.objects.ships;

import model.game.Player;
import model.objects.ObjectType;
import model.objects.SpaceObject;

public class Ship extends Blueprint implements SpaceObject {
	private Player owner;
	private ShipType shipType;

	@Override
	public ObjectType getObjectType() {
		return ObjectType.Ship;
	}

	public ShipType getShipType() {
		return shipType;
	}

	public Player getOwner() {
		return owner;
	}
	
	
	
	
}
