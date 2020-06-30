package com.d9nich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PointTest {
    private final Point zeroPoint = new Point();
    private final Point point = new Point(3, 4);

    @Test
    void getX() {
        assertEquals(0, zeroPoint.getX());
        assertEquals(3, point.getX());
    }

    @Test
    void getY() {
        assertEquals(0, zeroPoint.getY());
        assertEquals(4, point.getY());
    }

    @Test
    void testEquals() {
        assertNotEquals(zeroPoint, point);
        assertEquals(new Point(), zeroPoint);
    }

    @Test
    void testHashCode() {
        assertNotEquals(zeroPoint.hashCode(), point.hashCode());
        assertEquals(new Point().hashCode(), zeroPoint.hashCode());
    }
}