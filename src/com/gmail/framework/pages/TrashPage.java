package com.gmail.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.gmail.framework.utilities.PageUtils;

public class TrashPage extends PageUtils {

	public TrashPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
