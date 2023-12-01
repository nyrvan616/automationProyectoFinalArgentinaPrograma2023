package pom.pages;

import org.openqa.selenium.By;

public class HomePage {
    private String urlHome = "https://magento.softwaretestingboard.com/";

    private By txt_product_radiant_tee = By.xpath("//img[@alt='Radiant Tee']");

    public By getTxt_product_radiant_tee(){
        return txt_product_radiant_tee;
    }

    public String getUrlHome(){
        return urlHome;
    }
}
