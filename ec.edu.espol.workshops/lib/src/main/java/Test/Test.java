package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba = new CarInsurance();
		boolean license;
		//TC1
		Prueba.setBasePremium(500);
		Prueba.setAge(17);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC1 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC2
		Prueba.setBasePremium(500);
		Prueba.setAge(18);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC2 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC3
		Prueba.setBasePremium(500);
		Prueba.setAge(19);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC3 esperado: 2000   obtenido: " + Prueba.premiumCalculator(license));

		//TC4
		Prueba.setBasePremium(500);
		Prueba.setAge(80);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC4 esperado: 500   obtenido: " + Prueba.premiumCalculator(license));

		//TC5
		Prueba.setBasePremium(500);
		Prueba.setAge(79);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC5 esperado: 500   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC6
		Prueba.setBasePremium(500);
		Prueba.setAge(81);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC6 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC7
		Prueba.setBasePremium(0);
		Prueba.setAge(20);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC7 esperado: 1500   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC8
		Prueba.setBasePremium(-1);
		Prueba.setAge(20);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC8 esperado: -1   obtenido: " + Prueba.premiumCalculator(license));
		
		//TC9
		Prueba.setBasePremium(1);
		Prueba.setAge(20);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		license=true;
		System.out.println("Prueba TC9 esperado: 1501   obtenido: " + Prueba.premiumCalculator(license));
	}
	
}
