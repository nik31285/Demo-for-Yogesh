import org.testng.annotations.Test;

import com.config.BaseTest;
import com.keywords.UIKeywords;

public class HomePageTestCases extends BaseTest {
	@Test
	public void verifyLoginFunctionality() {
		UIKeywords.enterUsername("Admin");
		UIKeywords.enterPassword("admin123");
		UIKeywords.clickOnLogin();
	}
	@Test
	public void verifyTitleOfPage() {
		UIKeywords.verifyTitleName();
	}
	@Test
	public void verifyElement() throws Exception {
		UIKeywords.isAvailable();
	}
}
