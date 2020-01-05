package StepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsImplementation extends Drivers.driver {


    @Given("^admin is on home page$")

    public void user_is_on_home_page()  {
openbrowser();

    }


    @When("^when admin enters the invalid user name \"([^\"]*)\" and invalid password \"([^\"]*)\"$")
    public void when_admin_enters_the_invalid_credentials(String user, String password) {
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(user);
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(password);
        driver.findElement(By.className("chic-button")).sendKeys(Keys.ENTER);

    }

    @Then("^admin should get the error message$")
    public void admin_should_get_the_error_message()  {
        //String text = "invalid user name";
        Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/div[1]")).getText(),"invalid user name");


    }
//    @Before
//    public void open(){
//        driver = new ChromeDriver();
//
//  }
    @After
    public void teardown (Scenario scenario){

        if(scenario.isFailed()){
           scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"image/png");

        }

        driver.quit();
        driver = null;

    }



}
