package model.field.fieldProperties;

import model.field.Field;

public abstract class FieldProperty {
	protected int xCoordinate;
	protected int yCoordinate;
	protected Field parent;
	protected PropertyIdentifier ID;
	
	public FieldProperty(int x, int y, Field parent){
		this.xCoordinate=x;
		this.yCoordinate=y;
		this.parent=parent;
	}
	
	public abstract void handleProperty();

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Field getParent() {
		return parent;
	}

	public void setParent(Field parent) {
		this.parent = parent;
	}

	public PropertyIdentifier getID() {
		return ID;
	}

	public void setID(PropertyIdentifier iD) {
		ID = iD;
	}
	
	
	
}
