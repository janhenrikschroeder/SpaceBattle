package model.field.fieldProperties;

import model.field.Field;

public class Space extends FieldProperty{

	public Space(int x, int y, Field parent) {
		super(x, y, parent);
		ID = PropertyIdentifier.SPACE;
	}

	@Override
	public void handleProperty() {
		// TODO Auto-generated method stub
		
	}

}
