package com.tgt.igniteplus;
import java.util.Scanner;
public class IfCondition {
    public static void main(String args[])
    {
        int num;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        num=in.nextInt();
        //to check if entered number is positive or negative
        if(num>=0)
            System.out.println("positive number");
        else
            System.out.println("negative number");

        //To find if number is even and divisible by 5
        //Nested if condition
        if(num % 2 == 0)
            if(num % 5 == 0)
                System.out.println("number is even and divisible by 5");
    }
}
