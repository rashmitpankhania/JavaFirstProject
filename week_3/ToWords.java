public class ToWords {
    static String fig_to_words(long n){
        // length of the number
        int numLength = String.valueOf(n).length();
        String numString = Long.toString(n);
        if(numLength == 0)
            return "No number";
        if(numLength > 19)
            return "Such long not possible";
        String[] single_digits = new String[]{ "zero", "one",
                "two", "three", "four",
                "five", "six", "seven",
                "eight", "nine"};
        String[] two_digits = new String[]{"", "ten", "eleven", "twelve",
                "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",
                "fifty","sixty", "seventy",
                "eighty", "ninety"};
        String[] tens_power = new String[] {"hundred", "thousand"};
        if(numLength == 1)
            return single_digits[(int)n];

        int i = 0;
//        while(i<numLength){
//            if(numLength>3){
//
//            }
//        }
        return "Its pending";
    }
}
