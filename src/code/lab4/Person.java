package lab4;

/**
 * TODO write functionality for Inherited Interface Methods (i think it's completed)
 * TODO write JavaDocs for Constructors, Accessors (completed)
 *
 * Creates a person object that implements {@link Comparable}, {@link Printable},
 * and {@link Reversible}.
 * A person has a:
 * <li>date of birth</li>
 * <li>date of death</li>
 * <li>name.</li>
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
    /**
     * Constructs a Person object, if the person is dead.
     *
     * @param dateOfBirth represents the person's date of birth
     * @param dateOfDeath represents the person's date of death
     * @param name represents the person's name
     */
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name) {

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name = name;
    }

    /**
     * Constructs a Person object, if the person is alive.
     *
     * @param dateOfBirth represents the person's date of birth
     * @param name represents the person's name
     */
    public Person(final Date dateOfBirth,
                  final Name name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    // ACCESSORS

    /**
     * Getter for name variable.
     *
     * @return the person's name as a Name object.
     */
    public final Name getName() {
        return name;
    }

    /**
     * Getter for date of birth variable.
     *
     * @return the person's date of birth as a Date object.
     */
    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Getter for date of death variable.
     *
     * @return the person's date of death as a Date object.
     */
    public final Date getDateOfDeath() {
        return this.dateOfDeath;
    }

    /**
     * Getter for name variable which includes the whole name.
     *
     * @return the person's full name as a String.
     */
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
     * Prints every instance variable (including those of parent classes), in a sentence.
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
     * Prints the name title backwards
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
