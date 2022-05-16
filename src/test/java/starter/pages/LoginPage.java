package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.actions.Scroll.to;

public class LoginPage extends PageObject {

    private By emailField(){
        return By.xpath("//*[label[text() = 'Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text() = 'Password']]/input");
    }

    private By loginButtonAgain(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button/span");
    }

    @Step
    public void inputValidData(){
        $(emailField()).type("test1234");
        $(passwordField()).type("test1234");
    }

    private By linkRegister(){
        return By.linkText("Register");
    }

    @Step
    public void clickLinkedTextRegister(){
        to(linkRegister());
        $(linkRegister()).click();
    }

    @Step
    public void clickAgainLoginButton(){
        to(loginButtonAgain());
        $(loginButtonAgain()).click();
    }

    private By loginHeader(){
        return By.className("v-card__title");
    }

    private By errorMessage(){
        return By.className("v-alert__content");
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public boolean loginHeaderAppears(){
        return $(loginHeader()).isDisplayed();
    }

    @Step
    public boolean loginHeaderTextEqual(){
        return $(loginHeader()).getText().equals("Login");
    }

    @Step
    public boolean errorMessageAppears(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean errorMessageEquals(String text){
        return $(errorMessage()).getText().equals(text);
    }
}