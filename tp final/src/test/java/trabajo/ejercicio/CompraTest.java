package trabajo.ejercicio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import trabajo.ejercicio.pom.services.*;


public class CompraTest {
   
 public static void main(String[] args) {

        // Configurar el sistema para encontrar el controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Inicializar el WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Paso 1: Abrir el navegador e ir al sitio web de Magento
            driver.get("https://magento.softwaretestingboard.com/");

            // Inicializar Page Objects
            MagentoHomePage homePage = new MagentoHomePage(driver);
            ProductPage productPage = new ProductPage(driver);
            ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);

            // Paso 2: Seleccionar la prenda "Radiant Tee"
            homePage.selectProduct("Radiant Tee");

            // Paso 3: Configurar las opciones de la prenda
            productPage.configureProduct("L", "Azul", 2);

            // Paso 4: Hacer clic en "Add to Cart"
            productPage.addToCart();

            // Paso 5: Hacer clic en el enlace "shopping cart"
            productPage.goToShoppingCart();

            // Paso 6: Hacer clic en "Proceed to Checkout"
            shoppingCartPage.proceedToCheckout();

            // Paso 7: Completar el formulario de dirección de envío
            checkoutPage.completarFormularioDireccion("Nombre", "Apellido", "Dirección", "Ciudad", "Código Postal", "País");

            // Paso 8: Seleccionar la primera opción en los Métodos de Envío
            checkoutPage.seleccionarMetodoEnvio(1);

            // Paso 9: Hacer clic en "Next"
            checkoutPage.clicNext();

            // Paso 10: Hacer clic en "Place Order"
            checkoutPage.placeOrder();

            // Validaciones
            orderConfirmationPage.verifyThankYouMessage();
            orderConfirmationPage.verifyContinueShoppingButtonEnabled();
            orderConfirmationPage.verifyCreateAccountButtonVisible();
            orderConfirmationPage.obtenerNumeroOrden();
        } finally {
            // Cerrar el navegador al finalizar
            driver.quit();
        }
    }
}