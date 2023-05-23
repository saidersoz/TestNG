package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class Automationexercise_Page {

    public Automationexercise_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/form/p")
    public WebElement abonelikMetni;

    @FindBy(id = "susbscribe_email")
    public WebElement susbscribeEmail;

    @FindBy(id = "success-subscribe")
    public WebElement successSubscribe;

}
