package pom.pages;

import org.openqa.selenium.By;

public class CartPage {
    private By btn_proceed_to_checkout = By.cssSelector(".checkout > span");

    public By getBtn_proceed_to_checkout(){
        return btn_proceed_to_checkout;
    }

}
