package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

/**
 * Created by dgurau on 08-Feb-18.
 */
public class SelectDropdownPage extends BasePage{
    public SelectDropdownPage(WebDriver driver){super(driver);}

    @FindBy(xpath="//DIV[text()='Select List Demo']")
    public WebElementFacade simpleSelectElement;
}
