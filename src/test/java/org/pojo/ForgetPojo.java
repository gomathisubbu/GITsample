package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPojo extends BaseClass{
	
	public ForgetPojo() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement buttonForgetpass;

	@FindBy(id = "identify_email")
	private WebElement textSearchBox;
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement clickBtn;

	public WebElement getButtonForgetpass() {
		return buttonForgetpass;
	}

	public WebElement getTextSearchBox() {
		return textSearchBox;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	}
	

}
