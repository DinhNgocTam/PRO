/*
@author Hi
@date May 13, 2023
*/
package lab1;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int size;
			do {
				System.out.println("Enter the number of students you want: ");
				size = sc.nextInt();
				if (size <= 0) {
					System.out.println("Enter number > 0");
				}
			} while (size <= 0);

			sc.nextLine();
			String[] names = new String[size];
			float[] scores = new float[size];

			for (int i = 0; i < size; i++) {
				System.out.println("Enter the " + (i + 1) + "nd Student information");
				System.out.println("Enter name: ");
				String name = sc.nextLine();

				System.out.println("Enter score: ");

				float score = sc.nextFloat();

				while (score < 0 || score > 10) {
					System.out.println("Invalid score, please re-enter: ");
					score = sc.nextFloat();
				}

				names[i] = name;
				scores[i] = score;

				
				sc.nextLine();
			}

			for (int i = 0; i < size; i++) {
				System.out.println(+(i + 1) + "nd Student Information");
				System.out.println("Name: " + names[i]);
				System.out.println("Scores: " + scores[i]);

				if (scores[i] < 5) {
					System.out.println("Results of classification: Weak");
				} else if (scores[i] < 7) {
					System.out.println("Results of classification: Average");
				} else if (scores[i] < 8) {
					System.out.println("Results of classification: Rather");
				} else if (scores[i] < 9) {
					System.out.println("Results of classification: Good");
				} else {
					System.out.println("Results of classification: Excellent");
				}

			}
		}
	}

}
