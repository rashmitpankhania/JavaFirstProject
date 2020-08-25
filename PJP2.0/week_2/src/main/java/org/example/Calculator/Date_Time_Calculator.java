package org.example.Calculator;

import java.text.ParseException;
import java.util.Date;

public interface Date_Time_Calculator {
    String getDayOfTheWeek() throws ParseException;
    int getWeekNumber() throws ParseException;
}
