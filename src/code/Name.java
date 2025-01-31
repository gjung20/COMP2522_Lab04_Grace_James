/**
 * Represents a name object with a first and last name.
 * Both first and last names cannot be null, blank, and must be less than 50 characters.
 *
 * @author grace
 * @author james
 * @version 1.0
 */
public class Name implements Printable
{
    private final String firstName;
    private final String lastName;

    /**
     * Constructs a Name object for a Person.
     *
     * @param firstName represents a person's first name
     * @param lastName represent a person's last name
     */
    public Name(String firstName, String lastName)
    {
        validateName(firstName);
        validateName(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Prints the first and last name as a string.
     */
    public void display()
    {
        StringBuilder sbFullName;
        sbFullName = new StringBuilder();

        String fullName = firstName + " " + lastName;

        String displayFullName =
                sbFullName.append("This person's name is ").toString();
                sbFullName.append(fullName);
                sbFullName.append(".");
                sbFullName.append("\n");
                System.out.println(sbFullName);
    }

    /**
     * Validates the inputted name.
     * Names cannot be null or blank, and must not exceed 50 characters.
     *
     * @param name represents a name to be validated.
     */
    protected void validateName(String name)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        } else if(name.length() > 50)
        {
            throw new IllegalArgumentException("Name cannot exceed 50 characters.");
        }
    }
}
