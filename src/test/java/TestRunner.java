import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by dgurau on 08-Feb-18.
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,tags = "@debug"
)
public class TestRunner {

    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

}
