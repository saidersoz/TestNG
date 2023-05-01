package techproed.tests.Day26_DataProvider;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;

public class C01_DataProviderTest01 {

    @Test
    public void test01() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/Resources/mysmoketestdata.xlsx", "customer_info");
        System.out.println(excelUtils.getCellData(1, 0));
        String email = excelUtils.getCellData(1, 0);
        String password = excelUtils.getCellData(1, 1);
        System.out.println(email + " * " + password);
        System.out.println(excelUtils.columnCount());
    }
}
