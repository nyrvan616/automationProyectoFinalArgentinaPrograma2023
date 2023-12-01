package pom.pages;

import org.openqa.selenium.By;

public class CheckoutPage {
    private By txt_customer_email = By.id("customer-email");

    private By txt_customer_firstname = By.name("firstname");

    private By txt_customer_lastname = By.name("lastname");

    private By txt_customer_company = By.name("company");

    private By txt_customer_street0 = By.name("street[0]");

    private By txt_customer_city = By.name("city");

    private By txt_customer_country = By.name("country_id");

    private By txt_customer_region = By.name("region");

    private By txt_customer_postcode = By.name("postcode");

    private By txt_customer_telephone = By.name("telephone");

    private By txt_shippingmethod = By.id("label_method_flatrate_flatrate");

    private By btn_next = By.cssSelector(".button > span");

    public By getTxt_customer_email(){
        return txt_customer_email;
    }

    public By getTxt_customer_firstname() {
        return txt_customer_firstname;
    }

    public By getTxt_customer_lastname() {
        return txt_customer_lastname;
    }

    public By getTxt_customer_company() {
        return txt_customer_company;
    }

    public By getTxt_customer_street0() {
        return txt_customer_street0;
    }

    public By getTxt_customer_city() {
        return txt_customer_city;
    }

    public By getTxt_customer_country() {
        return txt_customer_country;
    }

    public By getTxt_customer_region() {
        return txt_customer_region;
    }

    public By getTxt_customer_postcode() {
        return txt_customer_postcode;
    }

    public By getTxt_customer_telephone() {
        return txt_customer_telephone;
    }

    public By getTxt_shippingmethod() {
        return txt_shippingmethod;
    }

    public By getBtn_next() {
        return btn_next;
    }
}
