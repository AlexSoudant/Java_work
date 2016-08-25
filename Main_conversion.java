package conversion_Celcius;

import java.util.Scanner;

public class Main_conversion {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String redo = " ";
		do{

			sc = new Scanner(System.in);
			int choice = 0;
			while(choice < 1 || choice > 2){		
				System.out.println("Quelle conversion? 1- Celcius -> Fahrenheit ? 2- Fahrenheit -> Celcius ?");
				choice = sc.nextInt();
			}
			System.out.println("Vous avez choisi : " + choice);
		
			float result = -9999;
		
			if(choice == 1){
				System.out.println("Veuillez rentrer la temperature en Celcius a convertir : ");
				float celcius_value = sc.nextFloat();
				result = 9/5 * celcius_value + 32;
			}
		
			else
			{
				System.out.println("Veuillez rentrer la temperature en Fahrenheit a convertir : ");
				float fahr_value = sc.nextFloat();
				result = ((fahr_value - 32) * 5) / 9;
			}		

			System.out.println("Resultat de la conversion : " + result);
			
//			while(redo != "O" || redo != "N"){
//				System.out.println("Voulez vous convertir une autre valeur? (O/N)");
//				redo = sc.nextLine();
//				
//				}
			
			}while(redo == "O");
		
			System.out.println("Au revoir");

		}
	
	public static double arrondi(double A, int B) {

		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);

		}
}
