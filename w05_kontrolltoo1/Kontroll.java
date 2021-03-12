import java.io.*;
import java.util.*;

/* A-tähed tekstis
* Loe programmi abil kokku, kui palju on tekstifailis a-tähti (nii suuri kui väikeseid)
* Leia, kui palju oli a-tähti igas sõnas, sõnades keskmiselt, suhtarvuna tähtede üldarvu
* Loe kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega. Koosta tabel, kus ridadeks tähtede arv sõnas ning veergudeks a-tähtede arv.
Lahtris näidatakse, mitu vastavat sõna oli tekstis. */ 

public class Kontroll{
    public static void main(String[] args){
        try
        {
            BufferedReader dataReader = new BufferedReader(new FileReader("data.txt"));
            String stringInFile = dataReader.readLine();

            int totalCounterLetter = 0;                 //F2
            char letter = 'a';
            int totalCounterWords = 0; 
            

            Hashtable<Integer, Hashtable<Integer, Integer>> wordCounters = new Hashtable<Integer, Hashtable<Integer, Integer>>();
            Hashtable<String, Integer> letterCountHashtable = new Hashtable<String, Integer>();

            int maxRows = 0; // word
            int maxColumns = 0; // letter


            while(stringInFile != null) {
                totalCounterLetter = totalCounterLetter + countLetter(stringInFile, letter); //here starts at each word average A letter
                String[] words = stringInFile.split("\\s+");
                totalCounterWords = totalCounterWords + words.length;      // how many words
                for (int i = 0; i < words.length; ++i){
                    int charCounter = countLetter(words[i], letter);

                    letterCountHashtable.put(words[i], charCounter);

                    

                    if (charCounter > maxColumns)
                        maxColumns = charCounter;

                    if (words[i].length() > maxRows)
                        maxRows = words[i].length();

                    Hashtable<Integer, Integer> table = wordCounters.get(words[i].length());

                    if (table == null) {
                        table = new Hashtable<Integer, Integer>();
                        wordCounters.put(words[i].length(), table);
                    }

                    Integer value = table.get(charCounter);

                    if (value != null){
                        value = value + 1;
                        table.put(charCounter, value);
                    }
                    else {
                        table.put(charCounter, 1);    //???????????????????
                    }
                }

                stringInFile = dataReader.readLine();
            }


    System.out.printf("Palju A kokku teab Jumal - %d%n", totalCounterLetter);

    letterCountHashtable.forEach((key, value)->{
        System.out.printf("%s - %d%n", key, value);
    });

    double average = (double)totalCounterLetter / (double)totalCounterWords;

    System.out.printf("keskmine siingi - %f%n", average);

    int relative = (totalCounterLetter / 26) * 100;

    System.out.printf("suhtarv on - %d%n", relative);

            for (int i = 0; i <= maxRows; ++i){
                if (i == 0){
                    System.out.print("\t|");

                    for (int g = 0; g <= maxColumns; ++g){
                        printCell(Integer.toString(g));
                    }
                    
                    System.out.print("\n");

                }
                else {
                    printCell(Integer.toString(i));

                    Hashtable<Integer, Integer> table = wordCounters.get(i);
                    
                    if (table != null)
                    {
                        for (int g = 0; g <= maxColumns; ++g){
                            Integer wordCounter = table.get(g);

                            if (wordCounter != null){
                                printCell(Integer.toString(wordCounter));
                            }
                            else {
                                printCell(null);
                            }
                        }
                    }
                    else {
                        for (int g = 0; g <= maxColumns; ++g)
                            printCell(null);
                    }
                    System.out.print("\n");

                }
            }

        }
        catch (IOException e)
        {
            return;
        }
    }

    private static void printCell(String value) {
        System.out.print("\t");
        if (value != null)
            System.out.print(value);
        System.out.print("|");
    }

    private static int countLetter(String str, char letter) {
        letter = Character.toUpperCase(letter);
        int counter = 0;
        
        for(int i = 0; i < str.length(); ++i){
            if (Character.toUpperCase(str.charAt(i)) == letter){
                counter++;

            }
        }

        return counter;
    } 

}
