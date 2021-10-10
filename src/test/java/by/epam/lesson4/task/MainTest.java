package by.epam.lesson4.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void conversionArray() {
        double[] array = new double[] {2, -2, 4.3};
        double[] actualArray = Main.conversionArray(array);
        double[] expectedArray = new double[] {4, 16, 18.49};
        assertArrayEquals(actualArray, expectedArray);
    }
}