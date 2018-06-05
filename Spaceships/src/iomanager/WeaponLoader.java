package iomanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import customExceptions.ioExceptions.ResourceFileCorruptedException;
import main.Main;
import model.objects.ships.shipStats.weapons.Weapon;
import model.objects.ships.shipStats.weapons.WeaponType;

public class WeaponLoader {
	
	public  ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	
	public WeaponLoader(){
		weapons=createWeaponBlueprints();
	}

	private ArrayList<Weapon> createWeaponBlueprints() {
		File folder= new File(IOConst.RESOURCES+"/"+IOConst.WEAPONPATH);
			 for (final File fileEntry : folder.listFiles()) {
				String name = fileEntry.getName();
			    String[] fileName=name.split("\\.");
			    if("."+fileName[1]==IOConst.WEAPONEXTENSION){
			    	try {
			    		load(fileName[0]);
			    	} catch (IOException | ResourceFileCorruptedException e) {
			    		e.printStackTrace();
			    	}
			    }
		}
			 Main.getLog().addLogEntry("Loaded Weapon Files");
			 return weapons;
	}

	private boolean load(String name) throws IOException, ResourceFileCorruptedException{
		if(name == null){
			return false;
		}
		BufferedReader br;
		try {
			String path = IOConst.RESOURCES+"/"+IOConst.WEAPONPATH+"/"+name+IOConst.WEAPONEXTENSION;
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
		if(entries.length != 7){
			br.close();
			throw new ResourceFileCorruptedException(name+IOConst.WEAPONEXTENSION);
		}
		Weapon weapon = new Weapon();
		weapon.setName(entries[0]);
		weapon.setDamage(Integer.valueOf(entries[1]));
		weapon.setFiringAngle(Integer.valueOf(entries[3]));
		weapon.setRange(Integer.valueOf(entries[2]));
		weapon.setAccuracy(Integer.valueOf(entries[4]));
		weapon.setType(WeaponType.valueOf(entries[5]));
		//TODO set properties
		weapons.add(weapon);
		br.close();
		return true;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}
	
	

}
