package org.example.Calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// String input is in the "dd-MM-yyyy"

public class Date_Time_CalculatorImpl implements Date_Time_Calculator, Date_Time_Adder, Date_Time_Subtract {

    private Date dateInput;
    private final Calendar calendar = Calendar.getInstance();

    @Override
    public String getDayOfTheWeek() {
        return new SimpleDateFormat("EEEE").format(dateInput);
    }

    @Override
    public int getWeekNumber() {
        calendar.setTime(dateInput);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    @Override
    public String getDateSubtractDays(String Date1, int days) throws ParseException {
        return getDateAddDays(Date1, -days);
    }

    @Override
    public String getDateSubtractMonths(String Date1, int months) throws ParseException {
        return getDateAddMonths(Date1, -months);
    }

    @Override
    public String getDateSubtractWeeks(String Date1, int weeks) throws ParseException {
        return getDateAddWeeks(Date1, -weeks);
    }

    public void setDateInput(String dateInput) throws ParseException {
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd-MM-yyyy");
        this.dateInput =  dateTimeFormatter.parse(dateInput);
    }

    @Override
    public String getDateAddDays(String Date1, int days) throws ParseException {
        new Rash(Date1).invoke();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime());
    }

    @Override
    public String getDateAddMonths(String Date1, int months) throws ParseException {
        new Rash(Date1).invoke();
        calendar.add(Calendar.MONTH, months);
        return new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime());
    }

    @Override
    public String getDateAddWeeks(String Date1, int weeks) throws ParseException {
        new Rash(Date1).invoke();
        calendar.add(Calendar.WEEK_OF_YEAR, weeks);
        return new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime());
    }

    private class Rash {
        private final String date1;

        public Rash(String Date1) {
            date1 = Date1;
        }

        public void invoke() throws ParseException {
            SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date =  dateTimeFormatter.parse(date1);
            calendar.setTime(date);
        }
    }
}
