import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest
{
    @Test
    void getUsername()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        assertTrue(alexa.getUsername().matches("Alexa"));
    }

    @Test
    void setUsername()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        alexa.setUsername("Ori");
        assertTrue (alexa.getUsername().matches("Ori"));
    }
}