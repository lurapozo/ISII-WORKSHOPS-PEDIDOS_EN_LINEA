package ec.edu.espol.workshops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

//import java.time.LocalDateTime;
public class StepsDefs {
	//private int actualAnswer;
	private String actualMessage;
	private String MessageTime;
	private int resp;
	private String today;
	private Boolean id;
	private String time;
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
		if(today.equals("december")||today.equals("october")) {
			this.actualMessage="Discount";
		}else {
			this.actualMessage="NO Discount";
		}
	}

	@Then("I give a {string}% discount")
	public void i_give_a_discount(String expectedAnswer) {
		assertEquals(expectedAnswer, actualMessage);
	}
	
	
	//Know if the id is "<valid>"	
	@Given("a customer with invalid id")
	public void a_customer_with_invalid_id() {
	    id=false;
	}
	
	@Given("a_customer_with_id {Boolean}")
	public void a_customer_with_id(Boolean id) {
	    this.id= id;
	}

	@When("I calculate the premium id")
	public void i_calculate_the_premiumid() {
		if(id) {
			this.resp=1;
		}else {
			this.resp=-1;
		}
	}

	@Then("I see if {int}")
	public void i_see_if_valid(int expectedAnswer) {
		assertEquals(expectedAnswer, this.resp);
	}
	
	//Know if the id is "<valid>"	
	@Given(" A customer wants to aply for a second insurance for the second time")
	public void a_customer_apply_second_time() {
	    time="second";
	}
	
	@Given(" A customer wants to aply for a second insurance for the {String} time")
	public void a_customer_apply(String time) {
	    this.time= time;
	}

	@When("I see if the customer has insurance")
	public void i_see_if_insuarance_before() {
		if(time.equals("first")) {
			this.MessageTime= "new customer";
		}else {
			this.MessageTime= "already has insurance";
		}
	}

	@Then("I see if {int}")
	public void i_show_validation(String expectedAnswer) {
		assertEquals(expectedAnswer, this.MessageTime);
	}
}