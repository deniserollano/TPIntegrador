package trabajo.ejercicio.pom.services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;
import static trabajo.ejercicio.DriverManager.wait;

public class OrderConfirmationPage {
    private WebDriver driver;

    public OrderConfirmationPage(WebDriver driver) {

        this.driver = driver;
    }

    public void verifyThankYouMessage() {
// Implementa lógica para verificar el mensaje de agradecimiento
        WebElement texto;
        texto = driver.findElement(By.className("Thank you for purchase!"));
        Assert.assertTrue(texto.getText().contains("order has been dispatched"), "EL texto no contiene la frase Thank you for purchase!");

    }

    public void verifyContinueShoppingButtonEnabled() {
        // Implementar lógica para verificar si el botón "Continue Shopping" está habilitado
        WebElement btnBackHome = driver.findElement(By.id("Continue Shopping"));
        Assert.assertTrue(btnBackHome.isEnabled(), "El boton Continue Shopping no esta habilitado");
    }

    public void verifyCreateAccountButtonVisible() {
        // Implementar lógica para verificar si el botón "Create an Account" está visible
        //WebDriverWait wait = new WebDriverWait(driver, 500);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Create an Account")));
        assertTrue(element.isDisplayed());
    }

    public void obtenerNumeroOrden() {

        String mensaje = driver.findElement(By.cssSelector(".order-number")).getText();
        System.out.println("Su numero de orden es "+mensaje.split(": ")[1].trim());
    }
}