package com.eurotech.saucedemoaqua.stepdefs;

import com.eurotech.saucedemoaqua.pages.SliderPage;
import com.eurotech.saucedemoaqua.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SliderStepdefs {

    SliderPage sliderPage=new SliderPage();



    @Given("the user is on the slider page")
    public void theUserIsOnTheSliderPage() {
        Driver.get().get("https://demoqa.com/slider");
        Assert.assertTrue(sliderPage.inputRangeSlider.isDisplayed());
    }

    @When("the user moves the slider to {int}")
    public void theUserMovesTheSliderTo(int targetSliderRange) {

        int intialSliderRange = Integer.parseInt(sliderPage.inputSliderValue.getAttribute("value"));
        int numberOfTimesSliderToMove=targetSliderRange-intialSliderRange;
        for (int i=0;i<numberOfTimesSliderToMove;i++){
            sliderPage.inputRangeSlider.sendKeys(Keys.ARROW_RIGHT);
        }

//        Actions move = new Actions (Driver.get());
//        move.dragAndDropBy(demoqaSliderPage.inputRangeSlider, targetSliderRange-start, 0).perform();
//
//        System.out.println("range = " + sliderPage.inputRangeSlider.getAttribute("value"));

//        Actions actions = new Actions (Driver.get());
//        actions.dragAndDropBy(sliderPage.inputRangeSlider,72,0).perform();

    }

    @Then("the slider should be ranged to {int}")
    public void theSliderShouldBeRangedTo(int expectedSliderRange) {
        int intialSliderRange = Integer.parseInt(sliderPage.inputSliderValue.getAttribute("value"));
        Assert.assertEquals(expectedSliderRange,intialSliderRange);

    }
}
