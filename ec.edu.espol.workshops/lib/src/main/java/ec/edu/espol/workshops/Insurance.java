package ec.edu.espol.workshops;
import java.util.Scanner; 

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Seguro de Autos.");
		CarInsurance seguro = new CarInsurance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la edad:");
		int edad = scanner.nextInt();
		seguro.setAge(edad);
		System.out.println("Ingrese el genero:(M/F)");
		scanner.nextLine();
		String gender = scanner.nextLine();
		if(gender.equals("m") ) {
			seguro.setGender('M');
		}
		else if(gender.equals("M"))  {
			seguro.setGender('M');
		}
		else if(gender.equals("male"))  {
			seguro.setGender('M');
		}
		else if(gender.equals("hombre"))  {
			seguro.setGender('M');
		}
		else if(gender.equals("f") ) {
			seguro.setGender('F');
		}
		else if(gender.equals("F"))  {
			seguro.setGender('F');
		}
		else if(gender.equals("female") ) {
			seguro.setGender('F');
		}
		else if(gender.equals("mujer") ) {
			seguro.setGender('F');
		}
		else {
			seguro.setGender('O');
		}
		
		System.out.println("¿Està casado/a?:(si/no)");
		String casado = scanner.nextLine();
		
		if (casado.equals("si"))  {
			seguro.setMarried(true);
		}
		else if (casado.equals( "sì") ) {
			seguro.setMarried(true);
		}
		else if (casado.equals("no"))  {
			seguro.setMarried(false);
		}
		else {
			seguro.setMarried(false);
		}

		System.out.println("¿Si licencia es vàlida?:(si/no)");
		boolean flag = true;
		String validez = scanner.nextLine();
		if (validez.equals("sì") ) {
			seguro.getPremiumCalculator(true);
		}
		else if (validez.equals("si") ) {
			seguro.getPremiumCalculator(true);
		}
		else if (validez.equals("no") ) {
			seguro.getPremiumCalculator(false);
			flag = false;
		}
		else {
			seguro.getPremiumCalculator(false);
			flag = false;
		}
				
		
		if (!flag) {
			System.out.println("No se le puede otorgar un seguro");
			return;
		}
		System.out.println("El seguro es de:");
		System.out.println(seguro.getBasePremium());
		
	}

}

