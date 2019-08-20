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
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return uniqueElements(result);
    }

    public int[] commonElements(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int commonElementsNumber = 0;
        for (int arr1Element : arr1) {
            for (int arr2Element : arr2) {
                if (arr1Element == arr2Element) {
                    result[commonElementsNumber] = arr1Element;
                    commonElementsNumber++;
                }
            }
        }
        return Arrays.copyOf(result, commonElementsNumber);
    }

    public int[] reverseArray(int[] arr) {
        return null;
    }

    public int[] sortEvenPositionArray(int[] arr) {
        return null;
    }
}
