package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPtourSelected extends PageBaseMobile {

    public static final String SPINNERADULT_BUTTON_ID= "com.phptravelsnative:id/adult_spinner";
    public static final String QUANTITYADULT_BUTTON_XPATH= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]";
    public static final String SPINNERCHILD_ID= "com.phptravelsnative:id/child_spinner";
    public static final String QUANTITYCHILD_BUTTON_XPATH= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]";
    public static final String BOOK_BUTTON_ID= "com.phptravelsnative:id/onupdate";
    public static final String FIRSTNAME_ID= "com.phptravelsnative:id/first_name";
    public static final String SECONDNAME_ID= "com.phptravelsnative:id/second_name";
    public static final String EMAIL_ID= "com.phptravelsnative:id/input_email";
    public static final String PHONE_BUTTON_ID= "com.phptravelsnative:id/input_phone";
    public static final String ADDRESS_BUTTON_ID= "com.phptravelsnative:id/input_address";
    public static final String PROCEED_BUTTON_ID= "com.phptravelsnative:id/btn_proceed";
    public static final String VERIFY_CONTENT= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[4]/android.view.View[2]";


    public PHPtourSelected(RemoteWebDriver driver) {
        super(driver);
    }

    public void tapSpinnerAdult(){clickElement(By.id(SPINNERADULT_BUTTON_ID));}
    public void tapQuantityAdult(){clickElement(By.xpath(QUANTITYADULT_BUTTON_XPATH));}
    public void tapSpinnerChild(){clickElement(By.id(SPINNERCHILD_ID));}
    public void tapQuantityChild(){clickElement(By.xpath(QUANTITYCHILD_BUTTON_XPATH));}
    public void tapBook(){clickElement(By.id(BOOK_BUTTON_ID));}
    public void tapFirstName(){clickElement(By.id(FIRSTNAME_ID));}
    public void CompleteFirstName(){completeField(MobileBy.id(FIRSTNAME_ID), "Renzo");}
    public void tapSecondName(){clickElement(By.id(SECONDNAME_ID));}
    public void CompleteSecondName(){completeField(MobileBy.id(SECONDNAME_ID), "Ubeira");}
    public void tapEmailButton(){clickElement(By.id(EMAIL_ID));}
    public void CompleteEmail(){completeField(MobileBy.id(EMAIL_ID), "renzo.ubeira@gmail.com");}
    public void tapPhoneButton(){clickElement(By.id(PHONE_BUTTON_ID));}
    public void CompletePhone(){completeField(MobileBy.id(PHONE_BUTTON_ID), "2613225501");}
    public void tapAddressButton(){clickElement(By.id(ADDRESS_BUTTON_ID));}
    public void CompleteAddress(){completeField(MobileBy.id(ADDRESS_BUTTON_ID), "Sarmiento 80");}
    public void tapProceedButton(){clickElement(By.id(PROCEED_BUTTON_ID));}

    public String ReadTittle() {
        return getWebElement(By.xpath(VERIFY_CONTENT)).getText();
    }

}
