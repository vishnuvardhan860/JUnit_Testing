package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

     // using the pattern for first name

    private static final String FIRST_NAME_REGEX = "^[a-zA-Z]+$";

    public boolean validateFirstName(String firstName) {

        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }

    private static final String SECOND_NAME_REGEX = "^[a-zA-Z]{3,}$";

    public boolean validateSecondName(String  SecondName) {

        return Pattern.matches(SECOND_NAME_REGEX, SecondName);
    }
}
