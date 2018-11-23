public class Naloga20{
	public static void main(String[] args){
		int st = 5; //Stevilo in velikost tabele (st * st)
		for(int i = 1; i <= st; i++){
			for(int j = 1; j <=st; j++){
				System.out.print(i*j);
				if(i*(j+1) < 10){ 				//da se lepo poravn, če je nasledje število v vrsti enomesto naredi 2 prsledka
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println(); //nova vrstica
		}
	}
}