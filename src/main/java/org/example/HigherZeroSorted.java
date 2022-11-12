package org.example;

import java.util.Arrays;

public class HigherZeroSorted {
    public static int[] returnHigherThanZeroSortedBackward (int[] inputMass){
        Arrays.sort(inputMass);
        int counter = 0;
        for (var element : inputMass){
            if (element < 0){
                counter++;
            } else break;
        }
        int[] outputMass = new int[inputMass.length-counter];
        for (int i = 0; i < outputMass.length; i++){
            outputMass[i] = inputMass[inputMass.length-1-i];
        }
        return outputMass;
    }
}
