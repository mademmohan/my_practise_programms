package com.Collections;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatortTest {


		// static WebDriver driver;//mobile brower
		static AppiumDriver<MobileElement> driver1;
		// AndroidDriver<WebElement> driver2;

		public static void main(String[] args) throws Exception {
			openCalculator();
		}

		public static void openCalculator() throws Exception {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("DeviceName", "Honor 9 Lite");
			cap.setCapability("udid", "P8B4C18126005671");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9");
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver1 = new AppiumDriver<MobileElement>(cap);

			System.out.println("Application Started.......");

		}

	}


