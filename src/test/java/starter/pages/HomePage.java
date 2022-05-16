package starter.pages;

import net.serenitybdd.core.pages.SerenityActions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;
import static net.serenitybdd.screenplay.actions.Scroll.to;

public class HomePage extends PageObject {

    private By homeHeader(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/div[1]/h3");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    } //defini identifier element yang akan berinteraksi dengan automatenya

    private By orderButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/i");
    }

    private By transactionButton(){
        return By.xpath("//*[@class = 'v-list-item v-list-item--link theme--light'][1]//div[text() = ' Transaksi ']");
    }

    private By product1(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][1]//span[text() = 'Beli']");
    }

    private By product2(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][2]//span[text() = 'Beli']");
    }

    private By product3(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][3]//span[text() = 'Beli']");
    }

    private By product4(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][4]//span[text() = 'Beli']");
    }

    private By product5(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][5]//span[text() = 'Beli']");
    }

    private By product6(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][6]//span[text() = 'Beli']");
    }

    private By product7(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][7]//span[text() = 'Beli']");
    }

    private By product8(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][8]//span[text() = 'Beli']");
    }

    private By product9(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][9]//span[text() = 'Beli']");
    }

    private By product10(){
        return By.xpath("//*[@class = 'col-md-4 col-lg-3 col-6'][10]//span[text() = 'Beli']");
    }

    private By totalNumBuy(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/span/span");
    }

    private By selector(){
        return By.className("v-select__selections");
    }

    private By categoryPositive(){
        return By.xpath("//*[text()[contains(.,'ABC')]]");
    }

    private By categoryNegative(){
        return By.xpath("//*[@class = 'v-list-item v-list-item--link theme--light']//div[text() = 'kesehatan']");
    }

    private By category(){
        return By.xpath("//*[@class = 'v-list-item v-list-item--link theme--light'][2]//div[text() = 'kesehatan']");
    }

    private By cancelCategory(){
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[2]/div");
    }

    private By productNamePositive(){
        return By.className("v-card__title product-title");
    }

    private By productNameNegative(){
        return By.className("v-alert__content");
    }

    @Step
    public void openUrl(){
        open();
    }

    @Step
    public boolean validateOnHomePage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void clickLoginButton(){
        to(loginButton());
        $(loginButton()).click();
    }

    @Step
    public void clickTransactionButton(){
        to(transactionButton());
        $(transactionButton()).click();
    }

    @Step
    public void clickSelector(){
        to(selector());
        $(selector()).click();
    }

    @Step
    public void clickCategoryPositive(){
        SerenityActions actions = new SerenityActions(getDriver());
        actions.moveToElement($(categoryPositive())).perform();
        $(categoryPositive()).click();
    }

    @Step
    public void clickCategoryNegative(){
        SerenityActions actions = new SerenityActions(getDriver());
        actions.moveToElement($(categoryNegative())).perform();
        $(categoryNegative()).click();
    }

    @Step
    public void clickACategory(){
        SerenityActions actions = new SerenityActions(getDriver());
        actions.moveToElement($(category())).perform();
        $(category()).click();
    }

    @Step
    public void clickCancelCategory(){
        Duration waitDuration = Duration.ofSeconds(10);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
        $(cancelCategory()).click();
    }

    @Step
    public void buy(String buy){
        if (buy.equals("one")){
            $(product1()).click();
        }
        if (buy.equals("two")){
            $(product1()).click();
            $(product2()).click();
        }
        if (buy.equals("three")){
            $(product1()).click();
            $(product2()).click();
            $(product3()).click();
        }
    }

    @Step
    public void buyproduct(){
        $(product1()).click();
    }

    @Step
    public void buy10product(){
        $(product1()).click();
        $(product2()).click();
        $(product3()).click();
        $(product4()).click();
        $(product5()).click();
        $(product6()).click();
        $(product7()).click();
        $(product8()).click();
        $(product9()).click();
        $(product10()).click();
    }

    @Step
    public void clickOrder(){
        to(orderButton());
        $(orderButton()).click();
    }

    @Step
    public boolean headerAppears(){
        return $(homeHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(homeHeader()).getText().equals("AltaShop");
    }

    @Step
    public boolean bubbleAppears(){
        return $(totalNumBuy()).isDisplayed();
    }

    @Step
    public boolean bubbleTextEqual(String result){
        return $(totalNumBuy()).getText().equals(result);
    }

    public boolean productFound(){
        return $(productNamePositive()).isDisplayed();
    }

    public boolean productNotFound(){
        return $(productNameNegative()).isDisplayed();
    }
}