package model.game;

import java.util.ArrayList;

import iomanager.ShipLoader;
import model.field.Playground;
import model.objects.SpaceObject;
import model.objects.ships.Blueprint;
import model.objects.ships.Ship;

public class Game {
	private Player[] players;
	private Playground playground;
	private ArrayList<SpaceObject> objects;
	private State state;
	private Settings settings;
	private ArrayList<Blueprint> blueprints;
	
	public Game(Player[] players, Settings settings){
		this.players=players;
		state = new State();
		objects = new ArrayList<SpaceObject>();
		this.settings=settings;
		playground= new Playground(settings);
		blueprints = new ArrayList<Blueprint>();
		blueprints = new ShipLoader().getBlueprints();
		initializePlayers();
	}

	private void initializePlayers() {
		switch(settings.getPlayerCount()){
		case 2: players[0].addResources(20);
		createShip(new Ship(), players[0], 1, 1);
		}
		
	}

	private void createShip(Ship ship, Player player, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	
}
