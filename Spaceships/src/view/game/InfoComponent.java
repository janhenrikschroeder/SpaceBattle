package view.game;

import javafx.scene.layout.*;
import javafx.scene.text.Text;

public class InfoComponent extends HBox{
	
	private GameView parent;
	private Text debug;
	private int dimX;
	private int dimY;

	public InfoComponent(GameView gameView){
		this.parent=gameView;
		debug = new Text("");
		this.getChildren().add(debug);
		dimX= (int) (parent.getModel().getSettings().getScreenX()*0.2);
		dimY = (int) (parent.getModel().getSettings().getScreenY()*0.8);
		setMaxWidth(dimX);
		setMaxHeight(dimY);
		setMinWidth(dimX);
		setMinHeight(dimY);
	}

	

	public void setParent(GameView parent) {
		this.parent = parent;
	}

	public Text getDebug() {
		return debug;
	}

	public void setDebug(Text debug) {
		this.debug = debug;
	}

	
	
}
