package model.objects.ships;

import model.game.Player;
import model.objects.ObjectType;
import model.objects.SpaceObject;

public class Ship extends Blueprint implements SpaceObject {
	private Player owner;

	@Override
	public ObjectType getType() {
		return ObjectType.Ship;
	}
	
	
}
