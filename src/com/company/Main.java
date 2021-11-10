package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(number(43, 22));
        System.out.println(number(20, 35));
        System.out.println(number(50, 38));
        System.out.println(number(45, 27));
        System.out.println(number(19, 24));

    }

    public static String number(int ageOfThePerson, int temperature) {
        if (ageOfThePerson >= 20 && ageOfThePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (ageOfThePerson < 20 && temperature <= 28) {
            return "Можно идти гулять";

        } else if (ageOfThePerson > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";
        }
    }
}