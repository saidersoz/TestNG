package techproed.tests.Day28_Listeners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.HepsiburadaPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class elif {

    HepsiburadaPage hepsiburada = new HepsiburadaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void successTest() {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada_url"));
        hepsiburada.searchBox.sendKeys("neoflam fika" + Keys.ENTER);
        ReusableMethods.bekle(2);
        hepsiburada.urun2.click();
        ReusableMethods.bekle(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        hepsiburada.addToCart.click();
        ReusableMethods.bekle(4);
        hepsiburada.addToCartGit.click();
        ReusableMethods.bekle(6);
        String text = hepsiburada.siparis.getText();
        System.out.println(text);
    }

}
