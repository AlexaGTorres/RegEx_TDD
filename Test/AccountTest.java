import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AccountTest
{
    @Test
    void getName()
    {
        Account alexa = new Account("Alexa", 17, 448395);
        assertTrue(alexa.getName() == "Alexa");
    }
}