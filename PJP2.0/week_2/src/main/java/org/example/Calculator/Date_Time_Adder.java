package org.example.Calculator;

import java.text.ParseException;

public interface Date_Time_Adder {
    String getDateAddDays(String Date1, int num) throws ParseException;
    String getDateAddWeeks(String Date1, int num) throws ParseException;
    String getDateAddMonths(String Date1, int num) throws ParseException;
}
