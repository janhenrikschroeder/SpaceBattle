package controller.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.game.ButtonBar;

public class ButtonController implements EventHandler<ActionEvent>{
	
	private ButtonBar view;
	
	public ButtonController(ButtonBar view){
		this.view = view;
		view.getExit().setOnAction(this);
	}

	@Override
	public void handle(ActionEvent e) {
		if(e.getSource() == view.getExit()){
			System.out.println("Exit game");
		}
		
	}
	
	

}
