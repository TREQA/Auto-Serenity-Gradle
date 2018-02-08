package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.locators.WebElementFacadeImplLocator;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

/**
 * Created by dgurau on 08-Feb-18.
 */

@DefaultUrl("http://www.seleniumeasy.com/test/")
public class DashboardPage extends BasePage{

    public DashboardPage(WebDriver driver){super(driver);}

    @FindBy (id="btn_basic_example")
    public WebElementFacade startPracticeBtn;

    public WebElementFacade category(String category){
        return $("//P[text()='Assuming you have a basic understanding of HTML and CSS.']/..//A[text()='" + category + "']");
    }
}
