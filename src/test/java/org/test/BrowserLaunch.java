package org.test;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.pages.FBLogin;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class BrowserLaunch extends BaseClass{
	
	@Test
	private void testCase() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		launchBrowser();
		loadUrl("https://en-gb.facebook.com");
		winMax();
		printTitle();
		printCurrentUrl();
		FBLogin fbLogin = new FBLogin();
		fill(fbLogin.getTxtUser(), getData(1, 1));
		fill(fbLogin.getTxtPass(), getData(2, 1));
		screenShot("ks.png");
		winMin();
		Thread.sleep(2000);
		winMaxAgain();
		btnClick(fbLogin.getBtn());
		Thread.sleep(5000);
		browserClose();
		
		
	
	}

}
