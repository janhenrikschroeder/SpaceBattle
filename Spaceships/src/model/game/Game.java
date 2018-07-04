package model.game;

import java.util.ArrayList;
import java.util.Observable;

import iomanager.ShipLoader;
import model.field.Playground;
import model.objects.SpaceObject;
import model.objects.ships.Blueprint;
import model.objects.ships.Ship;

public class Game extends Observable{
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
		createShip("HQ", players[0], 1, 1);
		}
		
	}

	private void createShip(String shipName, Player player, int i, int j) {
		Blueprint hqBlueprint;
		Ship hq = new Ship();
		for(Blueprint candidate: blueprints){
			if(candidate.getName()==shipName){
				 hq=new Ship(candidate);
			}
		}
		player.getShipList().add(hq);
		objects.add(hq);
		notifyObservers();	
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Playground getPlayground() {
		return playground;
	}

	public void setPlayground(Playground playground) {
		this.playground = playground;
	}

	public ArrayList<SpaceObject> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<SpaceObject> objects) {
		this.objects = objects;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public ArrayList<Blueprint> getBlueprints() {
		return blueprints;
	}

	public void setBlueprints(ArrayList<Blueprint> blueprints) {
		this.blueprints = blueprints;
	}

	
}
