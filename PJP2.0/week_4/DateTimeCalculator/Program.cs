using System;
using System.Globalization;
using Microsoft.VisualBasic.CompilerServices;

namespace DateTimeCalculator
{
    internal static class Program
    {
        private static readonly Func<int, DateTime, DateTime> SubtractDays = (x, date) => date.AddDays(-x);
        private static readonly Func<int, DateTime, DateTime> AddDays = (x, date) => date.AddDays(x);
        private static readonly Func<int, DateTime, DateTime> SubtractMonths = (x, date) => date.AddMonths(-x);
        private static readonly Func<int, DateTime, DateTime> AddMonths = (x, date) => date.AddMonths(x);
        private static readonly Func<int, DateTime, DateTime> SubtractWeeks = (x, date) => date.AddDays(-x * 7);
        private static readonly Func<int, DateTime, DateTime> AddWeeks = (x, date) => date.AddDays(x * 7);

        private static readonly Func<DateTime, DateTime, int> SubtractDatesGetDays =
            (date1, date2) => date1.Subtract(date2).Days;

        private static readonly Func<DateTime, DateTime, int> SubtractDatesGetMonths =
            (date1, date2) => date1.Subtract(date2).Days / 30;

        private static readonly Func<DateTime, DateTime, int> SubtractDatesGetWeeks =
            (date1, date2) => date1.Subtract(date2).Days / 7;
        
        private static readonly Func<DateTime, string> GetDayOfWeekFromDate = (date) => date.DayOfWeek.ToString();

        private static readonly Func<DateTime, int> GetWeekOfTheYearFromDate = (date) =>
        {
            Calendar calendar = new GregorianCalendar();
            return calendar.GetWeekOfYear(date, CalendarWeekRule.FirstDay, date.DayOfWeek);
        };

        private static string ReadDateInput()
        {
            while (true)
            {
                Console.WriteLine("enter date in dd/mm/yyyy");
                var inputDate = Console.ReadLine();
                if (DateTime.TryParse(inputDate, out _)) return inputDate;
            }
        }

        private static int DayWeekDateChoice()
        {
            Console.WriteLine("Press 1 for Day | Press 2 for Months | Press 3 for Weeks | Press 4 for Date");
            return IntegerType.FromString(Console.ReadLine());
        }

        private static void StartGame()
        {
            Console.WriteLine("Welcome!");
            var dat = DateTime.Now;
            Console.WriteLine($"Today is {dat.ToShortDateString()} at {dat.ToShortTimeString()}");
            Console.WriteLine("Press any key to continue or X for exit");
            string choiceInput = Console.ReadLine();
            while (choiceInput != "X" && choiceInput != "x")
            {
                Console.WriteLine("Press 1 for Add or Press 2 for Subtract");
                choiceInput = Console.ReadLine();
                var isItAddition = false;
                if (choiceInput == null)
                    continue;
                if (choiceInput.Equals("1"))
                {
                    isItAddition = true;
                    Console.WriteLine("Add what?");
                }
                else
                {
                    Console.WriteLine("Subtract waat?");
                }

                int typeChoice = DayWeekDateChoice();
                Console.WriteLine("ok now enter date");
                DateTime inputDateTime = DateTime.Parse(ReadDateInput(), CultureInfo.CurrentCulture);
                DateTime res = DateTime.Today;
                switch (typeChoice)
                {
                    case 1:
                        Console.WriteLine("Enter days");
                        var days = IntegerType.FromString(Console.ReadLine()); 
                        res = isItAddition
                            ? AddDays(days, inputDateTime)
                            : SubtractDays(days, inputDateTime);
                        break;
                    case 2:
                        Console.WriteLine("Enter months");
                        var months = IntegerType.FromString(Console.ReadLine()); 
                        res = isItAddition
                            ? AddMonths(months, inputDateTime)
                            : SubtractMonths(months, inputDateTime);
                        break;
                    case 3:
                        Console.WriteLine("Enter weeks");
                        var weeks = IntegerType.FromString(Console.ReadLine()); 
                        res = isItAddition
                            ? AddWeeks(weeks, inputDateTime)
                            : SubtractWeeks(weeks, inputDateTime);
                        break;
                    case 4:
                        DateTime date2 = DateTime.Parse(ReadDateInput(), CultureInfo.CurrentCulture);
                        Console.WriteLine("what do you want in return");
                        Console.WriteLine("days : "+SubtractDatesGetDays(inputDateTime, date2));
                        Console.WriteLine("weeks : "+SubtractDatesGetWeeks(inputDateTime, date2));
                        Console.WriteLine("months : "+SubtractDatesGetMonths(inputDateTime, date2));
                        break;
                        
                }

                Console.WriteLine("=====================================");
                Console.WriteLine("Result "+res.ToLongDateString());
                Console.WriteLine("Press any key to continue or X for exit");
                choiceInput = Console.ReadLine();
            }
        }

        public static void Main(string[] args)
        {
            StartGame();
        }
    }
}