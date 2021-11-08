package com.pie.grcelm.tCSF.stepDefs;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableSteps {
	
	@Given("^I want to write a step with (.*)$")
	public void i_want_to_write_a_step_with_name2(String param) {
	    System.out.println(param);
	}
	@When("^I check for the (.*) in step$")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println(int1);
	}
	@Then("^I verify the (.*) in step$")
	public void i_verify_the_fail_in_step(String test) {
	    System.out.println(test);
	}
	
	@Given("^I have to navigate using data table$")
	public void dataTest(DataTable table) {
		List<List<String>> list = table.getTableConverter().toLists(table, String.class);
		for(List<String> cred : list) {
			cred.get(0);
			cred.get(1);
		}
		
	}

}
