package com.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void search() {
        int []list = {10,11,12,13,14,15};
        int target = 56;

        LinearSearch linearSearch = new LinearSearch(list, target);

        assertEquals(-1, linearSearch.search());
    }
}