package Fuel_Problem;

import Interface.Parent;

public class child implements parent,Parent2 {
    public static void main(String[] args) {
        child obj = new child();
        obj.x();
    }

    @Override
    public void x() {
        System.out.println("In x");
    }


}
