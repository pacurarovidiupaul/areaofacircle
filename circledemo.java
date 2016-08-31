/**
 * @autor: Ovidiu Pacurar
 * @description: This program calculate area and circumference of a circle with
 * the user interaction. User will be prompt to enter the radius and the result
 * will be calculated base on the provided radius value.
 * Another version to see how is working
 */

package ro.testjava.circledemo;

import java.util.Scanner;

public class CircleDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the radius: ");
		/*
		 * We are storing the entered radius in double because a user can enter
		 * the radius in decimals
		 */
		double radius = sc.nextDouble();
		// Area = PI * radius * radius
		double area = Math.PI * (radius * radius);
		System.out.println("The are o circle is: " + area);
		// Circumferene = 2 * PI * radius
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of cirlces is: " + circumference);

	}

}
