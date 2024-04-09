package PTC;

public class FreedomFighter {
    String name;
    String dob;

    FreedomFighter()
    {
        this.name = "SUbhashchandra Bosh";
        this.dob = "1897";
        System.out.println(this.name);
        System.out.println(this.dob);
    }
   public static void obj_as_param()
   {
       new FreedomFighter();
   }


}
