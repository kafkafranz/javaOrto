package tekrar;

public class Method {

	String nereden;
	String nereye;
	boolean aktif;
	int kaydedilenYolcu, kapasite = 40;

	public void yolcuAl() {
		if (!aktif) 
		{
			kaydedilenYolcu++;
			if (kaydedilenYolcu > kapasite) {
				System.out.println("otobus doldu.");
			}

		}
		else 
		{
			System.out.println("otobus garajda");
		}

	}
	
	public void yolcuCikar(){
		
		if(kaydedilenYolcu>0)
			kaydedilenYolcu--;
	}
	
	public void bilgiAl(){
		
		System.out.println("kapasite:"+kapasite);
		System.out.println("kaydedilen yolcu sayisi:"+kaydedilenYolcu);
		System.out.println("nereden:"+nereden);
		System.out.println("nereye:"+nereye);
		if(!aktif)System.out.println("otobus aktif");
		else System.out.println("otobus pasif");
	}

}
