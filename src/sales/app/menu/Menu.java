/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.menu;

import java.util.Scanner;
import sales.app.inventory.RawMaterialInventory;
import sales.app.utilities.Faker;

/**
 *
 * @author Joel-Tapia | joelts159@gmail.com
 */
public class Menu {

    private RawMaterialInventory productsInventory;
    private final Scanner scan = new Scanner(System.in);
    private int option;

    public Menu() {
        this.option = 0;
        this.productsInventory = new RawMaterialInventory();
    }

    private void menuTitle(String title) {
        System.out.println("\n-------------| " + title + " |-------------");
    }

    private void lastMenu() {
        System.out.println("\n");
        System.out.println("1) Atras");
        System.out.println("-Presiona cualquier tecla para salir-");

        switch (this.scan.nextInt()) {
            case 1:
                this.inventoryManagementMenu();
                break;
            default:
                option = 100;
                System.out.println("fin del proceso");
        }
    }

    public void bootOption() {
        String type;
        
        System.out.println("|------------------| Opción de arranque |------------------|");
        System.out.println("|¿Desea arrancar el programa con una base de materia prima?|");
        System.out.println("|----------------------------------------------------------|\n");
        System.out.println("Si(S): se crearan productos de prueba");
        System.out.println("NO(N): Los valores se inicializan en 0, deberá de rellenar todos los productos");
        System.out.println("-Presiona cualquier tecla para salir-");

        System.out.print("\n -Ingrese su opción: ");
        type = this.scan.nextLine().toLowerCase();
        switch (type) {
            case "s":
                this.productsInventory = Faker.generateDataFaker();
                this.mainMenu();
                break;
            case "n":
                this.mainMenu();
                break;
            default:
                option = 100;
                System.out.println("fin del proceso");
        }
    }

    /* ------------------------- main manu -------------------------*/
    public void mainMenu() {
        this.menuTitle("Menú principal");

        System.out.println("1) Administración de inventario");
        System.out.println("2) Registrar mis ventas");
        System.out.println("-Presiona cualquier tecla para salir-");

        System.out.print("\n -Ingresa su opción: ");

        this.option = this.scan.nextInt();
        do {
            switch (this.option) {
                case 1:
                    this.inventoryManagementMenu();
                    break;
                case 2:
                    this.salesMenu();
                    break;
                default:
                    option = 100;
                    System.out.println("fin del proceso");
            }
        } while (option >= 1 && option <= 2);
    }

    /* ------------------------- RawMaterialInventory Management Menu -------------------------*/
    private void inventoryManagementMenu() {
        do {
            this.menuTitle("Adminitración de inventario");

            System.out.println("1) Listar todos los productos del inventario");
            System.out.println("2) Ver el historial de ventas");
            System.out.println("3) Agregar productos al inventario");
            System.out.println("4) disminuir productos al invetario");
            System.out.println("5) Atras");
            System.out.println("-Presiona cualquier tecla para salir-");

            System.out.print("\n -Ingrese su opción: ");
            this.option = this.scan.nextInt();
            switch (this.option) {
                case 1:
                    this.productsInventory.printRawMaterial();
                    this.lastMenu();
                    break;
                case 2:
                    this.productsInventory.printSales();
                    this.lastMenu();
                    break;
                case 3:
                    this.addProductsMenu();
                    break;
                case 4:
                    this.editProductsMenu();
                    break;
                case 5:
                    this.mainMenu();
                    break;
                default:
                    option = 100;
                    System.out.println("fin del proceso");
            }
        } while (this.option >= 1 && this.option <= 4);
    }

