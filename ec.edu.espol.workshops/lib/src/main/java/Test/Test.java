package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba = new CarInsurance();
		boolean license;


		
		//TC1
		Prueba.setBasePremium(500);
		Prueba.setAge(29);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC1 esperado: 300   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC2
		Prueba.setBasePremium(500);
		Prueba.setAge(30);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC2 esperado: 250   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC3
		Prueba.setBasePremium(500);
		Prueba.setAge(31);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC3 esperado: 250   obtenido: " + Prueba.premiumCalculator(license));
		//TC4
		Prueba.setBasePremium(500);
		Prueba.setAge(59);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC4 esperado: 150   obtenido: " + Prueba.premiumCalculator(license));
		//TC5
		Prueba.setBasePremium(500);
		Prueba.setAge(60);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC5 esperado: 150   obtenido: " + Prueba.premiumCalculator(license));
		//TC6
		Prueba.setBasePremium(500);
		Prueba.setAge(61);
		Prueba.setGender('M');
		Prueba.setMarried(true);
		license=true;
		System.out.println("Prueba TC6 esperado: 200   obtenido: " + Prueba.premiumCalculator(license));
		//TC7
		Prueba.setBasePremium(500);
		Prueba.setAge(59);
		Prueba.setGender('F');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC7 esperado: 200   obtenido: " + Prueba.premiumCalculator(license));
		//TC8
		Prueba.setBasePremium(500);
		Prueba.setAge(60);
		Prueba.setGender('F');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC8 esperado: 200   obtenido: " + Prueba.premiumCalculator(license));
		//TC9
		Prueba.setBasePremium(500);
		Prueba.setAge(61);
		Prueba.setGender('F');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC9 esperado: 250   obtenido: " + Prueba.premiumCalculator(license));

	}
	
}


