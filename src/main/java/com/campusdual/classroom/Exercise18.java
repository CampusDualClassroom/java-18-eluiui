package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int tamano = Utils.integer("Tamaño del array: ");
		int[] myArray = createAndInitializeArray(tamano);

		showInlineArray(myArray);
	}

	public static int[] createAndInitializeArray(int num) {
		int[] intArray = new int[num];

		for (int i = 0; i < num; i++) {
			intArray[i] = i + 1;
		}
		return intArray;
	}

	public static void showInlineArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i < intArray.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
