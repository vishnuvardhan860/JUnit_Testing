package com.bridgelabz;

import org.junit.Assert;

import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_ShouldReturnTrue_Test() {

          //  creating the object of userRegistrstion

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("KVV");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidFirstName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("KVV");

        Assert.assertFalse(result);


    }

    @Test
    public void givenValidSecondName_ShouldReturnTrue_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("VISHNU");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidSecondName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("VISHNU");

        Assert.assertFalse(result);

    }
}
