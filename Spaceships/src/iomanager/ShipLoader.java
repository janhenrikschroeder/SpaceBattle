package iomanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import customExceptions.ioExceptions.ResourceFileCorruptedException;
import iomanager.IOConst;
import main.Main;
import model.objects.ships.Blueprint;
import model.objects.ships.ShipType;
import model.objects.ships.shipStats.Hull;
import model.objects.ships.shipStats.Shield;
import model.objects.ships.shipStats.Armaments;
import model.objects.ships.shipStats.weapons.Weapon;

public class ShipLoader {
	
	
	
	public  ArrayList<Blueprint> blueprints = new ArrayList<Blueprint>();
	
	public ShipLoader(){
		blueprints=createBlueprints();
	}
	
	private boolean load(String name) throws IOException, ResourceFileCorruptedException{
		if(name == null){
			return false;
		}
		BufferedReader br;
		try {
			String path = IOConst.RESOURCES+"/"+IOConst.SHIPPATH+"/"+name+IOConst.SHIPEXTENSION;
			System.out.println(path);
			br = new BufferedReader( new FileReader(path));
			
		} catch (FileNotFoundException e) {
			throw new IOException();
		}
		String currentLine;
		try {
			currentLine = br.readLine();
		} catch (IOException e) {
			br.close();
			throw new IOException();
		}
		if(currentLine == null){
			br.close();
			return false;
		}
		currentLine.trim();
		String[] entries = currentLine.split(",");
		if(entries.length != 17){
			br.close();
			throw new ResourceFileCorruptedException(name+IOConst.SHIPEXTENSION);
		}
		Blueprint blueprint = new Blueprint();
		blueprint.setName(entries[0]);
		blueprint.setResourceCost(Integer.valueOf(entries[2]));
		blueprint.setShipClass(ShipType.valueOf(entries[1]));
		blueprint.setHull(new Hull(Integer.valueOf(entries[3])));
		blueprint.setShield(new Shield(Integer.valueOf(entries[4]), Integer.valueOf(entries[5])));
		blueprint.setWeapons(createWeapons(entries));
		blueprint.setSpeed(Integer.valueOf(entries[12]));
		blueprint.setManeuverability(Integer.valueOf(entries[13]));
		String[] spotStrings =purify(entries[14]).split("\\.");
		blueprint.setVisualSpot(Integer.valueOf(spotStrings[0]));
		blueprint.setRadarSpot(Integer.valueOf(spotStrings[1]));
		blueprint.setProxySpot(Integer.valueOf(spotStrings[2]));
		String[] camoStrings = purify(entries[15]).split("\\.");
		blueprint.setVisualCamo(Integer.valueOf(camoStrings[0]));
		blueprint.setRadarCamo(Integer.valueOf(camoStrings[1]));
		//TODO add Properties to ship
		blueprints.add(blueprint);
		br.close();
		return true;
	}
	
	private Armaments createWeapons(String[] entries) {
		Armaments result = new Armaments();
		int frontCount = Integer.valueOf(entries[5]);
		int rearCount = Integer.valueOf(entries[7]);
		int sideCount = Integer.valueOf(entries[9]);
		String[] frontGunsInformation = purify(entries[6]).split("\\.");
		String[] rearGunsInformation = purify(entries[8]).split("\\.");
		String[] sideGunsInformation = purify(entries[10]).split("\\.");
		WeaponLoader wl = new WeaponLoader();
		for(String weaponName : frontGunsInformation){
			for(Weapon weaponCandidate : wl.getWeapons()){
				if(weaponCandidate.getName()== weaponName){
					result.getFrontGuns().add(weaponCandidate);
				}
			}
		}
		for(String weaponName : rearGunsInformation){
			for(Weapon weaponCandidate : wl.getWeapons()){
				if(weaponCandidate.getName()== weaponName){
					result.getRearGuns().add(weaponCandidate);
				}
			}
		}
		for(String weaponName : sideGunsInformation){
			for(Weapon weaponCandidate : wl.getWeapons()){
				if(weaponCandidate.getName()== weaponName){
					result.getLeftGuns().add(weaponCandidate);
					result.getRightGuns().add(weaponCandidate);
				}
			}
		}
		return result;
	}
	
	
	private String purify(String string){
		string = string.replace("[", "");
		string = string.replace("]", "");
		return string;
	}

	public ArrayList<Blueprint> createBlueprints() {
		File folder= new File(IOConst.RESOURCES+"/"+IOConst.SHIPPATH);
		  for (final File fileEntry : folder.listFiles()) {
			  String name = fileEntry.getName();
		      String[] fileName=name.split("\\.");
		      if("."+fileName[1]==IOConst.SHIPEXTENSION){
		    	  try {
		    		  load(fileName[0]);
		    	  } catch (IOException | ResourceFileCorruptedException e) {
		    			e.printStackTrace();
		    	  }
		      }
		  }	
		Main.getLog().addLogEntry("Successfully loaded Blueprints");
		return blueprints;
	}

	public ArrayList<Blueprint> getBlueprints() {
		return blueprints;
	}

	public void setBlueprints(ArrayList<Blueprint> blueprints) {
		this.blueprints = blueprints;
	}
	
	
	

}
