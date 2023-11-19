package edu.training.Lesson07.main;

public class Example04 {

	public static void main(String[] args) {
		int n = 20;

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = fibonacciSequence(i);
		}
		
		printArray("Массив из последовательности Фибоначчи", arr);

	}

	public static int fibonacciSequence(int number) {
		if ((number == 0) || (number == 1)) {
			return number;
		} else {
			return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
		}
	}
	
	public static void printArray(String message, int[] mas) {
		System.out.println("-----------------------" + message + "-----------------------");
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "]");
		}
	}

}
