package stepDefinition;

import io.cucumber.java.en.And;

import static pages.LoginPage.*;

public class LoginPageSteps {

    @And("I enter a valid email and click the Devam button")
    public void loginStepsEmail() {
        loginWithValidEmail();
    }

    @And("I enter a valid password and click the Giris Yap button")
    public void loginStepsPw() throws InterruptedException {
        loginWithValidPassword();
    }
}
