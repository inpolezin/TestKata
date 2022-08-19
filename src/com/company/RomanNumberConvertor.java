package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConvertor {
    public HashMap<String, Integer> romeArabHM = new HashMap<>(100);

    public RomanNumberConvertor() {
        init();
    }

    public int fromRoman(String key) {
        return romeArabHM.get(key);
    }

    public String toRoman(int value) {

        for (Map.Entry<String, Integer> entry : romeArabHM.entrySet()) {
            if (entry.getValue().equals(value)) {
                return String.valueOf(entry.getKey());
            }
        }

        return "Ответа нет";
    }

    public  void init() {
        romeArabHM.put("I", 1);
        romeArabHM.put("II", 2);
        romeArabHM.put("III", 3);
        romeArabHM.put("IV", 4);
        romeArabHM.put("V", 5);
        romeArabHM.put("VI", 6);
        romeArabHM.put("VII", 7);
        romeArabHM.put("VIII", 8);
        romeArabHM.put("IX", 9);
        romeArabHM.put("X", 10);
        romeArabHM.put("XI", 11);
        romeArabHM.put("XII", 12);
        romeArabHM.put("XIII", 13);
        romeArabHM.put("XIV", 14);
        romeArabHM.put("XV", 15);
        romeArabHM.put("XVI", 16);
        romeArabHM.put("XVII", 17);
        romeArabHM.put("XVIII", 18);
        romeArabHM.put("XIX", 19);
        romeArabHM.put("XX", 20);
        romeArabHM.put("XXI", 21);
        romeArabHM.put("XXII", 22);
        romeArabHM.put("XXIII", 23);
        romeArabHM.put("XXIV", 24);
        romeArabHM.put("XXV", 25);
        romeArabHM.put("XXVI", 26);
        romeArabHM.put("XXVII", 27);
        romeArabHM.put("XXVIII", 28);
        romeArabHM.put("XXIX", 29);
        romeArabHM.put("XXX", 30);
        romeArabHM.put("XXXI", 31);
        romeArabHM.put("XXXII", 32);
        romeArabHM.put("XXXIII", 33);
        romeArabHM.put("XXXIV", 34);
        romeArabHM.put("XXXV", 35);
        romeArabHM.put("XXXVI", 36);
        romeArabHM.put("XXXVII", 37);
        romeArabHM.put("XXXVIII", 38);
        romeArabHM.put("XXXIX", 39);
        romeArabHM.put("XL", 40);
        romeArabHM.put("XLI", 41);
        romeArabHM.put("XLII", 42);
        romeArabHM.put("XLIII", 43);
        romeArabHM.put("XLIV", 44);
        romeArabHM.put("XLV", 45);
        romeArabHM.put("XLVI", 46);
        romeArabHM.put("XLVII", 47);
        romeArabHM.put("XLVIII", 48);
        romeArabHM.put("XLIX", 49);
        romeArabHM.put("L", 50);
        romeArabHM.put("LI", 51);
        romeArabHM.put("LII", 52);
        romeArabHM.put("LIII", 53);
        romeArabHM.put("LIV", 54);
        romeArabHM.put("LV", 55);
        romeArabHM.put("LVI", 56);
        romeArabHM.put("LVII", 57);
        romeArabHM.put("LVIII", 58);
        romeArabHM.put("LIX", 59);
        romeArabHM.put("LX", 60);
        romeArabHM.put("LXI", 61);
        romeArabHM.put("LXII", 62);
        romeArabHM.put("LXIII", 63);
        romeArabHM.put("LXIV", 64);
        romeArabHM.put("LXV", 65);
        romeArabHM.put("LXVI", 66);
        romeArabHM.put("LXVII", 67);
        romeArabHM.put("LXVIII", 68);
        romeArabHM.put("LXIX", 69);
        romeArabHM.put("LXX", 70);
        romeArabHM.put("LXXI", 71);
        romeArabHM.put("LXXII", 72);
        romeArabHM.put("LXXIII", 73);
        romeArabHM.put("LXXIV", 74);
        romeArabHM.put("LXXV", 75);
        romeArabHM.put("LXXVI", 76);
        romeArabHM.put("LXXVII", 77);
        romeArabHM.put("LXXVIII", 78);
        romeArabHM.put("LXXIX", 79);
        romeArabHM.put("LXXX", 80);
        romeArabHM.put("LXXXI", 81);
        romeArabHM.put("LXXXII", 82);
        romeArabHM.put("LXXXIII", 83);
        romeArabHM.put("LXXXIV", 84);
        romeArabHM.put("LXXXV", 85);
        romeArabHM.put("LXXXVI", 86);
        romeArabHM.put("LXXXVII", 87);
        romeArabHM.put("LXXXVIII", 88);
        romeArabHM.put("LXXXIX", 89);
        romeArabHM.put("XC", 90);
        romeArabHM.put("XCI", 91);
        romeArabHM.put("XCII", 92);
        romeArabHM.put("XCIII", 93);
        romeArabHM.put("XCIV", 94);
        romeArabHM.put("XCV", 95);
        romeArabHM.put("XCVI", 96);
        romeArabHM.put("XCVII", 97);
        romeArabHM.put("XCVIII", 98);
        romeArabHM.put("XCIX", 99);
        romeArabHM.put("C", 100);
    }
}
