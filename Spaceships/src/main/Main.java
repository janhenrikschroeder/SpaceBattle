package main;
import controller.mainMenu.MainMenuController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application{

	private static Stage stage;
	
	private static StackPane root;
	
	private static Scene scene;
	
	private static Logbook log;
	
	public static void main(String[] args)  {
		log= new Logbook();
		launch(args);
	}

	
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Main.stage = stage;
		MainMenuController mainCtr =new MainMenuController();
		root = new StackPane(mainCtr.getView());
		
		//TODO set root
		scene = new Scene(root, 800, 640);
		
		this.stage.setScene(scene);
		this.stage.show();
		
	}

	public static void switchContent(Pane p1, Pane p2){
	root.getChildren().remove(p1);
	root.getChildren().add(p2);
	}

	public static Logbook getLog() {
		return log;
	}
	
	public static void resizeScene(int x, int y){
		scene =new Scene(root, x, y);
		stage.setScene(scene);
		stage.show();
	}
	
	
	
}
