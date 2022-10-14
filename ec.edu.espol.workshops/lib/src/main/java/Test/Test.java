package Test;

import ec.edu.espol.workshops.CarInsurance;

public class Test {
	public static void main (String [ ] args) {
		System.out.println ("Empezamos la ejecución del programa");
		CarInsurance Prueba = new CarInsurance();
		Prueba.setAge(55);
		Prueba.setGender('M');
		Prueba.setMarried(false);
		System.out.print(Prueba.getBasePremium());
		
	}
	
}
