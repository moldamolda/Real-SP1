import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Desktop;
import java.net.URI;
class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<String> options = new ArrayList<>();
        ArrayList<String> Goptions = new ArrayList<>();

        MoodMenu mM = new MoodMenu(options);
        GenreMenu gM = new GenreMenu(Goptions);

        PlayList hiphopJ = new PlayList("Joyful Hiphop", "https://open.spotify.com/playlist/37i9dQZF1EIdKVoRo3EqPJ?si=3be815caaa784ead");
        PlayList hiphopE = new PlayList("Energetic Hiphop", "https://open.spotify.com/playlist/37i9dQZF1EIde7oz6y5oZU?si=5444fe349e8043a6");
        PlayList hiphopS = new PlayList("Sad Hiphop", "https://open.spotify.com/playlist/37i9dQZF1EIcZUgkA3BSiL?si=a45cda96584b4270");
        PlayList hiphopA = new PlayList("Angry Hiphop", "https://open.spotify.com/playlist/37i9dQZF1EIdaUXZDw9dYo?si=3ed36e9fc9a64297");

        PlayList rockJ = new PlayList("Joyful Rock", "https://open.spotify.com/playlist/2BumzROvyilNPyczjghkba?si=3ff3b4ded359465f");
        PlayList rockE = new PlayList("Energetic Rock", "https://open.spotify.com/playlist/37i9dQZF1DWZVAVMhIe3pV?si=774c43c88f094b65");
        PlayList rockS = new PlayList("Sad Rock", "https://open.spotify.com/playlist/37i9dQZF1EIcxHInSBQ4YQ?si=271dd5b4d3c74d24");
        PlayList rockA = new PlayList("Angry Rock", "https://open.spotify.com/playlist/37i9dQZF1EIhPEivbiO6xe?si=b3fd4c498405443d");

        PlayList popJ = new PlayList("Joyful Pop", "https://open.spotify.com/playlist/37i9dQZF1DWVlYsZJXqdym?si=3003c41896ba45e0");
        PlayList popE = new PlayList("Energetic Pop", "https://open.spotify.com/playlist/37i9dQZF1DX0vHZ8elq0UK?si=1409d6a1ddf948f2");
        PlayList popS = new PlayList("Sad Pop", "https://open.spotify.com/playlist/37i9dQZF1EIdZrPvCvCkh4?si=2ae2a41117dd49a2");
        PlayList popA = new PlayList("Angry Pop", "https://open.spotify.com/playlist/37i9dQZF1EIfThrCEERy1q?si=e05aeb35697942f4");

        PlayList classicalJ = new PlayList("Joyful Classical", "https://open.spotify.com/playlist/37i9dQZF1DX5Lm1ZiObdc3?si=e38a3cf83ffa4a6a");
        PlayList classicalE = new PlayList("Energetic Classical", "https://open.spotify.com/playlist/3uEzkz6Maxo4FFH0KPsJ6C?si=e71ae79c38684c12");
        PlayList classicalS = new PlayList("Sad Classical", "https://open.spotify.com/playlist/37i9dQZF1DXbm0dp7JzNeL?si=05dc8ae3010943b9");
        PlayList classicalA = new PlayList("Angry Classical", "https://open.spotify.com/playlist/37i9dQZF1EIfQTRTyWFecw?si=ea13da4062d44ad4");

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
        System.out.println("Okay, " + user + ". " + "What genre would you like to listen to for your " + mood + " mood?\n");
        gM.displayGenreMenu();
        System.out.println("\nI would like to listen to: ");
        String genre = scanner.next();


        //TODO:  switch case
        // Så programmet kan printe nogle menuer og tage i mod inputs som navn, mood og genr
        //if((mood.equals("Joyful") && genre.equals("Hiphop"))){
        //System.out.println(hiphopJ);
        switch (mood) {
            case "Joyful":
                switch (genre) {
                    case "Hiphop":
                        Desktop.getDesktop().browse(new URI(hiphopJ.link));
                    case "Rock":
                        Desktop.getDesktop().browse(new URI(rockJ.link));
                    case "Pop":
                        Desktop.getDesktop().browse(new URI(popJ.link));
                    case "Classical":
                        Desktop.getDesktop().browse(new URI(classicalJ.link));
                }
            case "Energetic":
                switch (genre) {
                    case "Hiphop":
                        Desktop.getDesktop().browse(new URI(hiphopE.link));
                    case "Rock":
                        Desktop.getDesktop().browse(new URI(rockE.link));
                    case "Pop":
                        Desktop.getDesktop().browse(new URI(popE.link));
                    case "Classical":
                        Desktop.getDesktop().browse(new URI(classicalE.link));

                }
            case "Sad":
                switch (genre) {
                    case "Hiphop":
                        Desktop.getDesktop().browse(new URI(hiphopS.link));
                    case "Rock":
                        Desktop.getDesktop().browse(new URI(rockS.link));
                    case "Pop":
                        Desktop.getDesktop().browse(new URI(popS.link));
                    case "Classical":
                        Desktop.getDesktop().browse(new URI(classicalS.link));

                }
            case "Angry":
                switch (genre) {
                    case "Hiphop":
                        Desktop.getDesktop().browse(new URI(hiphopA.link));
                    case "Rock":
                        Desktop.getDesktop().browse(new URI(rockA.link));
                    case "Pop":
                        Desktop.getDesktop().browse(new URI(popA.link));
                    case "Classical":
                        Desktop.getDesktop().browse(new URI(classicalA.link));
                }
        }
    }