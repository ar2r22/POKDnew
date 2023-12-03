package Tests;

import Pages.InspectorPage;
import Pages.MainPage;
import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class InspectorTests extends BaseTest {
    //MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    //InspectorPage inspectorPage = PageFactory.initElements(driver, InspectorPage.class);
    MainPage mainPage = new MainPage();

    @Test
    public void inspectorPageOpen() throws InterruptedException {
        WebElement аааа = driver.findElement(By.xpath("//div[contains(text(),'Инспектор')]/ancestor::button"));
        аааа.click();
        //mainPage.inspectorButtonClick();
        //assertTrue(inspectorPage.inspectorTitleIsDisplayed());

        //assertTrue(inspectorPage.startedProcessBlockTitleIsDisplayed());
        //assertTrue(inspectorPage.viewButtonIsDisplayed());
    }
   /* @Test
    public void onInspectorPageChoseExamination(){

        mainPage.inspectorButtonClick();
        inspectorPage.blockExaminationClick();
        WebElement fieldChoseExamination = driver.findElement(By.xpath("//*[@id=\"f_10c8bde1-e373-4307-be8f-c9d99771fb18\"]"));
        fieldChoseExamination.click();
        WebElement examination10101 = driver.findElement(By.xpath("//*[@id=\"f_10c8bde1-e373-4307-be8f-c9d99771fb18_0\"]/div[2]/div/span"));
        examination10101.click();
        WebElement examination10101Chosen = driver.findElement(By.xpath("//*[@id=\"2c20fcc3-2ee2-4e6b-b964-48a4e2468da8\"]/div[2]/div[2]/div/div/span/text()"));

        assertTrue(examination10101Chosen.isDisplayed());
    }
    @Test
    public void onInspectorPageDisplayedViewButton(){

        mainPage.inspectorButtonClick();
        assertTrue(inspectorPage.viewButtonIsDisplayed());
    }
*/


}
