package techproed.tests.Day28_Listeners;

import org.testng.SkipException;
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
    public void successTest() {
        System.out.println("PASS");
        assertTrue(true);
    }

    @Test
    public void successTest2() {
        System.out.println("PASS");
        assertTrue(true);
    }

    @Test
    public void failTest() {
        System.out.println("FAIL");
        assertTrue(false);
    }

    @Test
    public void failTest2() {
        System.out.println("FAIL");
        assertTrue(false);
    }

    @Test
    public void skipTest() {
        System.out.println("SKIP");
        throw new SkipException("Atlandı!!!");
    }

    @Test
    public void skipTest2() {
        System.out.println("SKIP");
        throw new SkipException("Atlandı!!!");
    }


}