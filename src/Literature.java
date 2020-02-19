abstract public class Literature
{
    protected int pages;
    protected String author;
    protected String publisher;
    protected String genre;
    protected boolean isFiction;
    protected String type;
    protected String name;

    public Literature(String name, String type , int pages, String author, String publisher, String genre, boolean isFiction)
    {
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.isFiction = isFiction;
        this.type = type;
        this.name = name;
    }

    public String toString()
    {
        String output = "";
        output += "\nName: " + name;
        output += "\nType: " + type;
        output += "\nAuthor: " + author;
        output += "\ngenre: " + genre;
        output += "\nFiction: " + isFiction;
        output += "\nPublisher: " + publisher;
    return output;
    }
}
