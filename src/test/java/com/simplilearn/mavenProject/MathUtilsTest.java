package com.simplilearn.mavenProject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.simplilearn.mavenproject2.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    // Set up resources before each test
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    // Tear down resources after each test (if needed)
    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void testAdd() {
        assertEquals(8, mathUtils.add(5, 3), "5 + 3 should equal 8");
        assertEquals(-2, mathUtils.add(-5, 3), "-5 + 3 should equal -2");
        assertEquals(0, mathUtils.add(0, 0), "0 + 0 should equal 0");
    }

    @Test
    void testSubtract() {
        assertEquals(2, mathUtils.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(-8, mathUtils.subtract(-5, 3), "-5 - 3 should equal -8");
        assertEquals(0, mathUtils.subtract(0, 0), "0 - 0 should equal 0");
    }

    @Test
    void testMultiply() {
        assertEquals(15, mathUtils.multiply(5, 3), "5 * 3 should equal 15");
        assertEquals(-15, mathUtils.multiply(-5, 3), "-5 * 3 should equal -15");
        assertEquals(0, mathUtils.multiply(5, 0), "5 * 0 should equal 0");
    }

    @Test
    void testDivide() {
        assertEquals(1.6666666666666667, mathUtils.divide(5, 3), "5 / 3 should equal 1.666...");
        assertEquals(-1.6666666666666667, mathUtils.divide(-5, 3), "-5 / 3 should equal -1.666...");
        assertEquals(-1.0, mathUtils.divide(5, 0), "Division by zero should return -1.0");
    }
}

