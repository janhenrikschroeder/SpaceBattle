package model.objects.ships.shipStats;

public class Shield {
	private int maxShieldStrenght;
	private int ShieldStrenght;
	private int baseRegeneration;
	
	public Shield(int max, int reg){
		this.maxShieldStrenght=max;
		this.ShieldStrenght=max;
		this.baseRegeneration=reg;
	}
}
