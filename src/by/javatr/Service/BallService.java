package by.javatr.Service;

import by.javatr.entity.Ball;
import by.javatr.entity.Color;

public class BallService
{
    public static Ball getRandomColoredBall(double weight)
    {
        if (weight <= 0)
        {
            throw new IllegalArgumentException("Illegal argument");
        }
        Color colors = ColorService.getRandomColor();
        return new Ball(weight, colors);
    }
}