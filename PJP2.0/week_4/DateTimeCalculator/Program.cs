using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using Microsoft.VisualBasic.CompilerServices;

namespace DateTimeCalculator
{
    [Serializable]
    internal class Program
    {
        [NonSerialized] const string FileName = @"../../../SavedSession.bin";
        private readonly List<string> _history = new List<string>();

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

        private readonly string[] _dayWeekChoiceArray = {"", "Day", "Month", "Week", "Date"};

        private static void StartGame()
        {
            Program program;
            if (File.Exists(FileName))
            {
                Console.WriteLine("Reading saved file");
                Stream openFileStream = File.OpenRead(FileName);
                BinaryFormatter deserializer = new BinaryFormatter();
                program = (Program) deserializer.Deserialize(openFileStream);
                openFileStream.Close();
            }
            else
            {
                program = new Program();
            }

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
                            ? CalculatorImpl.AddDays(days, inputDateTime)
                            : CalculatorImpl.SubtractDays(days, inputDateTime);

                        break;
                    case 2:
                        Console.WriteLine("Enter months");
                        var months = IntegerType.FromString(Console.ReadLine());
                        res = isItAddition
                            ? CalculatorImpl.AddMonths(months, inputDateTime)
                            : CalculatorImpl.SubtractMonths(months, inputDateTime);

                        break;
                    case 3:
                        Console.WriteLine("Enter weeks");
                        var weeks = IntegerType.FromString(Console.ReadLine());
                        res = isItAddition
                            ? CalculatorImpl.AddWeeks(weeks, inputDateTime)
                            : CalculatorImpl.SubtractWeeks(weeks, inputDateTime);

                        break;
                    case 4:
                        DateTime date2 = DateTime.Parse(ReadDateInput(), CultureInfo.CurrentCulture);
                        Console.WriteLine("what do you want in return");
                        Console.WriteLine("days : " + CalculatorImpl.SubtractDatesGetDays(inputDateTime, date2));
                        Console.WriteLine("weeks : " + CalculatorImpl.SubtractDatesGetWeeks(inputDateTime, date2));
                        Console.WriteLine("months : " + CalculatorImpl.SubtractDatesGetMonths(inputDateTime, date2));

                        break;
                }

                Console.WriteLine("=====================================");
                Console.WriteLine("Result " + res.ToLongDateString());
                string operationType = program.GetOperationHistory(isItAddition, typeChoice, inputDateTime, res);
                program._history.Add(operationType);
                Console.WriteLine("Press any key to continue or X for exit");
                choiceInput = Console.ReadLine();
            }

            Console.WriteLine("your history =========================================");
            program._history.ForEach(Console.WriteLine);
            Stream saveFileStream = File.Create(FileName);
            BinaryFormatter serializer = new BinaryFormatter();
            serializer.Serialize(saveFileStream, program);
            saveFileStream.Close();
        }

        private string GetOperationHistory(bool isAdd, int typeChoice, DateTime givenDate, DateTime res)
        {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.Append(DateTime.Now.ToString(CultureInfo.CurrentCulture));
            stringBuilder.Append(isAdd ? " Operation - Add " : " Operation - Subtract ");
            stringBuilder.Append("Quantity - ");
            stringBuilder.Append(_dayWeekChoiceArray[typeChoice]);
            stringBuilder.Append(" Given Date - " + givenDate.ToString(CultureInfo.CurrentCulture));
            stringBuilder.Append(" Result - " + res.ToString(CultureInfo.CurrentCulture));
            return stringBuilder.ToString();
        }

        public static void Main(string[] args)
        {
            // StartGame();
            BulkOperation bulkOperation = new BulkOperation();
            bulkOperation.StartBulkOperation();
        }
    }
}