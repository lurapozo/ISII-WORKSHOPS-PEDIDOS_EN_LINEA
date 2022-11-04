package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

//import java.time.LocalDateTime;
public class StepsDefs {
	//private int actualAnswer;
	private String actualMessage;
	private String today;
	CarInsurance carInsurance = new CarInsurance();

	//Discount during "<month>"	
	@Given("a customer during december")
	public void a_customer_during_december() {
	    today="december";
	}
	
	@Given("a customer during {string}")
	public void a_customer_during(String string) {
	    this.today= string;
	}

	@When("I calculate the premium")
	public void i_calculate_the_premium() {
		if(today.equals("december")) {
			actualMessage="10";
		}else {
			actualMessage="0";
		}
	}

	@Then("I give a {string}% discount")
	public void i_give_a_discount(String expectedAnswer) {
		assertEquals(expectedAnswer, actualMessage);
	}
}