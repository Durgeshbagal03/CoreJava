package ConstructorOverload;

public class overload {
    int a = 5;
    float b= 3.98f;
    char c = 'a';
   overload()
   {
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

   }
   overload(int z,int w)
   {
       System.out.println(z);
       System.out.println(w);

   }

    public static void main(String[] args) {
        overload obj = new overload();
        overload obj1= new overload(5,8);


    }
}
