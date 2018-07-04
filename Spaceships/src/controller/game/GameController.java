package controller.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.field.Playground;
import model.game.Game;
import model.game.Player;
import model.game.Settings;
import view.game.GameView;

public class GameController implements EventHandler<ActionEvent>{
	
	private GameView view;
	private Game game;
	private Settings settings;
	private Player[] players;
	private Player activePlayer;
	private ButtonController buttonCtr;
	private ClickOnPlaygroundController pgCtr;

	
	public GameController(Player[] players, Settings settings){
		this.players=players;
		this.settings=settings;
		activePlayer= players[0];
		game =new Game(players, settings);
		view=new GameView(game);
		buttonCtr = new ButtonController(view.getButtons());
		pgCtr = new ClickOnPlaygroundController(view.getField(), this);
	}
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void changeChosenField(double x, double y) {
		view.getInfo().getDebug().setText(""+x+" "+y);
		
	}

	public GameView getView() {
		return view;
	}

	public void setView(GameView view) {
		this.view = view;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Settings getSettings() {
		return settings;
	}

	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Player getActivePlayer() {
		return activePlayer;
	}

	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}


}
