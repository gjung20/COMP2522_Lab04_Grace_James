package lab4;

/**
 * TODO Add Data and Print
 *
 * @author Grace Jung
 * @author James Smith
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        Date georgeBirth = new Date(1903, 6,25);
        Date georgeDeath = new Date(1950, 1,21);
        Name georgeName = new Name("George", "Orwell");
        Author georgeOrwell = new Author(georgeBirth, georgeDeath,georgeName,"Poetry");
        Book nineteenEightyFour = new Book("1984", 1960, georgeOrwell);

    }
}
