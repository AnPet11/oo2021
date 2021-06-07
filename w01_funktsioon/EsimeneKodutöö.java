public class EsimeneKodutöö{
    public static void main(String[] args){
        
        int a = 1;  //initial value
        int b = 1999; //end value

            int randomNumber1 = (int) (Math.random()  * 1000); 
            int randomNumber2 = a - (int) (Math.random() * 1000 + b);
            int randomNumber3 = a * (int) (Math.random() * 1000 - b);

    System.out.println("Esimene suvaline number on " + randomNumber1);
    System.out.println("Teine suvaline number on " + randomNumber2);
    System.out.println("Kolmas suvaline number on " + randomNumber3);

    }


}
