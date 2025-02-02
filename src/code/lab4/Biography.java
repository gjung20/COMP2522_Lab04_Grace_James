package lab4;

/**
 * TODO implement Display() functionality
 * TODO JavaDoc for Constructor, Accessors, Validation Methods (but not JavaDoc), equals()
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
    private final boolean validateSubject(final Person subject)
    {
        if(subject == null){
            return false;
        } else {
            return true;
        }
    }

    // ACCESSORS
    protected final Person getSubject(){
        return subject;
    }

    // OTHER METHODS
    /**
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


    @Override
    public void display() {

    }
}
