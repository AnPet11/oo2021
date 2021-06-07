import java.util.ArrayList;

public class W2_Main{

    public static void main(String[] args){
        GameCharacter character1 = new GameCharacter("Juri");
        human();
    
        System.out.println(
            character1.name + " " +
            //character1.secret);
            character1.getSecret());
        //W2_Human.sayHello();
        //Integer.parseInt("5");
        character1.setSecret("My new secret");

        System.out.println(character1.getSecret());

        GameCharacter character2 = new GameCharacter("Mini");

        System.out.println(character1);
        System.out.println(character2);

        System.out.println(character1.getXY()[0]);
    }
    public static void human(){
        W2_Human angelina = new W2_Human(); //new object
        System.out.println(angelina.legs + "" + angelina.name);

        angelina.legs = 5;
        angelina.name = "Angelina";

        System.out.println(angelina.legs + " " + angelina.name);

        W2_Human angelina2 = new W2_Human("Juri");

        System.out.println(angelina2.name);

        angelina2.legs = 10;

        System.err.println(angelina.legs + " " + angelina2.legs);
    }

    public static void lists(){
        int age = 50;

        String[] stringArray = new String[5];
        int[] numberArray = new int[5];

        ArrayList<String> stringList= new ArrayList<>();

        numberArray[0] = 5; 

        stringList.add(0, "Hello");
        stringList.add("Yellow");
        stringList.add(1, "Orange");

        for(String entry : stringList){
            System.out.println(entry);
        }

        System.out.println(stringList.get(1));
    }
}