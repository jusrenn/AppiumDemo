package activities;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HesapMakinasiPage {

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    public AndroidElement number1;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public AndroidElement topla;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    public AndroidElement number7;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public AndroidElement esittir;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public AndroidElement sonuc;

    public HesapMakinasiPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
}
