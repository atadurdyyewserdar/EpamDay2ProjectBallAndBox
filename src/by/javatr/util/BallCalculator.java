package by.javatr.util;

import by.javatr.entity.Ball;

import java.util.List;

public class BallCalculator
{
    public static double calculateBallsWeight(List<Ball>balls) throws Exception {
        if (balls == null)
        {
            throw new Exception("Illegal argument in method calculateBallsWeight");
        }
        double sum = 0;
        for(Ball b : balls)
        {
            sum += b.getWeight();
        }
        return sum;
    }
}
