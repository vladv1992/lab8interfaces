package ro.fasttrackit.lab8;

public class MainTalk {
    public static void main(String[] args){
        Person mada = new Person("234798949595");
        System.out.println(mada.identify());
        System.out.println(mada.talk());
        Talkable talk = mada;
        System.out.println(mada.sing());
        System.out.println(talk.identify());
        Oaie mura = new Oaie("Joana");
       // System.out.println(mura.name);

        Talkable anothere = new Oaie("Suzi");
        System.out.println(anothere.identify());
        System.out.println(new Conferences());

    }
}