    private void addProductsMenu() {
        do {
            this.menuTitle("Agregar productos al inventario");

            System.out.println("1) Agregar Fresas");
            System.out.println("2) Agregar Platano");
            System.out.println("3) Agregar Mango");
            System.out.println("4) Agregar Hielo");
            System.out.println("5) Agregar Leche");
            System.out.println("6) Agregar Azucar");
            System.out.println("7) Atras");
            System.out.println("-Presiona cualquier tecla para salir-");

            System.out.print("\n -Ingresa su opción: ");
            this.option = this.scan.nextInt();

            switch (this.option) {
                case 1:
                    System.out.println("¿Cuantos ml desea ingresar?");
                    this.productsInventory.addStrawberries(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 2:
                    System.out.println("¿Cuanto desea ingresar?");
                    this.productsInventory.addBananas(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 3:
                    System.out.println("¿Cuanto desea ingresar?");
                    this.productsInventory.addMango(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 4:
                    System.out.println("¿Cuanto desea ingresar?");
                    this.productsInventory.addIce(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 5:
                    System.out.println("¿Cuanto desea ingresar?");
                    this.productsInventory.addMilk(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 6:
                    System.out.println("¿Cuanto desea ingresar?");
                    this.productsInventory.addSugar(this.scan.nextFloat());

                    break;
                case 7:
                    this.inventoryManagementMenu();
                    break;
                default:
                    option = 100;
                    System.out.println("fin del proceso");
            }
        } while (this.option >= 1 && this.option <= 7);
    }

    private void editProductsMenu() {
        do {
            this.menuTitle("Restar productos al inventario");

            System.out.println("1) Restar Fresas");
            System.out.println("2) Restar Platano");
            System.out.println("3) Restar Mango");
            System.out.println("4) Restar Hielo");
            System.out.println("5) Restar Leche");
            System.out.println("6) Restar Azucar");
            System.out.println("7) Atras");
            System.out.println("-Presiona cualquier tecla para salir-");

            System.out.print("\n -Ingresa su opción: ");
            this.option = this.scan.nextInt();

            switch (this.option) {
                case 1:
                    System.out.println("¿Cuantos ml desea disminuir?");
                    this.productsInventory.subtractStrawberries(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 2:
                    System.out.println("¿Cuanto desea disminuir?");
                    this.productsInventory.subtractBananas(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 3:
                    System.out.println("¿Cuanto desea disminuir?");
                    this.productsInventory.subtractMangos(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 4:
                    System.out.println("¿Cuanto desea disminuir?");
                    this.productsInventory.subtractIce(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 5:
                    System.out.println("¿Cuanto desea disminuir?");
                    this.productsInventory.subtractMilk(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 6:
                    System.out.println("¿Cuanto desea disminuir?");
                    this.productsInventory.subtractSugar(this.scan.nextFloat());
                    this.lastMenu();
                    break;
                case 7:
                    this.inventoryManagementMenu();
                    break;
                default:
                    option = 100;
                    System.out.println("fin del proceso");
            }
        } while (this.option >= 1 && this.option <= 7);
    }

    /* ------------------------- product sales menu -------------------------*/
    private void salesMenu() {
        do {
            this.menuTitle("Registro de ventas");

            System.out.println("1) Venta de bebida sabor fresa");
            System.out.println("2) Venta de bebida sabor banana");
            System.out.println("3) Venta de bebida sabor mango");
            System.out.println("4) Atras");
            System.out.println("-Presiona cualquier tecla para salir-");

            System.out.print("\n -Ingresa su opción: ");
            this.option = this.scan.nextInt();
            switch (option) {
                case 1:
                    this.productsInventory.subtractStrawberryDrink();
                    System.out.println("Venta de bebida de fresa registrado");
                    break;
                case 2:
                    this.productsInventory.subtractBananaDrink();
                    System.out.println("Venta de bebida de banana registrado");
                    break;
                case 3:
                    this.productsInventory.subtractMangoDrink();
                    System.out.println("Venta de bebida de mango registrado");
                    break;
                case 4:
                    this.mainMenu();
                    break;
                default:
                    option = 100;
                    System.out.println("fin del proceso");
            }
        } while (this.option >= 1 && this.option <= 4);
    }
}
