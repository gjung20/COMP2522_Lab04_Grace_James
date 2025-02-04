package lab4;

/**
 * TODO write functionality for Inherited Interface Methods
 * TODO write JavaDocs for Constructors, Accessors
 *
 * Creates a person object.
 *
 * @author Grace Jung
 * @author James Smith
 * @author Andrew Hwang
 * @version 1.0
 */
public class Person
        implements  Comparable<Person>,
                    Printable,
                    Reversible
{
    // VARIABLES
    private Date dateOfBirth;
    private Date dateOfDeath;
    private Name name;

    // CONSTRUCTORS
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name) {

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name = name;
    }

    public Person(final Date dateOfBirth,
                  final Name name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    // ACCESSORS
    public final Name getName() {
        return name;
    }

    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Date getDateOfDeath() {
        return this.dateOfDeath;
    }

    public final String getFullName() {
        return this.name.getFullName();
    }


    // IMPLEMENTED METHODS
    /**
     * Compares to Person objects, they are compared by their ages relative to each other.
     * If this person is older,     a 1 is returned.
     * If this person is younger,   a -1 is returned.
     * If both are the same age,    a 0 is returned.
     *
     * @param o     - Person representing who you would like to compare against this person object.
     * @return int  -   -1 if this person is younger than the passed in person,
     *                  1 if this person is older than the passed in person,
     *                  0 if the two person objects are the same age.
     */
    @Override
    public int compareTo(Person o) {

        // Checks Year in which Person was born.
        if(this.dateOfBirth.getYear() < o.dateOfBirth.getYear())
        {
            return -1;
        } else if(this.dateOfBirth.getYear() > o.dateOfBirth.getYear())
        {
            return 1;

        // If two people are born in the same year, check who was born in an earlier month.
        } else
        {
            if(this.dateOfDeath.getMonth() < o.dateOfDeath.getMonth())
            {
                return -1;
            } else if(this.dateOfDeath.getMonth() > o.dateOfDeath.getMonth())
            {
                return 1;

            // If two people are born in the same month and year, check who was born on the earlier day.
            } else
            {
                if(this.dateOfDeath.getDay() < o.dateOfDeath.getDay())
                {
                    return -1;
                } else if(this.dateOfDeath.getDay() > o.dateOfDeath.getDay())
                {
                    return 1;
                } else
                {
                    return 0;
                }
            }

        }
    }

    /**
     * Prints every instance variable (including those of parent classes, in a sentence.
     */
    @Override
    public void display() {
        StringBuilder sbPerson;
        sbPerson = new StringBuilder();

        if (this.dateOfDeath != null) {
            sbPerson.append("Name: ");
            sbPerson.append(this.name.getFullName());
            sbPerson.append("\nDate of Birth: ");
            sbPerson.append(this.dateOfBirth.getYyyyMmDd());
            sbPerson.append("\nDate of Death: ");
            sbPerson.append(this.dateOfDeath.getYyyyMmDd());
        } else {
            sbPerson.append("Name: ");
            sbPerson.append(this.name.getFullName());
            sbPerson.append("\nDate of Birth: ");
            sbPerson.append(this.dateOfBirth.getYyyyMmDd());
        }

        System.out.println(sbPerson.toString());
    }

    /**
     * Prints the name/ title backwards
     */
    @Override
    public void backwards() {
        StringBuilder sbPersonBW;
        sbPersonBW = new StringBuilder();

        int nameLength;
        nameLength = this.name.getFullName().length();

        sbPersonBW.append("Backwards Name: ");

        for(int counter = 0; counter < nameLength; counter++)
        {
            char c = this.name.getFullName().charAt(nameLength - (1 + counter));
            sbPersonBW.append(c);
        }

        System.out.println(sbPersonBW);
    }
}
