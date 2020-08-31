package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = (originalPrice * 100) + ( originalPrice * vatRate );
        return Math.round(result) / 100.0;
    }

    public String reverse(String sentence) {
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
