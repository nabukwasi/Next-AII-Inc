/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vucoursework.nextaiinc;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class NextAIInc {
    // Method to calculate and print total weekly pay or display error messages
    public void calculatePay(double basePay, int hoursWorked) {
        // Minimum base pay
        final double MIN_BASE_PAY = 30000;
        // Maximum allowed working hours per week
        final int MAX_HOURS = 72;

        // Check if base pay is below the minimum
        if (basePay < MIN_BASE_PAY) {
            System.out.println("Error: Base pay is below the minimum required rate of UGX 30,000/hour.");
            return; // Exit method
        }

        // Check if hours worked exceed the maximum limit
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum allowed limit of 72 hours/week.");
            return; // Exit method
        }

        // Calculate pay
        double totalPay;
        if (hoursWorked <= 48) {
            totalPay = basePay * hoursWorked; // No overtime
        } else {
            int overtimeHours = hoursWorked - 48; // Hours beyond 48 are overtime
            totalPay = (basePay * 48) + (overtimeHours * basePay * 2); // Regular + Overtime pay
        }

        // Print total pay
        System.out.printf("Total Weekly Pay: UGX %.2f\n", totalPay);
    }

    public static void main(String[] args) {
        // Create an instance of NextAIInc
        NextAIInc nextAI = new NextAIInc();
        Scanner scanner = new Scanner(System.in);

        // Input base pay and hours worked
        System.out.println("Enter the base pay (UGX/hour): ");
        double basePay = scanner.nextDouble();

        System.out.println("Enter the hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Call the method to calculate pay
        nextAI.calculatePay(basePay, hoursWorked);

        scanner.close();
    }
}
