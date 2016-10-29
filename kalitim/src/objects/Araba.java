package objects;

public class Araba extends Arac{

	private String kasaTipi;
	
	public Araba() {
		
		System.out.println("araban�n constu");
	}

	
	public Araba(String kasaTipi,int motorHac,int teker,String vites,String renk ) {
		super(motorHac,teker,vites,renk);
		this.kasaTipi = kasaTipi;
		System.out.println("araban�n parametreli constu");
	}


	public String getKasaTipi() {
		return kasaTipi;
	}

	public void setKasaTipi(String kasaTipi) {
		this.kasaTipi = kasaTipi;
	}
	
}
