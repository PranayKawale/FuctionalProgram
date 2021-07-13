package com.function;

import java.util.Scanner;

public class QuadraticEq {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        double a = num.nextDouble();
        System.out.print("Enter value of b : ");
        double b = num.nextDouble();
        System.out.print("Enter value of c : ");
        double c = num.nextDouble();
        double r1, r2;

        double delta = b * b - 4.0 * a * c;
        if (delta > 0){
            r1 = (- b + Math.pow(delta, 0.5)) / (2 * a);

            r2 = (- b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Root1 : "+r1+" Root2 : "+r2);
	}  else if (delta == 0) {
		 r1 = r2 = -b / (2 * a);
		 System.out.println("Root1 : "+r1+" Root2 : "+r2);
	} else {
		System.out.println(" Root are complex number");
	}

  }      

}
