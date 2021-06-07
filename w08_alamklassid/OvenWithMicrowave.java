public class OvenWithMicrowave extends Oven{          //oven is a small base, base class
    @Override
    public void start(){
        System.out.println("Microwave is running");
        super.start();
    }

    @Override
    public void stop(){
        System.out.println("Microwave is stopped");
        super.stop();
    }
}
