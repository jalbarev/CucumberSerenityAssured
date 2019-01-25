package gft.projects.poccucumber.test.steps;

import cucumber.api.java.After;
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
    }

    @Given("^a customer calling to (\\w+) with no name$")
    public void ProperGreetingUri(String uri){
        //stateScenario.setRequestBuilder(MockMvcRequestBuilders.get("/" + uri).accept( MediaType.APPLICATION_JSON ));
        stateScenario.setRestassuredResponse(when().get("/"+ uri));
    }

    @Given("^a customer calling to (\\w+) with (\\w+)$")
    public void ProperGreetingUri(String uri, String name){
        //stateScenario.setRequestBuilder(MockMvcRequestBuilders.get("/" + uri + "?name=" + name).accept( MediaType.APPLICATION_JSON ));
        stateScenario.setRestassuredResponse(when().get("/"+ uri + "?name" + name));
    }

    @When("^the service is called$")
    public void theNameIsProvided() throws Exception {
        //stateScenario.setCallResult(mockMvc.perform(stateScenario.getRequestBuilder()).andReturn());
        System.out.println("The service is called");
    }

    @Then("^the service return hello (\\w+)$")
    public void theServiceSaysHello(String name) throws JSONException, UnsupportedEncodingException {
        //Assert.assertEquals(HttpStatus.OK.value(), stateScenario.getCallResult().getResponse().getStatus() );
        //JSONObject jsonResult = new JSONObject(stateScenario.getCallResult().getResponse().getContentAsString());
        //Assert.assertEquals("hello "+name, jsonResult.get("content"));
        stateScenario.getRestassuredResponse().then().statusCode(HttpStatus.OK.value());
    }

//    @After
//    public void afterScenario() {
//      stateScenario.cleanUp();
//    }
}