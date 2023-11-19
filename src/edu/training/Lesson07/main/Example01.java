package edu.training.Lesson07.main;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		double[] x = new double[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++) {
			System.out.print("ar[" + i + "] => ");
			x[i] = sc.nextInt();
		}
		
		printArray(x);
		
		division(x);

	}

	public static void division(double[] x) {
		double[] y = new double[5];
		
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i] / i;
		}
		
		printArray(y);
		
	}
	
	public static void printArray(double[] mas) {        
        for (int i = 0; i < mas.length; i++) {
            System.out.println("ar[" + i + "] = " + mas[i]);
        }
        
    }

}
