import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest
{
    @Test
    void getName()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        assertTrue(alexa.getUsername().matches("Alexa"));
    }

    @Test
    void setName()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        alexa.setUsername("Ori");
        assertTrue (alexa.getUsername().matches("Ori"));
    }
}