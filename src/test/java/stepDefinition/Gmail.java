package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static stepDefinition.CucumberHooks.driver;

public class Gmail {

    @Given("^A chrome browser$")
    public void a_chrome_browser()  {
        System.out.println("Given a chrome broswe");
    }

    @When("^I access gmail URL$")
    public void i_access_gmail_URL(){
driver.get("https://www.gmail.com");
    }

    @Then("^I see gmail page prompting for username and password$")
    public void i_see_gmail_page_prompting_for_username_and_password()  {
        Assert.assertEquals(true, driver.getTitle().contains("Gmail"));
    }

}
