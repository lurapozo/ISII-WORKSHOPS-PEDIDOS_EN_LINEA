package ec.edu.espol.workshops;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
   @Test

   public void testAdd() {
	   //System.out.println ("Prueba 1");
	   CarInsurance Prueba = new CarInsurance();
	   Prueba.setAge(90);
	   Prueba.setGender('M');
	   Prueba.setMarried(false);
	   assertEquals(-1,Prueba.getPremiumCalculator(true));
	   
	   //System.out.println ("Prueba 2");
		CarInsurance Prueba2 = new CarInsurance();
		Prueba2.setAge(50);
		Prueba2.setGender('F');
		Prueba2.setMarried(true);
		assertEquals(200,Prueba2.getPremiumCalculator(true));
		
		//System.out.println ("Prueba 3");
		CarInsurance Prueba3 = new CarInsurance();
		Prueba3.setAge(20);
		Prueba3.setGender('M');
		Prueba3.setMarried(false);
		assertEquals(2000,Prueba3.getPremiumCalculator(true));
		
     /*String str = "Junit is working fine";
     assertEquals("Junit is working fine",str);*/
   }
}