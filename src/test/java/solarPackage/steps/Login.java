package solarPackage.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("^I am on the \"([^\"]*)\"$")
    public void i_am_on_the(String url)  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
    }

    @When("^I enter valid username as\"([^\"]*)\"$")
    public void i_enter_valid_username_as(String username)  {
      driver.findElement(By.id("email")).sendKeys(username);
    }

    @When("^I enter valid password as\"([^\"]*)\"$")
    public void i_enter_valid_password_as(String password)  {
driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("^I click on the sign in button$")
    public void i_click_on_the_sign_in_button()  {
driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
driver.manage().window().maximize();
    }

    @Then("^I should be navigated to the Dashboard page successfully$")
    public void i_should_be_navigated_to_the_Dashboard_page_successfully()  {
String actualTitle=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/h1")).getText();
String expectedTitle="Dashboard";
        Assert.assertEquals(actualTitle,expectedTitle);
        //driver.quit();

    }

}
