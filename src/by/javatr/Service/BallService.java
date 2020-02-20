package by.javatr.Service;

import by.javatr.entity.Ball;
import by.javatr.entity.Color;

public class BallService
{
    public static Ball getRandomColoredBall(double weight)
    {
        Color[] colors = Color.values();
        int random = (int)(Math.random() * colors.length);
        return new Ball(weight, colors[random]);
    }
}