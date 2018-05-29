package model.field.fieldProperties;

import java.util.ArrayList;

import customExceptions.modelExceptions.OutOfPlaygroundException;
import model.field.Field;
import model.objects.ObjectType;
import model.objects.SpaceObject;
import model.objects.ships.Ship;

public class Mine extends FieldProperty{
	private final int range = 1;
	private int xCoordinate;
	private int yCoordinate;
	private Field parent;
	
	public Mine(int x, int y){
		this.xCoordinate=x;
		this.yCoordinate=y;
	}
	
	@Override
	public void handleProperty() {
		ArrayList<Field> fields = new ArrayList<Field>();
		try {
			 fields = getFieldsInRange();
		} catch (OutOfPlaygroundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Field field: fields){
			SpaceObject obj = field.getFieldObject();
			if(obj.getType()==ObjectType.Ship){
				Ship ship = (Ship) obj;
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
