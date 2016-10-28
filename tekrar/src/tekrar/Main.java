package tekrar;

public class Main {
		public static void main(String[] args) {
			
			Method otobus=new Method();
			otobus.nereden="istanbul";
			otobus.nereye="mugla";
			
			for (int i = 0; i < 50; i++) {
				otobus.yolcuAl();
			}
			
			otobus.bilgiAl();
			
		}
	}
