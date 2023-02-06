package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id ='email']")
	private WebElement txtUser;

	@FindBy(xpath = "//input[@id ='pass']")
	private WebElement txtPass;

	@FindBy(name ="login")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
