package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Register page.
 */
public class RegisterPage extends Base {
    private final By firstNameInput = By.id("user[first_name]");
    private final By lastNameInput = By.id("user[last_name]");
    private final By emailInput = By.id("user[email]");
    private final By passwordInput = By.id("user[password]");
    private final By userTerms = By.id("user[terms]");
    private final By singUpButton = By.xpath("//input[@value='Sign up']");

    /**
     * Constructor of the class.
     */
    public RegisterPage() {
        super();

    }

    /**
     * Method to fill the first name, last name, email and password inputs. and click on the sing up button.
     *
     * @param firstName The first name to fill.
     * @param lastName  The last name to fill.
     * @param email     The email to fill.
     * @param password  The password to fill.
     */
    public void register(String firstName, String lastName, String email, String password) {
        type(firstName, firstNameInput);
        type(lastName, lastNameInput);
        type(email, emailInput);
        type(password, passwordInput);
        click(userTerms);
        click(singUpButton);
    }
}
