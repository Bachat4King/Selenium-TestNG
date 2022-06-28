package pages;

import org.openqa.selenium.By;

import java.time.Duration;

/**
 * Class that represents the Dashboard page.
 */
public class DashboardPage extends Base {

    public By courseCard = By.xpath("//a[contains(@class, 'course-card')]");
    public By username = By.xpath("//section[contains(@class,'user-menu')]/descendant::img/parent::a");

    /**
     * Constructor of the class.
     */
    public DashboardPage() {
        super();
    }

    /**
     * Method that returns the username of the user.
     *
     * @return the username of the user.
     */
    public String getUsername() {
        return getText(username);
    }

    /**
     * Method that clicks on the course card given the name of the course.
     *
     * @param courseCardName the name of the course.
     */
    public void clickCourseCard(String courseCardName) {
        findElement(courseCard, Duration.ofSeconds(10)).findElement(By.xpath("//a[contains(@class, 'course-card')]/descendant::h3[contains(text(), '" + courseCardName + "')]")).click();
    }

}