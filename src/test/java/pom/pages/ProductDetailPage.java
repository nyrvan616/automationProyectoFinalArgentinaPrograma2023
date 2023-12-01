package pom.pages;

import org.openqa.selenium.By;

public class ProductDetailPage {
    private By txt_large_size = By.id("option-label-size-143-item-169");

    private By txt_blue_color = By.id("option-label-color-93-item-50");

    private By txt_quantity = By.id("qty");

    private By btn_add_to_cart = By.id("product-addtocart-button");

    private By txt_link_to_shopping_cart = By.cssSelector(".message-success a");


    public By getTxt_large_size(){
        return txt_large_size;
    }

    public By getTxt_blue_color(){
        return txt_blue_color;
    }

    public By getTxt_quantity() {
        return txt_quantity;
    }

    public By getBtn_add_to_cart() {
        return btn_add_to_cart;
    }

    public By getTxt_link_to_shopping_cart(){
        return txt_link_to_shopping_cart;
    }
}
