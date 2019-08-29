package com.globallogic;

import java.util.Arrays;

public class ArrayProcessing {

    Common common = new Common();

    private int indexOf(int[] arr, int val) {
        return Arrays.asList(arr).indexOf(val);
    }

    public int[] uniqueElements(int[] arr) {

        int uniqueElementsCounter = 0;
        int[] arrOfUniqueElements = new int[arr.length];

        for (int i = 0; i <= arr.length; i++) {
            if (!common.contains(arrOfUniqueElements, arr[i])) {
                arrOfUniqueElements[uniqueElementsCounter] = arr[i];
                uniqueElementsCounter++;
            }
        }

        int[] a = new int[uniqueElementsCounter];

        System.arraycopy(arrOfUniqueElements, 0, a, 0, arrOfUniqueElements.length);

        return a;

//        int uniqueElementsCounter = 0;
//
//        for (int i = 0; i <= arr.length; i++) {
//            if (indexOf(arr, i) == i) {
//                uniqueElementsCounter++;
//            }
//        }
//
//        int[] arrOfUniqueElements = new int[uniqueElementsCounter];
//
//        for (int i = 0, j = 0; i <= arr.length; i++) {
//            if (indexOf(arr, i) == i) {
//                arrOfUniqueElements[j] = arr[i];
//                j++;
//            }
//        }

        // return arrOfUniqueElements;
    }

    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
//        int[] mergedArray = new int[arr1.length + arr2.length];
//        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
//        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
//
//        return uniqueElements(mergedArray);
        return null;
    }

    public int[] commonElements(int[] arr1, int[] arr2) {
        int commonElementsCounter = 0;

        for (int i : arr1) {
            if (common.contains(arr2, i)) {
                commonElementsCounter++;
            }
        }

        int[] commonElementsArray = new int[commonElementsCounter];

        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (common.contains(arr2, arr1[i])) {
                commonElementsArray[j] = arr1[i];
                j++;
            }
        }

        return commonElementsArray;
    }

    public int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int elI = arr.length - i - 1;
            reversedArray[i] = arr[elI];
        }
        return reversedArray;
    }

    public int[] sortEvenPositionArray(int[] arr) {
        int evenLength = arr.length / 2;

        if (arr.length % 2 != 0) {
            evenLength = evenLength + 1;
        }

        int[] onlyEvenElements = new int[evenLength];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i % 2 != 1) {
                onlyEvenElements[j] = arr[i];
                j++;
            }
        }

        Arrays.sort(onlyEvenElements);

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = onlyEvenElements[j];
                j++;
            }
        }

        return arr;
    }
}
