package model.objects.ships.shipStats;

public class Hull {
	private int maxHullStrenght;
	private int HullStrenght;
	
	public Hull(int max){
		maxHullStrenght = max;
		HullStrenght = max;
	}

	public int getMaxHullStrenght() {
		return maxHullStrenght;
	}

	public void setMaxHullStrenght(int maxHullStrenght) {
		this.maxHullStrenght = maxHullStrenght;
	}

	public int getHullStrenght() {
		return HullStrenght;
	}

	public void setHullStrenght(int hullStrenght) {
		HullStrenght = hullStrenght;
	}
	
	
}
