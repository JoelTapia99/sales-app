/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.products;

import sales.app.exceptions.InsufficientQuantityException;

/**
 *
 * @author kenjo
 */
public class Product {

    private String name;
    private float amount;

    public Product(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void addAmount(float amount) {
        this.amount += amount;
    }

    public void subtractAmount(float amount) throws InsufficientQuantityException {
        float aux = this.getAmount();
        if ((aux - amount) > 0) {
            this.amount -= amount;
        } else {
            throw new InsufficientQuantityException("No hay sufuciente cantidad de " + this.getName() + " para realizar la resta");
        }
    }
    
    @Override
    public String toString() {
        return this.getName() + " = " + Float.toString(this.getAmount()) + " ";
    }
}
