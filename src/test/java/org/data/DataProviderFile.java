package org.data;

import org.testng.annotations.DataProvider;

public class DataProviderFile {

	@DataProvider(name ="FBLogin")
	public Object[][] fetchData() {
		return new Object[][] {

			{"java","java@123"},
			{"sql","sql@123"},
			{"oracle","oracle@123"},
			{"selenium","selenium@123"},
			{"python","python@123"}
			
		};
	}
}
