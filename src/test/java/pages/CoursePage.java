package pages;

import org.openqa.selenium.By;

/**
 * Class that represents the Course Page.
 */
public class CoursePage extends Base {

    private final By playButton = By.xpath("//div/descendant::button[contains(@class,\"play-button \")]");

    /**
     * Constructor of the class.
     */
    public CoursePage() {
        super();
    }

    /**
     * Press the button to play the video.
     */
    public void playIntroductionVideo() {
        click(playButton);
    }

}
