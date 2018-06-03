package model.game;

public class Settings {
	private int fieldLenght;
	private int fieldHeight;
	private int playerCount;
	private int minePercentage;
	
	
	public Settings(){
		fieldLenght = DefaultSettings.FIELDLENGHT;
		fieldHeight = DefaultSettings.FIELDHEIGHT;
		playerCount = DefaultSettings.PLAYERCOUNT;
		minePercentage = DefaultSettings.MINEPERCENTAGE;
	}
	
	public Settings(int lenght, int height, int playerCount, int minePercentage){
		this.fieldLenght =lenght;
		this.fieldHeight = height;
		this.playerCount = playerCount;
		this.minePercentage = minePercentage;
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
