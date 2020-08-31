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
        StringBuilder r = new StringBuilder(); 
        r.append(sentence); 
        r = r.reverse();
        return r.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getType().equals("Linux")) {
                count++;
            };
        };
        return 0;
    }
}
