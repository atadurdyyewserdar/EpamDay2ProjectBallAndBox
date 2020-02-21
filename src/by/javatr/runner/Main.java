package by.javatr.runner;

import by.javatr.Service.BoxService;
import by.javatr.entity.Ball;
import by.javatr.entity.Box;
import by.javatr.entity.Color;
import by.javatr.scanner.DataScanner;
import by.javatr.util.BoxCalculator;
import by.javatr.util.Printer;


public class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter capacity of box: ");
        double capacity = DataScanner.enterDoubleFromConsole();
        Box box = BoxService.getFilledBox(capacity);
        Printer.printBox(box);
        int countBlue = BoxCalculator.countBallByColor(box, Color.BLUE);
        System.out.println("------------------------------------------");
        System.out.println("Max capacity of box: " + capacity);
        System.out.println("Weight of all balls: "+ BoxCalculator.calculateCurrentBoxWeight(box));
        System.out.println("Amount of free space: "+ BoxCalculator.getAmountOfFreeSpace(box));
        System.out.println("Amount of BLUE balls: " + countBlue);
    }
}