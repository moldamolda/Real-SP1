import java.util.ArrayList;

public class GenreMenu {

    public ArrayList<String> Goptions;

    public GenreMenu(ArrayList<String> Goptions) {

        this.Goptions = Goptions;
    }

    public void displayGenreMenu() {

        for (String Goption : Goptions) {
            System.out.println(Goption);
        }
    }
}
