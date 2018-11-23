import java.util.*;
public class Naloga22{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		int min, sek;
		double cas, najhitrejsi = 0;
		do{ //de nei prvi cas bil enak 0, ter da se postavi najslabsi cas za primerjavo
			System.out.println("Vnesi minute prvega cas");
			min = vhod.nextInt();
			System.out.println("Vnesi sekunde prvega cas");
			sek = vhod.nextInt();
			najhitrejsi = min + sek/100.0;
		}while(najhitrejsi == 0);
		do{
			System.out.println("Vnesi minute");
			min = vhod.nextInt();
			System.out.println("Vnesi sekunde");
			sek = vhod.nextInt();
			cas = min + sek/100.0;
			if(cas < najhitrejsi && cas != 0) najhitrejsi = cas;
		}while(min != 0 || sek != 0);
		
		System.out.println("Najhitrejsi cas je bil: " + (int)najhitrejsi + " minut in " + (int)((najhitrejsi-(int)najhitrejsi)*100) + " sekund");
	}
}