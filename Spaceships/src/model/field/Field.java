package model.field;

import model.field.fieldProperties.FieldProperty;
import model.objects.SpaceObject;

public class Field {
	private FieldProperty fp;
	private SpaceObject fieldObject;
	private Playground parent;
	private int xCoordinate;
	private int yCoordinate;
	
	public Field(int x, int y) {
		this.xCoordinate=x;
		this.yCoordinate=y;
	}
	public Playground getParent() {
		return parent;
	}
	public void setParent(Playground parent) {
		this.parent = parent;
	}
	public FieldProperty getFp() {
		return fp;
	}
	public void setFp(FieldProperty fp) {
		this.fp = fp;
	}
	public SpaceObject getFieldObject() {
		return fieldObject;
	}
	public void setFieldObject(SpaceObject fieldObject) {
		this.fieldObject = fieldObject;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	
}
