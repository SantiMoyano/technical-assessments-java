import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String romanNum = "MCMXCIV";
        System.out.println(romanNum + " is "+romanToInt(romanNum));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();

        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char actualRomanNumeral = s.charAt(i);
            char nextRomanNumeral = (i < s.length() - 1) ? s.charAt(i + 1) : '\0';
            int currentValue = romanToIntMap.get(actualRomanNumeral);
            int nextValue = (nextRomanNumeral != '\0') ? romanToIntMap.get(nextRomanNumeral) : 0;

            if (nextRomanNumeral != '\0' && currentValue < nextValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }
        return total;
    }
}