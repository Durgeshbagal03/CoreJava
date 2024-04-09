package MethodOverloading;

public class Employee {


    public void car()
    {
        System.out.println("My fav car");
    }
    public void car(int cost)
    {
        System.out.println(cost);
    }
    public void car(String Brand)
    {
        System.out.println(Brand);
    }
    public void car(int cost, String Brand)
    {
        System.out.println(cost+" "+ Brand);

    }
    public void car(String Brand , int cost)
    {
        System.out.println(Brand+" "+ cost);
    }
    public void car(float cost ,String Brand ,String Colour)
    {
        System.out.println(cost+" "+Brand+" "+ Colour);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.car();
        obj.car(50);
        obj.car("TATA");
        obj.car(50,"TATA");
        obj.car(50.00f,"TATA","Black");
        obj.car("TATA",50);
    }
}
