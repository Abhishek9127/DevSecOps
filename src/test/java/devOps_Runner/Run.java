package devOps_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/devOps_features", glue={"devOps_stepdefination", "devOps_Helper"}, tags="@smo")
public class Run {


}
