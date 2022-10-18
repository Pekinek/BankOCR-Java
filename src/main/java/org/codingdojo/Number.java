package org.codingdojo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number {

    Digit[] digits;

    public Number() {
        digits = new Digit[9];
        for (int i = 0; i < 9; i++) {
            digits[i] = new Digit();
        }
    }

    public Digit[] getDigits() {
        return digits;
    }

    public String getValue() {
        return Stream.of(digits).map(Digit::getValue).collect(Collectors.joining());
    }
}
