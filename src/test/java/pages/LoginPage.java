package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Login page.
 */
public class LoginPage extends Base {

    private final By emailInput = By.id("user[email]");
    private final By passwordInput = By.id("user[password]");
    private final By singInButton = By.xpath("//input[@value='Sign in']");
    private final By errorMessage = By.xpath("//div[@id='notice']");

    /**
     * Constructor of the class.
     */
    public LoginPage() {
        super();
    }

    /**
     * Method to fill the email and password inputs and click on the sing in button.
     *
     * @param email    The email to fill.
     * @param password The password to fill.
     */
    public void login(String email, String password) {
        type(email, emailInput);
        type(password, passwordInput);
        click(singInButton);
    }

    /**
     * Method to get the error message when credentials are wrong.
     *
     * @return The error message.
     */
    public String getSingleErrorMessage() {
        return getText(errorMessage);
    }
}
