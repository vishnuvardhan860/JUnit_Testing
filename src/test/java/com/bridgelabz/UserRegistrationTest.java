package com.bridgelabz;
//importing  junit assert
import org.junit.Assert;
//importing j unit Test
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_ShouldReturnTrue_Test() {
        /*
            creating the object of userRegistrstion
         */

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

    // creating method for SecondName

    @Test
    public void givenValidSecondName_ShouldReturnTrue_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateSecondName("VISHNU");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidSecondName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateSecondName("VISHNU");

        Assert.assertFalse(result);

    }
    /*
   creating method for Email validation
   for True test
   */
    @Test
    public void givenInValidEmail_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateEmail("XYZ860@gmail.com");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidEmail_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateEmail("XYZ@gmail.com");

        Assert.assertFalse(result);
    }
}