public class SacredText extends Literature
{
    protected String religion;
    public SacredText(String name, String type, int pages, String author, String publisher, String genre, boolean isFiction, String religion) {
        super(name, type, pages, author, publisher, genre, isFiction);
        this.religion = religion;
    }
    public String toString()
    {
        String output = super.toString();
        output += "\nReligion: " + religion;
        return output;
    }
}
