import java.util.ArrayList;
public class MoodMenu {

    public ArrayList<String> options;

    public MoodMenu(ArrayList<String> options) {

        this.options = options;
    }
    public void displayMenu() {

        for (String option : options){
            System.out.println(option);
        }


    }


}