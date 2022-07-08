package com.meetSky.step_definitions;

import com.meetSky.pages.Login_page;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {


    Login_page login_page=new Login_page();

    @Given("user is on the login page")
    public void user_is_on_the_library_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }

        @When("user enters a valid {string} in the password box")
    public void user_enters_a_valid_password_in_the_password_box(String password) {
        login_page.passwordPlaceholder.sendKeys("password");

    }
    @Then("user clicks the log in button")
    public void user_clicks_the_log_in_button() {
        login_page.loginButton.click();

    }

    @When("user leaves the username input box blank")
    public void userLeavesTheUsernameInputBoxBlank() {
        login_page.userPlaceholder.sendKeys("");
    }


    @And("user enters an {string} into password input box")
    public void userEntersAnInvalid_PasswordIntoPasswordInputBox(String invalid_password) {
    }

    @When("user enters a valid {string} in the username input box")
    public void userEntersAValidInTheUsernameInputBox(String username) {
    login_page.userPlaceholder.sendKeys(username);
    }

    @And("Wrong username or password message is displayed for invalid credentials")
    public void messageIsDisplayedForInvalidCredentials() {
        String expectedMessage = "Wrong username or password";
        Assert.assertEquals(expectedMessage, login_page.wrongPasswordMsg.getText());
    }

    @Then("Please fill out this field message is displayed if the password or username is empty")
    public void pleaseFillOutThisFieldMessageIsDisplayedIfThePasswordOrUsernameIsEmpty() {
        String blankBoxMessage = login_page.userPlaceholder.getAttribute("validationMessage");
        Assert.assertTrue(blankBoxMessage.equals("Please fill out this field"));
    }

    @And("user sees valid placeholder on username")
    public void userSeesValidPlaceholderOnUsername() {
        Assert.assertTrue(login_page.userPlaceholder.isDisplayed());
    }

    @Then("user sees valid placeholder on password")
    public void userSeesValidPlaceholderOnPassword() {
        Assert.assertTrue(login_page.passwordPlaceholder.isDisplayed());
    }

    @Then("user sees the password in a form of dots by default")
    public void userSeesThePasswordInAFormOfDotsByDefault() {
        Assert.assertTrue(login_page.passwordDots.isDisplayed());
    }

    @And("user clicks eye icon")
    public void userClicksEyeIcon() {
        login_page.revealPassword.click();
    }


    @Then("user sees the {string} explicitly")
    public void userSeesTheExplicitly(String password) {

        Assert.assertEquals(password, login_page.passwordPlaceholder.getText());

    }

    @When("user sees the forgot password link on the page")
    public void userSeesTheForgotPasswordLinkOnThePage() {
        Assert.assertTrue(login_page.resetPasswordLink.isDisplayed());
    }

    @And("user clicks on forgot password link")
    public void userClicksOnForgotPasswordLink() {
        login_page.forgotPasswordLink.click();
    }

    @Then("user sees reset password button on the next page")
    public void userSeesResetPasswordButtonOnTheNextPage() {
        Assert.assertTrue(login_page.resetPasswordLink.isDisplayed());
    }
}
