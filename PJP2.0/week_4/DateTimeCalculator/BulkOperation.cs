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
        private string[] _allLines = new string[100001]; // 100000 operations
        private static string InputFileName { get; } = @"../../../InputBulkOperation.txt";
        private static string OutputFileName { get; } = @"../../../Output.txt";
        private IEnumerable<string> _processedOutput;

        private void ReadFile()
        {
            try
            {
                _allLines = File.ReadAllLinesAsync(InputFileName, CancellationToken.None).Result;
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
            Parallel.For(0, _allLines.Length, l => { _allLines[l] = ExtractResultFromLine(_allLines[l]); });
            _processedOutput = _allLines;
            File.WriteAllLinesAsync(OutputFileName, _processedOutput, CancellationToken.None);
        }

        private static string ExtractResultFromLine(string l)
        {
            var stringTokenizer = new StringTokenizer(l, " ".ToCharArray());
            var dateTime = DateTime.Parse(stringTokenizer.Last().ToString(), CultureInfo.CurrentCulture);
            var addOrSubtract = stringTokenizer.ElementAt(0).ToString().ToLower();
            var quantity = Convert.ToInt32(stringTokenizer.ElementAt(1).ToString());
            var typeOfQuantity = stringTokenizer.ElementAt(2).ToString().ToLower();
            Debug.Assert(addOrSubtract != null, nameof(addOrSubtract) + " != null");
            var mul = addOrSubtract.Equals("add") ? 1 : -1;
            var res = typeOfQuantity switch
            {
                "days" => dateTime.AddDays(mul * quantity).ToShortDateString(),
                "months" => dateTime.AddMonths(mul * quantity).ToShortDateString(),
                "weeks" => dateTime.AddDays(mul * quantity * 7).ToShortDateString(),
                "years" => dateTime.AddYears(mul * quantity).ToShortDateString(),
                _ => "Please enter Days, Months, Weeks or Years ONLY!"
            };

            return l + " Result => " + res;
        }

        public void StartBulkOperation()
        {
            ReadFile();
            Process();
        }
    }
}