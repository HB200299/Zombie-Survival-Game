package zombiesurvivalgame;

import java.util.Random;
import java.util.Scanner;

public class ZombieSurvivalGame {
    
    public static boolean town = false;
    public static boolean forrest = false;
    public static boolean car = false;
    public static int wood = 0;
    public static int string = 0;
    public static int stone = 0;
    public static int gun = 0;
    public static int scrap = 0;
    public static int powerSources = 0;
    
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        
        int start = random.nextInt(3);
        if (start == 0) {
            System.out.println("You wake up in the wilderness just outside a deserted city.");
            System.out.println("Inside the city walls you can see multiple human-like shapes shuffling around");
            forrest = true;
        }
        if (start == 1) {
            System.out.println("You wake up inside an abandoned and crumbling building.");
            System.out.println("Outside the building, you hear the shambling of bodies and dathly moaning.");
            town = true;
        }
        if (start == 2) {
            System.out.println("You wake up in a broken car just outside a deserted city.");
            System.out.println("Inside the city walls you can see multiple human-like shapes shuffling around");
            car = true;
        }

        while (true) {
            action();
            System.out.println("You currently have "+wood+" wood, "+string+" string, "+stone+" stones, "+gun+" guns, "+scrap+" scrap, and "+powerSources+" power sources");
        }
    }

    public static void action() {
        Scanner input = new Scanner(System.in);
        if (forrest == true) {
            System.out.println("You are in the forrest, what would you like to do?");
            System.out.println("1-gather reasourses from the forrest");
            System.out.println("2-head into the city");
            System.out.println("3-head to the nearby road");
            System.out.println("4-explore the forrest");
            int ent =input.nextInt();
            choice(ent);
        }
        if (town == true) {
            System.out.println("You are in the town centre, what would you like to do?");
            System.out.println("1-gather reasourses from the city");
            System.out.println("2-head to the forrest just outside the city");
            System.out.println("3-head to the road outside the city");
            System.out.println("4-explore the city");
            int ent =input.nextInt();
            choice(ent);
        }
        if (car == true) {
            System.out.println("You are in the car, what would you like to do?");
            System.out.println("1-fix the car");
            System.out.println("2-head to the nearby forrest");
            System.out.println("3-head into the city");
            System.out.println("4-check the car");
            int ent =input.nextInt();
            choice(ent);
        }

    }
    
    public static void choice(int a){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        if (forrest == true) {
            if(a==1){
                System.out.println("You gather reasourses from the forrest");
                int temp = random.nextInt(3);
                System.out.print("Youv'e gathered "+temp+" wood, ");
                wood = wood+temp;
                temp = random.nextInt(3);
                System.out.print(temp+" string, and ");
                string = string+temp;
                temp = random.nextInt(3);
                System.out.println(temp+" stone.");
                stone = stone+temp;
            }
            if(a==2){
                forrest = false;
                town = true;
                System.out.println("You head into an abanoned building on the outskirts of the city");
            }
            if(a==3){
                forrest = false;
                car=true;
                System.out.println("You get into an abandoned car on the side of the road");
            }
            if(a==4){
                System.out.println("You journey deep into the forrest");
                
                
            }
        }
        if (town == true) {
            if(a==1){
                
            }
            if(a==2){
                town=false;
                forrest=true;
                System.out.println("You head into the forest just outside of town");
            }
            if(a==3){
                town=false;
                car=true;
                System.out.println("You get into an abandoned car on the side of the road");
            }
            if(a==4){
                System.out.println("You head into the confines of the city");
                
                
                
                
            }
        }
        if (car == true) {
            if(a==1){
                
            }
            if(a==2){
                car=false;
                forrest=true;
                System.out.println("You head into the forest just outside of town");
            }
            if(a==3){
                car=false;
                town=true;
                System.out.println("You head into an abanoned building on the outskirts of the city");
            }
            if(a==4){
                
            }
        }  
    }

    public static void endgame() {

    }
}
