package com.zhane;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;

        System.out.print("Please type in the values of each side separated with a comma : ");
        String str = input.nextLine();
        System.out.println("");

        try {
            String s = str.trim();
            String[] str1 = s.split(",");
            a = Double.parseDouble(str1[0]);
            b = Double.parseDouble(str1[1]);
            c = Double.parseDouble(str1[2]);

            CheckTriangle checkTriangle = new CheckTriangle();
            checkTriangle.check(a,b,c);
        }catch (Exception e){
            System.out.println("Please type the values correctly and separated with a comma.");
        }
    }
}
