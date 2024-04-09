package Fuel_Problem;

public class Constructor_Chaining {
    Constructor_Chaining(String name)
    {
        System.out.println(name);
    }
    Constructor_Chaining(int roll_no)
    {
        this("Abhii");
        System.out.println(roll_no);
    }
    Constructor_Chaining(double year)
    {
        this(65);
        System.out.println(year);

    }
    Constructor_Chaining(String stream,int code)
    {
        this(15.2023);
        System.out.println(stream+""+code);

    }
    Constructor_Chaining(float percentage , String name)
    {
        this("Computer science ", 2533);
        System.out.println(name+":"+ percentage);
    }

    public static void main(String[] args) {
        Constructor_Chaining obj = new Constructor_Chaining(95.50f,"Science");

    }



}
