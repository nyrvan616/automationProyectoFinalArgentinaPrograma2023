package pom.service;

import driver.DriverActions;
import pom.pages.HomePage;
import pom.pages.ProductDetailPage;

import java.sql.Driver;

public class ProductDetailService {
    private ProductDetailPage productDetailPage;

    public ProductDetailService(){
        this.productDetailPage = new ProductDetailPage();
    }


    public void click_on_txt_large_size (){
        DriverActions.click(productDetailPage.getTxt_large_size());
    }

    public void click_on_txt_blue_color () { DriverActions.click(productDetailPage.getTxt_blue_color());}

    public void send_keys_on_txt_quantity(String text){DriverActions.insertText(productDetailPage.getTxt_quantity(), text);}

    public void click_on_btn_add_to_cart(){
        DriverActions.click(productDetailPage.getBtn_add_to_cart());
    }

    public void click_on_txt_link_to_shopping_cart(){
        DriverActions.click(productDetailPage.getTxt_link_to_shopping_cart());
    }
}
