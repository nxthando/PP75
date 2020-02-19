public class ReadingDriver
{
    public static void main(String[] args)
    {
        Literature[] myBooks = new Literature[3];
        Novel MeinKampf = new Novel("Mein Kampf", "Novel", 505, "Adolf Hitler",
                "Franz Eher Nachfolger", "Manifesto", false, "Adolf Hitler", 1,false,false,false);
        Magazine TeenVogue = new Magazine("Teen Vogue", "Teen Magazine", 23,"Vogue", "Conde Nast", "Portfolio",
                false, new String[]{"Justin Bieber", "Liam Hemsworth"});
        SacredText Bible = new SacredText("The Holy Bible", "Sacred Text", 2048, "Various Authors", "The Christian Faith",
                "N/A", false, "Christianity");
        myBooks[0] = MeinKampf;
        myBooks[1] = TeenVogue;
        myBooks[2] = Bible;

        for (int i = 0; i < myBooks.length;i++)
        {
            System.out.println(myBooks[i]);
        }
    }
}
