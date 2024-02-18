package option1GetWeeklyTemps;

import java.util.ArrayList;
import java.util.Scanner;

public class option1GetWeeklyTemps {

	public static void main(String[] args) {
//		DIRECTIONS: Develop a Java program that will store data in the form of daily average 
//		temperatures for one week. Store the day and average temperature in two 
//		different arraylists. Your program should prompt the user for the day of 
//		the week (Monday through Sunday) and display both the day and temperature 
//		for each day. If "week" is entered, the output for your program should 
//		provide the temperature for each day and the weekly average. Use the 
//		looping and decision constructs in combination with the arrays to complete 
//		this assignment.		
	        ArrayList<String> daysOfWeek = new ArrayList<>();
	        ArrayList<Double> temperatures = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to input daily average temperatures for one week
	        for (int i = 0; i < 7; i++) {
	            System.out.print("Enter the day of the week (e.g., Monday): ");
	            String day = scanner.nextLine();
	            daysOfWeek.add(day);

	            System.out.print("Enter the average temperature for " + day + ": ");
	            double temperature = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline character
	            temperatures.add(temperature);
	        }

	        // Display daily temperatures
	        for (int i = 0; i < 7; i++) {
	            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + " degrees");
	        }

	        // Calculate and display weekly average temperature
	        double sum = 0;
	        for (double temp : temperatures) {
	            sum += temp;
	        }
	        double weeklyAverage = sum / temperatures.size();
	        System.out.println("Weekly average temperature: " + weeklyAverage + " degrees");

	        // Prompt user for a specific day or "week" and display the corresponding temperature
	        while (true) {
	            System.out.print("Enter a day of the week (Monday through Sunday) or 'week' for the weekly average (or 'exit' to quit): ");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            } else if (input.equalsIgnoreCase("week")) {
	                System.out.println("Weekly average temperature: " + weeklyAverage + " degrees");
	            } else {
	                int index = daysOfWeek.indexOf(input);
	                if (index != -1) {
	                    System.out.println("Temperature on " + input + ": " + temperatures.get(index) + " degrees");
	                } else {
	                    System.out.println("Invalid input. Please enter a valid day of the week (e.g., Monday) or 'week'.");
	                }
	            }
	        }

	        scanner.close();

	}

}
