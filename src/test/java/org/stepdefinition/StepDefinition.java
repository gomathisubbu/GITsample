
package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pojo.ForgetPojo;
import org.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	public static PojoClass l = new PojoClass();
	ForgetPojo f = new ForgetPojo();

	@Given("User is in facebook page")
	public void user_is_in_facebook_page() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
		toCurrentUrl();
	}

	@Given("user have enter into facebook page in chrome browser")
	public void user_have_enter_into_facebook_page_in_chrome_browser() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
	}

	@When("User enter invalid user name and invalid password")
	public void user_enter_invalid_user_name_and_invalid_password() {
		l = new PojoClass();
		toEnter(l.getTxtUser(), "goms123@.gmail.com");
		toEnter(l.getTxtPass(), "goms1234");
	}

	@When("User click the Login button")
	public void user_click_the_Login_button() {
		l = new PojoClass();
		toClick(l.getBtnLogin());
	}

	@Then("User should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
		l = new PojoClass();
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check url", url.contains("https://www.facebook.com/"));
	}

	@When("User enter valid user name and invalid password")
	public void user_enter_valid_user_name_and_invalid_password() {
		l = new PojoClass();
		toEnter(l.getTxtUser(), "gomathikamal12@.gmail.com");
		toEnter(l.getTxtPass(), "goms1234");
	}

	
	@When("User enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
		l = new PojoClass();
		toEnter(l.getTxtUser(), user);
		toEnter(l.getTxtPass(), pass);
		}

	@Given("User have to enter user name and password in facebook")
	public void user_have_to_enter_user_name_and_password_in_facebook() {
		f = new ForgetPojo();
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maximize();
		toCurrentUrl();

	}

	@Given("User have to click forget password")
	public void user_have_to_click_forget_password() throws InterruptedException {
		f = new ForgetPojo();
		toClick(f.getButtonForgetpass());
//		toClick(f.getClickBtn());
		Thread.sleep(3000);
	}

	@When("User have to enter email or phoneno")
	public void user_have_to_enter_email_or_phoneno() {
		f = new ForgetPojo();
		toEnter(f.getTextSearchBox(), "gomathikamal12@gmail.com");
	}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {
		f = new ForgetPojo();
		toClick(f.getTextSearchBox());
	}

}
