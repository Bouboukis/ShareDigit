package com.georgioskachrimanis.javacourse;

public class ShareDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        int lastDigitNumber1, lastDigitNumber2;

        if ((number1 < 10 || number1 > 99 ) || (number2 < 10 || number2 > 99)){
            return false;
        }

        while (number1 > 10) {

            lastDigitNumber1 = number1 % 10;
            lastDigitNumber2 = number2 % 10;
            number1 /= 10;
            number2 /= 10;

            if ((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber1 == number2)
            || (number1 == lastDigitNumber2) || (number1 == number2)){
                return true;
            }
        }

        return false;
    }
}
