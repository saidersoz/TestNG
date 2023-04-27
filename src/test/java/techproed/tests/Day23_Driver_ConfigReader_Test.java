package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

import static org.testng.Assert.assertTrue;

public class Day23_Driver_ConfigReader_Test{

    @Test
    public void testDriver() {
        //"https://techproeducation.com/" sayfasına gidiniz.
        Driver.getDriver().get("https://techproeducation.com/");

        //Title testi yapınız
        assertTrue(Driver.getDriver().getTitle().contains("Techpro"));

        //Sayfayı kapatınız
        Driver.closeDriver();
    }
}
