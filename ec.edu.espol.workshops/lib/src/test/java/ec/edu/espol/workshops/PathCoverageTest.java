package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PathCoverageTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPremiumCalculator() {
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
	   assertEquals(2000,prueba4.getPremiumCalculator(true));
		
	   CarInsurance prueba5 = new CarInsurance();
	   prueba5.setAge(50);
	   prueba5.setGender('M');
	   prueba5.setMarried(false);
	   assertEquals(400,prueba5.getPremiumCalculator(true));
   }
}