package com.zhane;

public class CheckTriangle {
    public void check(double a, double b, double c){
        if ( ((a + b) > c) && ((a + c) > b) && ((b + c) > a) ){
            if ( (a == b) && (a == c) ){
                System.out.println("This is a equilateral triangle");
            }
            else if ((a == b) || (a == c) || (b == c)){
                System.out.println("This is a isosceles triangle.");
            }
            else if ( (((a*a) + (b*b)) == (c*c)) || (((a*a) + (c*c)) == (b*b)) || (((c*c) + (b*b)) == (a*a)) ){
                System.out.println("This is a right Triangle");
            }
            else
                System.out.println("This is a valid triangle");
        }
        else {
            System.out.println("This is an invalid triangle");
        }

    }
}
