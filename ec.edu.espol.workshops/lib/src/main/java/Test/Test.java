package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		System.out.println ("Prueba 1");
		CarInsurance Prueba = new CarInsurance();
		Prueba.setAge(90);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		System.out.println(Prueba.getPremiumCalculator(true));
		
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba2 = new CarInsurance();
		Prueba2.setAge(50);
		Prueba2.setGender('F');
		Prueba2.setMarried(true);
		System.out.println(Prueba.getPremiumCalculator(true));
		
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba3 = new CarInsurance();
		Prueba3.setAge(20);
		Prueba3.setGender('M');
		Prueba3.setMarried(false);
		System.out.println(Prueba3.getPremiumCalculator(true));
		
	}
	
}
