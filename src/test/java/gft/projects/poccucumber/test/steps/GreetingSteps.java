package gft.projects.poccucumber.test.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gft.projects.poccucumber.test.AbstractCucumberTest;
import io.restassured.RestAssured;
import org.json.JSONException;
import org.springframework.http.HttpStatus;

import java.io.UnsupportedEncodingException;

import static io.restassured.RestAssured.when;


public class GreetingSteps extends AbstractCucumberTest {


    @Before
    public void setUp() {
        RestAssured.port = port;
        stateScenario.cleanUp();
    }

    @Given("^a customer calling to (\\w+) with no name$")
    public void ProperGreetingUri(String uri){
        stateScenario.setRestassuredResponse(when().get("/"+ uri));
    }

    @Given("^a customer calling to (\\w+) with (\\w+)$")
    public void ProperGreetingUri(String uri, String name){
        stateScenario.setRestassuredResponse(when().get("/"+ uri + "?name" + name));
    }

    @When("^the service is called$")
    public void theNameIsProvided() throws Exception {
        System.out.println("The service is called");
    }

    @Then("^the service return hello (\\w+)$")
    public void theServiceSaysHello(String name) throws JSONException, UnsupportedEncodingException {
        stateScenario.getRestassuredResponse().then().statusCode(HttpStatus.OK.value());
    }
}