package pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;
import utils.Waits;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by dgurau on 08-Feb-18.
 */
@DefaultUrl("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html")
public class DownloadProgressPage extends BasePage{
    public DownloadProgressPage(WebDriver driver) {super(driver);}

    @FindBy(id="downloadButton")
    public WebElement downloadBtn;

    @FindBy(xpath="//DIV[@id='dialog']/..//BUTTON[text()='Close']")
    public WebElement closeDownloadPopupBtn;

    public WebElement getCloseBtn(){
        return Waits.clickable(driver,closeDownloadPopupBtn);
    }
}
