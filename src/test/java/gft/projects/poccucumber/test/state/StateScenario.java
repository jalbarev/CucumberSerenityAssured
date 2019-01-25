package gft.projects.poccucumber.test.state;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;

public class StateScenario {

    @Setter
    @Getter
    private Response restassuredResponse;

    public void cleanUp(){
        restassuredResponse = null;
    }
}
