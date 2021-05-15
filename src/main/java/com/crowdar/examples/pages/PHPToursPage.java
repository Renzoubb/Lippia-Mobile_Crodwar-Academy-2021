package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PHPToursPage extends PageBaseMobile {
    public static final String LOCATION_CONTENT_ID= "com.phptravelsnative:id/tour_auto_search";
    public static final String SEARCH_CONTENT_ID= "com.phptravelsnative:id/auto_search";
    public static final String CITY_NAME_ID= "com.phptravelsnative:id/city_name";
    public static final String DATE_CONTENT_ID= "com.phptravelsnative:id/date_from";
    public static final String DATEFROM_BUTTON_XPATH= "//android.view.View[@content-desc=\"28 May 2021\"]";
    public static final String OK_BUTTON_ID= "android:id/button1";
    public static final String ADULT_BUTTON_ID="com.phptravelsnative:id/adult";
    public static final String ADULTCUANTITY_BUTTON_XPATH= "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]";
    public static final String SEARCH_BUTTON_ID= "com.phptravelsnative:id/search_hotels";
    public static final String TOURNAME_BUTTON_ID= "com.phptravelsnative:id/name";

    public PHPToursPage(RemoteWebDriver driver) {
        super(driver);
    }
    public void tapLocationContent(){
        clickElement(By.id(LOCATION_CONTENT_ID));
    }
    public void tapSearchContent(){
        clickElement(By.id(SEARCH_CONTENT_ID));
    }
    public void completeLocationTour(){completeField(MobileBy.id(SEARCH_CONTENT_ID), "petra");}
    public void tapCityName(){ clickElement(By.id(CITY_NAME_ID));}
    public void tapDateFrom(){clickElement(By.id(DATE_CONTENT_ID));}
    public void tapDateSelected(){clickElement(By.xpath(DATEFROM_BUTTON_XPATH));}
    public void tapOkButton(){clickElement(By.id(OK_BUTTON_ID));}
    public void tapAdultButton(){clickElement(By.id(ADULT_BUTTON_ID));}
    public void tapAdultCuantity(){clickElement(By.xpath(ADULTCUANTITY_BUTTON_XPATH));}
    public void tapSearchButton(){clickElement(By.id(SEARCH_BUTTON_ID));}
    public void tapTourName(){clickElement(By.id(TOURNAME_BUTTON_ID));}

}
