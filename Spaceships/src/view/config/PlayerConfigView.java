package view.config;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class PlayerConfigView extends VBox{
	
	private PlayerComponent p1;
	private PlayerComponent p2;
	private PlayerComponent p3;
	private PlayerComponent p4;
	private Button back;
	private Button forward;
	
	public PlayerConfigView(){
		setAlignment(Pos.CENTER);
		setSpacing(PlayerConfigConstants.GENERALSPACING);
		HBox container = new HBox();
		container.setAlignment(Pos.TOP_CENTER);
		container.setSpacing(PlayerConfigConstants.COMPONENTSPACING);
		p1 = new PlayerComponent(true);
		p2 = new PlayerComponent(true);
		p3 = new PlayerComponent(false);
		p4 = new PlayerComponent(false);
		back = new Button("zurück");
		forward = new Button ("Spiel mit diesen Spielern starten");
		HBox buttonContainer = new HBox();
		buttonContainer.setAlignment(Pos.BOTTOM_CENTER);
		buttonContainer.setSpacing(PlayerConfigConstants.BUTTONSPACING);
		buttonContainer.getChildren().addAll(back, forward);
		container.getChildren().addAll(p1, p2, p3, p4);
		getChildren().addAll(container, buttonContainer);
	}

	public PlayerComponent getP1() {
		return p1;
	}

	public void setP1(PlayerComponent p1) {
		this.p1 = p1;
	}

	public PlayerComponent getP2() {
		return p2;
	}

	public void setP2(PlayerComponent p2) {
		this.p2 = p2;
	}

	public PlayerComponent getP3() {
		return p3;
	}

	public void setP3(PlayerComponent p3) {
		this.p3 = p3;
	}

	public PlayerComponent getP4() {
		return p4;
	}

	public void setP4(PlayerComponent p4) {
		this.p4 = p4;
	}

	public Button getBack() {
		return back;
	}

	public void setBack(Button back) {
		this.back = back;
	}

	public Button getForward() {
		return forward;
	}

	public void setForward(Button forward) {
		this.forward = forward;
	}
	
	
	
}
