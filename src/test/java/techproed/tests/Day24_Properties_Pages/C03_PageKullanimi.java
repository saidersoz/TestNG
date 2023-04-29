package techproed.tests.Day24_Properties_Pages;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PageKullanimi {

    @Test
    public void test01() {

        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCenter_url"));

        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        //Sayfadan cikis yap ve cikis yapildigini test et

    }
}
