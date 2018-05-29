package model.field;

import model.field.fieldProperties.*;
import model.game.Settings;

public class Playground {
	
	private Field[][] playground;
	private Settings settings;
	
	public Playground(int pgLenght, int pgHeight, Settings settings) {
		this.playground= new Field[pgLenght][pgHeight];
		this.settings=settings;
		initializeField();
	}

	private void initializeField() {
		int mineCount=settings.getFieldHeight()*settings.getFieldLenght()*(settings.getMinePercentage()/100);
		createStartingMines();
		for(int i =0; i<= settings.getFieldLenght();i++){
			for(int j =0; j<= settings.getFieldHeight(); j++){
				
			}
		}
		
	}

	private void createStartingMines() {
		createMine(0,0);
		createMine(0, settings.getFieldHeight()-1);
		createMine(settings.getFieldLenght(),0);
		createMine(settings.getFieldLenght(), settings.getFieldHeight());
	}

	private void createMine(int x, int y) {
		playground[x][y].setFp(new Mine(x, y));
	}

	public Field[][] getPlayground() {
		return playground;
	}

	public void setPlayground(Field[][] playground) {
		this.playground = playground;
	}

	
	
	
}
