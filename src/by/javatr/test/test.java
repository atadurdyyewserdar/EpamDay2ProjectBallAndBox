package by.javatr.test;

public class test
{
    //public static test ff = new test();
    public static int x = 45;

    //private test(){}

    public static void main(String[] args)
    {
        System.out.println(test.x);
    }
}


class A{
    public void f(){
        System.out.println("A");
    }
}

class B extends A{

    public void f(){
        System.out.println("B");
    }
}

class C extends B{
    public void f(){
        System.out.println("C");
    }
}