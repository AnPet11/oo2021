public class Main {

    public static /*class*/ void main(String[] args){       // this programm entrypoint

       // EstonianID est = new EstonianID("49902113716");
        //System.out.println(est.getGender());
        //System.out.println(est.getDOB());

        animals();
        
    }

    public static void animals(){           //static - this method exist 
        IAnimal cat = new Cat();
        cat.attack();
        
        cat = new Bird();                   //variable cat get can contain other classes that implement interface IAnimal
        cat.attack();
    }
}
