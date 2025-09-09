// **************************************************************
// File Name: Exercise1_Imperative.java
// Author: Jhon Rever Luague
// Date: September 06 2025
// Deskripsyon: Nagpakita sa Imperative Programming sa Java
//              gamit ang loop ug manual nga proseso.
// **************************************************************

import java.util.ArrayList; // Gigamit para makahimo og dynamic list
import java.util.List;      // Import para sa List collection

public class Exercise1_Imperative {
    public static void main(String[] args) {
        // Paghimo og lista sa numero gikan 1 hangtod 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);  // gi-add usa-usa ang mga numero
        }

        // Imperative style:
        // Step-by-step nga pagpangita sa even numbers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);  // i-save kung even
            }
        }

        // Ipakita ang resulta
        System.out.println("Mga even numbers (Imperative): " + evenNumbers);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Mga even numbers (Imperative): [2, 4, 6, 8, 10]
//
// GENERAL COMMENT:
// Ang imperative nga paagi mas detalyado, kinahanglan og
// loops ug kondisyon aron makuha ang resulta. Ang programmer
// mismo ang naglatid sa step-by-step nga buhaton sa computer.
// ----------------------------
