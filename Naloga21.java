import java.util.*; 
public class Naloga21{
	public static void main(String[] args){
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi stevilo");
		int st = vhod.nextInt();
		if(st < 10 || st > 30){
			System.out.println("Stevilo je izven intervala 10 do 30");
		}
		else{
			System.out.println("Stevilo je v intervalu");
		}
		
	}
}