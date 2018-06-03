package controller.mainMenu;

import controller.config.SettingsViewController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import main.Main;
import model.game.Game;
import model.game.Player;
import model.game.Settings;
import view.config.SettingsView;
import view.mainMenu.MainMenuView;

public class MainMenuController implements EventHandler<ActionEvent>{
	
	private MainMenuView view = new MainMenuView();

	
	
	public MainMenuController(){
		 
		view.getBtnQuit().setOnAction(this);
		view.getBtnStart().setOnAction(this);
		view.getHelp().setOnAction(this);
	}

	@Override
	public void handle(ActionEvent event) {
		
		if(event.getSource()==view.getBtnQuit()){
			Main.getLog().addLogEntry("System exited by user.");
			Main.getLog().print();
			Platform.exit();
			System.exit(0);
		}
		if(event.getSource()==view.getBtnStart()){
			Main.switchContent(view, prepareSwitchingToConfig());
		}
		
		if(event.getSource()==view.getHelp()){
			//TODO unimplemented Button
		}
		
		
	}

	private SettingsView prepareSwitchingToConfig() {
		SettingsViewController settingsCtr = new SettingsViewController();
		
		return settingsCtr.getView();
	}

	public MainMenuView getView() {
		return view;
	}
	
}
