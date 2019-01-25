package gft.projects.poccucumber.test;


import gft.projects.poccucumber.test.state.StateScenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbstractCucumberTest {

    @LocalServerPort
    protected int port;

    @Autowired
    public StateScenario stateScenario;
}
