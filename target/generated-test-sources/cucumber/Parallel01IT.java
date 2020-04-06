import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"F:/imdb/src/test/resources/signin.feature:12"},
        plugin = {"json:F:/imdb/target/cucumber-parallel/1.json", "html:F:/imdb/target/cucumber-parallel/1"},
        monochrome = true,
        glue = {"com.imdb.steps"})
public class Parallel01IT {
}
