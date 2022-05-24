/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import sales.app.exceptions.InsufficientQuantityException;
import sales.app.products.Product;
import sales.app.utilities.Tools;

/**
 *
 * @author kenjo
 */
public class RawMaterialInventory {

    public ArrayList<SalesRecord> salesRecord = new ArrayList<>();
    private final Product strawberries = new Product("Fresas", 0);
    private final Product bananas = new Product("Platanos", 0);
    private final Product mango = new Product("Mango", 0);
    private final Product ice = new Product("Hielo", 0);
    private final Product milk = new Product("Leche Condesada", 0);
    private final Product sugar = new Product("Azucar", 0);
    private final Product strawberryDrink = new Product("Bebida de fresa", 0);
    private final Product bananaDrink = new Product("Bebida de platano", 0);
    private final Product mangoDrink = new Product("Bebida de mango", 0);

    public void addRecord(String name) {
        this.salesRecord.add(new SalesRecord(name));
    }

    public void addRecords(String name, int units) {
        for (int i = 0; i < units; i++) {
            this.salesRecord.add(new SalesRecord(name));
        }
    }

    /* ----------------------- prints ----------------------- */
    public void printRawMaterial() {
        final String ml = " ml";
        final String g = " g";
        final String u = " u";
        System.out.println("|------------------------------------|");
        System.out.println("|  Nombre del producto | cantidad   |");
        System.out.println("|------------------------------------|");

        System.out.println("| " + this.strawberries.getName() + Tools.fillString(15) + "| " + this.strawberries.getAmount() + g);
        System.out.println("| " + this.bananas.getName() + Tools.fillString(13) + "| " + this.bananas.getAmount() + g);
        System.out.println("| " + this.mango.getName() + Tools.fillString(16) + "| " + this.mango.getAmount() + g);
        System.out.println("| " + this.ice.getName() + Tools.fillString(16) + "| " + this.ice.getAmount() + ml);
        System.out.println("| " + this.milk.getName() + Tools.fillString(6) + "| " + this.milk.getAmount() + ml);
        System.out.println("| " + this.sugar.getName() + Tools.fillString(15) + "| " + this.sugar.getAmount() + g);
        System.out.println("| " + this.strawberryDrink.getName() + Tools.fillString(6) + "| " + this.strawberryDrink.getAmount() + u);
        System.out.println("| " + this.bananaDrink.getName() + Tools.fillString(4) + "| " + this.bananaDrink.getAmount() + u);
        System.out.println("| " + this.mangoDrink.getName() + Tools.fillString(6) + "| " + this.mangoDrink.getAmount() + u);
    }

    public void printSales() {
        String lines = "|----------------------------------------------|";
        String s = "";
        int l_strawberries = 0;
        int l_bananas = 0;
        int l_mango = 0;

        System.out.println(lines);
        System.out.println("| # | Nombre de bebida |    fecha   |  hora    |");
        System.out.println(lines);
        if (!salesRecord.isEmpty()) {
            for (int i = 0; i < salesRecord.size(); i++) {
                SalesRecord record = salesRecord.get(i);

                if (record.getName().equals("Fresa")) {
                    l_strawberries++;
                    s = Tools.fillString(11);
                }

                if (record.getName().equals("Platano")) {
                    l_bananas++;
                    s = Tools.fillString(9);
                }

                if (record.getName().equals("Mango")) {
                    l_mango++;
                    s = Tools.fillString(11);
                }

                System.out.println("| " + i + " | " + record.getName() + s + " | " + record.getDate());
            }
        } else {
            System.out.println("|--- Sin Registros, primero venda alguna bebida ---|");
        }
        System.out.println(lines);
        System.out.println("| Total de bebidas de fresa: " + l_strawberries);
        System.out.println("| Total de bebidas de platano: " + l_bananas);
        System.out.println("| Total de bebidas de mango: " + l_mango);
        System.out.println(lines);
    }

    /* ----------------------- adders && subtract ----------------------- */
    public HashMap getInventory() {
        HashMap products = new HashMap();
        products.put("strawberries", this.strawberries);
        products.put("bananas", this.bananas);
        products.put("mango", this.mango);
        products.put("ice", this.ice);
        products.put("milk", this.milk);
        products.put("sugar", this.sugar);
        return products;
    }

    public void addStrawberries(float amount) {
        this.strawberries.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.strawberries.getName());
    }

    public void subtractStrawberries(float amount) {
        try {
            this.strawberries.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addBananas(float amount) {
        this.bananas.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.bananas.getName());
    }

    public void subtractBananas(float amount) {
        try {
            this.bananas.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addMango(float amount) {
        this.mango.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.mango.getName());
    }

    public void subtractMangos(float amount) {
        try {
            this.mango.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addIce(float amount) {
        this.ice.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.ice.getName());
    }

    public void subtractIce(float amount) {
        try {
            this.ice.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addMilk(float amount) {
        this.milk.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.milk.getName());
    }

    public void subtractMilk(float amount) {
        try {
            this.milk.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addSugar(float amount) {
        this.sugar.addAmount(amount);
        System.out.println("Se ha agrego " + amount + " " + this.sugar.getName());
    }

    public void subtractSugar(float amount) {
        try {
            this.sugar.subtractAmount(amount);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createStrawberryDrink() {
        if (this.strawberries.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.strawberries.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.strawberryDrink.addAmount(1);
                this.addRecord(this.strawberryDrink.getName());
                System.out.println("Bebida de Fresa creado");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void createStrawberryDrink(int units) {
        if (this.strawberries.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.strawberries.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.strawberryDrink.addAmount(units);
                this.addRecords(this.strawberryDrink.getName(), units);
                System.out.println(units + " bebidas de Fresa creadas");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void subtractStrawberryDrink() {
        try {
            this.strawberryDrink.subtractAmount(1);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createBananaDrink() {
        if (this.bananas.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.bananas.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.bananaDrink.addAmount(1);
                this.addRecord(this.bananaDrink.getName());
                System.out.println("Bebida de Fresa creado");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void createBananaDrink(int units) {
        if (this.bananas.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.bananas.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.bananaDrink.addAmount(units);
                this.addRecords(this.bananaDrink.getName(), units);
                System.out.println(units + " bebidas de Fresa creadas");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void subtractBananaDrink() {
        try {
            this.bananaDrink.subtractAmount(1);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createMangoDrink() {
        if (this.mango.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.mango.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.mangoDrink.addAmount(1);
                this.addRecord(this.mangoDrink.getName());
                System.out.println("Bebida de Fresa creado");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void createMangoDrink(int units) {
        if (this.mango.getAmount() >= 50 && this.ice.getAmount() >= 30
                && this.milk.getAmount() >= 20 && this.sugar.getAmount() >= 8) {
            try {
                this.mango.subtractAmount(50);
                this.ice.subtractAmount(30);
                this.milk.subtractAmount(20);
                this.sugar.subtractAmount(8);

                this.mangoDrink.addAmount(units);
                this.addRecords(this.mangoDrink.getName(), units);
                System.out.println(units + " bebida de Mango creadas");
            } catch (InsufficientQuantityException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("No hay recursos necesarios");
        }
    }

    public void subtractMangoDrink() {
        try {
            this.mangoDrink.subtractAmount(1);
        } catch (InsufficientQuantityException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
