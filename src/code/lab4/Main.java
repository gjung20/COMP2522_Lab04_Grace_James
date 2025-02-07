package lab4;

/**
 *
 *
 * @author Grace Jung
 * @author James Smith
 * @author Andrew Hwang
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        // Instantiating five book objects
        Date georgeBirth = new Date(1903, 6,25);
        Date georgeDeath = new Date(1950, 1,21);
        Name georgeName = new Name("George", "Orwell");
        Author georgeOrwell = new Author(georgeBirth, georgeDeath, georgeName,"Dystopian Fiction");
        Book nineteenEightyFour = new Book("1984", 1949, georgeOrwell);

        Date harperBirth = new Date(1926, 4, 28);
        Date harperDeath = new Date(2016, 2, 19);
        Name harperName = new Name("Harper", "Lee");
        Author harperLee = new Author(harperBirth, harperDeath, harperName, "Southern Gothic Fiction");
        Book toKillAMockingbird = new Book("To Kill A Mockingbird", 1960, harperLee);

        Date janeBirth = new Date(1775, 12, 16);
        Date janeDeath = new Date(1817, 7, 18);
        Name janeName = new Name("Jane", "Austen");
        Author janeAusten = new Author(janeBirth, janeDeath, janeName, "Romance, Coming of Age");
        Book prideAndPrejudice = new Book("Pride and prejudice", 1813, janeAusten);

        Date scottBirth = new Date(1896, 9, 24);
        Date scottDeath = new Date(1940, 12, 21);
        Name scottName = new Name("F. Scott", "Fitzgerald");
        Author fScottFitzgerald =  new Author(scottBirth, scottDeath, scottName, "Tragedy");
        Book theGreatGatsby = new Book("The Great Gatsby", 1925, fScottFitzgerald);

        Date hermanBirth = new Date(1819, 8, 1);
        Date hermanDeath = new Date(1891, 9, 28);
        Name hermanName = new Name("Herman", "Melville");
        Author hermanMelville = new Author(hermanBirth, hermanDeath, hermanName, "Adventure Fiction");
        Book mobyDick = new Book("Moby-Dick", 1851, hermanMelville);

        // Instantiating five person objects for biography
        Person robertMoses = new Person(new Date(1888, 12, 18), new Date(1981, 7, 29), new Name("Robert", "Moses"));
        Person steveJobs = new Person(new Date(1955, 2, 24), new Date(2011, 10, 5),new Name("Steve", "Jobs"));
        Person winstonChurchill = new Person(new Date(1874, 11, 30), new Date(1965, 1, 24), new Name("Winston", "Churchill"));
        Person alexanderHamilton = new Person(new Date(1755, 1, 11), new Date(1804, 7, 12), new Name("Alexander", "Hamilton"));
        Person albertEinstein = new Person(new Date(1879, 3, 14), new Date(1955, 4, 18), new Name("Albert", "Einstein"));

        // Instantiating five biography objects
        Biography powerBroker = new Biography("The Power Broker", 1974,
                new Author(new Date(1935, 10, 30), null, new Name("Robert", "Caro"), "Non-Fiction"), robertMoses);
        Biography steveJobsBio = new Biography("Steve Jobs", 2011,
                new Author(new Date(1952, 5, 20), null, new Name("Walter", "Isaacson"), "Non-Fiction"), steveJobs);
        Biography churchillLife = new Biography("Churchill: A Life", 1991,
                new Author(new Date(1936, 10, 25), new Date(2015, 3, 3), new Name("Martin", "Gilbert"), "Non-Fiction"), winstonChurchill);
        Biography hamiltonBio = new Biography("Alexander Hamilton", 2004,
                new Author(new Date(1949, 3, 2), null, new Name("Ron", "Chernow"), "Non-Fiction"), alexanderHamilton);
        Biography einsteinBio = new Biography("Einstein: His Life and Universe", 2007,
                new Author(new Date(1952, 5, 20), null, new Name("Walter", "Isaacson"), "Non-Fiction"), albertEinstein);

        // Instantiating five autobiography objects
        Autobiography diaryOfAnneFrank = new Autobiography("The Diary of a Young Girl", 1947,
                new Author(new Date(1929, 6, 12), new Date(1945, 3, 1),
                new Name("Anne", "Frank"), "Autobiography"));
        Autobiography mandelaAuto = new Autobiography("Long Walk to Freedom", 1994,
                new Author(new Date(1918, 7, 18), new Date(2013, 12, 5),
                new Name("Nelson", "Mandela"), "Autobiography"));
        Autobiography gandhiAuto = new Autobiography("The Story of My Experiments with Truth", 1927,
                new Author(new Date(1869, 10, 2), new Date(1948, 1, 30),
                new Name("Mahatma", "Gandhi"), "Autobiography"));
        Autobiography angelouAuto = new Autobiography("I Know Why the Caged Bird Sings", 1969,
                new Author(new Date(1928, 4, 4), new Date(2014, 5, 28),
                new Name("Maya", "Angelou"), "Autobiography"));
        Autobiography malcolmXAuto = new Autobiography("Autobiography of Malcolm X", 1965,
                new Author(new Date(1925, 5, 19), new Date(1965, 2, 21),
                new Name("Malcolm", "X"), "Autobiography"));

        // Comparing Books by Publication Year
        System.out.println("\n--- Comparing Books by Publication Year (using equals()) ---");
        System.out.println("1984 Publication Date: " + nineteenEightyFour.getYearPublished() +
                           "\nTo Killing A Mockingbird Publication Date: " + toKillAMockingbird.getYearPublished() +
                           "\n" + nineteenEightyFour.getTitle() + " vs. " + toKillAMockingbird.getTitle() + ": " +
                           (Integer.valueOf(nineteenEightyFour.getYearPublished()).equals(toKillAMockingbird.getYearPublished())));

        // Comparing Authors by Birthdate
        System.out.println("\n--- Comparing Authors by Birthdate (using equals()) ---");
        System.out.println("Jane Austen's birthdate: " + janeAusten.getDateOfBirth() +
                           "\nF. Scott Fitzgerald's birthdate: " + fScottFitzgerald.getDateOfBirth() +
                           "\nJane Austen vs. F. Scott Fitzgerald: " +
                           janeAusten.getDateOfBirth().equals(fScottFitzgerald.getDateOfBirth()));

        // Comparing Biographies by Subject
        System.out.println("\n--- Comparing Biographies by Subject (using compareTo())---");
        System.out.println("Albert Einstein's Biography's subject: " + einsteinBio.getSubject() +
                           "\nSteve Job's Biography's subject: " + steveJobsBio.getSubject() +
                           "\nEinstein vs. Steve Jobs: " + einsteinBio.getSubject().getName().getFullName().compareTo(steveJobsBio.getSubject().getName().getFullName()));

        // Printing Book, Biography, and Autobiography Details
        System.out.println("\n--- Book Details ---");
        prideAndPrejudice.display();
        System.out.println();
        theGreatGatsby.display();
        System.out.println();
        mobyDick.display();

        System.out.println("\n--- Biography Details ---");
        steveJobsBio.display();
        System.out.println();
        churchillLife.display();
        System.out.println();
        hamiltonBio.display();

        System.out.println("\n--- Autobiography Details ---");
        diaryOfAnneFrank.display();
        System.out.println();
        angelouAuto.display();
        System.out.println();
        malcolmXAuto.display();

        // Printing Book Titles & Author Names Backwards
        System.out.println("\n--- Reversed Titles & Author Names ---");
        System.out.println("[Book Title] 1984 Reversed: " + nineteenEightyFour.backwards());
        System.out.println("[Book Title] Pride and Prejudice Reversed: " + prideAndPrejudice.backwards());
        System.out.println("[Author Name] (Harper Lee) " + harperLee.backwards());
        System.out.println("[Author Name] (Herman Melville) " + hermanMelville.backwards());
    }
}
