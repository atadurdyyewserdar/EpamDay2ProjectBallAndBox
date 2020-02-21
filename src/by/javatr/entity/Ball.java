package by.javatr.entity;

import java.util.Objects;

public class Ball
{
    private double weight;
    private Color color;

    public Ball()
    {
    }

    public Ball(double weight, Color color)
    {
        if (weight <= 0)
        {
            throw new IllegalArgumentException("Weight can't be under 0");
        }
        else if (color == null)
        {
            throw new IllegalArgumentException("Color can't be null");
        }
        this.weight = weight;
        this.color = color;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        if (weight <= 0 )
        {
            throw new IllegalArgumentException("Weight can't be 0");
        }
        this.weight = weight;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        if (color == null)
        {
            throw new IllegalArgumentException("Color can't be null");
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
        else
        {
            Ball ball = (Ball) o;
            if (Double.compare(ball.weight, weight) == 0
                    && color.equals(ball.color))
            {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(weight, color);
    }
}
