package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Forgot Password page.
 */
public class ForgotPasswordPage extends Base {

    private final By emailInput = By.id("user[email]");
    private final By submitButton = By.xpath("//input[@value='Submit']");

    /**
     * Constructor of the class.
     */
    public ForgotPasswordPage() {
        super();
    }

    /**
     * Method that allows to recover the password.
     *
     * @param email The email to be used.
     */
    public void resetPassword(String email) {
        type(email, emailInput);
        click(submitButton);
    }


}