package com.eurotech.saucedemoaqua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://demoqa.com/slider
public class SliderPage extends BasePage{
    @FindBy(xpath = "//*[@id='sliderValue']")
    public WebElement inputSliderValue;

    @FindBy(xpath = "//input[@min='0']")
    public WebElement inputRangeSlider;



 
}