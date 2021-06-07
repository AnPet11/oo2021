public class W2_Human {
    public int head = 1;
    public int eyes = 2;
    public int hands = 2;
    public int legs = 2;

    public String name = "Giena";

    public W2_Human(){
        System.out.println("Constructor");
    }

    public W2_Human(String name){
        this.name = name;

    }

    public static void sayHeloo(){
        System.out.println("Hello");
    }
}