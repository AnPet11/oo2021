public class OvenWithSteam extends Oven{
    @Override
    public void start(){
        System.out.println("Steam is running");
        super.start();
    }

    @Override
    public void stop(){
        System.out.println("Steam is stopped");
        super.stop();
    }
}

