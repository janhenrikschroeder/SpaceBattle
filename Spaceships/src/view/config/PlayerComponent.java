package view.config;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class PlayerComponent extends VBox {
	
	private CheckBox enablePlayer;
	private TextField name;
	
	public PlayerComponent(boolean playerOneOrTwo){
		enablePlayer = new CheckBox("aktivieren");
		name = new TextField("fancy name");
		setSpacing(PlayerConfigConstants.PLAYERCONFIGSPACING);
		if(playerOneOrTwo){
			getChildren().add(name);
		}else{
			getChildren().addAll(name, enablePlayer);
		}
	}

	public CheckBox getEnablePlayer() {
		return enablePlayer;
	}

	public void setEnablePlayer(CheckBox enablePlayer) {
		this.enablePlayer = enablePlayer;
	}

	public TextField getName() {
		return name;
	}

	public void setName(TextField name) {
		this.name = name;
	}
	
	

}
