package techproed.tests.AutomationExc;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.Automationexercise_Page;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class Text20 {

    //1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. 'Ürünler' düğmesine tıklayın
    //4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
    //5. Arama girişine ürün adını girin ve ara düğmesine tıklayın
    //6. "ARALAN ÜRÜNLER"in görünür olduğunu doğrulayın
    //7. Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın
    //8. Bu ürünleri sepete ekleyin
    //9. 'Sepet' düğmesine tıklayın ve ürünlerin sepette göründüğünü doğrulayın
    //10. 'Kaydol / Giriş Yap' düğmesini tıklayın ve giriş bilgilerini gönderin
    //11. Tekrar Sepet sayfasına gidin
    //12. Giriş yaptıktan sonra bu ürünlerin de sepette göründüğünü doğrulayın.

    Automationexercise_Page automationexercisePage = new Automationexercise_Page();

    @Test
    public void test20() {
        Driver.getDriver().get(ConfigReader.getProperty("automationexercide_url"));
        automationexercisePage.products.click();
        ReusableMethods.bekle(2);

        assertTrue(automationexercisePage.allProducts.isDisplayed());
        ReusableMethods.bekle(2);

        automationexercisePage.searchProduct.sendKeys("short");
        automationexercisePage.submitSearch.click();
        ReusableMethods.bekle(2);

        assertTrue(automationexercisePage.searchProduct.isDisplayed());
        ReusableMethods.bekle(2);


        ReusableMethods.scroll(automationexercisePage.addToCart);

        Driver.closeDriver();
    }
}
