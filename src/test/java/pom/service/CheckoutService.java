package pom.service;

import driver.DriverActions;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pom.pages.CartPage;
import pom.pages.CheckoutPage;

import java.sql.DriverAction;
import java.util.List;

public class CheckoutService {
    private CheckoutPage checkoutPage;

    public CheckoutService(){
        this.checkoutPage = new CheckoutPage();
    }

    public void send_keys_on_txt_customer_email (String email){
        DriverActions.insertText(checkoutPage.getTxt_customer_email(), email);
    }

    public void send_keys_on_txt_customer_firstname (String firstname){
        DriverActions.insertText(checkoutPage.getTxt_customer_firstname(), firstname);
    }

    public void send_keys_on_txt_customer_lastname (String lastname){
        DriverActions.insertText(checkoutPage.getTxt_customer_lastname(), lastname);
    }

    public void send_keys_on_txt_customer_company (String company){
        DriverActions.insertText(checkoutPage.getTxt_customer_company(), company);
    }

    public void send_keys_on_txt_customer_street0 (String street0){
        DriverActions.insertText(checkoutPage.getTxt_customer_street0(), street0);
    }

    public void send_keys_on_customer_city (String city){
        DriverActions.insertText(checkoutPage.getTxt_customer_city(), city);
    }

    public void send_keys_on_customer_state (String region){
        DriverActions.insertText(checkoutPage.getTxt_customer_region(), region);
    }

    public void select_on_customer_country (String value){
        Select select = new Select(DriverManager.getDriver().findElement(checkoutPage.getTxt_customer_country()));
        select.selectByValue(value);
    }

    public void send_keys_on_customer_postcode (String postcode) {
        DriverActions.insertText(checkoutPage.getTxt_customer_postcode(), postcode);
    }

    public void send_keys_on_customer_telephone (String telephone){
        DriverActions.insertText(checkoutPage.getTxt_customer_telephone(), telephone);
    }

    public void click_on_shipping_method(){
        DriverActions.click(checkoutPage.getTxt_shippingmethod());
    }

    public void click_on_next_button (){
        DriverActions.click(checkoutPage.getBtn_next());
    }


}
