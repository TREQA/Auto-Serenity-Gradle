package utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by dgurau on 08-Feb-18.
 */
public class BasePage extends PageObject {

    public WebDriver driver;

    public BasePage(WebDriver passedDriver){
        this.driver = passedDriver;
    }
}
