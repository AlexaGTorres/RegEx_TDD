import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest
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