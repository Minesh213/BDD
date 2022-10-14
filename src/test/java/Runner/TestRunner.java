package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\krish\\IdeaProjects\\HomeworkBDDRegister\\src\\test\\resources\\Features\\A_Register.feature",
        glue = {"StepDefinition"},
        dryRun = false


)
public class TestRunner {

}
