package org.sapient.Number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNumberTest {
    private MyNumber myNumber;

    @BeforeEach
    void setUp() {
        myNumber = new MyNumberImpl();
    }

    @AfterEach
    void tearDown() {
        myNumber = null;
    }

    @Test
    void should_return_1_for_prime() {
        assertEquals(1, myNumber.checkPrime(2));
        assertEquals(1, myNumber.checkPrime(101));
        assertEquals(1, myNumber.checkPrime(67));
    }

    @Test
    void should_return_0_for_non_prime() {
        assertEquals(0, myNumber.checkPrime(1));
        assertEquals(0, myNumber.checkPrime(100));
        assertEquals(0, myNumber.checkPrime(99));
    }

    @Test
    void should_return_true_for_armstrong() {
        assertTrue(myNumber.checkArmstrong(371));
    }

    @Test
    void should_return_false_for_non_armstrong() {
        assertFalse(myNumber.checkArmstrong(100));
    }

    @Test
    void should_return_true_for_palindrome() {
        assertTrue(myNumber.checkPalindrome(123321));
    }

    @Test
    void should_return_false_for_non_palindrome() {
        assertFalse(myNumber.checkPalindrome(1234));
    }
}