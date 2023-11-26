package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Clase Page Object para la página de detalles del producto
public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void configureProduct(String size, String color, int quantity) {
        // Implementar lógica para configurar las opciones del producto

    }

    public void addToCart() {
         driver.findElement(By.id("add-to-cart")).click();
    }

    public void goToShoppingCart() {
        driver.findElement(By.linkText("shopping cart")).click();
    }
}