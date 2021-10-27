package org.test;

import org.baseclass.BaseClass;
import org.data.DataProviderFile;
import org.pages.FBLogin;
import org.testng.annotations.Test;


public class DataProviderTestNG extends BaseClass{
	
	@Test(dataProvider="FBLogin",dataProviderClass=DataProviderFile.class)
	private void testCase1(String s1, String s2) {
		
		launchBrowser();
		loadUrl("https://en-gb.facebook.com");
		winMax();
		FBLogin fbLogin = new FBLogin();
		fill(fbLogin.getTxtUser(), s1);
		fill(fbLogin.getTxtPass(), s2);
		
		
		
	}

}
