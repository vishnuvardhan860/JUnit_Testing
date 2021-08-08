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
    public void givenValidEmail_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateEmail("XYZ@860@gmail.com");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidEmail_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateEmail("XYZ860@gmail.com");

        Assert.assertFalse(result);
    }
    /*
    creating method for PhoneNumber validation
    for True test
    */
    @Test
    public void givenValidPhoneNumber_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validatePhoneNumber("958147738");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInPhoneNumber_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validatePhoneNumber("00 9581477386");
        Assert.assertFalse(result);
    }
    /*
  creating method for Password validation validation
  for True test
  */
    @Test
    public void givenValidPassWordvalid_ShouldReturnTrue_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validatePassword("DB210519988");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidPassWordValid_ShouldReturnFalse_Test() {
        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validatePassword("210519988");
        Assert.assertFalse(result);
    }


}