using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using Microsoft.Extensions.Primitives;

namespace DateTimeCalculator
{
    public class BulkOperation
    {
        private string[] _allLines = new string[100000]; // 100000 operations
        private const string FileName = @"../../../InputBulkOperation.txt";
        private IEnumerable<string> _processedOutput;

        private void ReadFile()
        {
            try
            {
                _allLines = File.ReadAllLines(FileName);
            }
            catch (FileNotFoundException e)
            {
                Console.WriteLine(e);
                Console.WriteLine("Please make a file first!!");
                throw;
            }
        }

        private void Process()
        {
            List<string> list = new List<string>();
            Parallel.For(0, _allLines.Length, l =>
            {
                _allLines[l] = _allLines[l] + " Result => " + ExtractResultFromLine(_allLines[l]);
            });
            _processedOutput = _allLines;
            File.WriteAllLinesAsync("../../../Output.txt", _processedOutput, CancellationToken.None);
        }

        private string ExtractResultFromLine(string l)
        {
            StringTokenizer stringTokenizer = new StringTokenizer(l, " ".ToCharArray());
            DateTime dateTime = DateTime.Parse(stringTokenizer.Last().ToString(), CultureInfo.CurrentCulture);
            string addOrSubtract = stringTokenizer.ElementAt(0).ToString();
            Console.WriteLine(addOrSubtract);
            int quantity = Convert.ToInt32(stringTokenizer.ElementAt(1).ToString());
            string typeOfQuantity = stringTokenizer.ElementAt(2).ToString();
            Debug.Assert(addOrSubtract != null, nameof(addOrSubtract) + " != null");
            int mul = addOrSubtract.Equals("Add") ? 1 : -1;
            string res;
            switch (typeOfQuantity)
            {
                case "Days":
                    res = dateTime.AddDays(mul * quantity).ToShortDateString();
                    break;
                case "Months":
                    res = dateTime.AddMonths(mul * quantity).ToShortDateString();
                    break;
                case "Weeks":
                    res = dateTime.AddDays(mul * quantity * 7).ToShortDateString();
                    break;
                case "Years":
                    res = dateTime.AddYears(mul * quantity).ToShortDateString();
                    break;
                default:
                    res = "Please enter Days, Months, Weeks or Years ONLY!";
                    break;
            }

            return res;
        }

        public void StartBulkOperation()
        {
            ReadFile();
            Process();
        }
    }
}