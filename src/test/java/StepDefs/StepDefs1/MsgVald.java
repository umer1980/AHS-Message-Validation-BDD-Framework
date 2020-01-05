package StepDefs.StepDefs1;

import Drivers.driver;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MsgVald extends Drivers.driver {

    @When("^admin enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void admin_enters_the_and(String username, String password)  {
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(username);
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(password);
        driver.findElement(By.className("chic-button")).sendKeys(Keys.ENTER);

    }

//    @Then("^admin should get not be able to logn$")
//    public void admin_should_get_not_be_able_to_logn()  {
//        String text = "invalid user name";
//        Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/div[1]")).getText(),text);
//
//
//    }


    @Then("^admin should get the error message \"([^\"]*)\"$")
    public void adminShouldGetTheErrorMessage(String message)  {
        Assert.assertEquals(driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/div[1]")).getText(),message);

    }
   @After
    public void close(Scenario scenario){
       if(scenario.isFailed()){
           scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"image/png");

       }
        driver.close();
        driver.quit();
   }




}
