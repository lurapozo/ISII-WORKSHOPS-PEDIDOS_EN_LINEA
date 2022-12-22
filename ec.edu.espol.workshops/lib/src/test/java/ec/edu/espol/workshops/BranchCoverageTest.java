package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BranchCoverageTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPremiumCalculator() {
	   CarInsurance prueba1 = new CarInsurance();
	   prueba1.setAge(90);
	   prueba1.setGender('M');
	   prueba1.setMarried(false);
	   assertEquals(-1,prueba1.getPremiumCalculator(true));
	   
	   CarInsurance prueba11 = new CarInsurance();
	   prueba11.setAge(-1);
	   prueba11.setGender('M');
	   prueba11.setMarried(false);
	   assertEquals(-1,prueba11.getPremiumCalculator(true));
	   
	   CarInsurance prueba12 = new CarInsurance();
	   prueba12.setAge(30);
	   prueba12.setGender('M');
	   prueba12.setMarried(false);
	   assertEquals(-1,prueba12.getPremiumCalculator(false));
	   
	   CarInsurance prueba2 = new CarInsurance();
	   prueba2.setAge(20);
	   prueba2.setGender('M');
	   prueba2.setMarried(false);
	   assertEquals(2000,prueba2.getPremiumCalculator(true));
	   
	   CarInsurance prueba21 = new CarInsurance();
	   prueba21.setAge(28);
	   prueba21.setGender('M');
	   prueba21.setMarried(false);
	   assertEquals(500,prueba21.getPremiumCalculator(true));
		
		CarInsurance prueba3 = new CarInsurance();
		prueba3.setAge(50);
		prueba3.setGender('F');
		prueba3.setMarried(true);
		assertEquals(200,prueba3.getPremiumCalculator(true));
		
		CarInsurance prueba31 = new CarInsurance();
		prueba31.setAge(70);
		prueba31.setGender('M');
		prueba31.setMarried(true);
		assertEquals(300,prueba31.getPremiumCalculator(true));
		
   }
}
