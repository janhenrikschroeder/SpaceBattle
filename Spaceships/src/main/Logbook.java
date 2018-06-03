package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Logbook {
	private ArrayList<String> log;
	
	public Logbook(){
		log = new ArrayList<String>();
	}
	
	public void addLogEntry(String message){
		log.add(message);
	}

	public void print() {
		try {
			PrintWriter writer = new PrintWriter("log.txt", "UTF-8");
			for(String line:log){
				writer.println(line);
				writer.close();
			}
			System.out.println("created logfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
