public class PlayList {
    String name;
    String link;
    public PlayList(String name, String link){
        this.name = name;
        this.link = link;
    }

    public String getName(){
        return this.name;
    }

    public String getLink(){
        return this.link;
    }

    public String setName(String name){
        return this.name;
    }

    public String setLink(String link) {
       return this.link;
    }

    public String toString(){
        return getName() + " " + getLink();
    }
}
