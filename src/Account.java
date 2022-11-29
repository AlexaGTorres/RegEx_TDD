public class Account
{
    private String username;
    private String age;
    private int id;

    public Account (String username, String age, int id)
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

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        if (age.matches("[0-9]"))//check for space between words
        {
            this.age = age;
        }
        else
        {
            this.age = "Please Check Requirements and Try Again";
        }
    }
}
