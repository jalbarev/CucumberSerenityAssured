package gft.projects.poccucumber.test;


import cucumber.api.java.Before;
import gft.projects.poccucumber.test.state.StateScenario;

import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbstractCucumberTest {

//    @Autowired
//    protected MockMvc mockMvc;

    @LocalServerPort
    protected int port;

    @Autowired
    public StateScenario stateScenario;
}
