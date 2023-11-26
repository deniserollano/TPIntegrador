package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void completarFormularioDireccion(String firstName, String lastName, String address, String city, String zip, String country){
// Implementa la lógica para completar el formulario de dirección
    }
    public void seleccionarMetodoEnvio(int option) {
// Implementa la lógica para seleccionar el método de envío
    }
    public void clicNext() {
        driver.findElement(By.id("next-button")).click();
    }
    public void placeOrder() {
        driver.findElement(By.id("place-order-button")).click();
    }
    public String obtenerMensajeConfirmacion() {
        return driver.findElement(By.cssSelector(".success-msg span")).getText();
    }
    public String obtenerNumeroOrden() {
	String mensaje = driver.findElement(By.cssSelector(".order-number")).getText();
// Utiliza split para obtener el número de la orden
        System.out.println("Your order # is");
        return mensaje.split(": ")[1].trim();
    }
}