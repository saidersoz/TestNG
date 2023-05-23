package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HepsiburadaPage {

    public HepsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@aria-autocomplete='list']")
    public WebElement searchBox;

    @FindBy(xpath = "(//h3)[2]")
    public WebElement urun2;

    @FindBy(id = "addToCart")
    public WebElement addToCart;


    @FindBy(xpath = "//button[text()='Sepete git']")
    public WebElement addToCartGit;


    @FindBy(xpath = "//div[@class='product_details_1sAZl']")
    public WebElement siparis;




}
