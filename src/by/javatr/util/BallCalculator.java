package by.javatr.util;

import by.javatr.entity.Ball;

import java.util.List;

public class BallCalculator
{
    public static double calculateBallsWeight(List<Ball>balls)
    {
        if (balls == null)
        {
            throw new IllegalArgumentException("Illegal argument in method calculateBallsWeight");
        }
        double sum = 0;
        for(Ball b : balls)
        {
            sum += b.getWeight();
        }
        return sum;
    }
}
