package com.tiy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Validator validator = new Validator();

        while(true){
            System.out.printf("%nYou must be at least 18 to enter!%nWhat is your Age: ");
            try{
                    if (validator.validateAge(scanner.next())) {
                        System.out.printf("%nCongratulations! %nYou are over 18 and are accepted to enter.%n");
                        break;
                    }
            }catch(Exception e){
                System.out.printf("%nError: %s%n", e.getMessage());
            }
        }
    }
}
