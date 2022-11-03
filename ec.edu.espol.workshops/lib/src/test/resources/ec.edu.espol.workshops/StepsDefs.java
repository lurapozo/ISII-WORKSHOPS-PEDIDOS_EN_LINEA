package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import ec.edu.espol.workshops.CarInsurance;

public class StepsDefs {
	private int actualAnswer;
	private String actualMessage;
	private String today;
	CarInsurance carInsurance = new CarInsurance();
	
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
	
	//Know if the customer have used the service before
	@Given("customer wants another insurance")
	public void citizen_has_insurance() {
		carInsurance.getBasePremium();
	}
	@When("we see if he has insurance")
	public void see_insurance() {
		actualMessage = "already has insurance";
	}
	@Then("we should recive \"already has insurance\"")
	public void we_should_insurance(){
		assertEquals(0, actualAnswer);
	} 
	
	//know if the id is invalid
	@Given("customer gives invalid id")
	public void invalid_id() {
		carInsurance.getPremiumCalculator(false);
	}
	@When("before calculating insurance")
	public void before_calculating() {
		actualAnswer = carInsurance.getPremiumCalculator(false);
	}
	@Then("we should recive \"already has insurance\"")
	public void we_should_recive_insurance(){
		assertEquals("already has insurance", actualAnswer);
	} 
	
	//Discount during December
	@Given("customer wants insurance in December")
	public void customer_december() {
		carInsurance.setMonth("December");
		carInsurance.setAge(22);
		carInsurance.setGender('M');
		carInsurance.setMarried(false);
	}
	@When("calculate insurance")
	public void calculate_insurance() {
		actualAnswer = carInsurance.getBasePremium();
	}
	@Then("we should recive 10% discount")
	public void we_should_give_discount(){
		assertEquals(1800, actualAnswer);
	} 
	
	//Discount during "<month>"
	@Given("customer wants insurance in <month>")
	public void whats_month_is(String month) {
		today=month;
	}
	@When("Given a customer during <month>")
	public void see_actual_month() {
		actualMessage = carInsurance.getMonth();
	}
	@Then("we should recive 10% discount")
	public void we_should_have_same_montht(){
		assertEquals(this.today, actualMessage);
	} 
	
}



