package model.game;

import java.util.ArrayList;

import model.field.Playground;
import model.objects.SpaceObject;

public class Game {
	private Player[] players;
	private Playground playground;
	private ArrayList<SpaceObject> objects;
	private State state;
	private Settings settings;
	
	public Game(Player[] players, Settings settings){
		this.players=players;
		state = new State();
		System.out.println("created states");
		objects = new ArrayList<SpaceObject>();
		this.settings=settings;
		playground= new Playground(settings);
	}
}
