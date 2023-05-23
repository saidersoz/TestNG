package techproed.tests.AutomationExc;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Automationexercise_Page;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Text10 {

    //Test Case 10: Verify Subscription in home page
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Scroll down to footer
    //5. Verify text 'SUBSCRIPTION'
    //6. Enter email address in input and click arrow button
    //7. Verify success message 'You have been successfully subscribed!' is visible

    //Test Senaryosu 10: Ana sayfada Aboneliği Doğrulayın
    //1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. Altbilgiye doğru aşağı kaydırın
    //5. 'ABONELİK' metnini doğrulayın
    //6. Giriş alanına e-posta adresini girin ve ok düğmesine tıklayın
    //7. Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür

    Automationexercise_Page automation = new Automationexercise_Page();

    Faker faker = new Faker();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("automationexercide_url"));
        String actualResult = "Automation Exercise";
        String expectedResut = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedResut, actualResult);
        ReusableMethods.bekle(2);
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        ReusableMethods.scroll(automation.subscription);
        Assert.assertTrue(automation.abonelikMetni.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        automation.susbscribeEmail.sendKeys(faker.internet().emailAddress()+ Keys.ENTER);
        Assert.assertTrue(automation.successSubscribe.isDisplayed());
    }
}























