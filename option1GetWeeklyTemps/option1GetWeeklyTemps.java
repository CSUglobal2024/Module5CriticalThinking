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

	        // Use a for loop to prompt user to input daily average temperatures for one week
	        for (int i = 0; i < 7; i++) {
	            System.out.print("Enter the day of the week (e.g., Monday): ");
	            String day = scanner.nextLine();
	            daysOfWeek.add(day);

	            System.out.print("Enter the average temperature for " + day + ": ");
	            double temperature = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline character
	            temperatures.add(temperature);
	        }

	    
	        // Calculate and display weekly average temperature
	        double tempSum = 0;
	        for (double temp : temperatures) {
	            tempSum += temp;
	        }
	        double weeklyAverage = tempSum / temperatures.size();
	        System.out.println("Weekly average temperature: " + weeklyAverage + " degrees");

	        // Prompt user for a specific day or "week" and display the corresponding temperature
	        while (true) {
	            System.out.print("Enter a day of the week (Monday through Sunday) to see that day's average temperature or 'week' for the weekly average (or 'exit' to quit): ");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break;
	            } else if (input.equalsIgnoreCase("week")) {
	                // Display daily temperatures
	    	        for (int i = 0; i < 7; i++) {
	    	            System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + " degrees");
	    	        }
	                System.out.println("Weekly average temperature: " + weeklyAverage + " degrees");
	            } else {
	            	String inputLowerCase = input.toLowerCase(); // added this so that if the input does not match the case of the original input the user will still get a response
	                int index = -1; 
	                for (int i = 0; i < daysOfWeek.size(); i++) { // find the index of the day of the week inputted by user
	                    if (daysOfWeek.get(i).equalsIgnoreCase(inputLowerCase)) { // Compare ignoring case
	                        index = i;
	                        break;
	                    }
	                }
	                if (index != -1) { //if the index is a valid on (1-6) then the input was valid for a day of the week
	                    System.out.println("Temperature on " + daysOfWeek.get(index) + ": " + temperatures.get(index) + " degrees");
	                } else { //put this one last to account for any user input error
	                    System.out.println("Invalid input. Please enter a valid day of the week (e.g., Monday) or 'week'.");
	                }
	            }
	        }

	        scanner.close();

	}

}
