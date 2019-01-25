package gft.projects.poccucumber.test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"})
@ContextConfiguration(classes = CucumberSpringConfig.class)
public class RunCucumberTest {
}
