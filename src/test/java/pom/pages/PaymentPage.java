package pom.pages;

import org.openqa.selenium.By;

public class PaymentPage {
    private By btn_place_order = By.cssSelector(".primary .checkout");

    private By txt_billing_address_detail = By.cssSelector(".billing-address-details");

    public By getBtn_place_order(){
        return btn_place_order;
    }

    public By getTxt_billing_address_detail(){
        return txt_billing_address_detail;
    }

}
