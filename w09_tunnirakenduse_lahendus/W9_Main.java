import java.util.Collections;
import java.util.stream.IntStream;

import org.graalvm.compiler.lir.aarch64.AArch64ArithmeticOp.AddSubShiftOp;

public class W9_Main{
    public static void main(String[] args) {
        Basket basket = new Basket();

        try
        {
            basket.Add("zero amount", 0, 10);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            basket.Add("negative price", 3, -10);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        try
        {
            basket.Add("fruits", 4, 3.99);
            basket.Add("milk", 1, 2);
            basket.Add("eggs", 1, 6);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        Item cheap = basket.Cheap();

        System.out.printf("cheapest is %s with price %f", cheap.name, cheap.price);

        // Threads

        Thread thread1 = new Thread(() -> {
            IntStream.range(1, 11).forEach(v -> System.out.printf("%d\n", v));
        });

        
        Thread thread2 = new Thread(() -> {
            IntStream.range(1, 11).boxed().sorted(Collections.reverseOrder()).forEach(v -> System.out.printf("%d\n", v));
        });

        thread1.run();
        thread2.run();
    }
}