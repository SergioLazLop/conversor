import java.util.Scanner;

public class ConversorJava {

	public static void main(String[] args) {
		while(true) {
			System.out.println("CONVERSOR DE MONEDAS");
			System.out.println("1 - Yenes a dolares\n" 
			+ "2 - Yuanes a dolares\n"
					+ "3 - Pesos Mexicanos a Dolares"
					+ "4 - Salir");
			System.out.print("POR FAVOR INGRESE UNA OPCIÓN: ");
			Scanner leer = new Scanner(System.in);
			char opcion = leer.next().charAt(0);
			
			switch(opcion) {
				case '1':
					convertir(141.14,"Yenes");
					break;
				case '2':
					convertir(7.15,"Yuanes");
					break;
				case '3':
					convertir(16.60,"Pesos");
					break;
				case '4':
					System.out.println("CERRANDO PROGRAMA");
					break;
				default:
					System.out.println("Opción incorrecta.");
					break;
					
			}
		}
	}

	static void convertir(double valorDolar, String pais) {
		Scanner leer = new Scanner(System.in);
		System.out.printf("ingrese la cantidad de %s : ", pais);
		double cantidadMoneda= leer.nextDouble();
		
		double dolares = cantidadMoneda / valorDolar;
		
		dolares = (double) Math.round(dolares * 100d)/ 100;
		
		System.out.println("-----------------------------");
		System.out.println("         Tienes $"+dolares+" Dolares            ");
		System.out.println("-----------------------------");
		
	}
	
	}
