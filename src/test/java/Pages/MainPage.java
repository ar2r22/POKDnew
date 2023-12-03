package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Инспектор')]/ancestor::button")
    public static WebElement inspectorButton;




    public void inspectorButtonClick(){
        inspectorButton.click();
    }




}
