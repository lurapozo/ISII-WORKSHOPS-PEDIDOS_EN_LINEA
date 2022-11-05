package ec.edu.espol.workshops;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature"
        ,glue={"stepDefinition"}
        ,dryRun = true
        )
public class Runner {
	StepsDefs stepsDefs = new StepsDefs();
	@Test
	final void testI_calculate_the_premium1() {
		stepsDefs.a_customer_during_december();
		stepsDefs.i_calculate_the_premium();
		stepsDefs.i_give_a_discount("Discount");
	}
	@Test
	final void testI_calculate_the_premium2() {
		stepsDefs.a_customer_during("december");
		stepsDefs.i_calculate_the_premium();
		stepsDefs.i_give_a_discount("Discount");
	}
	@Test
	final void testI_calculate_the_premium3() {
		stepsDefs.a_customer_during("january");
		stepsDefs.i_calculate_the_premium();
		stepsDefs.i_give_a_discount("NO Discount");
	}
	@Test
	final void testI_calculate_the_premium4() {
		stepsDefs.a_customer_during("october");
		stepsDefs.i_calculate_the_premium();
		stepsDefs.i_give_a_discount("Discount");
	}
	
	@Test
	final void testI_see_if_valid1() {
		stepsDefs.a_customer_with_invalid_id();
		stepsDefs.i_calculate_the_premiumid();
		stepsDefs.i_see_if_valid(-1);
	}
	@Test
	final void testI_see_if_valid2() {
		stepsDefs.a_customer_with_id(false);
		stepsDefs.i_calculate_the_premiumid();
		stepsDefs.i_see_if_valid(-1);
	}
	@Test
	final void testI_see_if_valid3() {
		stepsDefs.a_customer_with_id(true);
		stepsDefs.i_calculate_the_premiumid();
		stepsDefs.i_see_if_valid(1);
	}
	
	@Test
	final void testI_show_validation1() {
		stepsDefs.a_customer_apply_second_time();
		stepsDefs.i_see_if_insuarance_before();
		stepsDefs.i_show_validation("already has insurance");
		}
	@Test
	final void testI_show_validation2() {
		stepsDefs.a_customer_apply("first");
		stepsDefs.i_see_if_insuarance_before();
		stepsDefs.i_show_validation("new customer");
	}
	@Test
	final void testI_show_validation3() {
		stepsDefs.a_customer_apply_second_time();
		stepsDefs.a_customer_apply("second");
		stepsDefs.i_see_if_insuarance_before();
		stepsDefs.i_show_validation("already has insurance");
	}
	@Test
	final void testI_show_validation4() {
		stepsDefs.a_customer_apply("third");
		stepsDefs.i_see_if_insuarance_before();
		stepsDefs.i_show_validation("already has insurance");
	}

}