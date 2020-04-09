package com.tgt.igniteplus;
import java.util.Scanner;
public class WhileCondition {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series ");
        int i=1;
        while(i<=n)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }

    }

}
// Fibonacci series