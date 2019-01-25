package gft.projects.poccucumber.test.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import gft.projects.poccucumber.test.AbstractCucumberTest;
import io.restassured.RestAssured;
import org.springframework.http.HttpStatus;

public class FailedGreetingsSteps extends AbstractCucumberTest {

    @Before
    public void setUp() {
        RestAssured.port = port;
        stateScenario.cleanUp();
    }

    @Then("^the service return not found$")
    public void theServiceReturnsErrorNotFound(){
        stateScenario.getRestassuredResponse().then().statusCode(HttpStatus.NOT_FOUND.value());
    }
}
