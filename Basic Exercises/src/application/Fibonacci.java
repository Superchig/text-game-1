package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Please input how long the fibonacci sequence should go.");
		
		int input = sc.nextInt();
		
		int currentFib = 0;
		
		int pastFib1 = 1;
		
		int pastFib2 = 0;
		
		list.add(currentFib);
		
		for (int i = input - 1; i > 0; i--) {
			
			pastFib2 = pastFib1;
			
			pastFib1 = currentFib;
			
			currentFib = pastFib1 + pastFib2;
			
			list.add(currentFib);
			
		}
		
		System.out.println(list);
		
		sc.close();
		
	}
	
}
