package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] sehirVerileri() {

        return new Object[][]{{"Istanbul","Marmara","34"},
                {"DiyarBakır","GüneyDoğu","12"},
                {"Ankara","İçAnadolu","06"}};
    }

}
