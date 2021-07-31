import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest {

    WebDriver driver;
    String baseUrl = "https://app.bluealert.pl/ba/form/formularz-testowy";

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void shouldFillFormCorrectly() {
        FirstStepFormPage firstStepFormPage = new FirstStepFormPage(driver);
        firstStepFormPage.nameInput().sendKeys("Tester");
        firstStepFormPage.surnameInput().sendKeys("Oprogramowania");
        firstStepFormPage.emailInput().sendKeys("testowy_mail@op.pl");
        firstStepFormPage.phoneInput().sendKeys("123456789");
        firstStepFormPage.identificationNumberInput().sendKeys("81012768539");
        firstStepFormPage.documentIdInput().sendKeys("ORY659719");
        firstStepFormPage.birthDateInput().sendKeys("1990-05-05");
        firstStepFormPage.formWindow().click();
        firstStepFormPage.nextButton().click();

        SecondStepFormPage secondStepFormPage = new SecondStepFormPage(driver);
        Assert.assertTrue(secondStepFormPage.firstAgreementInput().isDisplayed());
    }

    @AfterTest
    public void close() {
        driver.close();
    }

}
