package trabajo.ejercicio.pom.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagentoHomePage {
    private WebDriver driver;
    public MagentoHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void abrirSitio() {
        driver.get("https://magento.softwaretestingboard.com/");
    }
    public void selectProduct(String radiantTee) {
        driver.findElement(By.linkText("Radiant Tee")).click();
    }
}
