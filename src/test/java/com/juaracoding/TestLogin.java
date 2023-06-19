package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;

    static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
    }

    @When("User enter valid username")
    public void user_enter_valid_username(){
        loginPage.enterUsername("Admin");
    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        loginPage.enterPassword("admin123");
    }

    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
    }

    @When("User enter invalid username")
    public void user_enter_invalid_username(){
        loginPage.logout();
        loginPage.enterUsername("Aadmin");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        loginPage.enterPassword("admin1234");
    }

    @Then("User get text invalid credentials")
    public void user_get_text_invalid_credentials(){
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(),"Invalid credentials");
    }
}
