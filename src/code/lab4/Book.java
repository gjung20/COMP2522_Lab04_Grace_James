package lab4;

/**
 * Represents a Book object that implements {@link Comparable},
 * {@link Printable}, and {@link Reversible}.
 * A book has a:
 * <li>title: String, not null, not blank, less than 100 characters.</li>
 * <li>publication year: int, must be between year 1 and the current year.</li>
 * <li>author: Author, not null.</li>
 *
 * @author Grace Jung
 * @author James Smith
 * @author Andrew Hwang
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
    /**
     * Constructs a Book object.
     *
     * @param title represents the books title
     * @param yearPublished represents the year of publication
     * @param author represents the author of book
     */
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
        boolean isAuthorValid;
        isAuthorValid = author != null;
        return isAuthorValid;
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
        boolean isYearValid;
        isYearValid = yearPublished >= 1 &&
                yearPublished <= CURRENT_YEAR;
        return isYearValid;
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
    /**
     * Overrides the compareTo() method from {@link Comparable}.
     * Older books are larger.
     *
     * @param o the object to be compared.
     * @return the object o as an integer.
     */
    @Override
    public int compareTo(Book o)
    {
        return Integer.compare(this.yearPublished, o.yearPublished);
    }

    /**
     * Prints the title, year, and author.
     */
    @Override
    public void display()
    {
        StringBuilder sbBookDetails;
        sbBookDetails = new StringBuilder();
        sbBookDetails.append("Title:");
        sbBookDetails.append(title);
        sbBookDetails.append('\n');
        sbBookDetails.append("Year Published: ");
        sbBookDetails.append(yearPublished);
        sbBookDetails.append('\n');
        sbBookDetails.append("Author: ");
        sbBookDetails.append(author);
        System.out.println(sbBookDetails.toString());

    }

    /**
     * Prints the title backwards as a String.
     */
    @Override
    public String backwards()
    {
        StringBuilder reversedTitle;
        char currentCharacter;

        reversedTitle = new StringBuilder();

        for(int i = 0 ; i < getTitle().length() ; i++)
        {
            currentCharacter = getTitle().charAt(i);
            reversedTitle.insert(0, currentCharacter);
        }
        return reversedTitle.toString();
    }
}
