package controller.game;
import javafx.event.EventHandler;
import view.game.FieldComponent;
import javafx.scene.input.MouseEvent;

public class ClickOnPlaygroundController implements EventHandler<MouseEvent>{
		
		private FieldComponent view;
		private GameController parent;
		
		public ClickOnPlaygroundController(FieldComponent view, GameController parent){
			this.view = view;
			this.parent=parent;
			view.setOnMousePressed(this);
		}

		

		@Override
		public void handle(MouseEvent e) {
			if(e.isPrimaryButtonDown()){
				int[] coord = getCorrespondingField(e.getX(), e.getY());
				changeChosenField(coord[0], coord[1]);
				view.selectField(coord[0],coord[1]);
			}
			
		}



		private int[] getCorrespondingField(double x, double y) {
			int[] result = new int[2];
			int[] fieldDim = new int[2];
			fieldDim[0]= parent.getSettings().getFieldHeight();
			fieldDim[1]=parent.getSettings().getFieldLenght();
			System.out.println( parent.getSettings().getFieldHeight());
			System.out.println( parent.getSettings().getFieldLenght());
			int i = (int) view.getDimX();
			int j = (int) view.getDimY();
			i = i/fieldDim[0];
			j= j/fieldDim[1];
			result[0]= (int) x/i;
			result[1]= (int) y/j;
			return result;
		}



		private void changeChosenField(int x, int y) {
			parent.changeChosenField(x, y);	
		}
		
		

	
}
