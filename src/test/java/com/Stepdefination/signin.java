package com.Stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signin {


WebDriver driver;

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {

        System.out.println(url);



        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();


        driver.get(url);

    }

    @When("^I click on signin button$")
    public void iClickOnSigninButton() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]")).click();   }

    @Given("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String arg0) throws Throwable {
        driver.findElement(By.xpath("/html/body")).sendKeys("email");

    }

    @Given("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String arg0) throws Throwable {

        driver.findElement(By.xpath("/html/body")).sendKeys("password");

    }


    @Then("^I should see my Account$")
    public void iShouldSeeMyAccount() {

    }
}
