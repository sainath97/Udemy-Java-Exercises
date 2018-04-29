/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gooddievalue;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class GoodDieValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dieValue;
        do{
            System.out.println("Enter a die value: ");
            dieValue=sc.nextInt();
            if(dieValue<1||dieValue>6)
                System.out.println("The die value is bad.");
        }while(dieValue<1||dieValue>6);
    }
}
