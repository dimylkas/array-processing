package com.globallogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayProcessingStreams {

    private Common common = new Common();

    public int[] uniqueElements(int[] arr) {
        return Arrays
                .stream(arr)
                .distinct()
                .toArray();
    }

    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        /*
        IntStream firstI = Arrays
                .stream(arr1)
                .filter(x -> !contains(arr2, x));

        IntStream secondI = Arrays
                .stream(arr2)
                .filter(x -> !contains(arr1, x));

        IntStream joinedStream = IntStream.concat(firstI, secondI);

        return joinedStream.toArray();
        */

        return uniqueElements(
                IntStream.concat(
                    Arrays.stream(arr1),
                    Arrays.stream(arr2)
                ).toArray()
        );
    }

    public int[] commonElements(int[] arr1, int[] arr2) {
        return Arrays
                .stream(arr1)
                .filter(x -> common.contains(arr2, x))
                .toArray();
    }

    public int[] reverseArray(int[] arr) {
        Integer[] newArray = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++) {
            newArray[i] = Integer.valueOf(arr[i]);
        }

        List<Integer> list = Arrays.asList(newArray);

        Collections.reverse(list);

        return list
                .stream()
                .mapToInt(i -> i)
                .toArray();

    }

    // @TODO: stream of even el ?
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
