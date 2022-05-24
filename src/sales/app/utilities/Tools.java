/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales.app.utilities;

/**
 *
 * @author kenjo
 */
public class Tools {
    public static String fillString(int limit){
        String newStr = "";
        for (int i = 0; i < limit; i++) {
            newStr += " ";
        }
        return newStr;
    }
}
