package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba = new CarInsurance();
		boolean license;
		//TC1
		Prueba.setBasePremium(500);
		Prueba.setAge(20);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC1 esperado: 2000   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC2
		Prueba.setBasePremium(500);
		Prueba.setAge(50);
		Prueba.setGender('F');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC2 esperado: 200   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC3
		Prueba.setBasePremium(500);
		Prueba.setAge(50);
		Prueba.setGender('F');
		Prueba.setMarried(true);
		license=false;
		System.out.println("Prueba TC3 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));

		//TC4
		Prueba.setBasePremium(500);
		Prueba.setAge(70);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC4 esperado: 500   obtenido: " + Prueba.premiumCalculator(license));

		//TC5
		Prueba.setBasePremium(500);
		Prueba.setAge(16);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC5 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC6
		Prueba.setBasePremium(500);
		Prueba.setAge(100);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC6 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
	}
	
}
