package pom.pages;

import org.openqa.selenium.By;

public class SuccessPage {
    private By txt_success_title = By.xpath("//h1/span");

    private By btn_continue = By.cssSelector(".continue");

    private By btn_registration = By.cssSelector("#registration");

    private By txt_order_number = By.cssSelector(".checkout-success p span");

    public By getTxt_success_title() {
        return txt_success_title;
    }

    public By getBtn_continue() {
        return btn_continue;
    }

    public By getBtn_registration() {
        return btn_registration;
    }

    public By getTxt_order_number() {
        return txt_order_number;
    }
}
