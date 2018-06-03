package view.config;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class SettingsView extends StackPane{
	
	private Button loadConfig;
	private Button customConfig;
	private Button back;
	private Button standardConfig;

	public SettingsView(){
		initializeButtons();
		
	}

	private void initializeButtons() {
		VBox container = new VBox();
		loadConfig = new Button("Eigene Einstellung laden");
		customConfig = new Button("Neue Einstellung erstellen");
		back = new Button("zurück");
		standardConfig= new Button("Standardeinstellungen");
		container.getChildren().addAll( standardConfig, loadConfig, customConfig, back);
		container.setAlignment(SettingsViewConstants.ALIGNMENT);
		container.setSpacing(SettingsViewConstants.SPACING);
		getChildren().add(container);
	}

	public Button getLoadConfig() {
		return loadConfig;
	}

	public Button getCustomConfig() {
		return customConfig;
	}

	public Button getBack() {
		return back;
	}

	public Button getStandardConfig() {
		return standardConfig;
	}
	
	
}
