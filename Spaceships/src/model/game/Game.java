package model.game;

import java.util.ArrayList;

import model.field.Playground;
import model.objects.SpaceObject;

public class Game {
	private Player[] players;
	private int activePlayer;
	private Playground playground;
	private ArrayList<SpaceObject> objects;
	private State state;
	private Settings settings;
	
	public Game(Player[] players, Settings settings){
		this.players=players;
		this.activePlayer=0;
		state = new State();
		objects = new ArrayList<SpaceObject>();
		this.settings=settings;
		playground= new Playground(settings.getFieldLenght(), settings.getFieldHeight(), settings);
	}
}
