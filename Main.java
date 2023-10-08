import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.*;
import java.net.URI;
class Main {

        public static void main(String[] args) {


            ArrayList<String> options = new ArrayList<>();
            ArrayList<String> Goptions = new ArrayList<>();


            MoodMenu mM = new MoodMenu(options);
            GenreMenu gM = new GenreMenu(Goptions);

            PlayList hiphopJ = new PlayList("Joyful Hiphop","https://open.spotify.com/playlist/37i9dQZF1EIdKVoRo3EqPJ?si=3be815caaa784ead");

            options.add("1. Joyful");
            options.add("2. Energetic");
            options.add("3. Sad");
            options.add("4. Angry");

            Goptions.add("1. Rock");
            Goptions.add("2. Pop");
            Goptions.add("3. Hiphop");
            Goptions.add("4. Classical");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please type your first user to start");
            String user = scanner.next();
            System.out.println("Hi " + user + ". Let's find a playlist for you.\nWhat is your current mood?\n");
            mM.displayMenu();
            System.out.println("\nI am: ");
            String mood = scanner.next();
            System.out.println("Okay, " + user +". " + "What genre would you like to listen to for your " + mood + " mood?\n" );
            gM.displayGenreMenu();
            System.out.println("\nI would like to listen to: ");
            String genre = scanner.next();




        //TODO:  switch case
        // Så programmet kan printe nogle menuer og tage i mod inputs som navn, mood og genr
            //if((mood.equals("Joyful") && genre.equals("Hiphop"))){
                //System.out.println(hiphopJ);
         }

       // switch(){
      //      case mood.equals("Joyful") && genre.equals("Hiphop")):
          //      System.out.println(hiphopJ);

        }



        }

}