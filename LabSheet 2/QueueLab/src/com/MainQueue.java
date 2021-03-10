package com;
import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {
		
		QueueX printerQueue = new QueueX(5);//create a object
		Scanner sc = new Scanner(System.in);//scanner object
		
		int inputStr;//declare a variable
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter transaction ID " + i + " " + ":" + " ");//prompt
			inputStr = sc.nextInt();//assign input
			printerQueue.insert(inputStr);//use insert method
			
		}
		
		QueueX evenQueue = new QueueX(5);//all 5 values might even
		QueueX oddQueue = new QueueX(5);//all 5 values might odd
		
		int value;//declare variable
		
		while (!printerQueue.isEmpty()) {
			value = printerQueue.remove();
			//check even or odd
			if (value % 2 == 0) {
				evenQueue.insert(value);
			}
			else {
				oddQueue.insert(value);
			}
		}
			
		System.out.println("PC1");//output
		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());//output
		}
			
		System.out.println("PC2");//output
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());//output
		}

	}

}
