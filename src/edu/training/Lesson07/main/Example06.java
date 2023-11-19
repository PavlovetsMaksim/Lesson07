package edu.training.Lesson07.main;

import java.util.Random;

public class Example06 {

	public static void main(String[] args) {
		int n = 5;
		
		double[] x = new double[n];
		double[] y = new double[n];
		
		initArrayWithRandom(x);
		initArrayWithRandom(y);
		
		printArray("Массив X", x);
		printArray("Массив Y", y);
		
		System.out.println();
		
		double result = sumAndCount(x, y);
		
		System.out.printf("Сумма: " + "%.2f", result);

	}
	
	public static void initArrayWithRandom(double[] mas) {
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 100;
		}
	}
	
	public static void printArray(String message, double[] mas) {
		System.out.println("--------------" + message + "--------------");
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%.2f]", mas[i]);
		}
		
		System.out.println();
	}
	
	public static double sumAndCount(double[] x, double[] y) {
		int count = 0;
		double sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i] ) {
				if (x[i] > 0) {
					sum += x[i];
					count++;
				}
			}
		}
		
		System.out.println("Количество элементов: " + count);
		
		return sum;
	}

}
