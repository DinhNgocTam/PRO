/*
@author Hi
@date May 13, 2023
*/
package lab2;

import java.util.Scanner;

public class Lab2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] names = new String[5];
		float[] scores = new float[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the " + (i + 1) + "nd Student information");
			names[i] = enterNames();

			scores[i] = enterScores();
			sc.nextLine();
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			printStudent(names[i], scores[i], rank(scores[i]));
		}
	}

	public static String enterNames() {
		System.out.println("Enter name: ");

		String name = sc.nextLine();

		return name;
	}

	public static float enterScores() {
		float score;

		while (true) {
			System.out.println("Enter score's student: ");

			score = sc.nextFloat();
			if (checkScore(score) == true) {
				break;
			} else {
				System.out.println("Invalid score, please re-enter: ");
			}
		}
		return score;
	}

	public static boolean checkScore(float score) {

		return score > 0 && score <= 10;
	}

	public static String rank(float score) {
		if (score < 5) {
			return "Weak";
		} else if (score < 7) {
			return "Average";
		} else if (score < 8) {
			
			return "Rather";
		} else if (score < 9) {
			return "Good";
		} else {
			return "Excellent";
		}
	}

	public static void printStudent(String name, float score, String classification) {
		System.out.println("Information Student: ");
		System.out.println("-Name : " + name);
		System.out.println("-Score : " + score);
		System.out.println("-Results of classification: : " + classification);
		System.out.println();
	}
}
