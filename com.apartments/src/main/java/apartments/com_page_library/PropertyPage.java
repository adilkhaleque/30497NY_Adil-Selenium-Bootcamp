package apartments.com_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage extends BasePage {
    @FindBy(id = "propertyName")
    public WebElement propertyName;

    @FindBy(xpath = "//*[@id='propertyReviewRow']/div/div[1]/span[3]/a")
    public WebElement reviewLink;

    @FindBy(id = "writeReviewButton")
    public WebElement reviewButton;

    @FindBy(xpath = "//div[@class='ratingAverageContainer']//div[@data-rating='5']")
    public WebElement fiveStarRatingButton;

    @FindBy(id = "reviewHeadline")
    public WebElement reviewHeadlineField;

    @FindBy(id = "reviewBodyText")
    public WebElement reviewBodyField;

    @FindBy(xpath = "//*[@id='reviewSubmissionWrapper']/div/div/div[2]/div/div/div[2]/div/div[3]/div[2]/button[2]")
    public WebElement submitReviewButton;

    public PropertyPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPropertyName() {
        return getTrimmedElementText(propertyName);
    }

    public void clickOnReviewLink() {
        safeClickOnElement(reviewLink);
    }

    public void clickOnWriteAReviewButton() {
        safeClickOnElement(reviewButton);
    }

    public void clickOnFiveStarRating() {
        safeClickOnElement(fiveStarRatingButton);
    }

    public void inputHeadlineText(String headlineText) {
        sendKeysToElement(reviewHeadlineField, headlineText);
    }

    public void inputReviewInBody(String bodyText) {
        sendKeysToElement(reviewBodyField, bodyText);
    }

    public String getSubmitReviewButtonText() {
        return getTrimmedElementText(submitReviewButton);
    }

    public void getReviewModal() {
        jsScrollUntilElementIsVisible(reviewLink);
        clickOnReviewLink();
        clickOnWriteAReviewButton();
    }

    public void inputReview(String headlineText, String bodyText) {
        clickOnFiveStarRating();
        inputHeadlineText(headlineText);
        inputReviewInBody(bodyText);
    }

}
