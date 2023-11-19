package edu.training.Lesson07.main;

import java.util.Arrays;
import java.util.Random;

public class Example07 {

	public static void main(String[] args) {

		double[] x = new double[10];

		initArrayWithRandom(x);
		printArray("Массив X:", x);

		createArrayY(x);

	}

	public static void createArrayY(double[] x) {

		double[] y = new double[x.length];

		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}

		sortArray(y);

	}

	public static void initArrayWithRandom(double[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble(100);
		}

	}

	public static void printArray(String message, double[] array) {

		System.out.println("--------------" + message + "--------------");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%.2f]", array[i]);
		}

		System.out.println();

	}
	
	public static void sortArray(double[] y) {

		Arrays.sort(y);

		for (int i = 0; i < y.length / 2; i++) {
			double tmp = y[i];
			
			y[i] = y[y.length - 1 - i];
			y[y.length - 1 - i] = tmp;
		}

		printArray("Массив Y:", y);
	}

}
