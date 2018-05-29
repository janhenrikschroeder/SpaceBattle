package customExceptions;

import main.*;

public abstract class CustomException extends Exception{
	public abstract void handle();
	
	protected void addLogEntry(String message){
		Main.getLog().addLogEntry(message);
	}
}
