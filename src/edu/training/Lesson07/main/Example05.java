package edu.training.Lesson07.main;

import java.util.Random;

public class Example05 {

	public static void main(String[] args) {
		int n = 5;
		
		double[] a = new double[n];
		double[] b = new double[n];
		
		initArrayWithRandom(a);
		initArrayWithRandom(b);
		
		printArray("Массив A", a);
		printArray("Массив B", b);
		
		createTArray(a, b);

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
	
	public static void createTArray(double[] a, double[] b) {
		double[] t = new double[a.length];
		
		t[0] = a[0] / b[0];
		
		for (int i = 1; i < a.length; i++) {
			t[i] = Math.pow((a[i] / b[i]), 1./(i + 1));
		}
		
		printArray("Массив T", t);
	}

}
