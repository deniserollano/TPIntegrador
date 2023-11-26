package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.DriverActions;
import trabajo.ejercicio.pom.pages.*;

public class CheckoutCompleteService {

    private clase_8.ejercicio.pom.pages.CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteService(){

        this.checkoutCompletePage = new clase_8.ejercicio.pom.pages.CheckoutCompletePage();
    }

    public void goBackHome(){
        DriverActions.click(this.checkoutCompletePage.getBtn_back_home());
    }

    public String getCompleteText(){
        return DriverActions.getText(this.checkoutCompletePage.getTxt_complete_text());
    }

    public Boolean isVisibleTitle(){
        return DriverActions.isVisible(this.checkoutCompletePage.getTxt_title());
    }

    public Boolean isEnableBackHome(){
        return DriverActions.isEnabled(this.checkoutCompletePage.getBtn_back_home());
    }
}