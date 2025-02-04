package lab4;

/**
 * Represents an Autobiography associated with an {@link Author}, and extends {@link Biography}.
 * Implements {@link Printable}.
 * An autobiography should have:
 * <li>a title</li>
 * <li>the year it was published</li>
 * <li>the author of the autobiography.</li>
 * The subject of the autobiography is also automatically the subject.
 *
 * @author Grace Jung
 * @author James Smith
 * @version 1.0
 */
public class Autobiography
                extends Biography
                implements Printable
{
    // CONSTRUCTOR
    /**
     * Constructs an Autobiography object.
     *
     * @param title represents the title of the autobiography
     * @param yearPublished represents the year the autobiography was published
     * @param author represents the author of the autobiography
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author)
    {
        super(title,
              yearPublished,
              author,
              author);
    }

    // OTHER METHODS
    /**
     * Overrides the display method in interface {@link Printable}.
     * Prints the book and author's information.
     */
    @Override
    public void display()
    {
        super.display();
    }
}
