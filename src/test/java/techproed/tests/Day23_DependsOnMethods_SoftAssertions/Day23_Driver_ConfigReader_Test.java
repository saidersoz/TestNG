package techproed.tests.Day23_DependsOnMethods_SoftAssertions;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.testng.Assert.assertTrue;

public class Day23_Driver_ConfigReader_Test{

    @Test
    public void driverTest() {

        //https://techproeducation.com/ sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("techproeducation_url"));

        //Title testi yapınız
        assertTrue(Driver.getDriver().getTitle().contains("Techpro"));
        System.out.println(ConfigReader.getProperty("username"));
        System.out.println(ConfigReader.getProperty("password"));

        //sayfayı kapatınız.
        Driver.closeDriver();

    }
}
