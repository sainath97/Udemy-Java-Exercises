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
public class FightingWith3Monsters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        
        int yourAttack = generator.nextInt(6)+5;
        System.out.println("Your Attack Points: "+yourAttack);
        int yourDefense = generator.nextInt(10)+6;
        System.out.println("Your Defense Points: "+yourDefense);
        int yourDamage = generator.nextInt(3)+2;
        System.out.println("Your Damage: "+yourDamage);
        int yourLife = generator.nextInt(20)+20;
        System.out.println("Your Life Points:"+yourLife);
        
        for(int i=0;i<3;i++){
            String monsterName = null;
            int num=generator.nextInt(5);
            switch(num)
            {
                case 0:monsterName="Alien";break;
                case 1:monsterName="Rabbit";break;
                case 2:monsterName="Daemon";break;
                case 3:monsterName="Mountain";break;
                case 4:monsterName="Rock";break;
            }

            int monsterAttack = generator.nextInt(8)+1;        
            System.out.println("Attack Points of "+monsterName+": "+monsterAttack);
            int monsterDefense = generator.nextInt(15)+5;
            System.out.println("Defense Points of "+monsterName+": "+monsterDefense);
            int monsterDamage = generator.nextInt(3)+1;
            System.out.println("Damage of "+monsterName+": "+monsterDamage);
            int monsterLife = generator.nextInt(20)+15;
            System.out.println("Life Points of "+monsterName+": "+monsterLife);

            sc.nextLine();
            boolean runAway=false;
            do{
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
                        System.out.println(monsterName+"'s remaining Life Points: " + monsterLife);
                    } else {
                        System.out.println("Your attack was not successful.");
                    }
                } else {
                    System.out.println("Monster attacks.");
                    int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                    int attackValue = monsterAttack + dice;
                    System.out.println("Rolled values:"+dice);
                    System.out.println(monsterName+"'s attack value: " + attackValue);
                    if (attackValue > yourDefense) {
                        System.out.println(monsterName+"'s attack was successful.");
                        yourLife = yourLife - monsterDamage;
                        System.out.println("Your remaining Life Points: " + yourLife);
                    } else {
                        System.out.println(monsterName+"'s attack was not successful.");
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
            else if(yourLife<=0){
                System.out.println("You are dead.. :-(");
                break;
            }
        }
    }  
}
