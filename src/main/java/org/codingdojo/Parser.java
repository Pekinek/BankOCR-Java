package org.codingdojo;

public class Parser {

    public String parse(String text) {

        var lines = text.split(System.lineSeparator());
        var number = new Number();
        for (int lineNumber = 0; lineNumber < 3; lineNumber++) {
            parseLine(lines[lineNumber], lineNumber, number);
        }
        return number.getValue();
    }

    private void parseLine(String line, int lineNumber, Number number) {
        if (line.length() != 27) {
            throw new IllegalArgumentException("Line length is not 27: " + line);
        }
        for (int i = 0; i < 9; i++) {
            number.getDigits()[i].getLines()[lineNumber] = line.substring(3 * i, 3 * i + 3);
        }
    }
}
