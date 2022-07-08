package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    public Login_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='user']")
    public WebElement userPlaceholder;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordPlaceholder;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMsg;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordDots;

    @FindBy(xpath="//a[@class='toggle-password']")
    public WebElement revealPassword;

    @FindBy(id="lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id="reset-password-submit")
    public WebElement resetPasswordLink;







}
