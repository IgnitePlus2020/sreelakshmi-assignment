package com.tgt.igniteplus;
import java.util.Scanner;

import static java.lang.System.exit;

public class SwitchCondition {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        char op;
        int a,b;
        float result;
        System.out.println("enter two numbers");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("enter the operation to be performed(+,-,*,/): ");
        op=in. next(). charAt(0);
        switch(op)
        {
            case '+': result = a + b ;
                System.out.println(a+" + "+b+" = "+result);
                break;
            case '-': result = a - b ;
                System.out.println(a+" - "+b+" = "+result);
                break;
            case '*': result = a * b ;
                System.out.println(a+" / "+b+" = "+result);
                break;
            case '/': if(b==0){
                System.out.println("divide by zero error");
                exit(0);
            }
            else {
                result = (float)a / b;
                System.out.println(a + " / " + b + " = " + result);
            }
            break;
            default: System.out.println("Invalid operation");

        }
    }
}
