package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.actions.Scroll.to;

public class OrderPage extends PageObject {

    private By paidButton(){
        return By.id("button-bayar");
    }

    private By minusButton(){
        return By.xpath("//*[@class = 'v-list-item theme--light'][1]//span[text() = '-']");
    }

    private By errorMessage(){
        return By.className("v-alert__content");
    }

    @Step
    public void clickPaid(){
        to(paidButton());
        $(paidButton()).click();
    }

    @Step
    public void clickMinusButton(){
        to(minusButton());
        $(minusButton()).click();
    }

    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorMessageEquals(){
        return $(errorMessage()).getText().equals(" Order is empty! ");
    }
}
