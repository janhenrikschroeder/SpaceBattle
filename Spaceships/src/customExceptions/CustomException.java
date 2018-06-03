package customExceptions;

import main.*;

public abstract class CustomException extends Exception{
	
	private String stdErrMsg="An Error occurred!";
	
	public CustomException(){
		addLogEntry(stdErrMsg);
	}
	public abstract void handle();
	
	protected void addLogEntry(String message){
		Main.getLog().addLogEntry(message);
	}
}
