/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.inventory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import sales.app.products.Product;

/**
 *
 * @author kenjo
 */
public class SalesRecord {

    private String name;
    private String date;

    public SalesRecord(String name) {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy | HH:mm:ss");

        this.clearName(name);
        this.date = dateObj.format(formatDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private void clearName(String name) {
        if (name.contains("fresa")) {
            this.name = "Fresa";
        }
        if (name.contains("platano")) {
            this.name = "Platano";
        }
        if (name.contains("mango")) {
            this.name = "Mango";
        }
    }
}
