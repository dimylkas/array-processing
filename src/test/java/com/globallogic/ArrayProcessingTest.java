package com.globallogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayProcessingTest {

    private ArrayProcessing unit = new ArrayProcessing();

    @Test
    void uniqueElementsArray() {
        int[] actual = unit.uniqueElements(new int[]{1, 2, 4, 2, 5});
        assertArrayEquals(new int[]{1, 2, 4, 5}, actual);
    }

    @Test
    void uniqueElementsArrayWithAlreadyUniqueElements() {
        int[] actual = unit.uniqueElements(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{1, 2, 3, 4}, actual);
    }

    @Test
    void uniqueElementsArrayWithSeveralUniqueElements() {
        int[] actual = unit.uniqueElements(new int[]{1, 1, 2, 3, 2, 4, 2, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    void uniqueElementsArrayWithEmptyArray() {
        int[] actual = unit.uniqueElements(new int[0]);
        assertArrayEquals(new int[0], actual);
    }
}