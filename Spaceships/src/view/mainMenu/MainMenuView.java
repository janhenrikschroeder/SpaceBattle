package view.mainMenu;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenuView extends VBox{
	
	private final Button btnQuit;
	private final Button btnStart;
	private final Button help;
	
	public MainMenuView(){
		
		setAlignment(Pos.CENTER);
		setSpacing(MainMenuViewConstants.SPACING);
		
		btnQuit = new Button("Beenden");
		btnStart=new Button("Spiel starten");
		help = new Button("Anleitung");
		
		getChildren().addAll( btnStart, help, btnQuit);
	}

	public Button getBtnQuit() {
		return btnQuit;
	}

	public Button getBtnStart() {
		return btnStart;
	}

	public Button getHelp() {
		return help;
	}
	
	
	
}
