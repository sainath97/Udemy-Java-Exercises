/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class RunAway {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Attack Points of Monster:");
        int monsterAttack = sc.nextInt();
        System.out.println("Defense Points of Monster:");
        int monsterDefense = sc.nextInt();
        System.out.println("Damage of Monster:");
        int monsterDamage = sc.nextInt();
        System.out.println("Life Points of Monster:");
        int monsterLife = sc.nextInt();
        
        System.out.println("Your Attack Points:");
        int yourAttack = sc.nextInt();
        System.out.println("Your Defense Points:");
        int yourDefense = sc.nextInt();
        System.out.println("Your Damage:");
        int yourDamage = sc.nextInt();
        System.out.println("Your Life Points:");
        int yourLife = sc.nextInt();
        sc.nextLine();
        boolean runAway=false;
        do{
            Random generator = new Random();
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                System.out.println("You attack");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = yourAttack + dice;
                System.out.println("Rolled values: "+dice);
                System.out.println("Your attack value: " + attackValue);
                if (attackValue > monsterDefense) {
                    System.out.println("Your attack was successful.");
                    monsterLife = monsterLife - yourDamage;
                    System.out.println("Monster's remaining Life Points: " + monsterLife);
                } else {
                    System.out.println("Your attack was not successful.");
                }
            } else {
                System.out.println("Monster attacks.");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = monsterAttack + dice;
                System.out.println("Rolled values:"+dice);
                System.out.println("Monster's attack value: " + attackValue);
                if (attackValue > yourDefense) {
                    System.out.println("Monster's attack was successful.");
                    yourLife = yourLife - monsterDamage;
                    System.out.println("Your remaining Life Points: " + yourLife);
                } else {
                    System.out.println("Monster's attack was not successful.");
                }
            }
            System.out.println("Press ENTER to continue or type in 'run' to run away.");
            String command=sc.nextLine();
            switch(command)
            {
                case "run":
                    System.out.println("you run away..");
                    runAway=true;
                    break;
                default:
            }
        }while(yourLife>0&&monsterLife>0&&!runAway);
        if(monsterLife<=0)
            System.out.println("Hurray! You Won.... :-)");
        else if(yourLife<=0)
            System.out.println("You are dead.. :-(");
    }  
}
