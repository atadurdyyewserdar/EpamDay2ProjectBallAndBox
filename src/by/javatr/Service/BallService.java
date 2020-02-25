package by.javatr.Service;

import by.javatr.entity.Ball;
import by.javatr.entity.Color;

public class BallService
{
    public static Ball getRandomColoredBall(double weight) throws Exception {
        if (weight <= 0)
        {
            throw new Exception("Illegal argument");
        }
        Color colors = ColorService.getRandomColor();
        return new Ball(weight, colors);
    }
}