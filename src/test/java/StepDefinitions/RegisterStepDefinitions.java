package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterStepDefinitions {
    WebDriver driver;

    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Given("^Enter Url$")
    public void enter_Url() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on Register Link$")
    public void user_click_on_Register_Link() {
        driver.findElement(By.className("ico-register")).click();

    }

    @Then("^User click to select gender Male Or Female$")
    public void user_click_to_select_gender_Male_Or_Female(){
        driver.findElement(By.id("gender-male")).click();

    }

    @When("^User enter firstname and lastname$")
    public void user_enter_firstname_and_lastname() {
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Minesh");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Valand");

    }

    @Then("^User Date of birth$")
    public void user_Date_of_birth(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("21");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("March");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1995");
    }

    @Then("^User enter valid Email$")
    public void user_enter_valid_Email(){
        driver.findElement(By.id("Email")).sendKeys("mpvaland21395@gmail.com");

    }

    @Then("^User enter company Name$")
    public void user_enter_company_Name(){
        driver.findElement(By.id("Company")).sendKeys("unipart");


    }

    @Then("^User unclick newsletter$")
    public void user_unclick_newsletter() {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div/input")).click();
    }

    @Then("^user enter password and confirm password again$")
    public void user_enter_password_and_confirm_password_again(){
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Minesh1222222");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Minesh1222222");

    }

    @Then("^user click to register button$")
    public void user_click_to_register_button() {
        driver.findElement(By.id("register-button")).click();

    }


}
