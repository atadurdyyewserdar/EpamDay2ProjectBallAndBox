package by.javatr.Service;

import by.javatr.entity.Color;

public class ColorService
{
    public static Color getRandomColor()
    {
        Color[] colors = Color.values();
        int random = (int)(Math.random() * colors.length);
        return colors[random];
    }
}
