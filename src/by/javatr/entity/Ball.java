package by.javatr.entity;

import java.util.Objects;

public class Ball
{
    private double weight;
    private Color color;

    public Ball(double weight, Color color) throws Exception {
        if (weight <= 0)
        {
            throw new Exception("Weight can't be under 0");
        }
        else if (color == null)
        {
            throw new Exception("Color can't be null");
        }
        this.weight = weight;
        this.color = color;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight) throws Exception {
        if (weight <= 0 )
        {
            throw new Exception("Weight can't be 0");
        }
        this.weight = weight;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color) throws Exception {
        if (color == null)
        {
            throw new Exception("Color can't be null");
        }
        this.color = color;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result = false;
        if (this == o)
        {
            result = true;
        }
        else if (!(o instanceof Ball))
        {
            result = false;
        }
        Ball ball = (Ball) o;
        if (Double.compare(ball.weight, weight) == 0 && color.equals(ball.color))
        {
            result = true;
        }
        return result;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(weight, color);
    }
}
