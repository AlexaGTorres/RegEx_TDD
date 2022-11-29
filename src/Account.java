public class Account
{
    private String username;
    private int age;
    private int id;

    public Account (String username, int age, int id)
    {
        this.username = username;
        this.age = age;
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        if (username.matches("[\\s]"))//check for space between words
        {
            this.username = username;
        }
        else
        {
            this.username = "Please Check Requirements and Try Again";
        }
    }
}
