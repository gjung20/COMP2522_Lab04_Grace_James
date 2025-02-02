package lab4;

/**
 * TODO Check if display() will result in null pointer due to returning potentially non-existent dateOfDeath.
 * TODO Javadocs for Class Description, Constructors, Validation Methods (but not JavaDoc bc private), and Accessors
 *
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
    public Author(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, dateOfDeath, name);

        if(validateGenre(genre)){
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre not valid");
        }
    }

    public Author(final Date dateOfBirth,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, name);

        if(validateGenre(genre)){
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Genre not valid");
        }
    }

    // VALIDATION METHODS
    private final boolean validateGenre(final String genre)
    {
       if(genre == null     ||
          genre.isBlank()   ||
          (genre.length() >= 30))
       {
           return false;
        } else {
           return true;
       }
    }

    // ACCESSORS
    public final String getGenre(){
        return genre;
    }

    // INHERITED METHODS
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
