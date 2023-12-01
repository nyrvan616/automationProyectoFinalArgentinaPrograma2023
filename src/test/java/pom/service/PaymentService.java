package pom.service;

import driver.DriverActions;
import driver.DriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.pages.CartPage;
import pom.pages.PaymentPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class PaymentService {
    private PaymentPage paymentPage;

    public PaymentService(){
        this.paymentPage = new PaymentPage();
    }

    public void click_on_btn_place_order (){
        DriverActions.isVisible(paymentPage.getTxt_billing_address_detail());
        DriverActions.click(paymentPage.getBtn_place_order());
    }
}
