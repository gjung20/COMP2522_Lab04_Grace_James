package lab4;

/**
 * Represents a name object with a first and last name.
 * Both first and last names cannot be null, blank, and must be less than 50 characters.
 *
 * @author Grace Jung
 * @author James Smith
 * @author Andrew Hwang
 * @version 1.0
 */
public class Name implements Printable
{
    private final String firstName;
    private final String lastName;

    // CONSTRUCTORS
    /**
     * Constructs a Name object for a Person.
     *
     * @param firstName represents a person's first name
     * @param lastName represent a person's last name
     */
    public Name(final String firstName,
                final String lastName)
    {
        validateName(firstName);
        validateName(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    // VALIDATION METHODS
    /*
     * Validates the inputted name.
     * Names cannot be null or blank, and must not exceed 50 characters.
     *
     * @param name represents a name to be validated.
     */
    private void validateName(String name)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        } else if(name.length() > 50)
        {
            throw new IllegalArgumentException("Name cannot exceed 50 characters.");
        }
    }

    // ACCESSORS

    /**
     * Getter for first name.
     *
     * @return the person's first name as a String
     */
    public final String getFirstName()
    {
        return firstName;
    }

    /**
     * Getter for last name.
     *
     * @return the person's last name as a String
     */
    public final String getLastName()
    {
        return lastName;
    }

    /**
     * Getter for full name.
     *
     * @return the person's full name as a String
     */
    public final String getFullName()
    {
        return getFirstName() + " " + getLastName();
    }

    // OTHER METHODS
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
}
