import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondStepFormPage {

    private WebDriver driver;

    private By firstAgreementInput = By.id("fieldgroup_zgoda");


    public SecondStepFormPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebElement firstAgreementInput() {
        return driver.findElement(firstAgreementInput);

    }
}