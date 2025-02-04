package lab4;

/**
 * TODO Check if display() will result in null pointer due to returning potentially non-existent dateOfDeath.
 *
 * @author Grace Jung
 * @author James Smith
 * @version 1.0
 */
public class Author
        extends Person
        implements Printable {

    // VARIABLES
    private String genre;

    // CONSTRUCTORS
    /**
     * Constructs an Author object with a death date.
     *
     * @param dateOfBirth the author's date of birth
     * @param dateOfDeath the author's death date (if applicable)
     * @param name the author's name
     * @param genre the author's genre
     */
    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);

        if(validateGenre(genre)){
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre not valid.");
        }
    }

    /**
     * Constructs an Author object without a death date.
     *
     * @param dateOfBirth the author's date of birth
     * @param name the author's name
     * @param genre the author's genre
     */
    public Author(final Date dateOfBirth,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, name);

        if(!validateGenre(genre)){
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre not valid.");
        }
    }

    // VALIDATION METHODS
    /*
    Validates the author's genre and makes sure it's a string that is
    not null, not empty, and shorter than 30 characters.
     */
    private final boolean validateGenre(final String genre)
    {
        boolean isGenre;
        isGenre = genre == null     ||
                  genre.isBlank()   ||
                  (genre.length() >= 30);
        return isGenre;
    }

    // ACCESSORS
    /**
     * Getter for the author's genre.
     *
     * @return the author's genre as a string
     */
    public final String getGenre(){
        return genre;
    }

    // INHERITED METHODS
    /**
     * Overrides the display method in interface {@link Printable}.
     * Returns the author's information:
     * - Name
     * - Genre
     * - Date of Birth
     * - Death Date (if applicable)
     * as a string.
     */
    @Override
    public void display(){
        StringBuilder sbAuthor;
        sbAuthor = new StringBuilder();

        if(super.getDateOfDeath() != null)
        {
            sbAuthor.append("Name: ");
            sbAuthor.append(super.getFullName());
            sbAuthor.append("\nGenre: ");
            sbAuthor.append(genre);
            sbAuthor.append("\nDate of Birth: ");
            sbAuthor.append(super.getDateOfBirth().getYyyyMmDd());
            sbAuthor.append("\nDate of Death: ");
            sbAuthor.append(super.getDateOfDeath().getYyyyMmDd());
        } else
        {
            sbAuthor.append("Name: ");
            sbAuthor.append(super.getFullName());
            sbAuthor.append("\nGenre: ");
            sbAuthor.append(genre);
            sbAuthor.append("\nDate of Birth: ");
            sbAuthor.append(super.getDateOfBirth().getYyyyMmDd());
        }

        System.out.println(sbAuthor);
    }
}
