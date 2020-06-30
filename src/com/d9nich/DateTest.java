package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    private final static Date date = new Date(2020, 6, 30);

    @Test
    void constructor() {
        assertThrows(IllegalArgumentException.class, () -> new Date(2020, 21, -10));
    }

    @Test
    void getYear() {
        assertEquals(2020, date.getYear());
    }

    @Test
    void getMonth() {
        assertEquals(6, date.getMonth());
    }

    @Test
    void getDay() {
        assertEquals(30, date.getDay());
    }

    @Test
    void testEquals() {
        assertEquals(new Date(2020, 6, 30), date);
        assertNotEquals(new Date(2021, 7, 12), date);
    }

    @Test
    void testHashCode() {
        assertEquals(new Date(2020, 6, 30).hashCode(), date.hashCode());
        assertNotEquals(new Date(2021, 7, 12).hashCode(), date.hashCode());
    }
}