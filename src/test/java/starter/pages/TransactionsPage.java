package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;
import static net.serenitybdd.screenplay.actions.Scroll.to;

public class TransactionsPage extends PageObject {

    private By result(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/h1");
    }

    private By products(){
        return By.xpath("//*[text()[contains(.,'Tensi Darah Elektrik')]]");
    }

    private By totalNumTrans(){
        return By.className("v-data-footer__pagination");
    }

    private By rowsButton(){
        return By.className("v-select__slot");
    }

    private By numsButton(){
        return By.xpath("//*[@class = 'v-list-item__content'][1]//div[text() = '5']");
    }

    private By arrowButtonRight(){
        return By.className("v-data-footer__icons-after");
    }

    private By arrowButtonLeft(){
        return By.className("v-data-footer__icons-before");
    }

    @Step
    public boolean headerAppears(){
        return $(result()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(result()).getText().equals("Transactions");
    }

    @Step
    public boolean totalTransactionAppears(){
        return $(totalNumTrans()).isDisplayed();
    }

    @Step
    public boolean productsAppears(){
        Duration waitDuration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
        return $(products()).isDisplayed();
    }

    @Step
    public void clickRowsPerPageButton(){
        Duration waitDuration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
        $(rowsButton()).click();
    }

    @Step
    public void clickNumsButton(){
        to(numsButton());
        $(numsButton()).click();
    }

    @Step
    public void clickArrowButtonRight(){
        Duration waitDuration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
        $(arrowButtonRight()).click();
    }

    @Step
    public void clickArrowButtonLeft(){
        Duration waitDuration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
        $(arrowButtonLeft()).click();
    }
}
