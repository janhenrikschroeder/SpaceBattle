package model.game;

public class Player {
	private int ID;
	private String name;
	private int resources;
	
	public Player(String name, int ID){
		this.name=name;
		this.ID =ID;
		resources = 0;
	}
	
	public void addResources(int resourceGain) {
		resources+= resourceGain;	
	}
}
