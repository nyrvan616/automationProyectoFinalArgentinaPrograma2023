package pom.service;

import driver.DriverActions;
import pom.pages.CartPage;
import pom.pages.HomePage;

public class CartService {
    private CartPage cartPage;

    public CartService(){
        this.cartPage = new CartPage();
    }

    public void click_on_btn_proceed_to_checkout (){
        DriverActions.click(cartPage.getBtn_proceed_to_checkout());
    }
}
