package view.game;

import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;

public class ButtonBar extends VBox {
	
	private GameView parentView;
	private Button exit;
	
	public ButtonBar(GameView gameView)  {
		this.parentView=gameView;
		exit = new Button("Verlassen");
		exit.setAlignment(Pos.CENTER);
		this.getChildren().add(exit);
	}

	public GameView getParentView() {
		return parentView;
	}

	public void setParentView(GameView parent) {
		this.parentView = parent;
	}

	public Button getExit() {
		return exit;
	}

	public void setExit(Button exit) {
		this.exit = exit;
	}

	
	
	
}
