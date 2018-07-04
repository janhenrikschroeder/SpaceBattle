package view.game;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import model.game.Game;
import javafx.scene.paint.Color;
//import javafx.scene.text.Text;

public class FieldComponent extends StackPane {
	
	private GameView parent;
	private Canvas canvas;
	private Game model;
	private double dimX;
	private double dimY;
	//private Text debug;
	
	public FieldComponent(GameView parent, Game model){
		this.parent= parent;
		this.model = model;
		dimX= model.getSettings().getScreenX()*0.6;
		dimY = model.getSettings().getScreenY()*0.6;
		canvas = new Canvas(dimX, dimY);
		setMaxWidth(dimX);
		setMaxHeight(dimY);
		setMinWidth(dimX);
		setMinHeight(dimY);
		
		drawGrid(canvas.getGraphicsContext2D());
		//debug = new Text("hi");
		getChildren().addAll(canvas);
	}

	private void drawGrid(GraphicsContext gc) {
		gc.clearRect(0, 0, getWidth(), getHeight());
		int x = model.getSettings().getFieldLenght();
		int y = model.getSettings().getFieldHeight();
		int lineSpacingX = (int) (dimX/x);
		int lineSpacingY = (int) (dimY/y);
		
		int cursorPosition = 0;
		gc.setStroke(Color.BLUE);
		for(int i = 0; i<=x; i++){
			cursorPosition = i*lineSpacingX;
			//System.out.println("cursorPosition: "+cursorPosition);
			gc.strokeLine(cursorPosition, 0, cursorPosition, dimY);
			
		}
		cursorPosition =0;
		for(int i = 0; i<=y; i++){
			cursorPosition = i*lineSpacingY;
			gc.strokeLine(0, cursorPosition, dimX, cursorPosition);
			
		}
		
	}
	
	public void selectField(int i, int j) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		drawGrid(gc);
		int x =model.getSettings().getFieldHeight();
		int y = model.getSettings().getFieldLenght();
		x= (int) (dimX/x);
		y =(int) (dimY/y);
		gc.fillRect(i*x +1, j*y +1, x-2, y-2);
	}


	public void setParent(GameView parent) {
		this.parent = parent;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Game getModel() {
		return model;
	}

	public void setModel(Game model) {
		this.model = model;
	}

	public double getDimX() {
		return dimX;
	}

	public void setDimX(double dimX) {
		this.dimX = dimX;
	}

	public double getDimY() {
		return dimY;
	}

	public void setDimY(double dimY) {
		this.dimY = dimY;
	}

	
	
	
	
	
}
