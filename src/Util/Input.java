package Util;

import java.util.Scanner;

public class Input {
    private Scanner scn;

    public Input(){
        this.scn = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Please enter a string.");
        String userStringInput = scn.nextLine();
        return userStringInput;
    }
    boolean yesNo(){
        System.out.println("Continue yes or no");
        String userBoolean = scn.nextLine();
        if (userBoolean.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    int getInt(int min, int max){
        System.out.println("please enter a number between 1 and 100");
        int userInt = scn.nextInt();
        while (userInt >= max || userInt <= min){
            System.out.println("please enter a number between 1 and 100");
             userInt = scn.nextInt();
        }
        return userInt;
    }
    int getInt(){
        System.out.println("Pleae enter an integer");
        int userInt = scn.nextInt();
        return userInt;
    }
    double getDouble(double min, double max){
        System.out.println("Please enter an integer");
        double userDouble = scn.nextDouble();
        return userDouble;
    }
    double getDouble(){
        System.out.println("Please enter any number");
        return scn.nextDouble();
    }
}
