package by.java.yakovitski.homework.lesson5.array;

import java.util.Arrays;

public class Array implements MySuperArray {

	private String [] array;
	private int arraySize;
	
	public Array(String[] array) {
		this.array = array;
	}
	
	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}
	
	public Array(int ArraySize) {
		this.array = new String [ArraySize];
	}
	
	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
	@Override
	public String toString() {
		return "Array = " + Arrays.toString(array);
	}

	@Override
	public int getLength() {
		return array.length;
	}

	@Override
	public int addElement(String string) {
		String[] arrayCopy = new String [array.length + 1];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = this.array[i];
		}
		arrayCopy[arrayCopy.length - 1] = string;
		this.array = arrayCopy;
		return arrayCopy.length - 1;
	}

	@Override
	public String getElement(int index) {
			if (index >= 0 && index < array.length) {
				return array[index];
			}
			else {
				return "Индекс за пределами массива";	
			}
	}

	@Override
	public void removeAllElements() {
		this.array = new String [0];
	}

	@Override
	public String[] getAllElements() {
		return this.array;
	}
}
