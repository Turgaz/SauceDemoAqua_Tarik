package com.eurotech.saucedemoaqua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.saucedemo.com/inventory.html
public class ProductPage extends BasePage{
    @FindBy(xpath = "//*[text() = 'Products']")
    public WebElement header;

}