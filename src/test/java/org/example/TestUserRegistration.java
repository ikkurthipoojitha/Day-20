package org.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import  static org.junit.Assert.assert;


public class TestUserRegistration {
    UserRegistration userRegistration = new UserRegistration();

    @BeforeAll
    public void initialize(){
        userRegistration = new UserRegistration();
    }


    @Test
    public void givenFirstName_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","Riya");
        assert result;
    }

    @Test
    public void givenLastName_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateFirstName("^[A-Z][a-z]{2,}$","Riya");
        assert result;
    }

    @Test
    public void givenPassword_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validatePassword("^[A-Z][0-9][@#]{1}[a-z]{5,}$","K9@hgjkjijk");
        assert result;
    }

    @Test
    public void givenMobileNo_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateMobileNo("^[9][1]\\s[9][0-9]{9}$","91 9876543892");
        assert result;
    }

    @Test
    public void givenEmail_whenChecked_shouldReturnHappy(){
        boolean result = userRegistration.validateEmail("^[a-z]{3}[.][x-z]{3}[@][a-z]{2}[.][c]{1}[o]{1}[.][i][n]$", "abc.xyz@bl.co.in");
        assert result;
    }


}
