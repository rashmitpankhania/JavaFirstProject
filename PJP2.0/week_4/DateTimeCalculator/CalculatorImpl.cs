using System;
using System.Globalization;

namespace DateTimeCalculator
{
    internal static class CalculatorImpl
    {
        public static readonly Func<int, DateTime, DateTime> SubtractDays = (x, date) => date.AddDays(-x);
        public static readonly Func<int, DateTime, DateTime> AddDays = (x, date) => date.AddDays(x);
        public static readonly Func<int, DateTime, DateTime> SubtractMonths = (x, date) => date.AddMonths(-x);
        public static readonly Func<int, DateTime, DateTime> AddMonths = (x, date) => date.AddMonths(x);
        public static readonly Func<int, DateTime, DateTime> SubtractWeeks = (x, date) => date.AddDays(-x * 7);
        public static readonly Func<int, DateTime, DateTime> AddWeeks = (x, date) => date.AddDays(x * 7);

        public static readonly Func<DateTime, DateTime, int> SubtractDatesGetDays =
            (date1, date2) => date1.Subtract(date2).Days;

        public static readonly Func<DateTime, DateTime, int> SubtractDatesGetMonths =
            (date1, date2) => date1.Subtract(date2).Days / 30;

        public static readonly Func<DateTime, DateTime, int> SubtractDatesGetWeeks =
            (date1, date2) => date1.Subtract(date2).Days / 7;

        public static readonly Func<DateTime, string> GetDayOfWeekFromDate = (date) => date.DayOfWeek.ToString();

        public static readonly Func<DateTime, int> GetWeekOfTheYearFromDate = (date) =>
        {
            Calendar calendar = new GregorianCalendar();
            return calendar.GetWeekOfYear(date, CalendarWeekRule.FirstDay, date.DayOfWeek);
        };
    }
}