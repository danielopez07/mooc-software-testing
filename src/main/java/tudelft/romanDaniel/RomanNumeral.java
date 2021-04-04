package tudelft.romanDaniel;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String romanNumeral) {
        int convertedNumber = 0;

        for(int i = 0; i < romanNumeral.length(); i++) {
            int currentNumber = map.get(romanNumeral.charAt(i));
            int nextNumber = i + 1 < romanNumeral.length() ? map.get(romanNumeral.charAt(i + 1)) : 0;

            if (nextNumber <= currentNumber) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }

        return convertedNumber;
    }
}
