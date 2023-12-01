package pom.service;

import driver.DriverActions;
import pom.pages.SuccessPage;

public class SuccessService {
    private SuccessPage successPage;

    public SuccessService(){
        this.successPage = new SuccessPage();
    }

    public String getTitle_text(){
        return DriverActions.getText(successPage.getTxt_success_title());
    }

    public Boolean getBtn_continue_shopping_availability(){
        return DriverActions.isEnabled(successPage.getBtn_continue());
    }

    public void getBtn_create_account_enabled(){
        DriverActions.isEnabled(successPage.getBtn_registration());
    }

    public Boolean getBtn_create_account_enabled_boolean(){
        return DriverActions.isEnabled(successPage.getBtn_registration());
    }
    public void getBtn_create_account_visibility(){
        DriverActions.isVisible(successPage.getBtn_registration());
    }

    public CharSequence getTxt_order_number(){
        return (CharSequence) DriverActions.getText(successPage.getTxt_order_number());
    }
}
