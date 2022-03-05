package com.pluralsight;

import java.util.Scanner;

public class Print_variable_0011_2 {
    public static void main(String[] args) {
       /**Instructions from your teacher:

        - Two variables, **num** and **cost** have been declared and given values:
        - **num** is an integer and **cost** is a double.
        - Write a single statement that prints **num** and **cost**.
        - Print both values (**num** first, then **cost**), _separated by a space on a single line_. Do not output any thing else.*/
        //do not change
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();
        System.out.println(num+" "+cost);
    }
}
