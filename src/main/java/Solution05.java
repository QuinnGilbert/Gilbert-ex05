/*
 *  UCF COP3330 Fall 2021 Exercise 5
 *  Copyright 2021 Quinn Gilbert
 */
import java.util.*;
public class Solution05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt input
        System.out.print("What is the first number? ");
        //input number
        double a = in.nextDouble();
        //prompt input
        System.out.print("What is the second number? ");
        //input second number
        double b = in.nextDouble();
        //calculate sum, diff, product, quotient
        double sum = a+b;
        double diff = a-b;
        double product = a*b;
        double quotient = a/b;
        //print results
        System.out.printf("""
                %f + %f = %f
                %f - %f = %f
                %f * %f = %f
                %f / %f = %f
                """,a,b,sum,a,b,diff,a,b,product,a,b,quotient);
    }
}
