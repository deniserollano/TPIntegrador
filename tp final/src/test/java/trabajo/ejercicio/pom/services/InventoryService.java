package trabajo.ejercicio.pom.services;

import trabajo.ejercicio.DriverActions;
import trabajo.ejercicio.pom.pages.InventoryPage;

public class InventoryService {

    private InventoryPage inventoryPage;

    public InventoryService(){
        this.inventoryPage = new InventoryPage();
    }
    public void clickAddToCardSauceLabsBackPack(){
        DriverActions.click(this.inventoryPage.getBtn_add_to_cart_sauce_labs_backpack());
    }

    public void goCart(){
        DriverActions.click(this.inventoryPage.getBtn_cart());
    }
}
