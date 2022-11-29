import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest
{
    //Username 3 tests
    @Test
    void getUsername()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        assertTrue(alexa.getUsername().matches("Alexa"));
    }//Regular check

    @Test
    void setUsernameSpace()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setUsername(" ");
        assertTrue (alexa.getUsername().matches(" "));
    }//Checks if there is a space

    @Test
    void setUsernameNoSpace()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setUsername("Ori");
        assertTrue(alexa.getUsername().matches("Please Check Requirements and Try Again"));
    }//Checks when there is no space

    //Age 3 tests
    @Test
    void getAge()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        assertTrue(alexa.getAge().matches("17"));
    }//Regular check

    @Test
    void setAgeNotNumber()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setAge("hello");
        assertTrue(alexa.getAge().matches("Please Check Requirements and Try Again"));
    }

    @Test
    void setAgeNumber()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setAge("16");
        assertTrue(alexa.getAge().matches("16"));
    }

    //Id 3 tests
    @Test
    void getId()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        assertTrue(alexa.getId().matches("448395"));
    }//Regular check

    @Test
    void setIdNotNumber()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setAge("bye");
        assertTrue(alexa.getAge().matches("Please Check Requirements and Try Again"));
    }

    @Test
    void setIdNumber()
    {
        Account alexa = new Account("Alexa", "17", "448395");
        alexa.setId("228179");
        assertTrue(alexa.getId().matches("228179"));
    }
}