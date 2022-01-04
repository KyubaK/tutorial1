package tutorial1;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Podaj liczbê: ");
	//	int x=sc.nextInt();
		
		
	//	Thread.sleep(1000);
	//	System.out.println("Teraz podaj liczbê do wymno¿enia poprzedniej");
//		double y = sc.nextDouble();
		
		List<String> listaWynikow = Arrays.asList("kamieñ - 1", "papier - 2", "no¿yce - 3");
			
		String[] wynik = {"wygrana", "remis","przegrana"};
		
		System.out.println("Mo¿esz wybraæ: ");
		for (String t : listaWynikow) {
			
			System.out.println(t);
		}
		
		String wpisz = sc.next();
		int liczba = Integer.parseInt(wpisz);

		if (liczba > 3){
			System.out.println("Podana wartoœæ idioto jest spoza zakresu 1-3");
		}
		else if(liczba == 1){
			System.out.println("Wybra³eœ kamieñ");
		}	 
		else if(liczba == 2) {

			System.out.println("Wybra³eœ papier durniu");
		}
		else {
			System.out.println("Wybra³eœ no¿yce hehehe");
		}

		
		Random c = new Random();
		int computer = c.nextInt(3)+1;
		
		System.out.println("Komputer wybra³: " + computer);
		
		if (computer == liczba) {
			System.out.println(wynik[1]);
		}
		else if (computer == 1 && liczba == 2 ) {
			System.out.println(wynik[0]);
		}
		else if (computer == 2 && liczba == 3) {
			System.out.println(wynik[0]);
		}
		else if (computer == 3 && liczba == 1) {
			System.out.println(wynik[0]);
		}
		else {
			System.out.println(wynik[2]);
		}
		
		
	}

}
