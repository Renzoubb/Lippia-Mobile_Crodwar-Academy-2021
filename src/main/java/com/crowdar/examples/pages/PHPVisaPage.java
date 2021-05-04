package com.crowdar.examples.pages;
import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class PHPVisaPage extends PageBaseMobile {

    public static final String FROM_BUTTON_ID= "com.phptravelsnative:id/car_from";
    public static final String SEARCH_BUTTON_XPATH= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText";
    public static final String COUNTRY_BUTTON_ID= "com.phptravelsnative:id/row_title";
    public static final String COUNTRYTO_BUTTON_ID= "com.phptravelsnative:id/car_to";
    public static final String SEARCHTO_BUTTON_ID= "com.phptravelsnative:id/country_picker_search";
    public static final String COUNTRYSPAIN_BUTTON_ID= "com.phptravelsnative:id/row_title";
    public static final String FIRSTNAME_BUTTON_ID= "ejemploid1";
    public static final String LASTNAME_BUTTON_ID= "ejemplodeid2";
    public static final String EMAIL_BUTTON_ID="ejemplodeid3";
    public static final String PHONE_BUTTON_ID= "ejemploid4";
    public static final String SUBMIT_BUTTON_ID= "ejemploid5";
    public static final String TITTLE_TEXT_ID= "ejemplodeid6";

    public PHPVisaPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public void tapSearchFrom(){
        clickElement(By.id(SEARCH_BUTTON_XPATH));
    }
    public void completeFrom(){
        completeField(MobileBy.id(FROM_BUTTON_ID),"Argentina");
    }
    public void tapCountry(){
        clickElement(By.id(COUNTRY_BUTTON_ID));
    }
    public void tapCountryTo(){
        clickElement(By.id(SEARCHTO_BUTTON_ID));
    }
    public void tapSearchTo(){
        clickElement(By.id(SEARCHTO_BUTTON_ID));
    }
    public void tapcompleteTo(){
        completeField(MobileBy.id(SEARCHTO_BUTTON_ID),"Spain");
    }
    public void tapCountrySpain(){
        clickElement(By.id(COUNTRYSPAIN_BUTTON_ID));
    }
    public void completeName(){completeField(By.id(FIRSTNAME_BUTTON_ID), "Renzo");}
    public void tapLastName() {clickElement(By.id(LASTNAME_BUTTON_ID));}
    public void completeLastName(){completeField(MobileBy.id(LASTNAME_BUTTON_ID), "Ubeira");}
    public void tapEmail(){clickElement(By.id(EMAIL_BUTTON_ID));}
    public void completeEmail(){completeField(MobileBy.id(EMAIL_BUTTON_ID),"renzo.ubeira@gmail.com");}
    public void tapPhone(){clickElement(By.id(PHONE_BUTTON_ID));}
    public void CompletePhone(){completeField(MobileBy.id(PHONE_BUTTON_ID), "2615486532");}
    public void tapSubmit(){clickElement(By.id(SUBMIT_BUTTON_ID));}

    public String ReadTittle() {
        return getWebElement(By.id(TITTLE_TEXT_ID)).findElement(By.xpath(TITTLE_TEXT_ID)).getText();
    }
    }


