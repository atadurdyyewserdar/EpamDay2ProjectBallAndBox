package by.javatr.entity;

public enum Color
{
    RED(0),
    GREEN(1),
    BLACK(2),
    YELLOW(3),
    BLUE(4),
    CYAN(5);

    private int index;

    Color(int index)
    {
        this.index = index;
    }

    public int getIndex()
    {
        return index;
    }
}
