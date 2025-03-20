package com.example.algorithms;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void search() {
        int []list = {1,2,3,4,5,6,7,8,9};
        int target = 9;



        assertEquals(8, BinarySearch.search(list, target));
    }

    @Test
    void binarySearch() {
        int []list = {1,2,3,4,5,6,7,8,9};
        int target = 9;

        assertEquals(8, BinarySearch.binarySearch(list, target));

    }
}