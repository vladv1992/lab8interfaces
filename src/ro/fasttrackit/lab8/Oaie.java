package ro.fasttrackit.lab8;

public class Oaie implements Talkable{
   private String name;

    public Oaie(String name){
        this.name = name;
    }
    @Override
    public String talk() {
        return "meeeheh";
    }

    @Override
    public String identify() {
        return "crotal, is my identifay " + name;

    }
}
