package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HesapMakinasiPage;
import utilities.Driver;

public class US001 {

    HesapMakinasiPage hm = new HesapMakinasiPage();

    @Test
    public void test01() {
        hm.number1.click();
        hm.topla.click();
        hm.number7.click();
        hm.esittir.click();

        String sonuc = hm.sonuc.getText();

        Assert.assertEquals(sonuc, "8");
    }

    @Test
    public void test02() {
    }

    @AfterTest
    public void closeApp() {
        Driver.closeDriver();
    }
}
