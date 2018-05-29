package main;

import java.util.ArrayList;

public class Logbook {
	private ArrayList<String> log;
	
	public Logbook(){
		log = new ArrayList<String>();
	}
	
	public void addLogEntry(String message){
		log.add(message);
	}
}
