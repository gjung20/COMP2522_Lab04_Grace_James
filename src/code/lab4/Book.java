package lab4;

/**
 * TODO Implement Interface Methods, Write Javadoc for Constructors, Write Class Description
 *
 *
 * @author Grace Jung
 * @author James Smith
 * @version 1.0
 */
public class Book
        implements  Comparable<Book>,
                    Printable,
                    Reversible
{

    // VARIABLES
    private String title;
    private int yearPublished;
    private Author author;

    public static final int CURRENT_YEAR = 2025;

    // CONSTRUCTORS
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        if(validateTitle(title)                     &&
            validateYearPublished(yearPublished)    &&
            validateAuthor(author))
        {
            this.title = title;
            this.yearPublished = yearPublished;
            this.author = author;
        }
    }

    // VALIDATION METHODS
    /*
     * Checks if the input title is null, blank or greater than 100 characters.
     * If none of these are true, book is valid, and boolean true is returned, else false.
     *
     * @param title String representing title of a Book.
     * @return boolean true if book title is valid, else false.
     */
    private final boolean validateTitle(final String title)
    {
        if(title == null    ||
           title.isBlank()  ||
           title.length() > 100){
            return false;
        } else {
            return true;
        }
    }

    /*
     * Checks if Book's Author is a null value.
     * If Author is not null it is valid and method returns a boolean true, else false.
     *
     * @param author            - represents the Author who wrote the book.
     * @return boolean          - boolean true if Author is valid, else false.
     */
    private final boolean validateAuthor(final Author author)
    {
        if(author == null){
            return false;
        } else {
            return true;
        }
    }

    /*
     * Checks if Book's year publish is greater than the current year, or less than year 0.
     * If neither are true, yearPublished is valid and method returns a boolean true, else false.
     *
     * @param yearPublished int - represents year the book was published
     * @return boolean          - true if book yearPublished is valid, else false.
     */
    private final boolean validateYearPublished(final int yearPublished)
    {
        if(yearPublished < 1 ||
        yearPublished > CURRENT_YEAR){
            return false;
        } else {
            return true;
        }
    }

    // ACCESSORS
    /**
     * Accesses and returns the Book's title.
     * @return String - representing books title.
     */
    protected final String getTitle(){
        return title;
    }

    /**
     * Accesses and returns the year the book was published
     * @return int - representing books Year Published.
     */
    protected final int getYearPublished(){
        return yearPublished;
    }

    /**
     * Accesses and returns the Book's Author.
     * @return Author - representing books author.
     */
    protected final Author getAuthor(){
        return author;
    }

    // IMPLEMENTED METHODS

    // Older Books are larger
    @Override
    public int compareTo(Book o) {
        return 0;
    }

    // Prints title, year, author
    @Override
    public void display() {

    }

    // Prints the title backwards
    @Override
    public void backwards() {

    }
}
