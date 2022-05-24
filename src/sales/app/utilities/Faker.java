/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.utilities;

import sales.app.inventory.RawMaterialInventory;

/**
 *
 * @author kenjo
 */
public class Faker {
//    private final RawMaterialInventory products = new RawMaterialInventory();
    
    public static RawMaterialInventory generateDataFaker(){
        final RawMaterialInventory products = new RawMaterialInventory();
        
        products.addStrawberries(1000);
        products.addBananas(1000);
        products.addMango(1000);
        products.addIce(1000);
        products.addMilk(1000);
        products.addSugar(1000);
        products.createStrawberryDrink(3);
        products.createBananaDrink(3);
        products.createMangoDrink(3);
        
        return products;
    }
   
}
