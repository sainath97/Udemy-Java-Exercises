/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celsius Value: ");
        double cel=sc.nextDouble();
        double far=(9.0/5.0)*cel+32.0;
        System.out.println("\nFahrenheit Value: "+far);
    }
    
}
