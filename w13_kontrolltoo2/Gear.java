public class Gear
{
    private int teeths;
    private int teethsLeft;
    private int turns;

    public Gear(int teeths)
    {
        this.teeths = teeths;
        this.teethsLeft = teeths;
    }

    public void Move()
    {
        --teethsLeft;

        if (teethsLeft == 0)
        {
            teethsLeft = teeths;
            ++turns;

            System.out.println("turns: " + turns);
        }
    }
}
