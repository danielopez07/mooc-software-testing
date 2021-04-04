package tudelft.romanDaniel;

public class RomanNumeralMain {

    public static void main (String[] args) {
        RomanNumeral rn = new RomanNumeral();

        System.out.println(rn.convert("IX"));
        System.out.println(rn.convert("I"));
        System.out.println(rn.convert(""));
        System.out.println(rn.convert("IC"));
        System.out.println(rn.convert("VIII"));
        System.out.println(rn.convert("XII"));

    }
}
