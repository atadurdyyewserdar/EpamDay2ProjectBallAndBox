package by.javatr.util;

import by.javatr.entity.Ball;
import by.javatr.entity.Box;

import java.util.ArrayList;
import java.util.List;

public class Printer
{
    public static void printBox(Box box)
    {
        if (box == null)
        {
            throw new IllegalArgumentException("Illegal argument method printBox");
        }
        int i = 1;
        for (Ball ball : box.getBalls())
        {
            System.out.println(i + ") Color: " + ball.getColor() + "    Weight: " + ball.getWeight());
            i++;
        }
    }

    public static void printBallList(List<Ball> balls)
    {
        if (balls == null)
        {
            throw new IllegalArgumentException("Illegal argument method printBox");
        }
        int i = 1;
        for (Ball ball : balls)
        {
            System.out.println(i + ") Color: " + ball.getColor() + "\tWeight: " + ball.getWeight());
            i++;
        }
    }
}
