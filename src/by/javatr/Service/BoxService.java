package by.javatr.Service;

import by.javatr.entity.Ball;
import by.javatr.entity.Box;
import by.javatr.util.BallCalculator;
import by.javatr.util.BoxCalculator;

import java.util.ArrayList;
import java.util.List;

public class BoxService
{
    public static boolean addBallToBox(Box box, Ball ball)
    {
        boolean result = false;
        if (box == null || ball == null)
        {
            throw new IllegalArgumentException("Null argument method addBallToBox");
        }
        double currBoxWeight = BoxCalculator.calculateCurrentBoxWeight(box);
        if (currBoxWeight + ball.getWeight() <= box.getCapacity())
        {
            box.getBalls().add(ball);
            result = true;
        }
        return result;
    }

    public static boolean addBallsArrayToBox(Box box, List<Ball> balls)
    {
        if (box == null || balls == null)
        {
            throw new IllegalArgumentException("Illegal argument in method addBallsToBox");
        }

        boolean result = false;
        double ballsWeight = BallCalculator.calculateBallsWeight(balls);
        double boxCurrWeight = BoxCalculator.calculateCurrentBoxWeight(box);

        if (boxCurrWeight + ballsWeight <= box.getCapacity())
        {
            for (Ball ball : balls)
            {
                box.getBalls().add(ball);
            }
            result = true;
        }
        return result;
    }

    public static Box getFilledBox(double boxCapacity)
    {
        if (boxCapacity < 1)
        {
            throw new IllegalArgumentException("Illegal argument");
        }
        double ballWeight = 1 + Math.random() * boxCapacity;
        int ballCount =(int) (boxCapacity / ballWeight);
        List<Ball> balls = new ArrayList<>();
        for(int i = 0;i<ballCount;i++)
        {
            Ball ball = BallService.getRandomColoredBall(ballWeight);
            balls.add(ball);
        }
        return new Box(boxCapacity, balls);
    }
}
