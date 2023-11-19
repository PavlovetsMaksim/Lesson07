package edu.training.Lesson07.main;

import java.util.Random;

public class Example03 {

	public static void main(String[] args) {
		int n = 6;
		
		double[] x = new double[n];
		double[] z = new double[n];
		
		initArrayWithRandom(x);
		initArrayWithRandom(z);
		
		printArray("Массив X:", x);
		printArray("Массив Z:", z);
		
		System.out.println();
		
		createYArray(x, z);
		
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
	
	public static void createYArray(double[] x, double[] z) {
		double[] y = new double[x.length];
		
		Random rand = new Random();
		
		double a = rand.nextDouble() * 100;
		double b = rand.nextDouble() * 100;
		double c = rand.nextDouble() * 100;
		double d = rand.nextDouble() * 100;
		
		for (int i = 0; i < x.length; i++) {
			y[i] = (a * x[i] + b) / (c * z[i] + d);
		}
		
		printArray("Массив Y:", y);
	}

}
