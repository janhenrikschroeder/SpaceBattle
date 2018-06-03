package model.field.fieldProperties;

import java.util.ArrayList;

import customExceptions.modelExceptions.OutOfPlaygroundException;
import model.field.Field;
import model.objects.ObjectType;
import model.objects.SpaceObject;
import model.objects.ships.Ship;
import model.objects.ships.ShipType;

public class Mine extends FieldProperty{
	
	private final int resourceGain =20;
	private final int range = 1;
	private final int resources =4000;
	
	public Mine(int x, int y, Field parent) {
		super(x, y, parent);
		ID = PropertyIdentifier.MINE;
	}

	
	
	
	
	
	@Override
	public void handleProperty() {
		ArrayList<Field> fields = new ArrayList<Field>();
		try {
			 fields = getFieldsInRange();
		} catch (OutOfPlaygroundException e) {
			e.printStackTrace();
		}
		for (Field field: fields){
			SpaceObject obj = field.getFieldObject();
			if(obj.getObjectType()==ObjectType.Ship){
				Ship ship = (Ship) obj;
				if (ship.getShipType()==ShipType.MININGVESSEL){
					ship.getOwner().addResources(resourceGain);
				}
				if (ship.getShipType()==ShipType.HQ){
					ship.getOwner().addResources(resourceGain/2);
				}
			}
		}
		
		
	}

	private ArrayList<Field> getFieldsInRange() throws OutOfPlaygroundException {
		ArrayList<Field> result = new ArrayList<Field>();
		for(int i = xCoordinate-range; i<=xCoordinate+range; i++){
			for(int j = yCoordinate-range; j<= yCoordinate+range; j++){
				try{
					if(i<0 || j<0){
						throw new OutOfPlaygroundException("trying to get Fields outside of Playground");
					}
					result.add(parent.getParent().getPlayground()[i][j]);
				}catch(OutOfPlaygroundException e){
				}
			}
		}
		return result;
	}
	

}
