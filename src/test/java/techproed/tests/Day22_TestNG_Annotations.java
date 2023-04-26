package techproed.tests;

import org.testng.annotations.*;

public class Day22_TestNG_Annotations {

    /*
    @Test : Test case oluşturmak için kullanılır.
        @Before ve @After : 5 Before ve 5 After anotation bulunur.
        --> Suite > Tests > Groups > Class > Method
                  @BeforeSuite : Herbir test suite'inden önce 1 kez çalışır.
                  @AfterSuite : Herbir test suite'inden sonra 1 kez çalışır.

                  @BeforeTest : Test öncesi 1 kez çalışır. (Herbir test case'i öncesi değil!!!)
                  @AfterTest : Test sonrası 1 kez çalışır. (Herbir test case'i öncesi değil!!!)

                  @BeforeGroups : Özel belirtilmiş herhangi bir grup öncesi çalışır.
                  @AfterGroups : Özel belirtilmiş herhangi bir grup sonrası çalışır.

                  @BeforeClass : Her bir class'dan önce bir kez çalışır
                  @AfterClass : Her bir class'dan sonra bir kez çalışır

                  @Before : Herbir test methodu öncesinde 1 kere çalışır
                  @After : Herbir test methodu sonrasında 1 kere çalışır
     */

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After Groups");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void test01() {
        System.out.println("Test 1");
    }

    @Test
    public void test02() {
        System.out.println("Test 2");
    }

    @Test(groups = "regression-test")
    public void test03() {
        System.out.println("Test 3");
    }

    @Test
    public void test04() {
        System.out.println("Test 4");
    }

    @Test(groups = "regression-test")
    public void test05() {
        System.out.println("Test 5");
    }

    @Test
    public void test06() {
        System.out.println("Test 6");
    }

    @Test
    public void test07() {
        System.out.println("Test 7");
    }
}
