package view.game;

import java.util.Observable;
import java.util.Observer;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import model.game.Game;
import javafx.scene.layout.BorderPane;

public class GameView extends BorderPane implements Observer{
	
	private Game model;
	private FieldComponent field;
	private InfoComponent info;
	private ButtonBar buttons;
	private StatusBar status;
	
	public GameView(Game model){
		this.model = model;
		field = new FieldComponent(this, model);
		info = new InfoComponent(this);
		buttons = new ButtonBar(this);
		status = new StatusBar(this);
		this.setCenter(field);
		this.setBottom(buttons);
		this.setLeft(info);
		this.setRight(status);
		buttons.setAlignment(Pos.CENTER);
		info.setAlignment(Pos.CENTER);
		status.setAlignment(Pos.CENTER);
		field.setAlignment(Pos.CENTER);
	}

	@Override
	public void update(Observable obs, Object obj) {
		// TODO Auto-generated method stub
		
	}

	public Game getModel() {
		return model;
	}

	public void setModel(Game model) {
		this.model = model;
	}

	public FieldComponent getField() {
		return field;
	}

	public void setField(FieldComponent field) {
		this.field = field;
	}

	public InfoComponent getInfo() {
		return info;
	}

	public void setInfo(InfoComponent info) {
		this.info = info;
	}

	public ButtonBar getButtons() {
		return buttons;
	}

	public void setButtons(ButtonBar buttons) {
		this.buttons = buttons;
	}

	public StatusBar getStatus() {
		return status;
	}

	public void setStatus(StatusBar status) {
		this.status = status;
	}
	
	
	
}
