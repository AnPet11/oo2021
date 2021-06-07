import javax.swing.plaf.synth.SynthSplitPaneUI;

public class First{
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray = new int[5];
        int numberArray2[] = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = new String[]{"Hello", "world", "!"}; 


        String name = "Angelina";
        int year = 2021;  
        

        // primitiivtyybid
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        byte myByte = Byte.MAX_VALUE-1; // =128 to 127 byte in this range
        short myShort = Short.MAX_VALUE-1;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; // false
        char character = 'F';
    

        // for i
        for (int i = 0; i < greetingsArray.length; i++){ //  for (int i = 0; i < args.length; i++){
            System.out.println(greetingsArray[i]); // System.out.println(args[i])
        }

        // foreach
        for (String text : greetingsArray){ // for (String text : args){
            System.out.println(text);
        }

        // while
        int length = greetingsArray.length; // args.length
        while (length > 0){
            length--;
            System.out.println("Inside while");
        }

        if(year == 2021){ // != не равняется
            System.out.println(year + " is equal to 2021");
        } else if (year > 2021){
            System.out.println(year + " is larger than 2021");
        } else {
            System.out.println(year + " is not equal or larger than 2021");
        }

        System.out.println("Hello world");
        System.out.println("Test one");
        System.out.println("Test two");
        System.out.print("\n");

        String hello = "Hello world!";
    
    }
}