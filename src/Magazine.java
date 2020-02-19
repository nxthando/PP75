public class Magazine extends Literature
{
    protected String[] celebrities;
    public Magazine(String name, String type, int pages, String author, String publisher, String genre, boolean isFiction, String[] celebrities) {
        super(name, type, pages, author, publisher, genre, isFiction);
        this.celebrities = celebrities;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += "\nCelebrities: ";
        for(int i= 0; i < celebrities.length; i++)
        {
            output += celebrities[i] + ",";
        }
        return output;
    }
}
