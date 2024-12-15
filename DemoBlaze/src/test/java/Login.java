import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ecomm.genericUtilities.ListenerUtility;
import com.ecomm.genericUtilities.BaseClass;
import com.ecomm.objectRepository.HomePage;

//@Listeners(ListenerUtility.class)

public class Login extends BaseClass{
	@Test
	public void login() {
		homePage = new HomePage(driver);
		
		homePage.getContactLink().click();
	}
}
