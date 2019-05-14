package com.HotelBooking;
import HotelBooking.Browser;
import HotelBooking.Pages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheTest {

    @Test
    public void canSaveandDelete(){
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        Pages.homePage().goTo();
        assertTrue(Pages.homePage().isAt());
        assertTrue(Pages.homePage().PerformBooking());

    }

    @After
    public void cleanUp()
    {
        Browser.close();
    }
}
