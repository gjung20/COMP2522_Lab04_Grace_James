package lab4;

/**
 * TODO Write Class Description
 * TODO JavaDoc for Constructor
 * TODO Add display() functionality
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
    @Override
    public void display(){

    }
}
