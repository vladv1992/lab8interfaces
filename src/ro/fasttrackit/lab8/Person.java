package ro.fasttrackit.lab8;

public class Person implements Talkable {
    String cnp;
  public Person(String cnp){
      this.cnp = cnp;
    }

    @Override
    public String identify(){
        return "identify whit " + cnp;
    }
    @Override
   public String talk(){
        return "fdfsfsdfsfsfs";
    }
    public String sing(){
      return "lallal";
    }


}
