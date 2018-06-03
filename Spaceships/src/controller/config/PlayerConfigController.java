package controller.config;

import java.util.ArrayList;

import controller.game.GameController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import main.Main;
import model.game.Player;
import model.game.Settings;
import view.config.PlayerConfigView;
import view.config.SettingsView;
import view.game.GameView;

public class PlayerConfigController implements EventHandler<ActionEvent>{
	
	private PlayerConfigView view;
	private Settings settings;
	
	public PlayerConfigController(Settings settings){
		this.settings = settings;
		view = new PlayerConfigView();
		view.getBack().setOnAction(this);
		view.getForward().setOnAction(this);
	}

	@Override
	public void handle(ActionEvent e) {
		if(e.getSource()==view.getBack()){
			Main.switchContent(view, prepareSwitchingToConfig());
		}
		if(e.getSource()==view.getForward()){
			Main.switchContent(view, prepareSwitchingToGame());
		}
		
	}

	private GameView prepareSwitchingToGame() {
		int playerCount =2;
		ArrayList<String> names=new ArrayList<String>();
		names.add(view.getP1().getName().getText());
		names.add(view.getP2().getName().getText());
		if(view.getP3().getEnablePlayer().isSelected()){
			playerCount++;
			names.add(view.getP3().getName().getText());
		}
		if(view.getP4().getEnablePlayer().isSelected()){
			playerCount++;
			names.add(view.getP4().getName().getText());
		}
		settings.setPlayerCount(playerCount);
		Player[] players = new Player[playerCount];
		for(int i = 0; i < playerCount; i++){
			players[i]=new Player(names.get(i), i);
		}
		GameController gameCtr = new GameController(players, settings);
		return gameCtr.getView();
	}

	private SettingsView prepareSwitchingToConfig() {
		SettingsViewController settingsCtr = new SettingsViewController();
		return settingsCtr.getView();
	}

	public PlayerConfigView getView() {
		return view;
	}

	public void setView(PlayerConfigView view) {
		this.view = view;
	}
	
	

}
