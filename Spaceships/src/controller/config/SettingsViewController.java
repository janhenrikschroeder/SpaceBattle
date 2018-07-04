package controller.config;


import controller.game.GameController;
import controller.mainMenu.MainMenuController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import main.Main;
import model.game.Settings;
import view.config.PlayerConfigView;
import view.config.SettingsView;
import view.game.GameView;
import view.mainMenu.MainMenuView;

public class SettingsViewController implements EventHandler<ActionEvent>{
	private SettingsView view;
	
	public SettingsViewController(){
		view= new SettingsView();
		view.getBack().setOnAction(this);
		view.getStandardConfig().setOnAction(this);
		view.getLoadConfig().setOnAction(this);
		view.getCustomConfig().setOnAction(this);
	}

	public SettingsView getView() {
		return view;
	}

	@Override
	public void handle(ActionEvent e) {
		if(e.getSource()==view.getBack()){
			Main.switchContent(view , prepareSwitchingToMenu());
		}
		if(e.getSource()==view.getCustomConfig()){
		//TODO unimplemented Button	
		} 
		if(e.getSource()==view.getLoadConfig()){
		//TODO unimplemented Button
		}
		if(e.getSource()==view.getStandardConfig()){
			Main.switchContent(view, prepareSwitchingToPlayerConfig());
		}
	}

	private PlayerConfigView prepareSwitchingToPlayerConfig() {
		Settings settings = new Settings();
		PlayerConfigController playerCtr = new PlayerConfigController(settings);
		return playerCtr.getView();
	}

	private MainMenuView prepareSwitchingToMenu() {
		MainMenuController mainCtr = new MainMenuController();
		return mainCtr.getView();
	}
	
	
}
