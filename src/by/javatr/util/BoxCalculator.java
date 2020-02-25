package by.javatr.util;

import by.javatr.entity.Ball;
import by.javatr.entity.Box;
import by.javatr.entity.Color;

public class BoxCalculator
{
    public static double calculateCurrentBoxWeight(Box box) throws Exception {
        if (box == null)
        {
            throw new Exception("Illegal argument calculateCurrentWeight method");
        }
        double sum = 0;
        for (Ball ball : box.getBalls())
        {
            sum += ball.getWeight();
        }
        return sum;
    }

    public static int countBallByColor(Box box, Color color) throws Exception {
        if (box == null || color == null)
        {
            throw new Exception("Illegal argument in countBallByColor method");
        }
        int counter = 0;
        for (Ball ball : box.getBalls())
        {
            if (ball.getColor() == Color.BLUE)
            {
                counter++;
            }
        }
        return counter;
    }

    public static double getAmountOfFreeSpace(Box box) throws Exception {
        if (box == null)
        {
            throw new Exception("Illegal argument in countBallByColor method");
        }
        double sum = 0;
        for (Ball ball : box.getBalls())
        {
            sum += ball.getWeight();
        }
        return box.getCapacity() - sum;
    }
}
