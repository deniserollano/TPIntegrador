package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.DriverActions;
import trabajo.ejercicio.pom.pages.CheckoutStepTwoPage;

public class CheckoutStepTwoService {
    private CheckoutStepTwoPage checkoutStepTwoPage;

    public CheckoutStepTwoService(){
        this.checkoutStepTwoPage = new CheckoutStepTwoPage();
    }

    public void goFinish(){
        DriverActions.click(this.checkoutStepTwoPage.getBtn_finish());
    }
}
