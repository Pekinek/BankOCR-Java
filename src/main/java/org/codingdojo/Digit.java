package org.codingdojo;

import java.util.Arrays;

public class Digit {

    private final String[] lines;

    public Digit() {
        lines = new String[3];
    }

    public Digit(String[] lines) {
        this.lines = lines;
    }

    public String[] getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return lines[0] + System.lineSeparator() + lines[1] + System.lineSeparator() + lines[2];
    }

    public String getValue() {
        return DigitParser.parseDigit(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit = (Digit) o;
        return Arrays.equals(lines, digit.lines);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(lines);
    }
}
