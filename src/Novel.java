public class Novel extends Literature
{
    private String mainCharacter;
    private int POV;
    private boolean isShort;
    private boolean isAdaptation;
    private boolean hasAdaptation;

    public Novel(String name, String type, int pages, String author, String publisher, String genre, boolean isFiction, String mainCharacter,
                 int POV, boolean isShort, boolean isAdaptation, boolean hasAdaptation)
    {
        super(name, type, pages, author, publisher, genre, isFiction);
        this.mainCharacter = mainCharacter;
        this.POV = POV;
        this.isShort = isShort;
        this.isAdaptation = isAdaptation;
        this.hasAdaptation = hasAdaptation;
    }

    public String toString()
    {
        String output =super.toString();
        output += "\nMain Character: " + mainCharacter;
        output += "\nPOV: " + POV + "st Person";
        output += "\nShort: " + isShort;
        output += "\nAdaptation: " + isAdaptation;
        output += "\nHas an Adaptation: " + hasAdaptation;
        return output;
    }
}
