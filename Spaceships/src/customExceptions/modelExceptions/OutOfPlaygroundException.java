package customExceptions.modelExceptions;

import customExceptions.CustomException;
import main.Main;

public class OutOfPlaygroundException extends CustomException{
	private final String stdErrMsg = "Operation auﬂerhalb des Spielfeldes vorgenommen!";
	
	public OutOfPlaygroundException(){
		addLogEntry(stdErrMsg);
	}

	public OutOfPlaygroundException(String message){
		addLogEntry(message);
	}
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		
	}
	
	

}
