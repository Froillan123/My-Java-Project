import java.time.LocalDate;

public class Person
{
    private String LastName;
    private String FirstName;
    private String MiddleName;
    private LocalDate birthday;
    private char Gender;
    private double Height;
    private double Weight;

    public Person(String LastName, String FirstName , String MiddleName, LocalDate birthday, char Gender, double Height, double Weight)
    {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.birthday = birthday;
        this.Gender = Gender;
        this.Height = Height;
        this.Weight = Weight;
    }

    public String getLastName()
    {
        return LastName;
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getMiddleName()
    {
        return MiddleName;
    }
    public LocalDate getBirthDate()
    {
        return birthday;
    }
    public char getGender()
    {
        return Gender;
    }
    public double getHeight()
    {
        return Height;
    }
    public double getWeight()
    {
        return Weight;
    }
    
}