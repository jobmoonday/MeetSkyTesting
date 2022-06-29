package com.meetSky.step_definitions;

import com.meetSky.pages.Login_page;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    Login_page login_page=new Login_page();

    @Given("user is on the login page")
    public void user_is_on_the_library_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }
    @When("user enters a valid username in the username input box")
    public void user_enters_a_valid_username_in_the_username_input_box() {
        login_page.userPlaceholder.sendKeys("Employee82");
    }
    @When("user enters a valid password in the password box")
    public void user_enters_a_valid_password_in_the_password_box() {
        login_page.passwordPlaceholder.sendKeys("Employee123");

    }
    @Then("user clicks the log in button")
    public void user_clicks_the_log_in_button() {
        login_page.loginButton.click();

    }

}
