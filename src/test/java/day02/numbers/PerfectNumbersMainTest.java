package day02.numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersMainTest {
@Test

    void testNumbers() {

        PerfectNumbersTest perfectNumbers = new PerfectNumbersTest();

        assertEquals(true, perfectNumbers.isPerfectNumber(6)); //true
        assertEquals(true, perfectNumbers.isPerfectNumber(8128)); //true
        assertEquals(false, perfectNumbers.isPerfectNumber(7246)); //false
        assertEquals(false, perfectNumbers.isPerfectNumber(9)); //false
    }
}
