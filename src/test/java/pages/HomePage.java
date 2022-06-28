package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Home page of the application.
 */
public class HomePage extends Base {
    private final By singIn = By.xpath("//section/descendant::a[contains(text(), 'Sign In')]");

    /**
     * Constructor of the class.
     */
    public HomePage() {
        super();
    }

    /**
     * Method that allows to click on the Sign In button.
     */
    public void pressSingIn() {
        click(singIn);
    }

}
