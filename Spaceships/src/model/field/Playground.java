package model.field;

import java.util.ArrayList;
import java.util.Iterator;

import customExceptions.modelExceptions.noMineCreationPossibleException;
import model.field.fieldProperties.*;
import model.game.Settings;

public class Playground {
	
	private Field[][] playground;
	private Settings settings;
	
	public Playground(Settings settings) {
		int pgLenght = settings.getFieldLenght();
		int pgHeight = settings.getFieldHeight();
		this.playground= new Field[pgLenght][pgHeight];
		for(int i =0; i<pgLenght;i++){
			for(int j=0; j<pgHeight; j++){
				playground[i][j]=new Field(i, j);
				playground[i][j].setParent(this);
				playground[i][j].setFp(new Space(i, j, playground[i][j]));
			}
		}
		this.settings=settings;
		initializeField();
		printField();
	}

	private void printField() {
		for(Field[] fields: playground){
			System.out.print("[");
			for(Field field : fields){
				if(field.getFp().getID()==PropertyIdentifier.SPACE){
					System.out.print("o");
				}else{
					System.out.print("x");
				}
				System.out.print(", ");
			}
			System.out.println("]");
		}
		System.out.println("");
		System.out.println("");
	}

	private void initializeField() {
		int mineCount=settings.getFieldHeight()*settings.getFieldLenght()*(settings.getMinePercentage()/100);
		createStartingMines();
		mineCount-=4;
		ArrayList<Field> field =new ArrayList<Field>();
		placeRandomMines(field, mineCount);
		
	}

	private void placeRandomMines(ArrayList<Field> fields, int mineCount) {
		for(int i =0; i< settings.getFieldLenght();i++){
			for(int j =0; j< settings.getFieldHeight(); j++){
				fields.add(playground[i][j]);
			}
		}
		//TODO refine code to handle placement rules better
		removeInitialMineFields(fields);
		while(mineCount>0){
			int index = (int) (Math.random()*(fields.size()));
			if(fields.size()!=0){
				Field newMineField= fields.get(index);
				newMineField.setFp(new Mine(newMineField.getxCoordinate(), newMineField.getyCoordinate(), newMineField));
				removeMineField(newMineField.getxCoordinate(), newMineField.getyCoordinate(),fields);	
			} else{
				try {
					throw new noMineCreationPossibleException();
				} catch (noMineCreationPossibleException e) {
					mineCount = 0;
				}
			}
		}
		
	}

	private void removeInitialMineFields(ArrayList<Field> fields) {
		removeMineField(0,  0, fields);
		removeMineField(0,  settings.getFieldHeight()-1, fields);
		removeMineField(settings.getFieldLenght()-1,  0, fields);
		removeMineField(settings.getFieldLenght()-1,  settings.getFieldHeight()-1, fields);
	}
	
	private void removeMineField(int x, int y, ArrayList<Field> fields) {
		Iterator<Field> iter = fields.iterator();
		while(iter.hasNext()){
			Field field = iter.next();
			if ((field.getxCoordinate()>=x-2) && (field.getxCoordinate()<= x+2) && (field.getyCoordinate()>=y-2) && (field.getyCoordinate()<=y+2)){
				iter.remove();
			}
		}
	}

	private void createStartingMines() {
		createMine(0,0);
		createMine(0, settings.getFieldHeight()-1);
		createMine(settings.getFieldLenght()-1,0);
		createMine(settings.getFieldLenght()-1, settings.getFieldHeight()-1);
	}

	private void createMine(int x, int y) {
		playground[x][y].setFp(new Mine(x, y, playground[x][y]));
	}
	
	private void setFieldProperty(int x, int y, FieldProperty property){
		playground[x][y].setFp(property);
	}

	public Field[][] getPlayground() {
		return playground;
	}
}
