package customExceptions.ioExceptions;

import customExceptions.CustomException;

public class ResourceFileCorruptedException extends CustomException {
	
	public ResourceFileCorruptedException(String fileName){
		addLogEntry(fileName+" does not have the correct format.");
	}

	@Override
	public void handle() {
		
	}

}
