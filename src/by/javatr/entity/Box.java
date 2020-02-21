package by.javatr.entity;

import by.javatr.util.BallCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box
{
    private double capacity;
    private List<Ball> balls;

    public Box(double capacity)
    {
        if (capacity <= 0)
        {
            throw new IllegalArgumentException("Illegal argument in Constructor Box");
        }
        this.capacity = capacity;
        balls = new ArrayList<>();
    }

    public Box(double capacity, List<Ball> balls)
    {
        if (capacity <= 0 || balls == null)
        {
            throw new IllegalArgumentException("Wrong argument");
        }
        this.balls = balls;
        this.capacity = capacity;
    }

    public double getCapacity()
    {
        return capacity;
    }

    public void setCapacity(double capacity)
    {
        if (capacity < BallCalculator.calculateBallsWeight(this.balls))
        {
            throw new IllegalArgumentException("Illegal arg");
        }
        this.capacity = capacity;
    }

    public List<Ball> getBalls()
    {
        return balls;
    }

    public void setBalls(List<Ball> balls)
    {
        if (balls == null || BallCalculator.calculateBallsWeight(this.balls) > capacity)
        {
            throw new IllegalArgumentException("Wrong argument");
        }
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean result = false;
        if (this == o)
        {
            result = true;
        }
        else if (!(o instanceof Box))
        {
            result = false;
        }
        else
        {
            Box box = (Box) o;
            if (Double.compare(box.capacity, capacity) == 0
                    && box.getBalls().equals(box.balls))
            {
                result = true;
            }
        }
        return result;

    }

    @Override
    public int hashCode()
    {
        return Objects.hash(capacity, balls);
    }
}
