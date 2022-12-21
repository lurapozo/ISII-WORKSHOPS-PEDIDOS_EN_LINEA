import org.junit.Test;

import ec.edu.espol.workshops.CarInsurance;

import static org.junit.Assert.assertEquals;

public class PathCoverageTest {
   @Test

   public void testAdd() {
	   CarInsurance prueba = new CarInsurance();
	   prueba.setAge(90);
	   prueba.setGender('M');
	   prueba.setMarried(false);
	   assertEquals(-1,prueba.getPremiumCalculator(true));
	   
	   CarInsurance prueba1 = new CarInsurance();
	   prueba1.setAge(30);
	   prueba1.setGender('M');
	   prueba1.setMarried(false);
	   assertEquals(500,prueba1.getPremiumCalculator(true));
	   
	   CarInsurance prueba2 = new CarInsurance();
	   prueba2.setAge(20);
	   prueba2.setGender('F');
	   prueba2.setMarried(true);
	   assertEquals(300,prueba2.getPremiumCalculator(true));
	   
	   CarInsurance prueba3 = new CarInsurance();
	   prueba3.setAge(50);
	   prueba3.setGender('F');
	   prueba3.setMarried(true);
	   assertEquals(200,prueba3.getPremiumCalculator(true));
	   
	   CarInsurance prueba4 = new CarInsurance();
	   prueba4.setAge(20);
	   prueba4.setGender('M');
	   prueba4.setMarried(false);
	   assertEquals(2000,prueba2.getPremiumCalculator(true));
		
	   CarInsurance prueba5 = new CarInsurance();
	   prueba5.setAge(50);
	   prueba5.setGender('M');
	   prueba5.setMarried(false);
	   assertEquals(200,prueba5.getPremiumCalculator(true));
   }
}