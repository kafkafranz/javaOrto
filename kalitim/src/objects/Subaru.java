package objects;

public class Subaru extends Araba {
	private String tip;

	public Subaru() {
		
		// arabanin default constu tan�ml� s�k�nt� c�karmad�.default u s�lsem.araba 
		//s�n�f�ndak� consta uygun protot�p� yazcaz.
	}
	
	public Subaru(String tip,String kasaTipi,int motorHac,int teker,String vites,String renk) {
		super(kasaTipi,motorHac,teker,vites,renk);
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	

	
}
