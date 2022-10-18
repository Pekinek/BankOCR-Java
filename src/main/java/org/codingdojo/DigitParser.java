package org.codingdojo;

import java.util.HashMap;
import java.util.Map;

public class DigitParser {

    private static final Map<Digit, String> digitMap = new HashMap<>();

    static {
        digitMap.put(new Digit(new String[]{" _ ", "| |", "|_|"}), "0");
    }

    private DigitParser() {

    }

    public static String parseDigit(Digit digit) {
        if (digitMap.containsKey(digit)) {
            return digitMap.get(digit);
        }
        return "?";
    }

}
