/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

/**
 *
 * @author lenovo
 */
public class Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first=2;
        int second=10;
        int temp=second;
        second=first;
        first=temp;
        System.out.println("first= "+first+"\nsecond= "+second);
    }
    
}
