import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/blackjackTest.feature"}, glue = {"steps"})
public class TestRunner extends AbstractTestNGCucumberTests {

}