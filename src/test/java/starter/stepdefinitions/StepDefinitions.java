package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.*;

public class StepDefinitions {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;

    @Steps
    OrderPage orderPage;

    @Steps
    TransactionsPage transactionsPage;

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.openUrl();
        homePage.validateOnHomePage();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        homePage.clickLoginButton();
    }

    @When("I input {string} email")
    public void iInputEmail(String email) {
        loginPage.inputEmail(email);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        registerPage.inputPassword(password);
    }

    @And("I click again login button")
    public void iClickAgainLoginButton() {
        loginPage.clickAgainLoginButton();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("home page")) {
            homePage.headerAppears();
            homePage.headerTextEqual();
        } else if (result.equals("login page")) {
            loginPage.loginHeaderAppears();
            loginPage.loginHeaderTextEqual();
        } else {
            loginPage.errorMessageAppears();
            loginPage.errorMessageEquals(result);
        }
    }

    @And("I click linked text register")
    public void iClickLinkedTextRegister() {
        loginPage.clickLinkedTextRegister();
    }

    @When("I input {string} username")
    public void iInputUsername(String username) {
        registerPage.inputUsername(username);
    }

    @And("I input an {string} email")
    public void iInputAnEmail(String email) {
        registerPage.inputAnEmail(email);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @When("I click {string}")
    public void iClick(String buy) {
        homePage.buy(buy);
    }

    @Then("I get bubble icon {string}")
    public void iGetBubbleIcon(String result) {
        switch (result) {
            case "1":
                homePage.bubbleAppears();
                homePage.bubbleTextEqual(String.valueOf(1));
                break;
            case "2":
                homePage.bubbleAppears();
                homePage.bubbleTextEqual(String.valueOf(2));
                break;
            case "3":
                homePage.bubbleAppears();
                homePage.bubbleTextEqual(String.valueOf(3));
                break;
        }
    }

    @When("I click category")
    public void iClickCategory() {
        homePage.clickSelector();
    }

    @And("I click category positive")
    public void iClickCategoryPositive() {
        homePage.clickCategoryPositive();
    }

    @And("I click Kesehatan")
    public void iClickKesehatan() {
        homePage.clickCategoryNegative();
    }

    @And("I click a category from the list")
    public void iClickACategoryFromTheList() {
        homePage.clickACategory();
    }

    @Then("I cancel selecting a category")
    public void iCancelSelectingACategory() {
        homePage.clickCancelCategory();
    }

    @Then("I get Tensi Darah Elektrik")
    public void iGetTensiDarahElektrik() {
        homePage.productFound();
    }

    @Then("I get product not found")
    public void iGetProductNotFound() {
        homePage.productNotFound();
    }

    @And("I input valid data")
    public void iInputValidData() {
        loginPage.inputValidData();
    }

    @When("I click buy product")
    public void iClickBuyProduct() {
        homePage.buyproduct();
    }

    @When("I click buy 10 product")
    public void iClickBuy10Product() {
        homePage.buy10product();
    }

    @And("I click order")
    public void iClickOrder() {
        homePage.clickOrder();
    }

    @Then("I click paid")
    public void iClickPaid() {
        orderPage.clickPaid();
    }

    @And("I check the result")
    public void iCheckTheResult() {
        transactionsPage.headerAppears();
        transactionsPage.headerTextEqual();
    }

    @And("I click minus button")
    public void iClickMinusButton() {
        orderPage.clickMinusButton();
    }

    @Then("I check order result")
    public void iCheckOrderResult() {
        orderPage.errorMessageAppears();
        orderPage.errorMessageEquals();
    }

    @And("I asked to login")
    public void iAskedToLogin() {
        loginPage.loginHeaderAppears();
        loginPage.loginHeaderTextEqual();
    }

    @And("I check total transaction")
    public void iCheckTotalTransaction() {
        transactionsPage.totalTransactionAppears();
    }

    @And("I click transaction button")
    public void iClickTransactionButton() {
        homePage.clickTransactionButton();
    }

    @Then("I click rows per page button")
    public void iClickRowsPerPageButton() {
        transactionsPage.clickRowsPerPageButton();
    }

    @And("I click number 5 button")
    public void iClickNumberButton() {
        transactionsPage.clickNumsButton();
    }

    @And("I click arrow button right")
    public void iClickArrowButtonRight() {
        transactionsPage.clickArrowButtonRight();
    }

    @And("I click arrow button left")
    public void iClickArrowButtonLeft() {
        transactionsPage.clickArrowButtonLeft();
    }

    @Then("I validate product appreas")
    public void iValidateProductAppreas() {
        transactionsPage.productsAppears();
    }
}