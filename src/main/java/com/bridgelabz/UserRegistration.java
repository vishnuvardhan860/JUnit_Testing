package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    /*
      using the pattern for first name should be in capital
     */

    private static final String FIRST_NAME_REGEX = "^[a-zA-Z]+$";

    public boolean validateFirstName(String firstName) {

        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }
    /*
      using the pattern for last name should be in capital
     */
    private static final String SECOND_NAME_REGEX = "^[a-zA-Z]{3,}$";

    public boolean validateSecondName(String  SecondName) {

        return Pattern.matches(SECOND_NAME_REGEX, SecondName);
    }
    /*
      using the pattern for Email pattern validation
     */
    private static final String EMAIL_VALIDATION = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";

    public boolean validateEmail(String emailvalid){
        return Pattern.matches(EMAIL_VALIDATION,emailvalid);

    }
}