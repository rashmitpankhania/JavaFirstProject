package org.example.Calculator;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Date_Time_CalculatorImplTest {
    private final Date_Time_CalculatorImpl date_time_calculator = new Date_Time_CalculatorImpl();

    @Test
    public void test_getDayOfTheWeek() throws ParseException {
        date_time_calculator.setDateInput("24-08-2020");
        assertEquals("Monday", date_time_calculator.getDayOfTheWeek());
    }

    @Test
    public void getDayOfTheWeek() throws ParseException {
        date_time_calculator.setDateInput("24-08-2020");
        assertEquals(35, date_time_calculator.getWeekNumber());
    }

    @Test
    public void getDateAddDays() throws ParseException {
        assertEquals("30-08-2020", date_time_calculator.getDateAddDays("25-08-2020", 5));
    }

    @Test
    public void getDateAddWeeks() throws ParseException {
        assertEquals("29-09-2020", date_time_calculator.getDateAddWeeks("25-08-2020", 5));
    }

    @Test
    public void getDateAddMonths() throws ParseException {
        assertEquals("25-01-2021", date_time_calculator.getDateAddMonths("25-08-2020", 5));

    }

    @Test
    public void getDateSubtractDays() throws ParseException {
        assertEquals("20-08-2020", date_time_calculator.getDateSubtractDays("25-08-2020", 5));
    }

    @Test
    public void getDateSubtractWeeks() throws ParseException {
        assertEquals("21-07-2020", date_time_calculator.getDateSubtractWeeks("25-08-2020", 5));
    }

    @Test
    public void getDateSubtractMonths() throws ParseException {
        assertEquals("25-03-2020", date_time_calculator.getDateSubtractMonths("25-08-2020", 5));

    }
}
