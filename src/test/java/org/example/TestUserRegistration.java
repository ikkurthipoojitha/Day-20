package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestUserRegistration {
    UserRegistration userRegistration = new UserRegistration();

    @BeforeEach
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Test
    public void givenFirstName_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","Teja");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenChecked_shouldReturnSad(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","abcd");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenLastName_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateLastName("^[A-Z][a-z]{2,}$","Kavya");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenChecked_shouldReturnSad(){
        boolean result = userRegistration.validateLastName("^[A-Z][a-z]{2,}$","Ab");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenPassword_whenChecked_shouldReturnHappy(){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        boolean result = userRegistration.validatePassword(regex,"Poojitha@123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenChecked_shouldReturnSad(){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        boolean result = userRegistration.validatePassword(regex,"bjknkl@123");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenMobileNumber_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateMobileNumber("^[0-9]{1,2}\\s[6-9][0-9]{9}$","91 9876543210");
        Assertions.assertTrue(result);

    }
    @Test
    public void givenMobileNumber_whenChecked_shouldReturnSad(){
        boolean result = userRegistration.validateMobileNumber("^[0-9]{1,2}\\s[6-9][0-9]{9}$","91 98543210");
        Assertions.assertFalse(result);

    }


    @Test
    public void givenEmail_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[_][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$", "abc_100@ad.co.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenChecked_shouldReturnSad(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[_][a-z0-9]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][a-z]{2,5}$", "abc_@ad.co.com");
        Assertions.assertFalse(result);
    }


}
