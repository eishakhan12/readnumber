package com.company;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner input = null;
        try {
            System.out.println("Please Enter 10 numbers");
            input = new Scanner(System.in);
            int sum = 0;
            for (int i = 0; i < 10; i += 1){
                sum += input.nextInt();
            }
            System.out.println("The total sum is: " + sum );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
