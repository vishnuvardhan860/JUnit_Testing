package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

        private static final String FIRST_NAME_REGEX = "^[a-zA-Z]+$";

        public boolean validateFirstName(String firstName) {
            return Pattern.matches(FIRST_NAME_REGEX, firstName);
        }
    }

