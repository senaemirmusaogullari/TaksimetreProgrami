import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {

		int km;
		double perkm = 2.20, toplam = 10;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz :");
		km = inp.nextInt();

		toplam += (km * perkm);
		
		toplam = (toplam < 20) ? 20 : toplam;
		
		System.out.println("Toplam Tutar :" + toplam);
		
	}

}
