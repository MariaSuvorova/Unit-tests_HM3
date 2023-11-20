package Homework3.test;

    



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    private Tests test;

    @BeforeEach
    void setUp() {
        test = new Tests();
    }

    @AfterEach
    void tearDown() {
        test = null;
    }

    @Test
    @DisplayName("Проверка числа на четность(true) или нечетность(false)")
    void evenOddNumber() {
        assertTrue(test.evenOddNumber(4));
        assertFalse(test.evenOddNumber(13));
    }

    @Test
    @DisplayName("Проверка вхождения числа в интервал (25;100)")
    void numberInInterval() {
        assertTrue(test.numberInInterval(53));
        assertFalse(test.numberInInterval(24));
        assertFalse(test.numberInInterval(101));
    }
}