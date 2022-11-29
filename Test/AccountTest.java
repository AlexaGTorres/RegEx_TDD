import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest
{
    @Test
    void getUsername()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        assertTrue(alexa.getUsername().matches("Alexa"));
    }//Regular check

    @Test
    void setUsernameSpace()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        alexa.setUsername(" ");
        assertTrue (alexa.getUsername().matches(" "));
    }//Checks if there is a space

    @Test
    void setUsernameNoSpace()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        alexa.setUsername("Ori");
        assertTrue(alexa.getUsername().matches("Please Check Requirements and Try Again"));
    }
}