public class W8_Main{
    public static void main(String[] args) {
        IOven oven = new OvenWithMicrowave();
        IOven oven2 = new OvenWithSteam();
        oven.start();
        System.out.println("==========");
        oven2.start();
        System.out.println("==========");
        oven.stop();
        System.out.println("==========");
        oven2.stop();
    }
}