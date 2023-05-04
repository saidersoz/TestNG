package techproed.tests.Day28_Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/*
Class'ı Listener ile ilişkilendirmek için ya Class başına @Listeners() eklenir
Yada XML dosyasına ekleme yapılır.
 */

@Listeners(techproed.utilities.Listeners.class) //Listener class'ın bulunduğu yolu belirtiyoruz.
public class C01_Listeners {

    @Test
    public void succesTest() {
        System.out.println("PASS");
        assertTrue(true);
    }

    @Test
    public void failTest() {
        System.out.println("FAIL");
        assertTrue(false);
    }

}