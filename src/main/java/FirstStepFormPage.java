import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstStepFormPage {

    private WebDriver driver;

    private By nameInput = By.id("id_first_name");
    private By surnameInput = By.id("id_last_name");
    private By emailInput = By.id("id_email");
    private By phoneInput = By.id("id_phone");
    private By identificationNumberInput = By.id("id_pesel");
    private By documentIdInput = By.id("id_id_numer");
    private By birthDateInput = By.id("id_date");
    private By formWindow = By.id("fieldgroup_dane");
    private By nextButton = By.id("form_button_next");

    public FirstStepFormPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebElement nameInput() {
        return driver.findElement(nameInput);
    }

    public WebElement surnameInput() {
        return driver.findElement(surnameInput);
    }

    public WebElement emailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement phoneInput() {
        return driver.findElement(phoneInput);
    }

    public WebElement identificationNumberInput() {
        return driver.findElement(identificationNumberInput);
    }

    public WebElement documentIdInput() {
        return driver.findElement(documentIdInput);
    }

    public WebElement birthDateInput() {
        return driver.findElement(birthDateInput);
    }

    public WebElement formWindow() {
        return driver.findElement(formWindow);
    }

    public WebElement nextButton() {
        return driver.findElement(nextButton);
    }


}
