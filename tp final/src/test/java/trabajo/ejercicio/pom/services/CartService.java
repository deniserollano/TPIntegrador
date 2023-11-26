package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.DriverActions;
import trabajo.ejercicio.pom.pages.CartPage;

public class CartService {
    private CartPage cartPage;

    public CartService() {
        this.cartPage = new CartPage();
    }

    public void goCheckout(){
        DriverActions.click(this.cartPage.getBtn_checkout());
    }
}
