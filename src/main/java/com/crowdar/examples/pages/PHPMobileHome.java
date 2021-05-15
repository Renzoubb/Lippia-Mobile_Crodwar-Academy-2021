package com.crowdar.examples.pages;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class PHPMobileHome extends PageBaseMobile {

    //public static final String VISA_BUTTON_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView";

    public static final String HOME_CONTENT_ID= "com.phptravelsnative:id/recyclerView";
    public static final String MESSAGE_ERROR= "Home page is not displayed.";
    public static final String VISA_BUTTON_XPATH= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView";
    public PHPMobileHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }
    public static void VerificaElemento() {
       /* MobileActionManager.waitVisibility(HOME_CONTENT_ID);
        Assert.assertTrue(MobileActionManager.isVisible(HOME_CONTENT_ID), PHPMobileHome.MESSAGE_ERROR);*/
    }

    public void tapToursButton(){
        clickElement(By.xpath(VISA_BUTTON_XPATH));
    }

    }
/* public void tapVisaButton(){
        clickElement(By.xpath(VISA_BUTTON_XPATH));
    }*/
    /*public String getTitle() {
        return getWebElement(By.xpath(ACTION_BAR_XPATH)).findElement(By.xpath(TEXT_VIEW_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getWebElement(By.xpath("//android.widget.TextView[@content-desc=" + "\"" + menu + "\"" + "]"));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        clickElement(element);
    }*/
    /*public void setInputData(){
        completeField(MobileBy.AccessibilityId(TEXT_VIEW_XPATH), value:"Dato")
    }*/


