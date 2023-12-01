package pom.service;

import driver.DriverActions;
import pom.pages.HomePage;

public class HomeService {
    private HomePage homePage;

    public HomeService(){
        this.homePage = new HomePage();
    }

    public String get_urlHome(){
        return homePage.getUrlHome();
    }

    public void click_on_txt_product_radiant_tee (){
        DriverActions.click(homePage.getTxt_product_radiant_tee());
    }
}
