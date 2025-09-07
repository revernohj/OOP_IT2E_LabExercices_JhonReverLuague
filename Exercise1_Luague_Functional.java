// **************************************************************
// File Name: Exercise1_Functional.java
// Author: Jhon Rever Luague
// Date: September 06 2025
// Deskripsyon: Nagpakita sa Functional Programming sa Java
//              gamit ang lambda ug stream API.
// **************************************************************

import java.util.Arrays;    // Gigamit para sa Arrays.asList()
import java.util.List;      // Import sa List interface
import java.util.stream.Collectors;  // Gigamit sa collect() method

public class Exercise1_Functional {
    public static void main(String[] args) {
        // Dataset nga naglangkob sa mga numero (user-defined)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Functional style:
        // Isulti lang unsay gusto buhaton → pili ug even numbers unya i-square
        List<Integer> squaresOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)        // pagpili lang sa even numbers
                .map(n -> n * n)                // pag-square sa matag numero
                .collect(Collectors.toList());  // ibutang sa usa ka bag-ong lista

        // Ipakita ang resulta
        System.out.println("Mga square sa even numbers (Functional): " + squaresOfEven);
    }
}

// ----------------------------
// SAMPLE OUTPUT:
// ----------------------------
// Mga square sa even numbers (Functional): [4, 16, 36, 64, 100]
//
// GENERAL COMMENT:
// Ang functional approach mas klaro ug mubo isulti.
// Dili na kinahanglan mag-loop sa detalye, kay ang stream()
// mao nay mo-handle sa tanan nga proseso.
// ----------------------------
