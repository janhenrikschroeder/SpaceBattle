package model.game;

public class Settings {
	private int fieldLenght;
	private int fieldHeight;
	private int playerCount;
	private int minePercentage;
	private int screenX;
	private int screenY;
	
	public Settings(){
		fieldLenght = DefaultSettings.FIELDLENGHT;
		fieldHeight = DefaultSettings.FIELDHEIGHT;
		playerCount = DefaultSettings.PLAYERCOUNT;
		minePercentage = DefaultSettings.MINEPERCENTAGE;
		screenX = DefaultSettings.dimX;
		screenY = DefaultSettings.dimY;
	}
	
	public Settings(int lenght, int height, int playerCount, int minePercentage, int screenX, int screenY){
		this.fieldLenght =lenght;
		this.fieldHeight = height;
		this.playerCount = playerCount;
		this.minePercentage = minePercentage;
		this.screenX=screenX;
		this.screenY=screenY;
	}
	
	
	
	public int getScreenX() {
		return screenX;
	}

	public void setScreenX(int screenX) {
		this.screenX = screenX;
	}

	public int getScreenY() {
		return screenY;
	}

	public void setScreenY(int screenY) {
		this.screenY = screenY;
	}

	public int getMinePercentage() {
		return minePercentage;
	}
	public void setMinePercentage(int minePercentage) {
		this.minePercentage = minePercentage;
	}
	public int getFieldLenght() {
		return fieldLenght;
	}
	public void setFieldLenght(int fieldLenght) {
		this.fieldLenght = fieldLenght;
	}
	public int getFieldHeight() {
		return fieldHeight;
	}
	public void setFieldHeight(int fieldHeight) {
		this.fieldHeight = fieldHeight;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	
}
