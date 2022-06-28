package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Reset Password page.
 */
public class ResetPasswordPage extends Base {

    private final By message = By.xpath("//article[contains(@class, 'password-reset')]/h1");

    /**
     * Constructor of the class.
     */
    public ResetPasswordPage() {
        super();
    }

    /**
     * Method to get the message when email to reset password is sent.
     *
     * @return The message.
     */
    public String getMessage() {
        return getText(message);
    }

}