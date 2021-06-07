public class Pendelum implements IClock
{
    private int length;
    private Gear gear;

    public Pendelum (int length, int teeths)
    {
        this.length = length;
        this.gear = new Gear(teeths);
    }
    @Override
    public double findDuration()
    {
        return 2 * Math.PI * Math.sqrt(length / 9.8);
    }

    public void Run()
    {
        long duration = (long) (findDuration() * 1000);

        try
        {
            while (true)
            {
                Thread.sleep(duration);
                System.out.println("tic");
                gear.Move();
                Thread.sleep(duration);
                System.out.println("tac");
                gear.Move();
                
            }
        }
        catch (InterruptedException e)
        {
        }
    }
  }