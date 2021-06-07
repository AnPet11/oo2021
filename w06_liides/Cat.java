public class Cat implements IAnimal{

    @Override
    public void speak() {
        System.out.println("Meow");
        
    }

    @Override
    public void eat() {
        System.out.println("I am eating a fish");
        
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz...");
        
    }

    @Override
    public void beSneaky() {
        System.out.println("I am a shadow. Shhh...");
        
    }

    @Override
    public void lookAround() {
        System.out.println("A look to left...to right");
        
    }

    @Override
    public void attack() {
        System.out.println("Scrathing");
        
    }

    @Override
    public void defend() {
        System.out.println("MAAAAAU");
        
    }
    
}
