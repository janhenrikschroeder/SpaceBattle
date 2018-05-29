package model.game;

public class Settings {
	private int fieldLenght;
	private int fieldHeight;
	private int playerCount;
	private int minePercentage;
	
	
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
