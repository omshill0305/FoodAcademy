package com.example.olga.foodacademyv2;

import android.content.Context;

import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.*;

public class WriteFeedbackActivityTest {

    private WriteFeedbackActivity wfa;

    @Before
    public void setUp() {
        wfa = new WriteFeedbackActivity();
    }

    @Test
    public void checkFeedback() {
        String lastName = "Olga";
        String date = "12/12/2018";
        String feedback = "Das war ein sehr gutes Restorante!";
        boolean expected = true;

        boolean check = wfa.checkFeedback(lastName, date, feedback);

        assertEquals(expected, check);
    }

    @Test
    public void checkFeedbackNegative() {
        String lastName = "Olga";
        String date = "12/12/2018";
        String feedback = "";
        boolean notExpected = true;

        boolean check = wfa.checkFeedback(lastName, date, feedback);

        assertNotEquals(notExpected, check);
    }
}