
/**
 * Write a description of class enumTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum enumTest
{
    jeremy("nice", "16"),
    john("name", "14"),
    tom("blah", "13");
    
    private final String desc;
    private final String year;
    
    enumTest(String description, String birthday)
    {
        desc = description;
        year = birthday;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getYear()
    {
        return year;
    }
}
