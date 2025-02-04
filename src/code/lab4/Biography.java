package lab4;

/**
 * Represents a Biography object that extends {@link Book}.
 * Implements {@link Printable}.
 * A biography has a:
 * <li>title</li>
 * <li>year published</li>
 * <li>author</li>
 * <li>person as a subject.</li>
 *
 * @author Grace Jung
 * @author James Smith
 * @version 1.0
 */
public class Biography
                extends Book
                implements Printable
{
    // VARIABLES
    private Person subject;

    // CONSTRUCTORS
    /**
     * Constructs a biography object with a specified title,
     * publication year, author, and subject.
     *
     * @param title represents the autobiography's title
     * @param yearPublished represents the year the autobiography was published
     * @param author represents the author of the biography
     * @param subject represents the subject of the biography
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title,
              yearPublished,
              author);

        if(validateSubject(subject)){
            this.subject = subject;
        } else {
            throw new IllegalArgumentException("Subject is not valid");
        }
    }

    // VALIDATION METHODS
    /*
    Validates the subject and makes sure it's not null.
     */
    private final boolean validateSubject(final Person subject)
    {
        boolean isSubjectValid;
        isSubjectValid = subject != null;
        return isSubjectValid;
    }

    // ACCESSORS
    /*
    Getter for the autobiography's subject.
     */
    protected final Person getSubject(){
        return subject;
    }

    // OTHER METHODS
    /**
     * Overrides the equals() method in the {@link Object} class.
     * Two biographies are equal if they are about the same subject.
     * Checks superclass (Book)'s author, pulls the Name object, and pulls full name as a String.
     * Does the same for incoming object, compares the two w/ equals() on the two Strings.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(final Object o){
        if(!(o instanceof Biography))
        {
            return false;
        }
        Biography b = (Biography)o;

        // Checks superclass (Book)'s author, pulls the Name object, and pulls full name as a String.
        // Does the same for incoming object, compares the two w/ equals() on the two Strings.
        if((super.getAuthor().getName().getFullName())
                .equals(b.getAuthor().getName().getFullName())){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Overrides the display method in interface {@link Printable}.
     * Prints the book details and subject as a string.
     */
    @Override
    public void display()
    {
        StringBuilder sbBiographyDetails;
        sbBiographyDetails = new StringBuilder();

        super.display();
        sbBiographyDetails.append("Subject: ");
        sbBiographyDetails.append(subject.getFullName());
        System.out.println(sbBiographyDetails.toString());

    }
}
