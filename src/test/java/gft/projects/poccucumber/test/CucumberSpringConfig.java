package gft.projects.poccucumber.test;

import gft.projects.poccucumber.test.state.StateScenario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CucumberSpringConfig {

    // StateScenario is unique for all the StepClasses, the it must be shared.
    static StateScenario stateScenario;

    @Bean
    public synchronized StateScenario getState(){
        if (stateScenario == null)
            stateScenario = new StateScenario();

        return stateScenario;
    }


}
