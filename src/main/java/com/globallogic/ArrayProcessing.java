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
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    public int[] sortEvenPositionArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            for (int j = 0; j < arr.length - i - 2; j = j + 2) {
                if (arr[j] > arr[j + 2]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = tmp;
                }
            }
        }
        return arr;
    }
}
