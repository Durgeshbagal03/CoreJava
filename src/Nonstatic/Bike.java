package Nonstatic;

class Bikes {
    public void bike()
    {
        System.out.println("i am in bike class Bikes and nonstatic package ");
    }

    public static void main(String[] args) {
        Bikes obj1 = new Bikes();
        obj1.bike();
        Mobiles obj2 = new Mobiles();
        obj2.cars();

    }
}
