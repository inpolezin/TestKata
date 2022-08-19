package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputException {

        int arabResult = 0;
        String romanResult = "";

        RomanNumberConvertor rnc = new RomanNumberConvertor();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String firstNum = input.split(" ")[0];
        String secondNum = input.split("\\s+")[2];
        String operation = input.split("\\s+")[1];

        if (input.split("\\s+").length > 3) throw new InputException("Ошибка");

        if (isNumeric(firstNum) && isNumeric(secondNum)) {

            if (Integer.parseInt(firstNum) > 10 || Integer.parseInt(secondNum) > 10) throw new InputException("Ошибка");

            switch (operation) {
                case "+":
                    arabResult = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                    break;
                case "-":
                    arabResult = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                    break;
                case "*":
                    arabResult = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                    break;
                case "/":
                    arabResult = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
                    break;
                default:
                    throw new InputException("Ошибка");
            }
            System.out.println(arabResult);

        } else if (!isNumeric(firstNum) && !isNumeric(secondNum)) {

            if (rnc.fromRoman(firstNum) > 10 || rnc.fromRoman(secondNum) > 10) throw new InputException("Ошибка");

            switch (operation) {
                case "+":
                    arabResult = rnc.fromRoman(firstNum) + rnc.fromRoman(secondNum);
                    break;
                case "-":
                    arabResult = rnc.fromRoman(firstNum) - rnc.fromRoman(secondNum);
                    break;
                case "*":
                    arabResult = rnc.fromRoman(firstNum) * rnc.fromRoman(secondNum);
                    break;
                case "/":
                    arabResult = rnc.fromRoman(firstNum) / rnc.fromRoman(secondNum);
                    break;
                default:
                    throw new InputException("Ошибка");
            }

            if (arabResult < 0) throw new InputException("Ошибка");

            romanResult = rnc.toRoman(arabResult);
            System.out.println(romanResult);

        } else throw new InputException("Ошибка");



    }

    public static boolean isNumeric(String string) {
        int intValue;

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException ignored) {}
        return false;
    }
}


