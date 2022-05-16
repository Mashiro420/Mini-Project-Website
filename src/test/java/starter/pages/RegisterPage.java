package starter.pages;

import Utils.General;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import static net.serenitybdd.screenplay.actions.Scroll.to;

public class RegisterPage extends PageObject {

    General general = new General();

    private By usernameField(){
        return By.xpath("//*[label[text() = 'Nama Lengkap']]/input");
    }

    private By emailField(){
        return By.xpath("//*[label[text() = 'Email']]/input");
    }

    private By passwordField(){
        return By.xpath("//*[label[text() = 'Password']]/input");
    }

    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputAnEmail(String email){
        if (email.equals("new")){
            $(emailField()).type(general.randomEmail());
        } else {
            $(emailField()).type(email);
        }
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton(){
        to(registerButton());
        $(registerButton()).click();
    }
}