package org.example.NaturalLanguage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import static java.time.LocalDate.*;

public class DateMethod {

    private static final Calendar now = Calendar.getInstance();
    private final Calendar calendar = Calendar.getInstance();

    public Date getDate() {
        return calendar.getTime();
    }

    /* "Literal" dates. */

    public void today() {
        calendar.setTime(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
    }

    public void yesterday() {
        calendar.add(Calendar.DAY_OF_MONTH, -1);
    }

    public void tomorrow() {
        calendar.add(Calendar.DAY_OF_MONTH, 1);
    }

    /* Modifiers */

    public void addDay(int amount) {
        add(Calendar.DAY_OF_YEAR, amount);
    }
    public void addWeek(int amount) {
        add(Calendar.WEEK_OF_YEAR, amount);
    }
    public void addMonth(int amount) {
        add(Calendar.MONTH, amount);
    }
    public void addYear(int amount) {
        add(Calendar.YEAR, amount);
    }

    /* Arbitrary Modification */

    public void add(int field, int amount) {
        calendar.add(field, amount);
    }

    public void setNextOccurrenceDayOfWeek(int dayOfWeek) {
        addDay(1);
        setDayOfWeek(dayOfWeek, true);
    }

    public void setLastOccurrenceDayOfWeek(int dayOfWeek) {
        addDay(-1);
        setDayOfWeek(dayOfWeek, false);
    }

    public void setDayOfWeek(int dayOfWeek) {
        setDayOfWeek(dayOfWeek, true);
    }

    private void setDayOfWeek(int dayOfWeek, boolean forward) {
        int amount = forward ? 1 : -1;
        for (int ii = 0; ii < 7; ii++) {
            if (getDayOfWeek() == dayOfWeek) {
                break;
            }
            addDay(amount);
        }
    }

    public int getDayOfWeek() {
        return get(Calendar.DAY_OF_WEEK);
    }

    public int get(int field) {
        return calendar.get(field);
    }

}