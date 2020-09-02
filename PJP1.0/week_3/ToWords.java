public class ToWords {
    static String fig_to_words(long n) {
        if (n == 0)
            return "Zero";
        String[] unitArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tensArray = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int[] val = {1000000000, 10000000, 100000, 1000, 100, 1};
        String[] stringVal = {"arab", "crore", "lac", "thousand", "hundred", "only"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < stringVal.length; i++) {
            int b1 = (int) n / val[i];
            n = n % val[i];
            if (b1 > 0) {
                if (b1 <= 19) {
                    res.append(unitArray[b1]).append(" ").append(stringVal[i]).append(" ");
                } else {
                    res.append(tensArray[b1 / 10]).append(" ").append(unitArray[b1 % 10]).append(" ").append(stringVal[i]).append(" ");
                }
            }
        }
        return res.toString();
    }
}
