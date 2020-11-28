/*
 Given a string of digits, 
you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
Return the resulting string.
https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java
 */
package fakebinary1;

/**
 *
 * @author michaelrodriguez
 */
public class FakeBinary1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fakeBin("12540");
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

    }

}
