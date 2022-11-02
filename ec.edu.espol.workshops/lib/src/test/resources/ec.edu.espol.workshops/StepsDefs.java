package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class StepsDefs {
	private int actualAnswer;
	public CarInsurance carInsurance = new CarInsurance();
	
	@Given("citizen is underage")
	public void citizen_is_underage() {
		carInsurance.setAge(17);
	}
	@When("we calculate the premium")
	public void we_calculate_the_premium() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("we should recive -1")
	public void we_should_recive(){
		assertEquals(0, actualAnswer);
	} 
}



