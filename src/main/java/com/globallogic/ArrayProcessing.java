package com.globallogic;

import java.util.Arrays;

public class ArrayProcessing {

    public int[] uniqueElements(int[] arr) {
        int[] resultArr = new int[arr.length];
        int uniqueElementsCounter = 0;
        for (int i : arr) {
            boolean isElementUnique = true;
            for (int j = 0; j < uniqueElementsCounter; j++) {
                if (i == resultArr[j]) {
                    isElementUnique = false;
                    break;
                }
            }
            if (isElementUnique) {
                resultArr[uniqueElementsCounter] = i;
                uniqueElementsCounter++;
            }
        }
        return Arrays.copyOf(resultArr, uniqueElementsCounter);
    }

    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        return null;
    }

    public int[] commonElements(int[] arr1, int[] arr2) {
        return null;
    }

    public int[] reverseArray(int[] arr) {
        return null;
    }

    public int[] sortEvenPositionArray(int[] arr) {
        return null;
    }
}
