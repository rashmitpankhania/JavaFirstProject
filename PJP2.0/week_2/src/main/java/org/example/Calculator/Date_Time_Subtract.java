package org.example.Calculator;

import java.text.ParseException;

public interface Date_Time_Subtract {
    String getDateSubtractDays(String Date1, int days) throws ParseException;
    String getDateSubtractMonths(String Date1, int months) throws ParseException;
    String getDateSubtractWeeks(String Date1, int weeks) throws ParseException;
}
