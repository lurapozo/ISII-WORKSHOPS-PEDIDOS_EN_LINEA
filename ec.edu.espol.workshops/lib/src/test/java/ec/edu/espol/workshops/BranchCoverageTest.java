import org.junit.Test;

import ec.edu.espol.workshops.CarInsurance;

import static org.junit.Assert.assertEquals;

public class BranchCoverageTest {
   @Test

   public void testAdd() {
	   CarInsurance prueba1 = new CarInsurance();
	   prueba1.setAge(90);
	   prueba1.setGender('M');
	   prueba1.setMarried(false);
	   assertEquals(-1,prueba1.getPremiumCalculator(true));
	   
	   CarInsurance prueba2 = new CarInsurance();
	   prueba2.setAge(20);
	   prueba2.setGender('M');
	   prueba2.setMarried(false);
	   assertEquals(2000,prueba2.getPremiumCalculator(true));
		
		CarInsurance prueba3 = new CarInsurance();
		prueba3.setAge(50);
		prueba3.setGender('F');
		prueba3.setMarried(true);
		assertEquals(200,prueba3.getPremiumCalculator(true));
   }
}