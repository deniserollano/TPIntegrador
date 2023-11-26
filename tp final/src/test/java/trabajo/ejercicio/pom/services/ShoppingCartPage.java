package trabajo.ejercicio.pom.services;
import org.openqa.selenium.WebDriver;


import trabajo.ejercicio.*;

// Clase Page Object para la página de carrito de compras
public class ShoppingCartPage {
    private WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {

        this.driver = driver;
    }

    public void proceedToCheckout() {
        // Implementar lógica para proceder al checkout desde el carrito de compras
    }
}