package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspectorPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"q-app\"]/div/div/main/div/div[1]/div[2]/span")
    private WebElement inspectorTitle;
    /*@FindBy(xpath = "//span[contains(text(),'Запущено процессов')]")
    private WebElement startedProcessBlock;
    @FindBy(xpath = "//span[contains(text(),'Просмотр')]/ancestor::button")
    private WebElement viewButton;
    @FindBy(xpath = "//div[contains(text(),'Проверка')]")
    private WebElement blockExamination;
    @FindBy(xpath = "//div[contains(text(),'Территориальный признак')]")
    private WebElement blockTerritorialSign;
*/


    public boolean inspectorTitleIsDisplayed() {
        inspectorTitle.isDisplayed();
        return true;
    }
 /*   public boolean startedProcessBlockTitleIsDisplayed() {
       startedProcessBlock.isDisplayed();
        return true;
    }
    public boolean viewButtonIsDisplayed() {
        viewButton.isDisplayed();
        return true;
    }
    public void blockExaminationClick() {
        blockExamination.click();
    }
*/
}
