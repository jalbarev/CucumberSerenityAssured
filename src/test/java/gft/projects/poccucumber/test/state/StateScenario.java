package gft.projects.poccucumber.test.state;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

public class StateScenario {

    @Getter
    @Setter
    private RequestBuilder requestBuilder;

    @Getter
    @Setter
    private MvcResult callResult;

    @Setter
    @Getter
    private Response restassuredResponse;

    public void cleanUp(){
        requestBuilder = null;
        callResult = null;
        restassuredResponse = null;
    }
}
